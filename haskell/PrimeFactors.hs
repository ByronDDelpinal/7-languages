module PrimeFactors (primeFactors) where

primeFactors :: Integer -> [Integer]
primeFactors 1 = []
primeFactors x
  | (x `mod` 2 == 0) && (x > 2) = [2, x `div` 2]
  | otherwise = [x]


