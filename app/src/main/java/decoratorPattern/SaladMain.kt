package decoratorPattern

class SaladMain {
    companion object{

        @JvmStatic
        fun main(args: Array<String>){
            val cucumberSalad = CucumberSalad(SaladMake())
            println(cucumberSalad.addIngredient())

            val carrotCucumberSalad = CarrotSalad(cucumberSalad)
            println(carrotCucumberSalad.addIngredient())
        }
    }
}