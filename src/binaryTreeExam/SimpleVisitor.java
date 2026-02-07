package binaryTreeExam;

@FunctionalInterface
public interface SimpleVisitor {
	
	/**
	 * Called for each Node traversal
	 * @param key the value of the Node
	 */
	void visit(Integer value);
	
}
