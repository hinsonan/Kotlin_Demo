import java.util.Random;

public class Gano {

    public enum mealTime{
        Breakfast, Lunch, Dinner
    }

    private String[] breakfastFood = new String[]{"Pancakes", "Sausage", "Waffles"};
    private String[] lunchFood = new String[]{"Cheeseburger", "Mystery Meat", "Chicken"};
    private String[] dinnerFood = new String[]{"Steak", "Pizza", "Old Leftovers"};

    private String[] breakfastDrink = new String[]{"Orange Juice", "Milk", "Apple Juice"};
    private String[] lunchDrink = new String[]{"Coke", "Dr.Pepper", "Water"};
    private String[] dinnerDrink = new String[]{"Fruit Punch", "Goat Milk", "Disgusting Sprite"};


    public mealTime mealTimeNow;
    private String food;
    private int numOfEmployees;
    private String drink;

    public Gano(mealTime meal){
        this.mealTimeNow = meal;
    }

    public int getNumOfEmployees() {
        switch (mealTimeNow){
            case Breakfast: numOfEmployees = 10;
            break;
            case Lunch: numOfEmployees = 20;
            break;
            case Dinner: numOfEmployees = 25;
            break;
        }
        return numOfEmployees;
    }

    public String getFood(){
        Random rand = new Random();
        if (mealTimeNow == mealTime.Breakfast){
            return breakfastFood[rand.nextInt(3)];
        }
        else if(mealTimeNow == mealTime.Lunch){
            return lunchFood[rand.nextInt(3)];

        }
        else{
            return dinnerFood[rand.nextInt(3)];

        }
    }

    public String getDrink(){
        Random rand = new Random();
        if (mealTimeNow == mealTime.Breakfast){
            return breakfastDrink[rand.nextInt(3)];
        }
        else if(mealTimeNow == mealTime.Lunch){
            return lunchDrink[rand.nextInt(3)];

        }
        else{
            return dinnerDrink[rand.nextInt(3)];

        }
    }


}
