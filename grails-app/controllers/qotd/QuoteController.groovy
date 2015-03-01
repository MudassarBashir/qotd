package qotd

class QuoteController {

	static defaultAction = "home" /* Double quote is important here. Single quote didn't work! */

    def index() { }

    def home() {
		render "<h1>Real Programmers do not eat Quiche</h1>"
	}

	def random() {
		def staticQuote = new Quote(author: "Anonymous",
									content: "Real Programmers don't eat much Quiche")
		[quote : staticQuote]
	}
}
