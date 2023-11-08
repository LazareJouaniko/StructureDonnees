package Main;

import java.util.List;
import Arbre.Tree;

public class Main {

	public static void main(String[] args) {
		Tree t = new Tree(20,null,null);
		int liste[] = {5,25,3,12,21,28,6,21,28};
		for (int l : liste) {
			t = Tree.insertion(l, t);
		}
		Tree.printTree(t);
		System.out.print(Tree.search(5, t));
	}

}
