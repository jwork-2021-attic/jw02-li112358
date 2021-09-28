package example;

public class BubbleSorter implements Sorter{

	
	private int[] a;
	private String plan = "";
	
	@Override
	public void load(int[] elements) {
		this.a = elements;
	}
	
	private void swap(int i,int j) {
		if(i == j)return;
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		plan += "" + a[i] + "<->" + a[j] + "\n";
	}
	
	

	@Override
	public void sort() {
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for(int i = 0;i < a.length - 1;++i) {
				if(a[i] > a[i + 1]) {
					swap(i,i+1);
					sorted = false;
				}
			}
		}
	}

	@Override
	public String getPlan() {
		return this.plan;
	}
	
}
