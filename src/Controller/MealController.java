package Controller;

import Checker.Check;
import Entity.Meal;
import Entity.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MealController {

    private FileReader fileReader;
    private ArrayList<Meal> mealsList = new ArrayList<Meal>();


    public MealController() {}

    public ArrayList<Meal> readMealFile (String fileName) throws IOException {
        Scanner sc = null;
        try {
            FileReader inputFile = new FileReader(fileName);
            sc = new Scanner(inputFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] values = line.split(",");
                String[] steps = new String[3];
                if (values.length == 9) {
                    int id = Check.StringToInt(values[0]);
                    String name = values[1];
                    double price = Check.StringToDouble(values[2]);
                    int size = Check.StringToInt(values[3]);
                    String time = values[4];
                    String tag = values[5];
                    steps[0] = values[6];
                    steps[1] = values[7];
                    steps[2] = values[8];
                    Meal meal = new Meal(id,name,price,size,time,tag,steps);
                    mealsList.add(meal);
                }
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
        finally {
            if (sc != null)
                sc.close();
        }
        return this.mealsList;
    }

    public Meal searchMealById(int id) {
        Meal resultMeal = null;
        if (mealsList.isEmpty()) {
            return null;
        }
        if (id <= 0) {
            return null;
        }
        for (Meal m : mealsList) {
            if (m.getId() == id) {
                resultMeal = m;
                break;
            }
        }
        return resultMeal;
    }

    // file io 读数据
    // 返回view显示

    public ArrayList<Meal> getMealList() {
        return this.mealsList;
    }

    public void showAllMeals() {
        System.out.println(mealsList);
    }
}
