package util;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by AMIT on 10-07-2016.
 */
public class StringsUtil {
    public static boolean isValid(String s) {
        return (s != null && s.trim().length() != 0 && !s.trim().equalsIgnoreCase("null"));
    }

    public static boolean isValidNew(String s) {
        return (s != null && s.trim().length() != 0 && !s.trim().equalsIgnoreCase("null") && !s.trim().equals("-1"));
    }

    public static String replace(String str, String[] replace) {
        int position = 0;
        StringBuffer result = new StringBuffer(str);
        try {
            for (int i = 0; i < replace.length; i++) {
                int j = i + 1;
                String pattern = "%" + j;
                position = str.indexOf(pattern);
                if (position == -1) {
                    return str;
                }

                result.replace(position, position + 2, replace[i]);
                str = result.toString();
            }
        } catch (Exception ex) {
            return new String();
        }
        return str;
    }


    /**
     * This Method will replace the substring in the input string with the String provided as third parameter to this method
     * @param str : str object
     * @param subString :  subString object
     * @param strReplace :  strReplace object
     * @return String : replace String
     */
    public static String replaceSubString(String str, String subString, String strReplace) {
        if (str == null || subString == null) {
            return str;
        }
        if (strReplace == null) {
            strReplace = "";
        }
        int replaceLength = subString.length();
        if (replaceLength < 1) {
            return str;
        }

        StringBuffer sb		= new StringBuffer(str);
        int replacedLength	= strReplace.length();
        int startIndex		= 0;
        try {
            for (; ; ) {
                str			= sb.toString();
                startIndex	= str.indexOf(subString, startIndex);

                if (startIndex == -1) {
                    break;
                }
                sb.replace(startIndex, startIndex + replaceLength, strReplace);
                startIndex	= startIndex + replacedLength;
                //System.out.println(sb.toString());
            }
        } catch (Exception e) {
            return str;
        }
        str = sb.toString();
        return str;
    }


    public static String replaceSubString(String str, HashMap map) {
        if (str == null || str.trim().equals("")) {
            return str;
        }
        Iterator it = map.keySet().iterator();
        while (it != null && it.hasNext()) {
            String strReplace = (String) it.next();
            String strReplaceWith
                    = (String) map.get(strReplace);
            str = replaceSubString(str, strReplace, strReplaceWith);
        }
        return str;
    }

    public static boolean isInt(String s) {
        boolean ret = false;
        if (s == null) {
            return ret;
        }
        try {
            Integer.parseInt(s);
            ret = true;
        } catch (NumberFormatException ne) {

        }
        return ret;
    }
}

