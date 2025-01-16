public class Test3226 {

    /**
     * 异或统计1的数量
     * @param n
     * @param k
     * @return
     */
    public int minChanges(int n, int k) {

        int ans=n^k;

        int res=0;

        while(ans!=0){

            res+=ans&1;
            ans/=2;
        }
        return res;
    }
}
