import java.util.*


fun main(args : Array<String>) {

    //gets random enum
    fun getRandomMealTime(): Gano.mealTime {
        val rand = Random()
        val number = rand.nextInt(3)
        return if (number == 1) {
            Gano.mealTime.Breakfast
        } else if (number == 2) {
            Gano.mealTime.Lunch
        } else {
            Gano.mealTime.Dinner
        }
    }


    val ganoMeal = Gano(getRandomMealTime())


    var food = ganoMeal.food

    var drink = ganoMeal.drink

    var workingEmployees = ganoMeal.numOfEmployees

    println("${ganoMeal.mealTimeNow}: $drink, $food")
    println("The number of workers at ${ganoMeal.mealTimeNow} is $workingEmployees")


}