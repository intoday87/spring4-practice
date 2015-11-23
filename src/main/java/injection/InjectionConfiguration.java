package injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import soundsystem.BlankDisc;
import soundsystem.CompactDisc;

@Configuration
@PropertySource("classpath:/app.properties")
public class InjectionConfiguration{
    @Autowired
    Environment environment;

    @Bean
    public CompactDisc compactDisc() {
        return new BlankDisc(environment.getProperty("disc.artist"), environment.getProperty("disc.title"));
    }
}
