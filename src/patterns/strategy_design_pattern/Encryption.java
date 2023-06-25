package patterns.strategy_design_pattern;

public interface Encryption {
    public void encrypt(String toBeEncrypted);

    public EncodingPatternEnum getEncryptionType();
}
