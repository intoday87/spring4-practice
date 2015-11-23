package profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import soundsystem.BlankDisc;
import soundsystem.CDPlayer;
import soundsystem.CompactDisc;

import java.util.ArrayList;

@Configuration
@Profile({"dev"})
public class DevelopmentProfileConfig {
    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(compactDisc());
    }

    @Bean
    public CompactDisc compactDisc() {
        return new BlankDisc("artist", "title", new ArrayList<String>());
    }
}
