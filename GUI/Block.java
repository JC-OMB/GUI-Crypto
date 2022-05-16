import java.util.Arrays;

public class Block {
    
    private String[] transactions;
    private int blockHash;
    private int previousBlockHash;
    
	@Override
	//toString to print all of the properties of the block
	public String toString() {
		return "Block [transactions=" + Arrays.toString(transactions) + ", blockHash=" + blockHash
				+ ", previousBlockHash=" + previousBlockHash + "]";
	}

	public Block(String[] transactions, int previousBlockHash) {
		super();
		this.transactions = transactions;
		this.previousBlockHash = previousBlockHash;
		//Create an array of two integers, being it the hash of the transactions and the previousBlockHash
		this.blockHash = Arrays.hashCode(new int [] { Arrays.hashCode(transactions) , this.previousBlockHash});
	}
	
	public String[] getTransactions() {
		return transactions;
	}
	public void setTransactions(String[] transactions) {
		this.transactions = transactions;
	}
	public int getBlockHash() {
		return blockHash;
	}
	public void setBlockHash(int blockHash) {
		this.blockHash = blockHash;
	}
	public int getPreviousBlockHash() {
		return previousBlockHash;
	}
	public void setPreviousBlockHash(int previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}

    
}
