import exams.*
open class Collage(var Name: String,var Pred:String,var Date:String,var Mark:Int,var Aut:Boolean,var kurs: Int):exam(Name,Pred,Date,Mark,Aut) {

    fun Kurs(){
        if(kurs==1){
            println("Удачи на первом экзамене")
        }
        else{
            if(kurs==4){
                println("Удачи на последнем экзамене")
            }
            else{
                println("Удачи на экзаменах")
            }
        }
    }

}