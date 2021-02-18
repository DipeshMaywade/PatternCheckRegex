import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternImplement implements PatternInterface {
    public void useCase1(String pattern1){
    String regex = "^[1-9]{1}[0-9]{5}";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(pattern1);
    boolean result = m.matches();
    System.out.println(result);
    }
    public void useCase2(String pattern2){
        String regex = "^[A-Z]{1}[1-9]{1}[0-9]{5}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern2);
        boolean result = m.matches();
        System.out.println(result);
    }
    public void useCase3(String pattern3){
        String regex = "^[1-9]{1}[0-9]{5}[A-Z]{1}]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern3);
        boolean result = m.matches();
        System.out.println(result);
    }
    public void useCase4(String pattern4){
        String regex = "[1-9]{1}[0-9]{2}[0-9]{3}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern4);
        boolean result = m.matches();
        System.out.println(result);

    }


}
