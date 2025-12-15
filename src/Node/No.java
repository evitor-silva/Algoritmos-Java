package Node;

public class No {

	public No right = null;
	public No left = null;
	public Integer value;

	public Integer findValue(No node, int value) {
		if (node == null)
			return null;
		if (node.value == value)
			return value;
		return value < node.value ? findValue(node.left, value) : findValue(node.right, value);
	}

	public Integer findMin(No node) {
		return node.left == null ? node.value : findMin(node.left);
	}

}
