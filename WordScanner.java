package com.baidu.hi;

import java.util.*;

/**
 * Created by 41237 on 2016/3/23.
 */
public class WordScanner {
    private Scanner my_in = new Scanner(System.in);

    public String[] readLineWithSpace()
    {
        String input = my_in.nextLine();
        return input.split("\\s+");
    }

	/**
	将字符串中index开始的一个数字化为int
	*/
    public static int readNumber(String s, int index)
    {
        int last = index;
        while (last < s.length() && s.charAt(last) >= 47 && s.charAt(last) <= 57) last++;
        String number = s.substring(index, last);
        return Integer.valueOf(number);
    }
}
