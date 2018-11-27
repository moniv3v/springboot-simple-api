package com.tw.apistackbase.controller;

public class Employee {
        private Integer id;
        private String name;
        private Integer age;
        private String gender;

        public Employee(){

        }

        public Employee(Integer id, String name, Integer age, String gender) {
                this.id = id;
                this.name = name;
                this.age = age;
                this.gender = gender;
        }

        public Integer getId() {
                return this.id;
        }

        public String getName() {
                return this.name;
        }

        public Integer getAge() {
                return this.age;
        }

        public String getGender() {
                return this.gender;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setAge(Integer age) {
                this.age = age;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }
}