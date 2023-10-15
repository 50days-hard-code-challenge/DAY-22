def findMissingRepeatingNumbers(a: [int]) -> [int]:
    # Write your code here
    #lst.remove('Orchids')
    a.sort()
    p=0
    q=0
    for i in range(len(a)-1):
        if(a[i]==a[i+1]):
            p=a[i]
        if(a[i]+2)==a[i+1]:
            q=a[i]+1
    if(a[0]!=1):
        q=1
    elif(q==0):
        q=a[-1]+1
    return [p,q]

    """
    Time limit exceeded
    p=0
    q=0
    b=[x for x in range(1,len(a)+1)]
    for i in range(len(a)): 
        if(a[i]in b):
            b.remove(a[i])
        else:
            p=a[i]
    q=b[0]
    return [p,q]"""
