num = int(input("how many fibonacci numbers? "))
x = 1
y = 1
if num == 1:
    print(x)
    exit()
if num == 2:
    print(x)
    print(y)
    exit()
print(x)
print(y)
for i in range(2, num):
    y = x + y
    print(y)
    x = y - x
