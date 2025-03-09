import New.*
open class BostonTimes(var Name1: String, var Num:Int, var Date:String, var Value:Double):Newspaper(Name1,Num,Date,Value)  {

    open fun Prnum(){
        if(Num==1000){
            println("Тысячный экземпляр")
        }
        else{
            println("Не Тысячный экземпляр")
        }
    }
}