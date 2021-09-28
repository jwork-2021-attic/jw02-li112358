package example;

public class SelectionSorter implements Sorter{
	
	private int[] a;
	private String plan = "";
	
	@Override
	public void load(int[] elements) {
		this.a = elements;
	}
	
	private void swap(int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		plan += "" + a[i] + "<->" + a[j] + "\n";
	}
	
	

	@Override
	public void sort() {
		int min;
		for(int i = 0;i < a.length;++i) {
			min = i;
			for(int j = i + 1;j < a.length;++j) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			if(i != min)swap(i,min);
		}
	}

	@Override
	public String getPlan() {
		return this.plan;
	}
	
}
