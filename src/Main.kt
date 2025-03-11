import strategyPattern.FlyWithWings
import strategyPattern.MallardDuck
import strategyPattern.MuteQuack


fun main() {
    val mallardDuck = MallardDuck(
        flyBehaviour = FlyWithWings(),
        quackBehaviour = MuteQuack()
    )
    println(mallardDuck.display())
    println(mallardDuck.swim())
    println(mallardDuck.performFly())
    println(mallardDuck.performQuack())
}