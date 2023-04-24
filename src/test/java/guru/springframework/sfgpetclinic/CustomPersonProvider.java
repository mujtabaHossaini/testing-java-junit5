package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.model.Person;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CustomPersonProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
                Arguments.of(new Person(1L, "mujtaba", "hossaini")),
                Arguments.of(new Person(2L, "morteza", "hossaini")),
                Arguments.of(new Person(3L, "mohammad", "sharifi")),
                Arguments.of(new Person(4L, "ahmad", "zare-ei"))
        );
    }
}
