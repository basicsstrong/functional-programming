package com.basicsstrong.functional.section14;

@SuppressWarnings("rawtypes")
public class TreeFun<E extends Comparable<E>> {

	private final E value;
	private final TreeFun<E> left;
	private final TreeFun<E> right;
	public int size;
	public int height;
	
	private static final TreeFun NIL = new TreeFun();

	

	@SuppressWarnings("unchecked")
	private TreeFun() {
		value = null;
		left = NIL;
		right = NIL;
		size = 0;
		height = -1;
	}

	private TreeFun(TreeFun<E> left, E value, TreeFun<E> right) {
		this.left = left;
		this.value = value;
		this.right = right;
		this.size = 1 + this.left.size + this.right.size;
		this.height = 1 + Math.max(this.left.height, this.right.height);
	}
	
	@SafeVarargs
	public static <E extends Comparable<E>> TreeFun<E> tree(E...es) {
		TreeFun<E> tree = NIL;
		for (int i = 0; i < es.length; i++) {
			tree = tree.insert(es[i]);
		}
		
		return tree;
	}
	
	private TreeFun<E> insert(E newValue) {
		return isEmpty() ? new TreeFun<E>(NIL, newValue, NIL)
					:newValue.compareTo(this.value) < 0 ? new TreeFun<E>(left.insert(newValue), this.value , this.right)
							: newValue.compareTo(this.value) > 0 ? new TreeFun<E>(this.left, this.value, right.insert(newValue))
									: new TreeFun<E>(this.left, newValue, this.right);
		
	}

	private boolean isEmpty() {
		return size == 0 ? true : false ;
	}

	public String toString() {
		return this.value != null ? String.format(" %s %s %s ", left, value, right) : "";
	}
	
	public TreeFun<E> remove(E element){
		if(element.compareTo(this.value) < 0) {
			return new TreeFun<E>(this.left.remove(element), this.value, this.right);
		}else if (element.compareTo(this.value) > 0) {
			return new TreeFun<E>(this.left, this.value, this.right.remove(element));
		}else
			return left.merge(right);			
	}

	private TreeFun<E> merge(TreeFun<E> right) {
		if(this.isEmpty())
			return right;
		else if(right.isEmpty())
			return this;
		else
			return new TreeFun<E>(this.left.merge(this.right),this.value,right);
	}
	
	public boolean isMember(E value) {
		
		if(this.value != null) {
		if(value.compareTo(this.value) < 0)
			return left.isMember(value);
		else if(value.compareTo(this.value) > 0)
			return right.isMember(value);
		else
			return true;
		}else
			return false;
	}
	
	public E max() {
		return this.right.equals(NIL) ?  this.value : this.right.max();
	}
}
