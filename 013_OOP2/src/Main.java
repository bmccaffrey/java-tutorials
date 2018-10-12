/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Developer bob = new Developer();
    bob.setName("Bob");
    bob.setSpecialty("Refactoring Spaghetti");
    bob.setFavoriteLanguage("You've probably never heard of it");
    bob.setSalary(75000);
    bob.isStereotypical(false);
    bob.setTabsOrSpaces("If the compiler doesn't care, why should I?");
    bob.setFavoriteHobby("Hiking");
    bob.setYearsCoding(12.5);

    System.out.println(bob.getName());
    System.out.println(bob.getSpecialty());
    System.out.println(bob.getFavoriteLanguage());
    System.out.println(bob.getSalary());
    System.out.println(bob.getStereotypical());
    System.out.println(bob.getTabsOrSpaces());
    System.out.println(bob.getFavoriteHobby());
    System.out.println(bob.getYearsCoding());

    String convo = "So, " + bob.getName() + ", you're an expert at " + bob.getSpecialty()
        + " with your favorite language, which you said, " + bob.getFavoriteLanguage()
        + ", and despite that, you take home what? " + "nearly $" + bob.getSalary() + " . Well, I guess I shouldn't be"
        + " too surprised, you do have about " + bob.getYearsCoding() + " experience." + " You are ";
    convo += (bob.getStereotypical()) ? "" : "not";
    convo += " what we would call a stereotypical developer. I understand that you spend most of your time "
        + bob.getFavoriteHobby() + "--is that right?";
    System.out.println(convo);

  }
}