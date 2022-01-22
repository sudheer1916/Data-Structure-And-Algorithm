import sys
def getDiff(arr):
    arr.sort()
    res = sys.maxsize
    for i in range(1,len(arr)):
        res = min(res,arr[i]-arr[i-1])
    return res

arr = [10,8,4,1]
print(getDiff(arr))