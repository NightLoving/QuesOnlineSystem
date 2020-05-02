package project.utils;

public class NumberUtil {

    /**
     * 生成指定长度的随机数
     *
     * @param length
     * @return
     */
    public static int generateRandomNum(int length) {
        int num = 1;
        double random = Math.random();
        if (random < 0.1) {
            random = random + 0.1;
        }
        for (int i = 0; i < length; i++) {
            num = num * 10;
        }
        return (int) ((random * num));
    }
}
