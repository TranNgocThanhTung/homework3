package Files;

import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		

TTFiles file=new TTFiles();
String fileName="test.txt";

//   try {
//	file.CreateFile(fileName);
//} catch (IOException e) {
//	e.printStackTrace();
//	System.out.println("Ko thể tạo file:"+e.getMessage());
//}
   String data="luv with u";
   try {
	file.WriteFile(fileName, data);
} catch (IOException e) {
	e.printStackTrace();
	System.out.println("Ko thể ghi dữ liệu vào file"+e.getMessage());
}
   try {
	System.out.println(file.ReadFile(fileName));
	

} catch (IOException e) {
	System.out.println("Ko thể đọc dữ liệu từ file:"+e.getMessage());
	e.printStackTrace();
}
}
}