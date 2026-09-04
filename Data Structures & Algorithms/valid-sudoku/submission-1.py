class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        

        rows = {r: set() for r in range(9)}
        cols = {c: set() for c in range(9)}

        for r in range(9):
            for c in range(9):
                
                row_value = board[r][c]
                col_value = board[c][r]
                if row_value in rows[r] and row_value != '.':
                    return False
                rows[r].add(row_value)
                if col_value in cols[r] and col_value != '.':
                    return False
                cols[r].add(col_value)

        box_of_threes = {}

        for b_row in range(3):
            for b_col in range(3):
                box_of_threes[(b_row, b_col)] = set()
        
        for r in range(9):
            for c in range(9):
                b_r = r // 3
                b_c = c // 3
                value = board[r][c]
                if value in box_of_threes[b_r, b_c] and value != '.':
                    return False
                box_of_threes[b_r, b_c].add(value)
        return True
            

        
        
        


