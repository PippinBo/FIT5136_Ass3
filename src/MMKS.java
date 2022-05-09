import java.util.Scanner;

public class MMKS {
    /**login方法**/
    public void login(){
        MMKS mmks = new MMKS();
        MainMenu mm = new MainMenu();
        User user = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your email.");
        String inputEmail = sc.next();
        if (user.checkEmail(inputEmail)) {
            System.out.println("please enter your password.");
            String inputPassword = sc.next();
            if (user.checkUserId(inputPassword, inputEmail)) {
                mmks.showMenu();
            }
        }
    }

    /**显示主菜单方法**/
    public void showMenu(){
        MainMenu mm = new MainMenu();
        mm.menu();
        while(true){
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            switch(option){
                case "1":
                    Mealsdatabase ma = new Mealsdatabase();
                    /**ma.readList();**/
                    System.out.println(ma.readList()); /**测试是否读取txt文件**/
                    break;
                case "2":
                    break;
                case "3":
                    System.out.println("USER SELECT 3");
                    System.out.println("GOOD BYE. THANK YOU!");
                    System.exit(3);
                    break;
                default:
                    System.out.println("ERROR, INVALID OPTION");
                    mm.menu();
                    break;
            }
        }
    }

    public void loginPage(){
        System.out.println("   Welcome to MMKS   ");
        System.out.println("**************************");
        System.out.println("(1) Login system");
        System.out.println("(2) Exit system");
        System.out.println("Please enter your option :");
    }

    /**主函数**/
    public static void main(String[] args) {
        MMKS mmks = new MMKS();
        MainMenu mm = new MainMenu();
        User user = new User();
        mmks.loginPage();
        while(true){

            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            switch(option){
                case "1":
                    mmks.login();/**调用登录方法**/
                    break;
                case "2" :
                    System.out.println("USER SELECT 2");
                    System.out.println("GOOD BYE. THANK YOU!");
                    System.exit(2);
                    break;
                default:
                    System.out.println("ERROR, INVALID OPTION");
                    mmks.loginPage();
                    break;
            }
        }

    }
}
