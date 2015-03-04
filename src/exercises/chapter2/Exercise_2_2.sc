package exercises.chapter2

object Exercise_2_2 {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
  	@annotation.tailrec
  	def loop(n: Int): Boolean = {
  		if (as.length <= 1 || n >= as.length) true
  		else ordered(as(n-1), as(n)) && loop(n+1)
  	}
  	
  	loop(1)
  }                                               //> isSorted: [A](as: Array[A], ordered: (A, A) => Boolean)Boolean
  
  isSorted(Array(1, 2, 3), (a: Int, b: Int) => a < b)
                                                  //> res0: Boolean = true
  isSorted(Array(1, 4, 2), (a: Int, b: Int) => a < b)
                                                  //> res1: Boolean = false
}