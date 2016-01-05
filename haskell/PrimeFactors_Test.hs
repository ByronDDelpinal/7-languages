module PrimeFactors_Test where

import PrimeFactors (primeFactors)
import Test.HUnit

test1 = TestCase $ assertEqual "factors of 1 are []" [] (primeFactors 1)
test2 = TestCase $ assertEqual "factors of 2 are [2]" [2] (primeFactors 2)


main = runTestTT $ TestList [test1, test2]
