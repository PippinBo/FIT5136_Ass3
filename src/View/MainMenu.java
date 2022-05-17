package View;

import Checker.FilePath;
import Controller.MealController;
import Entity.Meal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    Meal meal = new Meal();
    MealController mealController = new MealController();
    private ArrayList<Meal> allMenus = new ArrayList<Meal>();

    public void menu()
    {
        System.out.println("Welcome to MMKS");
        System.out.println("**********************");
        System.out.println("(1) Menu Order");
        System.out.println("(2) Meal recipes");
        System.out.println("(3) Log out");
        System.out.println("Please choose an option:");
    }

    public void allMenuPlans () {
        System.out.println("**********************");
        System.out.println("(1) Current week");
        System.out.println("(2) Previous week");
        System.out.println("(3) Previous two weeks");
        System.out.println("(4) Next week");
        System.out.println("(5) Next two weeks");
    }


    public void displayMenu () throws IOException {

        //从数据库中提取menu plan
        //将数据库的meal plan显示给用户
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        menu();
        while (!flag) {
            String option = sc.nextLine();
            switch (option) {
                case "1":
                    allMenuPlans();
                    //System.out.println(mealController.readMealFile(FilePath.currentFile));
                    flag = true;
                    break;
//                case "2":
//                    mealController.readMealFile(FilePath.PreviousWeekFile);
//                    flag = true;
//                    break;
//                case "3":
//                    mealController.readMealFile(FilePath.PreviousTwoWeeksFile);
//                    flag = true;
//                    break;
//                case "4":
//                    mealController.readMealFile(FilePath.NextWeekFile);
//                    flag = true;
//                    break;
//                case "5":
//                    mealController.readMealFile(FilePath.NextTwoWeeksFile);
//                    flag = true;
//                    break;
                default:
                    System.out.println("ERROR, INVALID OPTION");
                    allMenuPlans();
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        MainMenu mainMenu = new MainMenu();
        mainMenu.displayMenu();
    }
}