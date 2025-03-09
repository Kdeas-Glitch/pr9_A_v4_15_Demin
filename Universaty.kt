import exams.*
open class Universaty(var Name: String,var Pred:String,var Date:String,var Mark:Int,var Aut:Boolean):exam(Name,Pred,Date,Mark,Aut) {

    fun Prpred(){
        if(Pred=="Математика"){
            println("Надеюсь вы подготовились математикка сложный предмет")
        }
        else
        {
            println("Надеюсь вы подготовились")
        }
    }

}