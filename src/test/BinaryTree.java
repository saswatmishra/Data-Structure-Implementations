package test;

public class BinaryTree {

	public static void preOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			System.out.println(root.getData());
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}

	public static Object preOrderNonRecursive(BinaryTreeNode root) {
		if (root == null)
			return null;
		LLStack stack = new LLStack();
		while (true) {
			while (root != null) {
				System.out.println(root.getData());
				stack.push(root);
				root = root.getLeft();
			}
			if(stack.isEmpty())
				break;
			root = (BinaryTreeNode) stack.pop();
			root = root.getRight();
		}
		return root;
	}

	public static void inOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			inOrderTraversal(root.getLeft());
			System.out.println(root.getData());
			inOrderTraversal(root.getRight());
		}
	}

	public static void postOrderTraversal(BinaryTreeNode root) {
		if (root != null) {
			postOrderTraversal(root.getRight());
			System.out.println(root.getData());
			postOrderTraversal(root.getLeft());
		}

	}

	public static int findMax(BinaryTreeNode root) {
		int root_val, left_val, right_val, max = Integer.MIN_VALUE;

		if (root != null) {
			root_val = (int) root.getData();
			left_val = findMax(root.getLeft());
			right_val = findMax(root.getRight());
			if (left_val > right_val) {
				max = left_val;
			} else {
				max = right_val;
			}
			if (root_val > max) {
				max = root_val;
				System.out.println(max);
			}

		}

		return max;
	}

	public static void main(String args[]) {
		BinaryTreeNode one = new BinaryTreeNode(1);
		BinaryTreeNode two = new BinaryTreeNode(2);
		BinaryTreeNode three = new BinaryTreeNode(3);
		BinaryTreeNode four = new BinaryTreeNode(4);
		BinaryTreeNode five = new BinaryTreeNode(10);
		BinaryTreeNode six = new BinaryTreeNode(20);
		BinaryTreeNode seven = new BinaryTreeNode(5);
		BinaryTreeNode eight = new BinaryTreeNode(6);

		one.setLeft(two);
		one.setRight(three);
		two.setLeft(four);
		two.setRight(five);
		three.setLeft(six);
		four.setLeft(seven);
		six.setLeft(eight);
		preOrderTraversal(one);
		System.out.println();
		System.out
				.println("--------------------------------------------------");
		preOrderNonRecursive(one);
		System.out.println();
		System.out.println("-------------------------------------------------");
		inOrderTraversal(one);
		System.out.println();
		System.out.println("-------------------------------------------------");
		postOrderTraversal(one);
		System.out.println();
		System.out.println("------------------");
		findMax(one);
		System.out.println();
		System.out.println("--------------------------");

	}

}
