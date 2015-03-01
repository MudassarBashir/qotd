package qotd

class QuoteController {

	static scaffold = true
	def quoteService
	static defaultAction = "home" /* Double quote is important here. Single quote didn't work! */

    def index() { }

    def home() {
		render "<h1>Real Programmers do not eat Quiche</h1>"
	}

	def random() {
		def randomQuote = quoteService.getRandomQuote()
		[ quote : randomQuote ]
	}
}
