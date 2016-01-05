(ns prime-factors.core)

(defn primes
  ([num]
    (cond
        (< num 2)
            []
        (and (zero? (rem num 2)) (> num 2))
            [2, (quot num 2)]
        :else
            [num]
        )
    )
)
