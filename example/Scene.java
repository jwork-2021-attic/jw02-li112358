package example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scene {
	
	static int nums;
	
	static boolean mklines;
	
	static boolean colors;
	
	static Sorter sorter;
	
	private static void dealArgs(String[] args) {
		int nums = 64;
    	boolean mklines = true;
    	boolean colors = true;
    	Sorter sorter = new QuickSorter();
    	
    	for(int i = 0;i < args.length;++i) {
    		String[] ans = args[i].split("=");
    		if(ans.length < 2)continue;
    		if(ans[0].equals("nums")) {
    			double k = Integer.parseInt(ans[1]);
    			if(!Double.isNaN(k)) {
    				nums = (int) k;
    			}
    		}
    		else if(ans[0].equals("mklines")){
    			if(ans[1].equals("0")) {
    				mklines = false;
    			}
    		}
    		else if(ans[0].equals("sorter")){
    			if(ans[1].equals("Bubble")||ans[1].equals("bubble")||ans[1].equals("B")||ans[1].equals("b")){
    				sorter = new BubbleSorter();
    			}
    			else if(ans[1].equals("Quick")||ans[1].equals("quick")||ans[1].equals("Q")||ans[1].equals("q")){
    				sorter = new QuickSorter();
    			}
    			else if(ans[1].equals("Selection")||ans[1].equals("selection")||ans[1].equals("S")||ans[1].equals("s")){
    				sorter = new SelectionSorter();
    			}
    		}
    		else if(ans[0].equals("colors")){
    			if(ans[1].equals("0")) {
    				colors = false;
    			}
    		}
    	}
    	Scene.nums = nums;
    	Scene.colors = colors;
    	Scene.mklines = mklines;
    	Scene.sorter = sorter;
	}
	
    public static void main(String[] args) throws IOException {
    	if(args.length != 0 && (args[0].equals("-help") || args[0].equals("--help") || args[0].equals("-h") || args[0].equals("--h"))) {
    		System.out.println("nums=(int)                                    排序妖怪个数");
    		System.out.println("mklines=1/0                                   每次交换分行/不分行");
    		System.out.println("sorter=Bubble/Quick/Selection                 冒泡排序/快排/选择排序ʽ");
    		System.out.println("colors=1/0                                    多色系/黑白灰单色系");
    		System.out.println("默认对多色系64个妖怪进行分行快速排序");
    		return;
    	}
    	dealArgs(args);
    	if(Scene.colors) {
    		Monster.init2();
    	}
    	else {
    		Monster.init1();
    	}
    	List<Integer> ran = new ArrayList<Integer>(nums);
    	for(int i = 0;i < nums;++i) {
    		ran.add(i);
    	}
    	Collections.shuffle(ran);
        Line line = new Line(nums);
        for(int i = 0;i < nums;++i) {
        	line.put(Monster.CM[i], (int) ran.get(i));
        }

        Snake theSnake = Snake.getTheSnake();

        theSnake.setSorter(sorter);

        String log = theSnake.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }
    

    
}
