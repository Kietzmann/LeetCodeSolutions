package edu.kytsmen.leetcode.algorithms;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int hor = 0;
        int ver = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'D':
                    --ver;
                    break;
                case 'U':
                    ++ver;
                    break;
                case 'L':
                    ++hor;
                    break;
                case 'R':
                    --hor;
                    break;
            }
        }
        return hor == 0 && ver == 0;
    }
}
