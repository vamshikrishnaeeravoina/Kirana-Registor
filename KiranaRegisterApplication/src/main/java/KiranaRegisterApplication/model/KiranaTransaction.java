package KiranaRegisterApplication.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document(collection = "transactions")
public class KiranaTransaction {
	@Id
    private String id;
    private double amount;
    private String currency;
    private double convertedAmount;
    private Date date;
    private String type; // credit or debit
    private String description;
}

	
