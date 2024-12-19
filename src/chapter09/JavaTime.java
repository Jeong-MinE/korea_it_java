package chapter09;

// === java.time 패키지 === //
// : ISO 8601 표준을 기반으로 설계
// : YYYY-MM-DDThh:mm:ss.sssZ

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaTime {
    public static void main(String[] args) {

        // 1) LocalDate (날짜)
        // : 날짜(연도, 월, 일)
        // .now() - 현재 날짜반환
        // .of(연도, 월, 일) - 특정 날짜 반환
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specificDate = LocalDate.of(2025,3,14);
        System.out.println(specificDate);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);

        LocalDate ontMonthAgo = today.minusMonths(1);
        System.out.println(ontMonthAgo);

        // 2) LocalTime (시간)
        // : 시간(시,분,초,나누초)만 다름
        // - 날짜와 시간대 정보는 포함하지X
        // .now() - 현재 시간 반환
        // .of(시, 분, 초) - 특정 날짜 반환

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime specificTime = LocalTime.of(14,30);
        System.out.println(specificTime);

        LocalTime thirtyThreeMinutesLater = now.plusMinutes(33);
        System.out.println(thirtyThreeMinutesLater);

        LocalTime oneHourAgo = now.minusHours(1);
        System.out.println(oneHourAgo);

        // cf) get메서드
        // getYear(), getMonth(), getDayOfMonth() : 날짜 정보 반환
        // getHour(), getMinute(), getSecond() : 시간 정보 변환
        System.out.println(today.getMonth());
        System.out.println(now.getHour());

        // cf) LocalDateTime 클래스
        //  : 날짜와 시간을 함께 다루는 클래스
        //  .now(), .of(). .plus~(), .minus~() 사용 가능
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime.toLocalDate());
        System.out.println(nowDateTime.toLocalTime());

        // cf) 날짜와 시간 포맷팅(formatting)
        LocalDateTime example = LocalDateTime.now();
        System.out.println(example);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        System.out.println(example.format(formatter));


    }
}
