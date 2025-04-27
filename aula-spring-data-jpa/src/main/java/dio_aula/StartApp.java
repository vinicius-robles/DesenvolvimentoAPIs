package dio_aula;

import dio_aula.model.User;
import dio_aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("VINICIUS");
        user.setUsername("vrobls");
        user.setPassword("123456");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
