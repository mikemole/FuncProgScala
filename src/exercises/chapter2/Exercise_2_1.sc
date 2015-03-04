package exercises.chapter2

object Exercise_2_1 {
  def fib(n: Int): Int = {
  	if (n < 0) throw new IllegalArgumentException("less than 0: " + n)
  	
  	@annotation.tailrec
  	def loop(n: Int, a: Int, b: Int): Int = {
  		if (n == 0) a
  		else if (n == 1) b
  		else loop(n - 1, b, a + b)
  	}
  	loop(n, 0, 1)
  }                                               //> fib: (n: Int)Int
  
  println("0 == " + fib(0))                       //> 0 == 0
  println("1 == " + fib(1))                       //> 1 == 1
  println("1 == " + fib(2))                       //> 1 == 1
  println("2 == " + fib(3))                       //> 2 == 2
  println("3 == " + fib(4))                       //> 3 == 3
  println("5 == " + fib(5))                       //> 5 == 5
}