package bp.spring.jokegenerator.jokegenerator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("goodJokes")
@Profile({"chuck","default"})
public class CNJokeService implements JokeService {
    ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
