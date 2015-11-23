package profile;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soundsystem.CDPlayer;

import static org.fest.assertions.Assertions.assertThat;

public class DevelopmentProfileConfigTest {
    @Test
    public void dev로_프로파일이_활성화되면_profile_annotation의_attribute로_dev가_선언된_bean들이_생성된다() throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DevelopmentProfileConfig.class);

        CDPlayer cdPlayer = applicationContext.getBean("cdPlayer", CDPlayer.class);
        assertThat(cdPlayer).isNotNull();
        cdPlayer.play();//cdPlay내 compactDisc가 wiring되지 않았으면 예상하지 못한 nullPointerException 예외가 발생할 것이다.
    }
}