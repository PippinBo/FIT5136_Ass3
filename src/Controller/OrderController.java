package Controller;

import Checker.FilePath;
import Entity.Meal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OrderController {

    private MealController mealController = new MealController();
    private ArrayList<Meal> resultMeals = new ArrayList<Meal>();
    private ArrayList<Meal> allMeals = new ArrayList<Meal>();
    //记录用户选择的menu plan 并储存
    //根据用户选择的 menu plan显示用户选择menu plan
    //

    public void allMenuPlans () throws IOException {

        //从数据库中提取menu plan
        //将数据库的meal plan显示给用户
        System.out.println("**********************");
        System.out.println("(1) Current week");
        System.out.println("(2) Previous week");
        System.out.println("(3) Previous two weeks");
        System.out.println("(4) Next week");
        System.out.println("(5) Next two weeks");
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            String option = sc.nextLine();
            switch (option) {
                case "1":
                    mealController.getMealList();
                    System.out.println("Please choose your favourite meal!");
                    int choice = sc.nextInt();
                    addMealsById(choice, FilePath.currentFile);
                    flag = true;
                    break;
                case "2":
                    mealController.getMealList();
                    System.out.println("Please choose your favourite meal!");
                    int choice2 = sc.nextInt();
                    addMealsById(choice2, FilePath.PreviousWeekFile);
                    flag = true;
                    break;
                case "3":
                    System.out.println(mealController.readMealFile(FilePath.PreviousTwoWeeksFile));
                    flag = true;
                    break;
                case "4":
                    System.out.println(mealController.readMealFile(FilePath.NextWeekFile));
                    flag = true;
                    break;
                case "5":
                    System.out.println(mealController.readMealFile(FilePath.NextTwoWeeksFile));
                    flag = true;
                    break;
                default:
                    System.out.println("ERROR, INVALID OPTION");
                    allMenuPlans();
                    break;
            }
        }
    }

    public ArrayList<Meal> addMealsById (int inputId, String fileName) throws IOException {
        allMeals = mealController.readMealFile(fileName);
        for (Meal m : allMeals) {
            if (m.getId() == inputId && inputId > 0) {
                resultMeals.add(m);
                System.out.println("Add successfully!");
            }
        }
        System.out.println("This is your meals: ");
        //System.out.println("This meal is not exist! Please input again!");
        System.out.println(resultMeals);
        return resultMeals;
    }

    public void orderSummary() {//此方法为将所有的meal放到这里列出来
        System.out.println(resultMeals);
    }
}
