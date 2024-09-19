package KiranaRegisterApplication.repository;
import com.example.kiranaregister.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    List<Transaction> findByType(String type);
}



