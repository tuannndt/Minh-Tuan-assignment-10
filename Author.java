package homework;

import java.util.Date;

public class Author {
    private String name;
    private Date dateOfBirth;
    
    public Author() {
        this.name = "";
        this.dateOfBirth = new Date();
    }
    
    public Author(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName() {
        this.name = name;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
