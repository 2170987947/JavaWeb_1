package test0510;

public class ex2 {
    public int findMinimum(int n, int[] left, int[] right) {
        // write code here
        int sum = 0;
        int leftSum = 0;
        int rightSum = 0;
        int leftMin = Integer.MAX_VALUE;
        int rightMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (left[i] * right[i] == 0) {
                sum += left[i] + right[i];
            } else {
                leftSum += left[i];
                rightSum += right[i];
                leftMin = Math.min(leftMin, left[i]);
                rightMin = Math.min(rightMin, right[i]);
            }
        }
        return sum + Math.min(leftSum - leftMin + 1, rightSum - rightMin + 1) + 1;
    }
}