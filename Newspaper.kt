package New
open class Newspaper(var name: String,var num:Int,var date:String,var value: Double) {
    open fun info(){
        println("${name}: ${num} ${date}")
    }
    open fun Number(){
        if(num<=0){
            println("Неверный номер")
        }
        else
            if(num<1000){
                println("до 1000 экземпляпа ${1000-num} экземпляров")
            }
            else
                if (num>1000){
                    println("1000 экземпляр был ${num-1000} экземпляров назад")
                }
                else
                    println("Это 1000 экземпляр!!")

    }
    open fun Price(){
        if(value<=0){
            println("Неверная цена")
        }
        else
            if(value>100){
                println("Цена высокая")
            }
            else
                if (value>50){
                    println("Цена средняя")
                }
                else{
                    println("Низкая цена")//😐
                }
    }

}