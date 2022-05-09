
/**尝试读取txt文件中的菜谱内容，未完成**/
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Mealsdatabase {
    public String name;
    public int price;
    public String time;
    private ArrayList<Meals> mealsList;
    /**public static String mealsName;**/

    public Mealsdatabase(){
        mealsList = new ArrayList<Meals>();
    }
    /**display all meals**/
    public void displayAllMeals(){
        for (Meals a : mealsList)
        {
            System.out.println(a);
        }
    }
    /**display all meals with number**/
    public void displayAllMeals1()
    {
        int count = 0;
        for (Meals a : mealsList)
        {
            count ++;
            System.out.println(count + ". " + a);
        }
    }

    public void readFile()
    {
        String filename = ("Meals.txt");
        try
        {
            FileReader inputFile = new FileReader(filename);
            try
            {
                Scanner parser = new Scanner(inputFile);
                while (parser.hasNextLine())
                {
                    String[] tokens = parser.nextLine().split(",");
                    String title = tokens[0];
                    String author = tokens[1];
                    String rating = tokens[2];
                    mealsList.add(new Meals(name, price, time));
                }

            }
            finally
            {
                inputFile.close();
            }
        }
        catch(FileNotFoundException exception)
        {
            System.out.println(filename + "not found");
        }
        catch(IOException exception)
        {
            System.out.println("Unexpected I/O exception occurs");
        }

    }

    public ArrayList readList()
    {
        return mealsList;
    }


}
