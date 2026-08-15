class Solution {
    public int countWithout(int n, int d) {

        String s = String.valueOf(n);
        int len = s.length();

        // dp[position][tight][started]
        long[][][] dp = new long[len + 1][2][2];

        dp[0][1][0] = 1;

        for (int pos = 0; pos < len; pos++) {

            for (int tight = 0; tight <= 1; tight++) {

                for (int started = 0; started <= 1; started++) {

                    long ways = dp[pos][tight][started];

                    if (ways == 0)
                        continue;

                    int limit = (tight == 1)
                            ? s.charAt(pos) - '0'
                            : 9;

                    for (int digit = 0; digit <= limit; digit++) {

                        int newStarted = started;

                        if (digit != 0)
                            newStarted = 1;

                        // Ignore leading zero
                        // Only reject d after number has started
                        if (newStarted == 1 && digit == d)
                            continue;

                        int newTight = 0;

                        if (tight == 1 && digit == limit)
                            newTight = 1;

                        dp[pos + 1][newTight][newStarted] += ways;
                    }
                }
            }
        }

        return (int)(dp[len][0][1] + dp[len][1][1]);
    }
}