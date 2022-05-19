package Controller;

import Checker.FilePath;
import Entity.Meal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OrderController {

    private MealController mealController = new MealController();
    private ArrayList<Meal> allMeals;

    {
        try {
            allMeals = mealController.readMealFile(FilePath.meals);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Meal> resultMeals = new ArrayList<Meal>();
    //记录用户选择的menu plan 并储存
    //根据用户选择的 menu plan显示用户选择menu plan
    //

    public OrderController() {
    }

    public void addMeals() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("Please choose your favourite meal! Enter 0 to end the select.");
        int choice = sc.nextInt();
        if (choice == 0)
            allMenuPlans();
        else
            addMealsById(choice);
    }

    public void allMenuPlans () throws IOException {

        //从数据库中提取menu plan
        //将数据库的meal plan显示给用户
        System.out.println("**********************");
        System.out.println("(1) Show all meals and add one meal.");
        System.out.println("(2) Add one meal.");
        System.out.println("(3) Show your order summary.");
        System.out.println("(4) Enter 0 to end the select.");
        System.out.println("**********************");
        System.out.println("Please enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        boolean flag = false;
        while (!flag) {
            switch (option) {
                case 1:
                    System.out.println(allMeals);
                    flag = true;
                    allMenuPlans();
                    break;
                case 2:
                    addMeals();
                    break;
                case 3:
                    orderSummary();
                    flag = true;
                    allMenuPlans();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR, INVALID OPTION");
                    allMenuPlans();
                    break;
            }
//            switch (option) {
//                case "1":
//                    choice = sc.nextInt();
//                    addMealsById(choice);
//                    flag = true;
//                    allMenuPlans();
//                    break;
//                case "2":
//                    System.out.println("Please choose your favourite meal!");
//                    choice = sc.nextInt();
//                    addMealsById(choice);
//                    flag = true;
//                    break;
//                case "3":
//                    System.out.println("Please choose your favourite meal!");
//                    choice = sc.nextInt();
//                    addMealsById(choice);
//                    flag = true;
//                    break;
//                case "4":
//                    System.out.println("Please choose your favourite meal!");
//                    choice = sc.nextInt();
//                    addMealsById(choice);
//                    flag = true;
//                    break;
//                case "5":
//                    System.out.println("Please choose your favourite meal!");
//                    choice = sc.nextInt();
//                    addMealsById(choice);
//                    flag = true;
//                    break;
//                default:
//                    System.out.println("ERROR, INVALID OPTION");
//                    allMenuPlans();
//                    break;
//            }
        }
    }

    public ArrayList<Meal> addMealsById (int inputId) throws IOException {
        for (Meal m : allMeals) {
            if (m.getId() == inputId && inputId > 0 && inputId <= allMeals.size()) {
                if (resultMeals.contains(inputId)) {
                    System.out.println("This meal is already exist!");
                    break;
                }
                else {
                    resultMeals.add(m);
                    System.out.println("Add successfully!");
                }
            }
        }
        System.out.print("This is your meals: " + resultMeals);
        //System.out.println("This meal is not exist! Please input again!");
        return resultMeals;
    }

    public void orderSummary() {//此方法为将所有的meal放到这里列出来
        System.out.println(resultMeals);
    }
}