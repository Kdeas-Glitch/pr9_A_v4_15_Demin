import New.*
class NewYorkTimes(var Name: String,var Num:Int,var Date:String,var Value:Double):Newspaper(Name,Num,Date,Value)  {

    fun Prdate(){
        if(date=="07.03.2025"){
            println("Эта газета сегодняшняя")
        }
        else{
            println("Газета не сегодняшняя")
        }
    }
}