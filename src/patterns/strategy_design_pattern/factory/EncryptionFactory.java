package patterns.strategy_design_pattern.factory;

import org.hibernate.mapping.Component;
import patterns.strategy_design_pattern.EncodingPatternEnum;
import patterns.strategy_design_pattern.Encryption;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EncryptionFactory {
    Map<EncodingPatternEnum, Encryption> map;

    public EncryptionFactory(Set<Encryption> encryptionTypeSet) {
        createStrategy(encryptionTypeSet);
    }

    private void createStrategy(Set<Encryption> encryptionTypeSet) {
        map = new HashMap<EncodingPatternEnum, Encryption>();
        encryptionTypeSet.stream().forEach(encryptionTypes ->
                map.put(encryptionTypes.getEncryptionType(), encryptionTypes));

    }

    public Encryption findEncryption(EncodingPatternEnum encodingPatternEnum) {
        return map.get(encodingPatternEnum);
    }


}
