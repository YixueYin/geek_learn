package Week9;

public class reverseStr {
    /**
     * 给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔2k 个字符的前 k 个字符进行反转。
     *
     * 如果剩余字符少于 k 个，则将剩余字符全部反转。
     * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
     *
     */
    public String reverseStr(String s, int k) {

        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);

//        char[] chars = s.toCharArray();
//        int n = chars.length;
//        String result = null;
//        if(n <= k) {
//            char[] chars1 = new char[n];
//            for(int i = 0; i< n; i++) {
//                chars1[i] = chars[n-1-i];
//            }
//            result = chars1.toString();
//        }else if(n<2 * k) {
//            char[] chars2 = new char[k];
//            for(int i = 0; i< k ; i++) {
//                chars2[i] = chars[k-1-i];
//            }
//            for(int i = 0; i<k; i++) {
//                chars[i] = chars2[i];
//            }
//            result = chars.toString();
//        }else {
//
//        }
//        return result;
    }
}
