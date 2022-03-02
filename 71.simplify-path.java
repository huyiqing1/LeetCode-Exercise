import java.util.*;
/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (String str : path.split("/")) {
            if (!stack.isEmpty() && str.equals(".."))
                stack.pop();
            if (!str.equals(".") && !str.equals("") && !str.equals(".."))
                stack.push(str);
        }
        if (stack.isEmpty())
            return "/";
        while (!stack.isEmpty()) {
            sb.insert(0, "/" + stack.pop());
        }
        return sb.toString();
    }
}
// @lc code=end
