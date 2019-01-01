package ch1.item2;

public class JavaBeans {

    private int servingSize = -1;
    private  int serving = -1;
    private  int calories = 0;
    private  int fat = 0;
    private  int sodium = 0;


    public JavaBeans() {}

    public  int getCalories() {

        return calories;
    }


    public  void setServingSize(int val) {servingSize = val;}
    public  void setServings(int val) { serving = val ;}
    public  void setCalories(int val) {calories = val;}
    public  void setFat(int val) { fat = val ;}
    public  void setSodium(int val) {sodium = val;}

}
