package simple;

import org.w3c.dom.ls.LSResourceResolver;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length ==0){
            return "";
        }
        String preFix = strs[0];
        for (int i = 1; i <strs.length ; i++) {
            int j=0;
            for (; j < preFix.length() && j<strs[i].length() ; j++) {
                if(preFix.charAt(j)!=strs[i].charAt(j))
                    break;
            }
            preFix = preFix.substring(0,j);
            if ("".equals(preFix))
                return "";
        }
        return preFix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] ss = {"fqlower","flow","flight"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(ss));
    }
}
