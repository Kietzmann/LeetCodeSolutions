package edu.kytsmen.leetcode.algorithms;

/**
 * Created by dmytro on 04.02.17.
 */
public class ConvertANumberToHexadecimal {
    public String toHex(int dec) {
        if (dec == 0) return "0";
        StringBuilder res = new StringBuilder();

        while (dec != 0) {
            int digit = dec & 0xf;
            res.append(digit < 10 ? (char) (digit + '0') : (char) (digit - 10 + 'a'));
            dec >>>= 4;
        }

        return res.reverse().toString();
    }
}
