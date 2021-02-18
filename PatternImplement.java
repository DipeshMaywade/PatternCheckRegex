import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternImplement implements PatternInterface{

    public void useCase1(String pattern1){
        String regex = "^\abc.-\+[a-zA-Z0-9-]+@\bridgelabz.-\\+[a-zA-Z0-9.-]+\\.[a-zA-Z]$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern1);
        boolean result = m.matches();
        System.out.println(result);
    }
    public void useCase2(String pattern2){
        String regex = "^\abc.-\+[a-zA-Z0-9-]+@\bridgelabz.-\\+[a-z]{2}+\\.[a-zA-Z]{2}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern2);
        boolean result = m.matches();
        System.out.println(result);

    }
    public void useCase3(String pattern3){
        String regex = "^\abc.-\+[a-zA-Z-]{3}+@\bridgelabz.-\\+[a-zA-Z\.-]{2}+\\.[a-zA-Z]{2}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern3);
        boolean result = m.matches();
        System.out.println(result);

    }
    public void useCase4(String pattern4){
        String regex = "^\abc.-\+[a-zA-Z0-9-]+@\bridgelabz.-\\+[a-z]{2}+\\.[a-z]{2}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern4);
        boolean result = m.matches();
        System.out.println(result);
    }
}
