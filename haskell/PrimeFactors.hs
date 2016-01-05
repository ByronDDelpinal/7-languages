module PrimeFactors (primeFactors) where

primeFactors :: Integer -> [Integer]
primeFactors x = primeFactors' x 2
  where primeFactors' x c -- primeFactors' is the function definition so the guards must be indented two spaces past that.
          | x < c = []
          | x `mod` c == 0 = [c] ++ primeFactors' (x `div` c) c
          | otherwise = primeFactors' x (c + 1)
