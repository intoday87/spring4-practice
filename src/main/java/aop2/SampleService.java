package aop2;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public String getMessage() {
        return "message";
    }
}
