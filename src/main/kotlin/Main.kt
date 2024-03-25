fun main(){
  words("Barnie bakes brown bagels and buns")
    my(20,30,40)
    volume(21)
    isPalindrome("Kayak")
}
//Question 1
fun words(name:String){

var newName = name.replace("b","")



}

//Question 2

fun intArray(numbers:Array<Int>){
   for (x in numbers)
       var sum = numbers.sum()
   var count = numbers.count()
    var average = numbers.average()

}

//Question 3

fun volume(radius:Double){
    var radius = 3.14159
println(volume)
}

//Questin 4
fun isPalindrome(word:String):Boolean{
    var newWord=word.reversed()
    if (newWord==word) {
        println(true)
        return true
    }

    else{
        println(false)
        return false
    }
}
