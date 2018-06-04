package person;

public class Teacher extends Person {

    private String mainSubject;
    private int yearOfExperience;
    private char gender;
    
    public Teacher(String name, String surname, String jmbg) {
        super(name, surname, jmbg);        
    }
    
    public Teacher(String name, String surname, String jmbg, String mainSubject, int yearOfExperience, char gender) {
        super(name, surname, jmbg);
        this.mainSubject = mainSubject;
        this.yearOfExperience = yearOfExperience;  
        this.gender = gender;
    }
    
    
    public String getMainSubject() {
        return mainSubject;
        
    }    
    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
        
    }
    public int getYearOfExperience() {
        return yearOfExperience;
        
    }
    
    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
        
    }
    public char getGender() {
        return gender;
        
    }    
    public void setGender(char gender) {
        this.gender = gender;
        
    }
    @Override
    public void showData() {
        
        System.out.println("Glavni predmet: " + getMainSubject());
        System.out.println("Godine iskustva: " + getYearOfExperience());
        System.out.println("Pol: " + getGender());
        super.showData();
    }
}
