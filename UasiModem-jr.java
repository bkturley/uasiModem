package mil.ustranscom.dps.standard.tools;

import org.apache.commons.lang3.StringUtils;


public class UasiModem {

    public String encode(String encodeMe) {
        StringBuilder returnValueStringBuilder = new StringBuilder();
        if(StringUtils.isNotBlank(encodeMe)) {
            for (char character : encodeMe.toCharArray()) {
                switch (character) {
                    case 'A':
                        returnValueStringBuilder.append('E');
                        break;
                    case 'E':
                        returnValueStringBuilder.append('I');
                        break;
                    case 'I':
                        returnValueStringBuilder.append('O');
                        break;
                    case 'O':
                        returnValueStringBuilder.append('U');
                        break;
                    case 'U':
                        returnValueStringBuilder.append('A');
                        break;
                    case 'a':
                        returnValueStringBuilder.append('e');
                        break;
                    case 'e':
                        returnValueStringBuilder.append('i');
                        break;
                    case 'i':
                        returnValueStringBuilder.append('o');
                        break;
                    case 'o':
                        returnValueStringBuilder.append('u');
                        break;
                    case 'u':
                        returnValueStringBuilder.append('a');
                        break;
                    default:
                        returnValueStringBuilder.append(character);
                }

            }
        }
        return returnValueStringBuilder.toString();

    }

    public String decode(String decodeMe) {
        StringBuilder returnValueStringBuilder = new StringBuilder();
        if(StringUtils.isNotBlank(decodeMe)){
            for (char character : decodeMe.toCharArray()) {
                switch (character) {
                    case 'A':
                        returnValueStringBuilder.append('U');
                        break;
                    case 'E':
                        returnValueStringBuilder.append('A');
                        break;
                    case 'I':
                        returnValueStringBuilder.append('E');
                        break;
                    case 'O':
                        returnValueStringBuilder.append('I');
                        break;
                    case 'U':
                        returnValueStringBuilder.append('O');
                        break;
                    case 'a':
                        returnValueStringBuilder.append('u');
                        break;
                    case 'e':
                        returnValueStringBuilder.append('a');
                        break;
                    case 'i':
                        returnValueStringBuilder.append('e');
                        break;
                    case 'o':
                        returnValueStringBuilder.append('i');
                        break;
                    case 'u':
                        returnValueStringBuilder.append('o');
                        break;
                    default:
                        returnValueStringBuilder.append(character);
                }
            }
        }
        return returnValueStringBuilder.toString();
    }
}