package core;

/**
 * Created by 秦磊 on 2020/4/8.
 * <p>
 * 对象链式写法
 */
public class ChainTest {


    static class User {
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public User setName(String name) {
            this.name = name;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public User setAge(Integer age) {
            this.age = age;
            return this;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println(new User().setName("张三").setAge(30));
    }

}

