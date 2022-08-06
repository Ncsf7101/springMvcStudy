import com.rqiang.domain.User;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
            System.out.println("返回json集合数据");
            User user1 = new User();
            user1.setName("杀杀杀");
            user1.setAge(12);

            User user2 = new User();
            user2.setName("杀杀杀");
            user2.setAge(13);

            User user3 = new User();
            user3.setName("杀杀杀");
            user3.setAge(14);

            List<User> users = new ArrayList<User>();
            users.add(user1);
            users.add(user2);
            users.add(user3);
            System.out.println(users);
    }
}
