package exercises.chapter2

// Currying
object Exercise_2_3 {
 
  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
  	(a: A) => ((b: B) => f(a, b))
  }                                               //> curry: [A, B, C](f: (A, B) => C)A => (B => C)
  
}