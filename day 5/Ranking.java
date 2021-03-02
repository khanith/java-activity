public class Ranking implements Comparable<Ranking>{
    private int n;  
	private String name;
      private int score;
	public Ranking(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	
	@Override
	public String toString() {
		return "Ranking [n=" +n + ", name=" + name + ", score=" + score + ", getName()=" + getName() + ", getScore()="
				+ getScore() + ", getN()=" + getN() + "]";
	}
	@Override
	public int compareTo(Ranking r) {
		if(score==r.getScore())
			return 0;
		else if(score<r.getScore())
			return 1;
		else 
			return -1;
		
		
	}
      
      
}