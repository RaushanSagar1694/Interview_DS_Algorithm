

import java.util.*;




//Minimum Time Difference
class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] minute = new int[n];
        int idx = 0;

        for(String str : timePoints){
            int min = (Integer.parseInt(str.substring(0,2)) * 60) + Integer.parseInt(str.substring(3));
            minute[idx++] = min;
        }

        Arrays.sort(minute);

        int result = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            result = Math.min(result, (minute[i] - minute[i-1]));
        }

        return Math.min(result, (24*60 - minute[n-1]) + minute[0]);
    }
}
