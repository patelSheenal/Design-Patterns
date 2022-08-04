package builderPattern

class MyOrderMain {
    companion object{

        @JvmStatic
        fun main(args: Array<String>){
            //Builder Pattern
           val foodOrder = FoodOrder.Builder()
                .bread("white bread")
                .meat("bacon")
                .condiments("olive oil")
                .build()

            println(foodOrder.toString())
        }
    }
}