
public class Prac2 {

	public static void main(String[] args) {
		
		String data = "A/B/C";
		
		DataParser parser = new PipeDataParser();
		String[] parsed = parser.parse(data);
		
		for(String d : parsed) {
			System.out.println(d);
		}
		
	}
}

interface DataParser{
	String[] parse(String data);
}

class PipeDataParser implements DataParser {
	
	public String[] parse(String data) {
		return data.split("/");
	}
}

class HashDataParser implements DataParser {
	
	public String[] parse(String data) {
		return data.split("+");
	}

//	class ParserFactor implements DataParser {
//	
//	public static DataParser getParser(String data){
//		DataParser parser = null;
//		if("&".equals(data)) {
//			parser = new HashDataParser();
//			return parser;
//		}
//		else if("/".equals(data)) {
//			parser = new PipeDataParser();
//		}
//		
//	}
}