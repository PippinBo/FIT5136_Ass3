import java.util.ArrayList;

public class Meals {
    /**private int id;**/
    private String name;
    private int price;
    private String time;

    /**private String cookMethods;**/

    public Meals(){
        /**id = 0;**/
        name = "unknown";
        price = 0;
        time = "unknown";
        /**cookMethods = "unknown";**/
    }

    public Meals(String name, int price, String time/**String cookMethods**/){
        /**this.id = id;**/
        this.name = name;
        this.price = price;
        this.time = time;
        /**this.cookMethods = cookMethods;**/
    }

    /**public int getId(){
        return id;
    }**/
    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
    public String getTime(){
        return time;
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

    public void setPrice(int price){
        this.price = price;
    }
    public void setTime(String time){
        this.time = time;
    }

    /**public void setCookMethods(String cookMethods){
        this.cookMethods = cookMethods;
    }**/

    public String toString(){
        return "name:" + name + "price:" + price + "time" + time;
    }

}
