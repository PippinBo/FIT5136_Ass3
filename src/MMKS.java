import View.MainMenu;
import Controller.UserController;
import Entity.MealsDatabase;
import Entity.User;

import java.io.IOException;
import java.util.Scanner;

public class MMKS {

    MainMenu mm = new MainMenu();
    User user = new User();
    UserController userController = new UserController();

    public MMKS() {
    }

    /**login方法**/
    public boolean login(){
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("**************************");
        System.out.println("please enter your email.");
        String inputEmail = sc.next();
        System.out.println("**************************");
        System.out.println("please enter your password.");
        String inputPassword = sc.next();
        try {
            if (userController.checkUserLogin(inputEmail, inputPassword)) {
                System.out.println("Login successful! ");
                flag = true;
                showMenu();
            }
            else {
                System.out.println("User password or email is wrong! Please enter again!");
                login();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**显示主菜单方法**/
    public void showMenu(){
        mm.menu();
        while(true){
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch(option){
                case 1:
                    MealsDatabase ma = new MealsDatabase();
                    /**ma.readList();**/
                    System.out.println(ma.readList()); /**测试是否读取txt文件**/
                    break;
                case 2:
                    break;
                case 3:
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
        System.out.println("**************************");
        System.out.println("   Welcome to MMKS   ");
        System.out.println("**************************");
        System.out.println("(1) Login system");
        System.out.println("(2) Exit system");
        System.out.println("Please enter your option :");
    }

    /**主函数**/
    public static void main(String[] args) {
        boolean flag = false;
        MMKS mmks = new MMKS();
        mmks.loginPage();

        while(!flag){
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            switch(option){
                case "1": /**调用登录方法**/
                    mmks.login();
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