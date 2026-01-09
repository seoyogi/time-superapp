fun main(){
    println("SmartApp Kotlin版")
    val todos = mutableListOf<String>()
    var steps = 0
    while(true){
        println("時計: ${java.time.LocalTime.now()}")
        println("歩数: $steps")
        print("コマンド (todo x / step y / exit): ")
        val input = readLine()!!
        when {
            input.startsWith("todo ") -> todos.add(input.substring(5))
            input.startsWith("step ") -> steps += input.substring(5).toInt()
            input == "exit" -> break
        }
    }
}
