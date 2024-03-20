
fun main() {
    // how to find area of a trapezium
    val side1 = 90
    val side2 = 100
    val height = 8
    val result = (height / 2 * (side1 + side2))
    println(result)
    //how to find area of a parallelogram
    val base = 80
    val heights = 90
    val myresult = (base * heights)
    println(myresult)
    //how to find a perimeter of a circle
    val radius = 70
    val myresults = (2 * 22 * radius) / 7
    println(myresults)
    //kotlin arrays
    val learn = arrayOf("pencils", "books", "textbooks", "journals")
    println(learn[3])
    println(learn.size)
    if ("journal" in learn) {
        println("present")


    } else {
        println("does not exist")

    }
    //kotlin  ranges
    for(num in 100..120){
        println(num)
        for (alphabets in 'j'..'z')
            println(alphabets)
        //array of  checking if a value exists
        val fruits= arrayOf("mango","banana","orange","strawberry")
        if("kiwi" in "fruits"){
            println("missing")
        }else{
            println("found")
        }
    }
}

