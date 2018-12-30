import java.util.ArrayList;

public class PleaseWork {

	ArrayList<String> thoughts;

	public static void main(String[] args) {
		PleaseWork hope = new PleaseWork();
		ArrayList<String> thoughts = hope.think();
		hope.selfTalk(thoughts);
	}

	public ArrayList<String> think() {
		thoughts = new ArrayList<String>();
		thoughts.add("I'm probably going to break stuff.");
		thoughts.add("There's a very good chance that that will happen.");
		thoughts.add("But I still have to ask...");
		thoughts.add("Please work?");
		return thoughts;
	}

	public void selfTalk(ArrayList<String> myThoughts) {
		for (String t : myThoughts) {
			System.out.println(t);
		}
	}
}