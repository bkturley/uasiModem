package mil.ustranscom.dps.standard.tools;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class UasiModem {

    public static final char LOWER_A_CHAR = 'a';
    public static final char LOWER_E_CHAR = 'e';
    public static final char LOWER_I_CHAR = 'i';
    public static final char LOWER_O_CHAR = 'o';
    public static final char LOWER_U_CHAR = 'u';

    public static final char UPPER_A_CHAR = 'A';
    public static final char UPPER_E_CHAR = 'E';
    public static final char UPPER_I_CHAR = 'I';
    public static final char UPPER_O_CHAR = 'O';
    public static final char UPPER_U_CHAR = 'U';

    private static final Map<Character, Character> ENCODE_MAP = encodeMap();

    private static final Map<Character, Character> DECODE_MAP = decodeMap();

    private static Map<Character, Character> encodeMap() {
        Map<Character, Character> encodeMap = new HashedMap();
        encodeMap.put(LOWER_A_CHAR, LOWER_E_CHAR);
        encodeMap.put(UPPER_A_CHAR, UPPER_E_CHAR);
        encodeMap.put(LOWER_E_CHAR, LOWER_I_CHAR);
        encodeMap.put(UPPER_E_CHAR, UPPER_I_CHAR);
        encodeMap.put(LOWER_I_CHAR, LOWER_O_CHAR);
        encodeMap.put(UPPER_I_CHAR, UPPER_O_CHAR);
        encodeMap.put(LOWER_O_CHAR, LOWER_U_CHAR);
        encodeMap.put(UPPER_O_CHAR, UPPER_U_CHAR);
        encodeMap.put(LOWER_U_CHAR, LOWER_A_CHAR);
        encodeMap.put(UPPER_U_CHAR, UPPER_A_CHAR);
        return Collections.unmodifiableMap(encodeMap);
    }

    private static Map<Character, Character> decodeMap() {
        return Collections.unmodifiableMap(encodeMap().entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey)));
    }

    public String encode(String encodeMe)
    {
        return applyMap(ENCODE_MAP, encodeMe);
    }

    public String decode(String decodeMe)
    {
        return applyMap(DECODE_MAP, decodeMe);
    }

    private String applyMap(Map<Character, Character> map, String encodeMe) {
        StringBuilder returnValueStringBuilder = new StringBuilder();
        if(StringUtils.isNotBlank(encodeMe))
        {
            for(Character character : encodeMe.toCharArray())
            {
                returnValueStringBuilder.append(map.containsValue(character) ? map.get(character) : character);
            }
        }
        return returnValueStringBuilder.toString();
    }

}
