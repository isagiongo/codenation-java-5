package challenge;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository quoteRepository;

	@Override
	public Quote getQuote() {
		return quoteRepository.findQuoteById(retornaRandom());
	}
	
	@Override
	public Quote getQuoteByActor(String actor) {
		return quoteRepository.findQuoteByActorContains(actor).stream().findAny().get();
	}
	
	private Integer retornaRandom() {
		Random random = new Random();
		return random.nextInt(10000);
	}
}
