import New.*
class BostonTimes(var Name: String,var Num:Int,var Date:String,var Value:Double):Newspaper(Name,Num,Date,Value)  {

    fun Prnum(){
        if(Num==1000){
            println("Тысячный экземпляр")
        }
        else{
            println("Не Тысячный экземпляр")
        }
    }
}