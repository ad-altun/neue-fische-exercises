package org.example

fun main() {
    println()
    val primes = generateFirstNPrimes(10)
    println("First " + primes.size + " prime numbers are: ")
    println(primes) // Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
}

fun generateFirstNPrimes(n: Int): List<Int> {
    val primes = mutableListOf<Int>()
    var num = 2

    while (primes.size < n) {
        if (isPrime(num)) {
            primes.add(num)
        }
        num++
    }

    return primes
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    if (number == 2) return true
    if (number % 2 == 0) return false

    for (i in 3..Math.sqrt(number.toDouble()).toInt() step 2) {
        if (number % i == 0) return false
    }

    return true
}
