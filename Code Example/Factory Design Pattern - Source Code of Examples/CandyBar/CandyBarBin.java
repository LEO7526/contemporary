import java.util.*;

public class CandyBarBin {
	private CandyBar cb;
	Vector candyBars;
	int LowStockLevel = 5;
  

	public CandyBarBin(CandyBar cb) {
		candyBars = new Vector();
		this.cb = cb;
	}  
  
	public void restock() {
		if (getAmountInStock() < LowStockLevel) {
			add(cb.createCandyBar());
		}
	}
	
	public void add(CandyBar cb) {
		candyBars.add(cb);
	}

	public int getAmountInStock() {
	  return candyBars.size();
	}
	
	public String toString() {
	    StringBuffer sf = new StringBuffer();
	    for (int i = 0; i < candyBars.size(); i++) {
		  sf.append(candyBars.elementAt(i).toString()+"\n");
		}
		return sf.toString();
	}

}