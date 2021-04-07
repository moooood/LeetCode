/**
 * @author hongguan.liu
 * Created at: 2021/4/1
 **/
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;
        return traversal(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode traversal(int[] preorder, int preorderBegin, int preorderEnd, int[] inorder, int inorderBegin, int inorderEnd){
        if (preorderBegin == preorderEnd) return null;

        int rootValue = preorder[preorderBegin];
        TreeNode root = new TreeNode(rootValue);

        if (preorderEnd - preorderBegin == 1) return root;

        int delimiterIndex;
        for (delimiterIndex = inorderBegin; delimiterIndex < inorderEnd; delimiterIndex++){
            if (inorder[delimiterIndex] == rootValue) break;
        }

        int leftInOrderBegin = inorderBegin;
        int leftInOrderEnd = delimiterIndex;

        int rightInOrderBegin = delimiterIndex + 1;
        int rightInOrderEnd = inorderEnd;

        int leftPreorderBegin = preorderBegin + 1;
        int leftPreorderEnd = preorderBegin + 1 + (delimiterIndex - inorderBegin);

        int rightPreorderBegin = preorderBegin + 1 + (delimiterIndex - inorderBegin);
        int rightPreorderEnd = preorderEnd;

        root.left = traversal(preorder, leftPreorderBegin, leftPreorderEnd, inorder, leftInOrderBegin, leftInOrderEnd);
        root.right = traversal(preorder, rightPreorderBegin, rightPreorderEnd, inorder, rightInOrderBegin, rightInOrderEnd);

        return root;
    }
}
