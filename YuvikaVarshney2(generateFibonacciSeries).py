def generateFibonacciNumbers(n: int) -> List[int]: 
    # Write your code here
    fib = [0, 1]  

    # Generate the Fibonacci numbers.
    for i in range(2, n):

        # Compute the next Fibonacci number.
        fib.append(fib[i - 1] + fib[i - 2])  

    return fib[:n]
    """
    slower approach
    a=[]
    a.append(0)
    if(n==1):
        return a 
    a.append(1)
    if(n==2):
        return a 
    for i in range(2,n):
        x=a[i-1]+a[i-2]
        a.append(x)
    return a"""
