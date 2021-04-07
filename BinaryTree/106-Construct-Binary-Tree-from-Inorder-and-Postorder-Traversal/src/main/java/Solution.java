import java.util.Arrays;

/**
 * @author hongguan.liu
 * Created at: 2021/3/31
 **/
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) return null;
        return traversal(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

//    public TreeNode traversal(int[] inorder, int[] postorder){
//        if (postorder.length == 0) return null;
//
//        int rootValue = postorder[postorder.length - 1];
//        TreeNode root = new TreeNode(rootValue);
//
//        if (postorder.length == 1) return root;
//
//        int delimiterIndex;
//        for (delimiterIndex = 0; delimiterIndex < inorder.length; delimiterIndex++){
//            if (inorder[delimiterIndex] == rootValue) break;
//        }
//
//        //左闭右开
//        int[] leftInorder = Arrays.copyOfRange(inorder, 0, delimiterIndex);
//        int[] rightInorder = Arrays.copyOfRange(inorder, delimiterIndex+1, inorder.length);
//
//        postorder = Arrays.copyOfRange(postorder, 0, inorder.length - 1);
//
//        //左闭右开
//        int[] leftPostorder = Arrays.copyOfRange(postorder, 0, leftInorder.length);
//        int[] rightPostorder = Arrays.copyOfRange(postorder, leftInorder.length, postorder.length);
//
//        root.left = traversal(leftInorder, leftPostorder);
//        root.right = traversal(rightInorder, rightPostorder);
//
//        return root;
//    }
    //左闭右开
    public TreeNode traversal(int[] inorder, int inorderBegin, int inorderEnd, int[] postorder, int postorderBegin, int postorderEnd){
        if (postorderBegin == postorderEnd) return null;

        int rootValue = postorder[postorderEnd - 1];
        TreeNode root = new TreeNode(rootValue);

        if (postorderEnd - postorderBegin == 1) return root;

        int delimiterIndex;
        for (delimiterIndex = inorderBegin; delimiterIndex < inorder.length; delimiterIndex++){
            if (inorder[delimiterIndex] == rootValue) break;
        }

        //切割中序数组
        //左中序区间，左闭右开
        int leftInorderBegin = inorderBegin;
        int leftInorderEnd = delimiterIndex;

        //右中序区间，左闭右开
        int rightInorderBegin = delimiterIndex + 1;
        int rightInorderEnd = inorderEnd;

        //切割后序数组
        //左后序区间，左闭右开
        int leftPostorderBegin = postorderBegin;
        int leftPostorderEnd = postorderBegin + delimiterIndex - inorderBegin;


        //切割后序数组
        //右后序区间，左闭右开
        int rightPostorderBegin = postorderBegin + delimiterIndex - inorderBegin;
        int rightPostorderEnd = postorderEnd - 1;

        root.left = traversal(inorder, leftInorderBegin, leftInorderEnd, postorder, leftPostorderBegin, leftPostorderEnd);
        root.right = traversal(inorder, rightInorderBegin, rightInorderEnd, postorder, rightPostorderBegin, rightPostorderEnd);

        return root;
    }
}
