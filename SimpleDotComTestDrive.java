public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = { 2, 3, 4 };
		dot.setLocationCells(locations);
		String userGuess = "1";
		String result = dot.checkYourself(userGuess);

	}

}

class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss :<{";
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit!";
				numOfHits++;
				break;

			} // end of if #1
		} // out of the loop

		if (numOfHits == locationCells.length) {
			result = "kill";
		}// endif #2
		System.out.println(result);
		;
		return result;

	}

}