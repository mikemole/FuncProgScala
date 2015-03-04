package exercises.chapter2

// Implement the higher-order function that composes two functions.
// def compose[A,B,C](f: B => C, g: A => B): A => C
object Exercise_2_5 {
  def compose[A,B,C](f: B => C, g: A => B): A => C = {
  	(a: A) => f(g(a))
  }                                               //> compose: [A, B, C](f: B => C, g: A => B)A => C
}