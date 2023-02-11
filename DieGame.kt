//Diljeet Singh A00254609 and Simranjeet Kaur A00254648
fun main(){
    println("Creating a default dice")
    val d6 = Die()
    println("Creating a d20")
    val d20 = Die(20)
   

    println("Current side up for ${d6.GetName()} is ${d6.GetFaceUp()}")
    println("Current side up for ${d20.GetName()} is ${d20.GetFaceUp()}")
   
    println(".....................................\n")

    println("Testing the roll functions")
    println("Rolling the ${d6.GetName()}")
    d6.Roll()
    println("The new value is ${d6.GetFaceUp()}")
    println(".....................................\n")

    println("Rolling the ${d20.GetName()}")
    d20.Roll()
    println("The new value is ${d20.GetFaceUp()}")
    println(".....................................\n")

    
    println(".....................................\n")

    println("Setting the ${d20.GetName()} to show 20")
    d20.SetFaceUp(20)
    println("The side up is now ${d20.GetFaceUp()}")
    val dice1 = Die()
    val dice2 = Die()
    val dice3 = Die()
    val dice4 = Die()
    val dice5 = Die()
    println("Creating Five Dice")
    println(Yahtzee(dice1,dice2,dice3,dice4,dice5))

}
fun Yahtzee(die1:Die,die2:Die,die3:Die,die4:Die,die5:Die):Int{
    var counter:Int = 0
    while (die1.GetFaceUp()!=die2.GetFaceUp() || die2.GetFaceUp()!=die3.GetFaceUp() || die3.GetFaceUp()!=die4.GetFaceUp() || die4.GetFaceUp()!=die5.GetFaceUp()){
        die1.Roll()
        die2.Roll()
        die3.Roll()
        die4.Roll()
        die5.Roll()
        counter++
    }
    println("Yaay it took following rolls :" )
    return counter
}
