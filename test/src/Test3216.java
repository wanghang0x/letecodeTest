public class Test3216 {

    /**
     * @author wanghang
     */
    public String getSmallestString(String s) {

        boolean flag = false;

        char[] chars = s.toCharArray();

        for (int i = 1; i < chars.length; i++) {

            if (chars[i] % 2 == chars[i - 1] % 2 && chars[i] < chars[i - 1]) {
                char temp = chars[i];
                chars[i] = chars[i - 1];
                chars[i - 1] = temp;
                flag = true;
            }
            if (flag) {
                break;
            }
        }
        return String.valueOf(chars);
    }

}
