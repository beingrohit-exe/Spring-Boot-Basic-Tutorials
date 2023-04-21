package com.tutorial.day1.employee.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "entityTable")
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   //@Column(name = "fullname")
   private String name;
   private String email;
   private Integer age;
   private String city;

//   public Employee(Integer id, String name, String email, Integer age, String city) {
//      this.id = id;
//      this.name = name;
//      this.email = email;
//      this.age = age;
//      this.city = city;
//   }

   //Default Constructor
//   public Employee() {
//   }

//   public Integer getId() {
//      return id;
//   }
//
//   public void setId(Integer id) {
//      this.id = id;
//   }
//
//   public String getName() {
//      return name;
//   }
//
//   public void setName(String name) {
//      this.name = name;
//   }
//
//   public String getEmail() {
//      return email;
//   }
//
//   public void setEmail(String email) {
//      this.email = email;
//   }
//
//   public Integer getAge() {
//      return age;
//   }
//
//   public void setAge(Integer age) {
//      this.age = age;
//   }
//
//   public String getCity() {
//      return city;
//   }
//
//   public void setCity(String city) {
//      this.city = city;
//   }
}
