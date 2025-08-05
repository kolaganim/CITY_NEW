package collectionInterface;
import java.util.*;
import java.util.ArrayList;

public class AddingUsers {
    public static void main(String[] args) {

        UserDetails mDetails = new UserDetails("Meghana","Kolagani",19);
        UserDetails bDetails = new UserDetails("Basavaiah","Kolagani",45);

        List<UserDetails> users = new ArrayList<>();
        users.add(mDetails);
        users.add(bDetails);

        for(UserDetails user : users){
            System.out.println(user.getAge());
        }
    }
}
