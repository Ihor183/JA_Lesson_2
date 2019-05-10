package ua.igorbendera.jdbs;

public class Programmer {
    private int id;
    private String name;
    private String programmingLanguage;
    private String companyWorkFor;
    private int age;

    public Programmer(int id, String name, String programmingLanguage,
                      String companyWorkFor, int age) {
        this.id = id;
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.companyWorkFor = companyWorkFor;
        this.age = age;
    }

    public Programmer(String name, String programmingLanguage, String companyWorkFor, int age) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.companyWorkFor = companyWorkFor;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getCompanyWorkFor() {
        return companyWorkFor;
    }

    public void setCompanyWorkFor(String companyWorkFor) {
        this.companyWorkFor = companyWorkFor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Programmer {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", programmingLanguage = '" + programmingLanguage + '\'' +
                ", companyWorkFor = '" + companyWorkFor + '\'' +
                ", age = " + age +
                " }\n";
    }
}
