package validation;

public class validation {

    public static boolean isnull(String fname)
    {
        if(fname.isEmpty()) {
            return  true;
        }
        return false;
    }
}
