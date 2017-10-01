count=10
currentCount=1
print(1)
print(2)
one=2  #one before the current digit
two=1 #two before the current digit 
while currentCount<=count-2:
    temp=one; #as the name suggests it stores the temproary value of variable "one"
    print (one+two)
    one=one+two
    two=temp
    currentCount=currentCount+1

