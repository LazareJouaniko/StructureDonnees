package Arbre;

public class Tree {
	int val;
	Tree fg;
	Tree fd;
	
	public Tree(int val, Tree fg,Tree fd) {
		this.val = val;
		this.fg = fg;
		this.fd = fd;
	}
	@SuppressWarnings("unused")
	
	public static Tree insertion(int x, Tree t) {
			if (t == null) {
			return new Tree(x,null,null);
			}
			if (x < t.val) {
				t.fg =  insertion(x,t.fg);
			}else if (x > t.val) {
				t.fd =  insertion(x,t.fd);
			}
			return t;
	}
	
	public static void printTree(Tree t) {
		if (t != null) {
			printTree (t.fg);
			System.out.print(t.val);
			printTree (t.fd);
		}
	}
	public static boolean search(int x, Tree t) {

		if (t != null) {
			if (t.val == x) {
				return true;
			}if (t.val<x) {
				 return search(x,t.fd);
		}else if (t.val>x) {
				 return search(x,t.fg);
			}
	}
	return false ;
}
}
