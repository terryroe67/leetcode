package terry;

/**
 * Zigzag Conversion [Medium]
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows
 */
public class ZigzagConversion {

    public String convert(String s, int rows) {
        if (rows == 1) {
            return s;
        }

        int length = s.length();
        StringBuilder sb = new StringBuilder(length);

        // first row
        for (int i = 0; i < length; i = i + 2 * rows - 2) {
            sb.append(s.charAt(i));
        }

        // inner rows
        for (int row = 1; row < rows - 1; ++row) {
            for (int i = row; i < length; i = i + 2 * rows - 2) {
                sb.append(s.charAt(i));
                int j = i + 2 * rows - 2 * row - 2;
                if (j < length) {
                    sb.append(s.charAt(j));
                }
            }
        }

        // last row
        for (int i = rows - 1; i < length; i = i + 2 * rows - 2) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public String convert0(String s, int rows) {
        if (rows == 1) {
            return s;
        }

        int cols = 500;
        char[][] c = new char[rows][cols];
        int i = 0;
        int row = 0;
        int col = 0;
        boolean down = true;

        while (i < s.length()) {
            c[row][col] = s.charAt(i++);
            if (down) {
                if (row + 1 < rows) {
                    ++row;
                }
                if (row + 1 == rows) {
                    down = false;
                }
            } else {
                if (row > 0) {
                    --row;
                    ++col;
                }
                if (row == 0) {
                    down = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder(s.length());
        for (row = 0; row < rows; ++row) {
            for (col = 0; col < cols; ++col) {
                if (c[row][col] > 0) {
                    sb.append(c[row][col]);
                }
            }
        }

        return sb.toString();
    }
}