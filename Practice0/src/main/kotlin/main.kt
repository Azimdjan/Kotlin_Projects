import org.w3c.dom.ranges.Range
import java.util.*
import kotlin.collections.RandomAccess
import kotlin.random.Random.Default.nextInt

fun Starting_Menu(){
    println("->>>Welcome to Guess Number Game<<<-!")
}


fun main(args: Array<String>) {
    Starting_Menu()
    var choice:String? = null;
    println("Computer guessed number!")
    var number:Int = (0..1000).random();
    var guessed_Number:Int? = null;
    do{
        print("Please enter your choice:")
        guessed_Number = readLine()!!.toInt()
        if(guessed_Number<number){
            println("Your answer is too low!")
        }
        else if(guessed_Number>number){
            println("Your answer is too big!")
        }
        else{
            println("Bingo!!!")
            break
        }
    }while(true)
}