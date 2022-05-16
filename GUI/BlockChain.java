import java.util.ArrayList;

public class BlockChain {

	public static void main(String[] args) {
		//The blockChain is an arrayList that has blocks
		ArrayList<Block>blockChain = new ArrayList<Block>();
		
		//Initial values for blockchain
		String[] initialVals = {"Car Model: Toyota", "Date: May 15", " Hour: 16:30", "Total duration: 40 mins ",
				" From Tlalpan to Coyoacan Center", "200", "yes"};
		//Setting the first block 0 for starting point
		Block firstBlock = new Block(initialVals, 0);
		//adding block to blockChain
		blockChain.add(firstBlock);
		
		
		//Checking
		System.out.print("first block is " + firstBlock.toString()+ "\n");
		System.out.print("The blockchain is " + blockChain.toString() + "\n");
		
		//Block 2
		//Setting up a transaction for Car Model Toyota
		String[] secondVal = {"Car Model: Toyota", "Date: May 15", " Hour: 16:30", "Total duration: 40 mins ", 
				" From Tlalpan to Coyoacan Center", "200", "no"};
		//Setting the second value to the hash of the first block, as that is the car that is getting a reservation
		Block secondBlock = new Block(secondVal, firstBlock.getBlockHash());
		//adding block to blockChain
		blockChain.add(secondBlock);
		
		//Checking
		System.out.print("Second block is " + secondBlock.toString()+ "\n");
		System.out.print("The blockchain is " + blockChain.toString()+ "\n" );
		
		//Block 3
		//Adding Block 3 
		String[] thirdVal = {"Car Model: Bocho", "Date: May 15", " Hour: 16:00", "Total duration: 40 mins ", 
				" From Tlalpan to Coyoacan Center", "200", "yes"};
		//Setting the second value to the hash of the first block, as that is the car that is getting a reservation
		Block thirdBlock= new Block(thirdVal, secondBlock.getBlockHash());
		//adding block to blockChain
		blockChain.add(thirdBlock);
	}
}
