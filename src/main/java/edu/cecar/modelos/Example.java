package edu.cecar.modelos;
public class Example {
    private String date_of_stop, fatal, alcohol, gender;

    public Example(String date_of_stop, String fatal, String alcohol, String gender) {
        this.date_of_stop = date_of_stop;
        this.fatal = fatal;
        this.alcohol = alcohol;
        this.gender = gender;
    }
   
    public Example() {
    }

    public String getDate_of_stop() {
        return date_of_stop;
    }

    public void setDate_of_stop(String date_of_stop) {
        this.date_of_stop = date_of_stop;
    }

    public String getFatal() {
        return fatal;
    }

    public void setFatal(String fatal) {
        this.fatal = fatal;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
