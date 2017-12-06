package mil.ustranscom.dps.standard.tools;

import org.apache.commons.lang3.StringUtils;

public class UasiModem {

    public static final String STRING = "AEIOU";

    public String encode(String encodeMe)
    {
        return process(encodeMe, 6);
    }

    public String decode(String decodeMe)
    {
        return process(decodeMe, 4);
    }

    private String process(String input, int offset){
        StringBuilder returnValueStringBuilder = new StringBuilder();
        if(StringUtils.isNotBlank(input))
        {
            for(char character : input.toCharArray())
            {
                if(STRING.indexOf(character)>=0){
                    returnValueStringBuilder.append(STRING.charAt((STRING.indexOf(character)+offset)%STRING.length()));
                }else if(STRING.indexOf(character-32)>=0){
                returnValueStringBuilder.append((char)(STRING.charAt(((STRING.indexOf(character-32)+offset)%STRING.length()))+32));
            }
                else
                    returnValueStringBuilder.append(character);
            }
        }
        return returnValueStringBuilder.toString();
    }

}
