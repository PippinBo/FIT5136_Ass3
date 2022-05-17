package Checker;

public class Check {

    public static int StringToInt(String string)
    {
        try
        {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException e)
        {
            return -1;
        }
    }

    public static double StringToDouble (String string) {
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException e) {
            return -1;
        }
    }

}
