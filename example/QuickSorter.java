package example;

public class QuickSorter implements Sorter{
	
	private int[] a;
	private String plan = "";
	
	@Override
	public void load(int[] elements) {
		this.a = elements;
	}
	
	private void swap(int i,int j) {
		if(a[i] == a[j])return;
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		plan += "" + a[i] + "<->" + a[j] + "\n";
	}
	
	private void quickSort(int left,int right) {
		if(left >= right)return;
		int tip = left;
		for(int i = left + 1;i <= right;++i) {
			if(a[i] < a[left]) {
				tip++;
				swap(tip,i);
			}
		}
		swap(left,tip);
		quickSort(left,tip - 1);
		quickSort(tip + 1,right);
	}

	@Override
	public void sort() {
		quickSort(0,a.length - 1);
	}

	@Override
	public String getPlan() {
		return this.plan;
	}
	
}
