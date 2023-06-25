package patterns.strategy_design_pattern;

public class SHA2Encryption implements Encryption {
    @Override
    public void encrypt(String toBeEncrypted) {
        System.out.println("I am encyrpting using SHA2.");
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.SHA2;
    }
}
