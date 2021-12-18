package leetcode.house_robber;

public class HouseRobber {
	
	public static void main(String[] args) {
			int[] a = {1,2,3,4,7,6};
			HouseRobber obj = new HouseRobber();
			System.out.println(obj.maxLoot(a));
	}
	
	
	private int maxLoot( int[] arr ) {
		// TODO Auto-generated method stub
		int sum = 0;
		if ( arr.length <= 0 )
			sum = 0;
		else if ( arr.length == 1)
			sum = arr[0];
		else if ( arr.length == 2 )
			sum = Math.max( arr[0], arr[1] );
		
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		temp[1] = Math.max(arr[0], arr[1]);
		
		for (int i=2; i< arr.length; i++) {
			temp[i] = Math.max(arr[i] + temp[i-2] , temp[i-1]);
		}
		
			return temp[arr.length -1];
	}
	
}
