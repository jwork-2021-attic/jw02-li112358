package example;

import example.Line.Position;
import java.lang.Math;

public class Monster{
	public static CommonMonster[] CM;
	

	private static Color[][] color;
	private static class Color{
		int r;
		int g;
		int b;
		Color(int r,int g,int b){
			this.r = r;
			this.g = g;
			this.b = b;
		}
	}
	static void init1() {
		int nums = Scene.nums;
		CM = new CommonMonster[nums];
		double k = (double)255 / nums;
		for(int i = 0;i < nums;++i) {
			CM[i] = new CommonMonster((int)(255-k*i),(int)(255-k*i),(int)(255-k*i),i+1);
		}
	}
	static void init2(){
		int nums = Scene.nums;
		CM = new CommonMonster[nums];
		int line = (int) Math.sqrt(nums - 1) + 1;
		color = new Color[line][line];
		for(int i = 0;i < line;++i) {
			double ans = ((double)6 / line) * i;
			int sw = (int)ans;
			ans = ans - sw;
			switch(sw) {
			case 0:{
				color[i][line-1] = new Color(255,(int)(ans*255),0);
				break;
			}
			case 1:{
				color[i][line-1] = new Color((int)((1-ans)*255),255,0);
				break;
			}
			case 2:{
				color[i][line-1] = new Color(0,255,(int)(ans*255));
				break;
			}
			case 3:{
				color[i][line-1] = new Color(0,(int)((1-ans)*255),255);
				break;
			}
			case 4:{
				color[i][line-1] = new Color((int)(ans*255),0,255);
				break;
			}
			case 5:{
				color[i][line-1] = new Color(255,0,(int)((1-ans)*255));
				break;
			}
			}
		}
		for(int i = 0;i < line;++i) {
			int r = (255-color[i][line-1].r)/line;
			int g = (255-color[i][line-1].g)/line;
			int b = (255-color[i][line-1].b)/line;
			for(int k = 0;k < line - 1;++k) {
				color[i][k] = new Color(color[i][line-1].r+r*(line-1-k),color[i][line-1].g+g*(line-1-k),color[i][line-1].b+b*(line-1-k));
			}
		}
		for(int i = 0;i < nums;++i){
			int r = i/line;
			int j = i%line; 
			CM[i] = new CommonMonster(color[r][j].r,color[r][j].g,color[r][j].b,i + 1);
		}
	}
}

class CommonMonster implements Linable{
	private int value;
	
	private int r;
	private int g;
	private int b;
	
	private Position position;
	
	CommonMonster(int r,int g,int b,int value){
		this.r = r & 0xff;
		this.g = g & 0xff;
		this.b = b & 0xff;
		this.value = value;
	}
	
	public void swapPosition(CommonMonster CM) {
		Position p = CM.position;
		this.position.setLinable(CM);
		p.setLinable(this);
	}
	
	@Override
	public String toString() {
		String res = "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m";
		if(this.value<10) {
			res += "   ";
		}
		else if(this.value<100) {
			res += "  ";
		}
		else if(this.value<1000){
			res += " ";
		}
		res += this.value + "  \033[0m";
		return res;
	}
	
	@Override
	public void setPosition(Position position) {
		this.position = position;
		
	}
	
	@Override
	public Position getPosition() {
		return this.position;
	}
	
	@Override
	public int getValue() {
		return this.value;
	}
	
	
	
}
