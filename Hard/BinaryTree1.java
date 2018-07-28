//class Node
//{
//	int data;
//	Node left;
//	Node right;
//	
//	Node(int val)
//	{
//		data = val;
//		left = null;
//		right = null;
//	}
//}

public class BinaryTree1 {

	static int first = 0;
	static int second = 0;
	static int res = 0;
    
    public int maxPathSum(TreeNode root) {
        return inorder(root);
    }
    
    public static int findmax(TreeNode node, int sum)
	{
		if(node == null)
			return (first + second);
		
		sum += node.val;
		
		if(node.left==null && node.right==null)
		{
			if(first<sum)
			{
				//System.out.println(first+" "+second);
				second = first;
				first = sum;
			}
			else if(second<sum)
				second = sum;
		}
		
		findmax(node.left, sum);
		findmax(node.right, sum);
		
		return node.val>=0?first + second - node.val: first + second + node.val;
	}
    
    public static int inorder(TreeNode root)
	{
		if(root == null)
			return 0;
		res = Math.max(findmax(root, 0),res);
		first = second = 0;
		inorder(root.left);
		inorder(root.right);
		
		return res;
	}
}



/*

*/