public class Factory {

	public Tri implementacion(int n){
		if (n == 1){
			return new SplayBST();
		}
		else if (n == 2){
			return new TwoThreeTree();
		}
		else
		return null;

	}

}
