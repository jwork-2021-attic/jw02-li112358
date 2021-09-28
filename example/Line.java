package example;

import java.lang.Math;

public class Line {

	private Position[] positions;
	
	public Line(int length) {
		this.positions = new Position[length];
	}
	
	public void put(Linable linable, int i) {
		if(positions[i] == null) {
			positions[i] = new Position(null);
		}
		positions[i].setLinable(linable);
	}
	
	public Linable get(int i) {
		if((i < 0)||(i > positions.length)) {
			return null;
		}
		else {
			return positions[i].linable;
		}
	}
	
	@Override
    public String toString() {
        String lineString = "";
        int nums = Scene.nums;
        int line = (int)Math.sqrt(nums - 1) + 1;
        if(Scene.mklines) {
        	int i = 0;
        	for (Position p : positions) {
        		if(i == line) {
        			lineString += '\n';
        			i = 0;
        		}
        		i++;
        		lineString += p.linable.toString(); 
        	}
        }
        else {
        	for(Position p : positions) {
        		lineString += p.linable.toString();
        	}
        }
        return lineString;
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[this.positions.length];

        for (int i = 0; i < linables.length; i++) {
            linables[i] = positions[i].linable;
        }

        return linables;

    }
	
	class Position{
		
		private Linable linable;
		
		Position(Linable linable) {
			this.linable = linable;
		}
		
		public void setLinable(Linable linable) {
			this.linable = linable;
			linable.setPosition(this);
		}
	}
	
}

