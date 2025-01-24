import java.util.Arrays;

public class Test2944 {
//    给你一个 下标从 1 开始的 整数数组 prices ，其中 prices[i] 表示你购买第 i 个水果需要花费的金币数目。
//
//    水果超市有如下促销活动：
//
//    如果你花费 prices[i] 购买了下标为 i 的水果，那么你可以免费获得下标范围在 [i + 1, i + i] 的水果。
//    注意 ，即使你 可以 免费获得水果 j ，你仍然可以花费 prices[j] 个金币去购买它以获得它的奖励。
//
//    请你返回获得所有水果所需要的 最少 金币数。

    public int minimumCoins(int[] prices) {

        int len = prices.length;
        int[] dp = new int[len + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i=1;i<=len;i++){
            int price = prices[i-1];
            dp[i] = Math.min(dp[i],dp[i-1]+price);
            for (int j = i + 1; j <= Math.min(len, 2 * i); j++) {
                dp[j] = Math.min(dp[j], dp[i-1] + price);
            }
        }
        return dp[len];
    }
}
