import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {


    public static void main(String[] args) {
        String[][] input = {
                {"CREATE_ACCOUNT", "1", "account1"},
                {"CREATE_ACCOUNT", "2", "account1"}
                };

        System.out.println(Arrays.toString(solution(input)));
    }

    public static String[] solution(String[][] queries) {

        String[] results = new String[queries.length];
        String[][] accountDetails = new String[queries.length][];
        String[] details = new String[3];
        if (queries.length <= 0)
            results[0] = "false";
        int count = 0;
        for (String[] query : queries) {

            //CREATE_ACCOUNT
            if (query[0] == "CREATE_ACCOUNT") {
                if (checkAccountExists(accountDetails, query[2]) == true) {
                    results[count] = "false";
                    count++;
                    continue;
                }
                details[0] = query[1]; //timestamp
                details[1] = query[2]; //ac id
                details[2] = "0"; //initial deposit
                //accountDetails[key is AC id]contains timeStamp and inital depostit;
                accountDetails[count] = details;
                results[count] = "true";
            }

            if (query[0] == "DEPOSIT") {
                if (checkAccountExists(accountDetails, query[2]) == true) {
                    results[count] = "";
                    count++;
                    continue;
                }

                details[0] = query[1]; //timestamp
                details[1] = query[2]; //ac id
                details[2] = getBalance(accountDetails, query[2]) + Integer.valueOf(query[3]) + ""; //initial deposit
                //accountDetails[key is AC id]contains timeStamp and inital depostit;
                accountDetails[count] = details;
                results[count] = "true";

            }

            if (query[0] == "PAY") {
                if (checkAccountExists(accountDetails, query[2]) == true) {
                    results[count] = "";
                    count++;
                    continue;
                }
                int balance = getBalance(accountDetails, query[2]);
                if (balance < Integer.valueOf(query[3])) {
                    results[count] = "";
                    count++;
                    continue;
                }

                details[0] = query[1]; //timestamp
                details[1] = query[2]; //ac id
                details[2] =  balance - Integer.valueOf(query[3]) + ""; //initial deposit
                //accountDetails[key is AC id]contains timeStamp and inital depostit;
                accountDetails[count] = details;
                results[count] = "true";

            }
            count++;

        }
        return results;
    }

    public static boolean checkAccountExists(String[][] queries, String accid) {
        long numberOfAcc = Stream.of(queries).filter( x -> x != null && x[1] == accid).count();
        return numberOfAcc > 0;

    }

    public static int getBalance(String[][] accountDetails, String accid) {
        String[] accDetials = Stream.of(accountDetails).filter( x -> x != null && x[1] == accid).findAny().get();
        return Integer.valueOf(accDetials[2]);
    }


}
