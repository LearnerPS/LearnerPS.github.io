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

public class TestStudentSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//extracted();
		//파일에서 List를 읽어 복원하기
		FileInputStream fis = new FileInputStream("students.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Student> list = (ArrayList<Student>)ois.readObject();
		System.out.println( "복원된 리스트="+list );
	}

	private static void extracted() throws FileNotFoundException, IOException {
		ArrayList<Student> stdList = new ArrayList<Student>();
		// 학생 객체를 리스트에 추가, 파일에 저장
		Student st1 = new Student("홍길동","컴공","010-111",4);
		stdList.add(st1);
		st1 = new Student("김길동","소공","010-222",3);
		stdList.add(st1);
		//파일에 저장
		FileOutputStream fos = new FileOutputStream("students.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stdList);
		oos.flush();
		oos.close();
		System.out.println("객체 저장 성공");

    }

}

```
