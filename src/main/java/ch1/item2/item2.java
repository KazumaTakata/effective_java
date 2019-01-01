package ch1.item2;

public class item2 {

    public static void main(String[] args) {

        telescopePattern nut = new telescopePattern(23, 4, 111);


        System.out.printf("nut carorie is %d", nut.getCalories());


        JavaBeans nutBeans = new JavaBeans();
        nutBeans.setCalories(44);


        System.out.printf("nut carorie is %d", nutBeans.getCalories());

        builderPattern nutBuild = new builderPattern.Builder(240, 44).calories(44).sodium(444).carbohydrate(553).build();
    }


}
