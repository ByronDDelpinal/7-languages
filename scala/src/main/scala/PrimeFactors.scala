package com.crebma.primeFactors

object PrimeFactors {

    def isEven(num: Int) : Boolean = {
        num % 2 == 0
    }

    def isGreaterThanTwo(num: Int) : Boolean = {
        num > 2
    }

    def isOne(num: Int) : Boolean = {
        num == 1
    }

    def factors(num: Int, can: Int = 2) : List[Int] = {
        if (can > num) {
            List[Int]()
        } else if (isEven(num) && isGreaterThanTwo(num)) {
            List[Int](2) ++ factors(num/2)
        } else {
            List[Int](num)
        }
    }
}
