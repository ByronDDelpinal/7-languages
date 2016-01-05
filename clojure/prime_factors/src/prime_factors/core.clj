(ns prime-factors.core)

(defn primes
    ([num] (primes num 2))
    ([num divisor]
        (cond
            (< num divisor)
                []
            (zero? (rem num divisor))
                (cons divisor (primes (/ num divisor) divisor))
            :else
                (primes num (inc divisor))
        )
    )
)
