package com.tutorial.day1.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.day1.employee.Entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Integer> {

//    public List<Tag> checkAddTags(List<String> tags) {
//        // "rohit", "rishab", "sachin", "rakesh"
//
//        true, ["rohit", "rishab"];
//        false, ["sachin", "rakesh"]
//        Map<Boolean, List<String>> splittedTags = tags
//                .stream()
//                .collect(Collectors.partitioningBy(tagRepository::existsByTagName));
//        List<Tag> savedTagList = splittedTags
//                .get(false)
//                .stream()
//                .map(e -> tagRepository.save(Tag
//                        .builder()
//                        .tagName(e)
//                        .dateCreated(new Date())
//                        .build()))
//                .collect(Collectors.toList());
//        List<Tag> existedTagList = splittedTags
//                .get(true)
//                .stream()
//                .map(tagRepository::findByTagName)
//                .collect(Collectors.toList());
//        return Stream
//                .concat(savedTagList.stream(), existedTagList.stream())
//                .collect(Collectors.toList());
//    }
}