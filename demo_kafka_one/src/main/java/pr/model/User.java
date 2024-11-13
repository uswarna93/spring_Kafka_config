package pr.model;


import lombok.*;

import java.io.Serializable;

@Setter
@Getter
public class User implements Serializable {

        private String name;
        private String email;
        private Integer age;

        public User(String name, String email, Integer age) {
            this.name = name;
            this.email = email;
            this.age = age;
        }
        public User() {
        }

}

