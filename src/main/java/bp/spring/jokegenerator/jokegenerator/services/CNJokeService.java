package bp.spring.jokegenerator.jokegenerator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("goodJokes")
//@Profile({"chuck","default"})
public class CNJokeService implements JokeService {
     private final ChuckNorrisQuotes quotes;


    public CNJokeService(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
