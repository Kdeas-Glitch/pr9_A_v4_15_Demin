package exams
open class exam(var name: String,var pred:String,var date:String,var mark:Int,var aut: Boolean) {

    fun info(){
        println("Студент ${name} по ${pred} получил ${mark}")

    }
    open fun auto(){
        if(aut == true){
            println("Поздравляю у вас автомат")
        }
        else{
            println("Не повезло у вас нет автомата")
        }
    }

    open fun mark(){
        if(mark==3){
            println("Оценка Удовлетварительно")
        }
        if(mark==4){
            println("Оценка Хорошо")
        }
        if(mark==5){
            println("Оценка Отлично поздравляю")
        }
        if(mark==2||mark==1||mark==0){
            println("Оценка Плохо")
        }
    }

}