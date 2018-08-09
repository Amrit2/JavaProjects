package Week06;

public class ScoreTable {


	public static final int MAX_PLAYERS=3;
	public static final int MAX_SCORE=4;

	private Score[][] scoreTable;

	public ScoreTable()
	{

		this.scoreTable = new Score[MAX_PLAYERS][MAX_SCORE];
	}


	public Score access(int r,int c)
	{
		if(this.inBound(r, c))
		{
			return this.scoreTable[r][c];
		}

		return null;
	}

	public void greaterThan(int x)
	{
		for(int r=0;r<this.scoreTable.length;r++)
		{
			for(int c=0;c<this.scoreTable[r].length;c++)
			{
				Score s = access(r,c);
				if(s != null)
				{
					if(s.getScore()>x)
					{
						System.out.println(s);
					}
				}
			}			
		}
	}

	private boolean inBound(int r,int c)
	{
		if (r >=0 && r < this.scoreTable.length)
		{
			if (c >=0 && c < this.scoreTable[r].length)
			{
				return true;
			}

		}
		return false;
	}

	public void update(int r,int c,Score aScore)
	{
		if(this.inBound(r, c))
		{
			this.scoreTable[r][c] = aScore;
		}
	}

	public void print()
	{
		System.out.println(this);
	}

	
	public String toString()
	{
		String out = "";
		for(int r=0;r<this.scoreTable.length;r++)
		{
			for(int c=0;c<this.scoreTable[r].length;c++)
			{
				out += (this.scoreTable[r][c]+" ");
			}
			out += "\n";
		}
		return out;
	}
	
	static public ScoreTable example()
	{

		ScoreTable table = new ScoreTable();
		table.update(0, 0, new Score("Player 1",200));
		table.update(0, 1, new Score("Player 1",540));
		table.update(0, 2, new Score("Player 1",912));
		table.update(0, 3, new Score("Player 1",525));


		table.update(1, 0, new Score("Player 2",127));
		table.update(1, 1, new Score("Player 2",782));
		table.update(1, 2, new Score("Player 2",642));
		table.update(1, 3, new Score("Player 2",312));


		table.update(2, 0, new Score("Player 3",256));
		table.update(2, 1, new Score("Player 3",321));
		table.update(2, 2, new Score("Player 3",432));
		table.update(2, 3, new Score("Player 3",520));
		return table;
	}

	public double average(int r)
	{
		double a = 0;
		int n = 0;
		
		if(r>=0&&r<this.scoreTable.length)
		{
			n = this.scoreTable[r].length;
			if(n == 0)
			{
				return 0;
			}
			for(int c=0;c<scoreTable[r].length;c++)
			{
				a += this.scoreTable[r][c].getScore();
			}
		}

		return a/n;
	}
	
	public double maxAverage()
	{
		double max = this.average(0);
		
		for(int r=0;r<this.scoreTable.length;r++)
		{
			double a = this.average(r);
			//System.out.println(a);
			if(a > max)
			{
				max = a;
			}			
		}
		
		return max;
		
	}
	
	public static void main(String[] args) 
	{
		ScoreTable table = ScoreTable.example();
		table.print();
		System.out.println(table.average(1));
		System.out.println(table.maxAverage());
		}

}
