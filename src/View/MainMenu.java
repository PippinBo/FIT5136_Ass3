package View;

import Checker.FilePath;
import Controller.MealController;
import Controller.OrderController;
import Entity.Meal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    Meal meal = new Meal();
    OrderController orderController = new OrderController();
    MealController mealController = new MealController();
    private ArrayList<Meal> allMenus = new ArrayList<Meal>();

    public MainMenu() {
    }

    public void menu()
    {
        System.out.println("Welcome to MMKS");
        System.out.println("**********************");
        System.out.println("(1) Menu Order");
        System.out.println("(2) Meal recipes");
        System.out.println("(3) Log out");
        System.out.println("Please choose an option:");
    }


    public void displayMenu () throws IOException {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        menu();
        while (!flag) {
            String option = sc.nextLine();
            switch (option) {
                case "1":
                    orderController.allMenuPlans();
                    flag = true;
                    break;
                case "2":

                    break;
                case "3":

                    break;

                default:
                    System.out.println("ERROR, INVALID OPTION");
                    orderController.allMenuPlans();
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        MainMenu mainMenu = new MainMenu();
        mainMenu.displayMenu();
    }
}