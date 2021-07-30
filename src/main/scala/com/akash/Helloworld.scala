package com.akash
import scala.collection.mutable

trait Queues{
  def enqueue(q: mutable.Queue[Int]): mutable.Queue[Int]
  def dequeue(q: mutable.Queue[Int]): mutable.Queue[Int]

}

class DoubleQueue extends Queues{
  override def enqueue(q: mutable.Queue[Int]): mutable.Queue[Int] =  {
    val qq =q.map (c => c * 2)
    println(s"double enqueue ${qq.enqueue(2)} ")
    q
  }

  override def dequeue(q: mutable.Queue[Int]): mutable.Queue[Int] = {
    q.dequeue()
    println(s"double dequeue $q ")
    q
  }
}

class SquareQueue extends Queues{
  override def dequeue(q: mutable.Queue[Int]) = {

      q.dequeue()
    println(s"square dequeue $q")
    q
  }

  override def enqueue(q: mutable.Queue[Int]) = {
    val qq =q.map (c => c * c)
    println(s"square Enqueue: ${qq.enqueue(2)}")
    q
  }
}

object MainObject{
  def main(args:Array[String]){
    var queue2: mutable.Queue[Int] = mutable.Queue(1, 5, 6, 2, 3, 9, 5, 2, 5)
    var double = new DoubleQueue
    var square = new SquareQueue
    double enqueue queue2
    double dequeue queue2

    square enqueue queue2
    square dequeue queue2


  }
}
