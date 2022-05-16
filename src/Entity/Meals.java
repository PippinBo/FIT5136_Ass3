package Entity;

public class Meals {
    /**private int id;**/
    private String name;
    private double price;
    private String time;
    private int size;
    private String tag;
    //private int id;


    /**private String cookMethods;**/

    public Meals(){
        /**id = 0;**/
        name = "unknown";
        price = 0;
        time = "unknown";
        size = 0;
        /**cookMethods = "unknown";**/
        tag = "";
    }

    public Meals(String name, int price, String time/**String cookMethods**/, int size, String tag){
        /**this.id = id;**/
        this.name = name;
        this.price = price;
        this.time = time;
        this.size = size;
        this.tag = tag;
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
    public String getTime(){
        return time;
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
    public void setTime(String time){
        this.time = time;
    }
    public void setSize(int size) {
        this.size = size;
    }

    /**public void setCookMethods(String cookMethods){
     this.cookMethods = cookMethods;
     }**/

    public String toString(){
        return "name:" + name + "price:" + price + "time:" + time + "size:" + size + "Tag:" +  tag;
    }

}

