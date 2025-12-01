n=int(input())

count=0
if n%2==0:
        count=n-1
else:
    count=n    
for i in range(1,count+1):    
    print((2*i)-1,end=" ")
    