package qotd

class QuoteController {

	static defaultAction = "home" /* Double quote is important here. Single quote didn't work! */

    def index() { }

    def home() {
		render "<h1>Real Programmers do not eat Quiche</h1>"
	}

	def random() {
		def staticAuthor = "Anonymous"
		def staticContent = "Real Programmers don't eat much quiche"
		[author: staticAuthor, content: staticContent]
	}
}
