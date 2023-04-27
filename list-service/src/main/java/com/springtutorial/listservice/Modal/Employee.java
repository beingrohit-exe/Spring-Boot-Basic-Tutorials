package com.springtutorial.listservice.Modal;

public class Employee {

    private Integer id;
    private String firstname;
    private String lastname;
    private String city;

    /**
     * AllArgsConstructor || Parametrised
     * @param id
     * @param firstname
     * @param lastname
     * @param city
     */
    public Employee(Integer id, String firstname, String lastname, String city){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
    }

    /**
     * Parametrised
     * @param firstname
     * @param lastname
     * @param city
     */
    public Employee(String firstname, String lastname, String city){
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
    }

    /**
     * NoArgsConstructor
     */
    public Employee(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + "]";
    }
}
