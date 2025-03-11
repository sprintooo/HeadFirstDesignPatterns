package strategyPattern

/*abstract class Duck{
    fun swim(): Unit {}
    abstract fun display()
}

interface Quackable {
    fun quack()
}

interface Flyable {
    fun fly()
}

class MallardDuck : Duck(), Flyable, Quackable {
    override fun display() {}
    override fun fly() {}
    override fun quack() {}
}*/


// TODO - We need to make ducks fly ( how? )
// You just can't add functionality in superclass and lets others inherit this, it that is not their behaviour

// Solution - Duck

interface FlyBehaviour {
    fun fly()
}

class FlyWithWings() : FlyBehaviour {
    override fun fly() {
        println("Flying with wings...")
    }
}
class FlyNoWay(): FlyBehaviour{
    override fun fly() {
        println("I am not flying...")
    }
}

interface QuackBehaviour{
    fun quack()
}

class Quack(): QuackBehaviour{
    override fun quack() {
        println("I am Quacking...")
    }
}
class Squeak(): QuackBehaviour{
    override fun quack() {
        println("I am Squeaking...")
    }
}
class MuteQuack(): QuackBehaviour{
    override fun quack() {
        println("I am not quacking")
    }
}

abstract class Duck(
    private val flyBehaviour: FlyBehaviour,
    private val quackBehaviour: QuackBehaviour
) {
    fun performFly(){
        flyBehaviour.fly()
    }
    fun performQuack(){
        quackBehaviour.quack()
    }
    abstract fun swim()
    abstract fun display()
}

class MallardDuck(
    private val flyBehaviour: FlyBehaviour,
    private val quackBehaviour: QuackBehaviour
): Duck(flyBehaviour, quackBehaviour){
    override fun swim() {
        println("Mallard Duck is swimming...")
    }

    override fun display() {
        println("I am real mallard duck")
    }

}
