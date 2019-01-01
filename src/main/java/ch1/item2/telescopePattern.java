package ch1.item2;

public class telescopePattern {


        private final int servingSize;
        private final int servings;
        private  final  int calories;
        private  final  int fat;

        public  telescopePattern(int servingSize, int servings) {
            this(servingSize, servings, 0);
        }

        public  telescopePattern(int servingSize, int servings, int calories) {
            this(servingSize, servings, calories, 0);
        }

        public int  getCalories(){
            return this.calories;
        }

        public  telescopePattern(int servingSize, int servings, int calories, int fat) {
            this.servingSize = servingSize;
            this.servings = servings;
            this.calories = calories;
            this.fat = fat;
        }



}
