package Week7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _36isValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> row  = new HashMap<>(), col = new HashMap<>(), area = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            row.put(i, new HashSet<>());
            col.put(i, new HashSet<>());
            area.put(i, new HashSet<>());
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int c = board[i][j] - '1';
                int idx = i / 3 * 3 + j / 3;
                if (!row.get(i).contains(c) && !col.get(j).contains(c) && !area.get(idx).contains(c)) {
                    row.get(i).add(c);
                    col.get(j).add(c);
                    area.get(idx).add(c);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
