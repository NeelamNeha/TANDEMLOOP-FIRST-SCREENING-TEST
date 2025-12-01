arr=list(map(int,input("Enter a series of values:").split(',')))
out={i: sum(num%i==0 for num in arr) for i in range(1,10)}
print(out)