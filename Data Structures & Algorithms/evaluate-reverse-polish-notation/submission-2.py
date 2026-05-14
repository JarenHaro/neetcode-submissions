class Solution:
    
    def evalRPN(self, tokens: list[str]) -> int:
        operators = ["+", "-", "*", "/"]
        stack = []
        for item in tokens:
            if operators.count(item) == 0:
                stack.append(item)
            else:
                operator = item
                varB = int(stack.pop())
                varA = int(stack.pop())
                if operator == "+":
                    stack.append(varA + varB)
                elif operator == "-":
                    stack.append(varA - varB)
                elif operator == "*":
                    stack.append(varA * varB)
                elif operator == "/":
                    stack.append(varA / varB)
        return int(stack.pop())