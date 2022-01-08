***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
//이번에는 연도와 월, 일, 시, 분, 초까지 나타내주는 Calendar를 만들었다

//여러 종류가 있지만 그 중 달력의 가장 기본이 되는 그레고리력으로 만들었다
***
```ruby

package day_12_03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {

	public static void main(String[] args) {
		// 지금시간 추출
		Date d = new Date();
		int y = d.getYear();
		System.out.println( y ); // 1900년 이후 지나온 연도 121
		System.out.println( "연도 "+(1900+y) ); // 
		System.out.println( "월 "+(d.getMonth()+1) );
		System.out.println( "일 "+d.getDate() );
		
		System.out.println("시 "+d.getHours());
		System.out.println("분 "+d.getMinutes());
		System.out.println("초 "+d.getSeconds());
		///
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh");
		System.out.println( sdf.format(d) );
		///
		Calendar c = Calendar.getInstance();//역법 자동 계산
			
	}

}

```
