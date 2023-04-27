package com.example.headfirstdesignpattern.`1-duck`

abstract class Duck(
    private var flyBehavior: FlyBehavior,
    private var quackBehavior: QuackBehavior,
) {
    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        print("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠")
    }

    fun setFlyBehavior(fb: FlyBehavior) {
        flyBehavior = fb
    }

    fun setQuackBehavior(qb: QuackBehavior) {
        quackBehavior = qb
    }
}

class MallardDuck: Duck(
    flyBehavior = FlyWithWings(),
    quackBehavior = Quack(),
) {
    override fun display() {
        print("저는 물오리입니다.")
    }
}

class ModelDuck: Duck(
    flyBehavior = FlyNoWay(),
    quackBehavior = Quack(),
) {
    override fun display() {
        println("저는 모형 오리 입니다")
    }
}
