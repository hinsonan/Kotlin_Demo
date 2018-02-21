
fun main(args : Array<String>) {

    //this function will be used later on the array
    fun performOperation(x: Double) = Math.sqrt(Math.abs(x)) + 5.0
    //make array for the ints to be in
    var array = ArrayList<Double>()

    //ask for user input up to 11 number
    var count = 0
    while(count < 11){
        println("Please enter a number")
        array.add(count, readLine()!!.toDouble())
        count++
    }
    //reverse the array.
    var reverseArray = ArrayList<Double>()
    var countdown = 10
    for(i in 0..10){

        reverseArray.add(i, array[countdown])
        countdown -= 1

    }

    //perform operation on the reverse array
    //if value is above 50 print your number is above 50 else print the value
    for(i in reverseArray.indices){
        val number = performOperation(reverseArray[i])
        if(number > 300){
            println("This value is above 300 so we wont print it out")
        }
        else{
            println(number)
        }
    }



}

