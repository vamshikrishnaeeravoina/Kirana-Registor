package KiranaRegisterApplication.service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CurrencyConversionService {

    private static final String API_URL = "https://api.fixer.io/latest?base=INR";

    public double convertCurrency(double amount, String from, String to) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> response = restTemplate.getForObject(API_URL, Map.class);
        
        // Extract conversion rate
        Map<String, Double> rates = (Map<String, Double>) response.get("rates");
        double rate = rates.get(to) / rates.get(from);
        
        return amount * rate;
    }


}
