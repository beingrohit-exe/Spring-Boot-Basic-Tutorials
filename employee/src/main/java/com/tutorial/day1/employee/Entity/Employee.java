package com.tutorial.day1.employee.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String name;
   private String email;
   private Integer age;
   private String city;

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
