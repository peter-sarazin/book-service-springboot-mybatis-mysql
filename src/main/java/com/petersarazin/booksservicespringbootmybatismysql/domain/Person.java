package com.petersarazin.booksservicespringbootmybatismysql.domain;

public class Person {

    private Integer personId;
    private String firstName;
    private String middleName;
    private String lastName;

    public Integer getPersonId() { return personId; }
    public void setPersonId(Integer personId) { this.personId = personId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}
