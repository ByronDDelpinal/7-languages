package com.crebma.primeFactors

object PrimeFactors {

  def factors(num: Int) : List[Int] = {
    if (num == 1) {
        List[Int]()
    } else if (num % 2 == 0 && num > 2) {
        List[Int](2) ++ factors(num/2)
    } else {
        List[Int](num)
    }
  }
}
