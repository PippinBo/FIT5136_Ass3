package Entity;

import java.util.Arrays;

public class Meal {
    /**private int id;**/
    private String name;
    private double price;
    private int size;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String tag;
    private int id;
    private String[] steps;

    /**private String cookMethods;**/

    public Meal(){
        /**id = 0;**/
        name = "unknown";
        price = 0;
        id = 0;
        size = 0;
        time = "";
        /**cookMethods = "unknown";**/
        tag = "";
        steps = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getSteps() {
        return steps;
    }

    public void setSteps(String[] steps) {
        this.steps = steps;
    }

    public Meal(int id, String name, double price, int size, String time,String tag, String[] steps){
        /**this.id = id;**/
        this.name = name;
        this.price = price;
        this.id = id;
        this.size = size;
        this.time = time;
        this.tag = tag;
        this.steps = steps;
        /**this.cookMethods = cookMethods;**/
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    /**public int getId(){
     return id;
     }**/
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getSize() {
        return size;
    }

    /**public String getCookMethods(){
     return cookMethods;
     }**/

    /**public void setId(int Id){
     this.id = id;
     }**/
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public void setSize(int size) {
        this.size = size;
    }

    /**public void setCookMethods(String cookMethods){
     this.cookMethods = cookMethods;
     }**/

    @Override
    public String toString() {
        return
                "Id:" + id + "." + "\t" +
                "Name:" + name + "." + "\t" +
                "Price:" + price + "." + "\t" +
                "Time:" + time + "." + "\t" +
                "Size:" + size + "." + "\t" +
                "Tag:" + tag + "." + "\t" +
                "Steps:" + Arrays.toString(steps) + "\n";
    }
}

