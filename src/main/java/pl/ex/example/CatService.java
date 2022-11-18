package pl.ex.example;

import com.example.DI2.repository.PetRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CatService implements PetRepository {
    @Override

    public String checkPet() {
        return "kot";
    }
}
