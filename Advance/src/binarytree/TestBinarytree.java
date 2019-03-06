package binarytree;

import java.util.Stack;

public class TestBinarytree {
	/*	      0
	     1         2 
	  3     4    5   6
	7  8  9       */
	public static void main(String[] args)
	{
		TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
		for(int i = 0; i < 10; i++)
		{
			node[i] = new TreeNode(i);
		}
		for(int i = 0; i < 10; i++)
		{
			if(i*2+1 < 10)
				node[i].left = node[i*2+1];
			if(i*2+2 < 10)
				node[i].right = node[i*2+2];
		}
		System.out.println("递归：");
		postOrderRe(node[0]);
		System.out.println("\n非递归：");
		postOrder(node[0]);
	}
	
	
	
	public static void postOrderRe(TreeNode biTree)
	{//后序遍历递归实现
		if(biTree == null)
			return;
		else
		{
			postOrderRe(biTree.left);
			postOrderRe(biTree.right);
			System.out.print(biTree.value+" ");
		}
	}
	
	public static void postOrder(TreeNode biTree)
	{//后序遍历非递归实现
		int left = 1;//在辅助栈里表示左节点
		int right = 2;//在辅助栈里表示右节点
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<Integer> stack2 = new Stack<Integer>();//辅助栈，用来判断子节点返回父节点时处于左节点还是右节点。
		
		while(biTree != null || !stack.empty())
		{
			while(biTree != null)
			{//将节点压入栈1，并在栈2将节点标记为左节点
				stack.push(biTree);
				stack2.push(left);
				biTree = biTree.left;
			}
			
			while(!stack.empty() && stack2.peek() == right)
			{//如果是从右子节点返回父节点，则任务完成，将两个栈的栈顶弹出
				stack2.pop();
				System.out.print(stack.pop().value+" ");
			}
			
			if(!stack.empty() && stack2.peek() == left)
			{//如果是从左子节点返回父节点，则将标记改为右子节点
				stack2.pop();
				stack2.push(right);
				biTree = stack.peek().right;
			}
				
		}
	}


}
