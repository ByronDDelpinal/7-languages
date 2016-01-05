package prime_factors

func Factors(num int) []int {
    return getFactors(num, 2);
}

func getFactors(num int, can int) []int {
    if can > num {
        return []int{}
    } else if (num % can == 0) {
        return append([]int{can}, getFactors((num / can), can)...)
    } else {
        return getFactors(num, can + 1)
    }
}
