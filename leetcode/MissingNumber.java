class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum=0;
        int tsum = n*(n+1)/2;
        for(int a:array)
        sum+=a;
        return tsum-sum;
    }
}
