import java.util.Scanner;

public class MMKS {

    public static void main(String[] args) {
        MainMenu mm = new MainMenu();

        User user = new User();
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your email.");
        String inputEmail = sc.next();
        if (user.checkEmail(inputEmail)) {

            System.out.println("please enter your password.");
            String inputPassword = sc.next();
            if (user.checkUserId(inputPassword, inputEmail)) {
                //System.out.println("This is your information.");
                //user.toString();
                mm.menu();
            }
            /*else {
                System.out.println("");
            }*/
        }
        /*else {
            System.out.println("");
        }*/
    }
}
