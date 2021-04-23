package Week4;

public class _860lemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        //第一反应，用hashmap存
        //发现太麻烦
        //直接使用贪心，只要维护两个变量：five和ten即可
        int five = 0;
        int ten = 0;
        for(int bill: bills) {
            if(bill == 5) {
                five++;
            }else if(bill == 10) {
                if(five>0) {
                    five--;
                    ten++;
                }else {
                    return false;
                }
            }else if(bill == 20) {
                if(five > 0 && ten > 0) {
                    five--;
                    ten--;
                }else if (five>=3) {
                    five = five-3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
