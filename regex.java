import java.util.regex.Pattern;
public class regex {
    public static void main(String[] args){
        System.out.println(Pattern.matches("[abc]","b"));
        System.out.println(Pattern.matches("[^ac]","b"));
        System.out.println(Pattern.matches("[a-i]","o"));
        System.out.println(Pattern.matches("[abc]?","b"));
    }
    
}
