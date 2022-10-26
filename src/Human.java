import org.w3c.dom.ls.LSOutput;

import java.awt.desktop.PreferencesEvent;

public class Human {
    String name;
    private int dateOfBirth;
    private String cityOfResidence;
    String post;

    Human(String name, int dateOfBirth, String cityOfResidence, String post) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.cityOfResidence = cityOfResidence;
        this.post = post;


    }
    Human(String name, int dateOfBirth,  String post) {

    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setDateOfBirth(int dateOfBirth) {
        if (dateOfBirth == 0 ) {
            System.out.println("Информация не указана");
        } else if (dateOfBirth<0  )
            System.out.println(0);
        this.dateOfBirth = dateOfBirth;

    }
    public void setCityOfResidence(String cityOfResidence) {
        if (cityOfResidence == null || cityOfResidence.isEmpty() || cityOfResidence.isBlank()) {
            System.out.println("Информация не указана");
        }
        this.cityOfResidence = cityOfResidence;
    }

    void humans (){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfResidence +  ". Я родился в " + dateOfBirth + ". Я работаю на должности " + post +  " году. Будем знакомы!" );
    }

}
