package patterns.strategy_design_pattern;

public class MD5Encryption implements Encryption {
    @Override
    public void encrypt(String toBeEncrypted) {
        System.out.println("I am encyrpting using MD5.");
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.MD5;
    }
}
