(ns prime-factors.core)

(defn primes
    ([num]
        (cond
            (< num 2)
                []
            (and (zero? (rem num 2)) (> num 2))
                (cons 2 (primes (/ num 2)))
            (and (zero? (rem num 3)))
                (cons 3 (primes (/ num 3)))
            :else
                [num]
        )
    )
)
