***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestObjectSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		writeList();
		readList();
	}

	private static void readList() throws FileNotFoundException, IOException, ClassNotFoundException {
		//파일에서 List를 읽어 복원하기
		FileInputStream fis = new FileInputStream("names.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<String> list = (ArrayList<String>)ois.readObject();
		System.out.println( "복원된 리스트="+list );
	}

	private static void writeList() throws FileNotFoundException, IOException {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("홍길동");
		mylist.add("김길동");
		mylist.add("이길동");
		//파일에 저장
		FileOutputStream fos = new FileOutputStream("names.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(mylist);
		oos.flush();
		oos.close();
		System.out.println("객체 저장 성공");
	}
}

```
