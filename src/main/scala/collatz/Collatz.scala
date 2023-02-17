def collatz(n: Int) =
    if ((n % 2) == 0) then (n / 2)
    else (3 * n) + 1

def collatzCount(n: Int): Int =
    if (n == 1) then 0
    else 1 + collatzCount(collatz(n))
