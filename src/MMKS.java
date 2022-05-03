import java.util.Scanner;

public class MMKS {

    public static void main(String[] args) {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        String inputEmail = sc.next();
        user.checkEmail(inputEmail);

    }
}
