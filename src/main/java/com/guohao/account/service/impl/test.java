package com.guohao.account.service.impl;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.ArrayList;
import java.util.List;

public class test {
    static class Guo{
        Animals animals;

        public Animals getAnimals() {
            return animals;
        }

        public void setAnimals(Animals animals) {
            this.animals = animals;
        }

        @Override
        public String toString() {
            return "Guo{" +
                    "animals=" + animals +
                    '}';
        }
    }
    static class Animals {
        private String name;
        List<Dog> dog;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Dog> getDog() {
            return dog;
        }

        public void setDog(List<Dog> dog) {
            this.dog = dog;
        }

        @Override
        public String toString() {
            return "Animals{" +
                    "name='" + name + '\'' +
                    ", dog=" + dog +
                    '}';
        }
    }

    static class Dog{
        String name;
        String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        String userJson = "{\n" +
                "    \"animals\": {\n" +
                "        \"dog\": [\n" +
                "            {\n" +
                "                \"name\": \"Rufus\",\n" +
                "                \"age\":15\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Marty\",\n" +
                "                \"age\": null\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";
//        Guo guo = new Guo();
//        Animals animals = new Animals();
//        Dog dog1 = new Dog();
//        dog1.setAge("20");
//        dog1.setAge("guohao");
//        Dog dog2 = new Dog();
//        dog2.setAge("18");
//        dog2.setAge("bobo");
//        List<Dog> dogList2 = new ArrayList<>();
//        dogList2.add(dog1);
//        dogList2.add(dog2);
//        animals.setDogList(dogList2);
//        guo.setAnimals(animals);
//        System.out.println(JSON.toJSON(guo));
        Guo guo = JSON.parseObject(userJson, Guo.class);
        System.out.println(guo);



    }
}
