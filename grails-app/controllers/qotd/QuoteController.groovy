package qotd

class QuoteController {

	static defaultAction = "home" /* Double quote is important here. Single quote didn't work! */

    def index() { }

    def home() {
		render "<h1>Real Programmers do not eat Quiche</h1>"
	}

	def random() {
		def allQuotes = Quote.list() 
		def randomQuote
		if ( allQuotes.size() > 0 ) {
			def randomIdx = new Random().nextInt( allQuotes.size() )
			randomQuote = allQuotes[ randomIdx ]
		} 
		else {
			randomQuote = new Quote( author: "Anonymous", 
			content: "Real Programmers Don't eat much Quiche" )
		}
		[ quote : randomQuote ] 
	}
}
