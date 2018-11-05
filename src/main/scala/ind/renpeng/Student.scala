package ind.renpeng

object Student {
  def main(args: Array[String]): Unit = {
    val goodStudent=new GoodStudent();
    goodStudent.age=22
    println(goodStudent.name)
    println(goodStudent.age)
    println(goodStudent.eat("bread"))
    println(goodStudent.getId())
    goodStudent.study();
  }
}
//主构造器
class GoodStudent(val name:String,var age:Int){
//附属构造器
  def this(name:String, age:Int,gender:Int){
    this(name,age)
  }

  def this(){
    this("tom",10,1)
  }

  private [this] var id:String=_

  def study():Unit={
    println("studying")
  }
  def eat(food:String):String={
    "eating"+food
  }
  def getId():String={
    id="123"
     id
  }

}
