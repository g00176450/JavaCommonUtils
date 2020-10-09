package com.nullptr.utils.random;

import java.util.Random;

/**
 * 随机数生成器
 *
 * @author nullptr
 * @version 1.0 2020-3-18
 * @since 1.0 2020-3-18
 *
 * @see Random
 */
public class RandomGeneratorUtils {
    private static final Random random = new Random();

    private RandomGeneratorUtils () {
    }

    /**
     * 生成指定范围内的随机整数
     *
     * @param bound 取值范围
     * @return 返回(0-bound)之间的整数
     *
     * @since 1.0
     */
    public static int randomInt(int bound) {
        return random.nextInt(bound);
    }

    /**
     * 生成指定范围内的随机整数
     *
     * @param min 最小取值
     * @param max 最大取值
     * @return 返回[min-max]之间的整数
     *
     * @since 1.0
     */
    public static int randomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * 生成指定范围内的字符
     *
     * @param min 最小取值
     * @param max 最大取值
     * @return 返回[min-max]之间的字符
     *
     * @since 1.0
     */
    public static char randomChar(char min, char max) {
        return (char) (random.nextInt(max - min + 1) + min);
    }

    /**
     * 生成随机的布尔值
     *
     * @since 1.0
     */
    public static boolean randomBoolean() {
        return random.nextBoolean();
    }
}
