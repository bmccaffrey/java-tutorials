/**
 * Developer
 */
public class Developer {

  private String name;
  private String specialty;
  private String favoriteLanguage;
  private double salary;
  private boolean stereotypical;
  private String tabsOrSpaces;
  private double yearsCoding;
  private String favoriteHobby;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSpecialty() {
    return this.specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty.toLowerCase();
  }

  public String getFavoriteLanguage() {
    return this.favoriteLanguage;
  }

  public void setFavoriteLanguage(String favoriteLanguage) {
    this.favoriteLanguage = favoriteLanguage;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public boolean getStereotypical() {
    return this.stereotypical;
  }

  public void isStereotypical(boolean stereotypical) {
    this.stereotypical = stereotypical;
  }

  public String getTabsOrSpaces() {
    return this.tabsOrSpaces;
  }

  public void setTabsOrSpaces(String tabsOrSpaces) {
    this.tabsOrSpaces = tabsOrSpaces;
  }

  public double getYearsCoding() {
    return this.yearsCoding;
  }

  public void setYearsCoding(double yearsCoding) {
    this.yearsCoding = yearsCoding;
  }

  public String getFavoriteHobby() {
    return this.favoriteHobby;
  }

  public void setFavoriteHobby(String favoriteHobby) {
    this.favoriteHobby = favoriteHobby.toLowerCase();
  }

}