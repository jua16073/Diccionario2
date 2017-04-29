import java.util.Set;
public class Factory {

	public Set implementacion(int n){
		if (n == 1){
			return (Set) new SplayBST();
		}
		else if (n == 2){
			return (Set) new TwoThreeTree();
		}
		else
		return null;

	}

}
