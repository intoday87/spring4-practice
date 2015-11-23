package injection;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soundsystem.BlankDisc;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.fest.assertions.Assertions.assertThat;

public class InjectionConfigurationTest{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void test() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(InjectionConfiguration.class);

        BlankDisc compactDisc = context.getBean("compactDisc", BlankDisc.class);

        compactDisc.play();
        assertThat("Playing title by artist").isEqualTo(outContent.toString());
    }
}