package com.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 请求参数json接收
@RestController
public class _05 {

    @PostMapping("/05")
    String json(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }

    public static class User {
        String name;
        int age;
        List<String> hobby;
        Address address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public List<String> getHobby() {
            return hobby;
        }

        public void setHobby(List<String> hobby) {
            this.hobby = hobby;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", hobby=" + hobby +
                    ", address=" + address +
                    '}';
        }

        public static class Address{
            String province;
            String city;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            @Override
            public String toString() {
                return "Address{" +
                        "province='" + province + '\'' +
                        ", city='" + city + '\'' +
                        '}';
            }
        }
    }
}

