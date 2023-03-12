import time


def get_integer():
    return int(input("enter a number: "))


start = time.time_ns()
num = get_integer()

for i in range(2, round(num / 2) + 1):
    if num % i == 0:
        print("not prime")
        # isPrime = False
        print("total time is ", (time.time_ns() - start) / 1000000)
        exit()

# print("Prime = " isPrime)
print("prime")

print("total time is ", (time.time_ns() - start) / 1000000)
