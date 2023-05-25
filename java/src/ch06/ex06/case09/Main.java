package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		Chrome chrome = new Chrome();
		
		console.out(); //출력
		browser.out(); //출력
		
		UI.in(); //입력
		/*console.in(); 
		 * browser.in();
		 * Console.in();
		 * Browser.in();
		 * interface의 in은 static으로 
		 * 상속받을 이유도 할 필요도 없다.
		 * 어디로 접근하든 상속 되지 않는다.
		 */
		
		chrome.out();
		//chrome.in();
		//Chrome.in();
	}
}

/*UI이기에 in하는 것이지 크롬이라서, 콘솔이라서 브라우저라서 
in하는 것이 아니다.*/