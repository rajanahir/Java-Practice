package patterns.strategy_design_pattern;

public class SHA1Encryption implements Encryption {
    @Override
    public void encrypt(String toBeEncrypted) {
        System.out.println("I am encyrpting using SHA1" +
                ".");
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.SHA1;
    }
}
