/*
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String inStr = scan.nextLine();

    inStr = inStr.replaceAll("\\.", "");
    inStr = inStr.replaceAll(",", "");
    inStr = inStr.replaceAll("\\(", "");
    inStr = inStr.replaceAll("\\)", "");
    inStr = inStr.replaceAll("-", " ");

    String[] strArr = inStr.split(" ");

    for (String s : strArr) {
      //s = s.split(",")[0];
      System.out.println(s);
    }

    //Привет-это я. Как, ты справился с этим заданием (найти карту).










    */
/*int n = scan.nextInt();
    ZonedDateTime time = ZonedDateTime.now();
    if (n==1) {
      time = time.plusDays(2-1);
    } else {
      time = time.toLocalDate().atStartOfDay(ZoneId.systemDefault())
          .plusDays(2);
    }*//*

    */
/*String data = scan.nextLine();*//*


//    ZonedDateTime time = ZonedDateTime.now();
//    time = time.withZoneSameInstant(ZoneId.of("Europe/Moscow"));
//    System.out.println(time);

//    ZonedDateTime timeOld = ZonedDateTime.now();
//
//    boolean b = isExpectedShipmentDateChanged(timeOld, timeOld);
//    System.out.println(b);
//    LocalDateTime local = LocalDateTime.now();
//    System.out.println(local);
//
//    ZonedDateTime zoned = local.atZone(ZoneId.of("UTC"));
//    System.out.println(zoned);
//
//    ZonedDateTime msk = zoned.withZoneSameInstant(ZoneId.systemDefault());
//    System.out.println(msk);
//
//    ZonedDateTime time = ZonedDateTime.now(ZoneId.systemDefault());
//    System.out.println(time);
//
//    ZonedDateTime time2 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
//    System.out.println(time2);


    */
/*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    //ZonedDateTime time = ZonedDateTime.parse(data, formatter).withFixedOffsetZone();
    LocalDateTime time = LocalDateTime.parse(data, formatter);
    //ZonedDateTime time = ZonedDateTime.parse(data);
    ZonedDateTime time1 = time.atZone(ZoneId.systemDefault());
    scan.close();
    System.out.println(time);
    System.out.println(time1);*//*

  }

  public static boolean isExpectedShipmentDateChanged(ZonedDateTime oldDate,
      ZonedDateTime newDate) {
    return !Objects.equals(
        Optional.ofNullable(oldDate)
            .map(ChronoZonedDateTime::toInstant)
            .orElse(null),
        Optional.ofNullable(newDate)
            .map(ChronoZonedDateTime::toInstant)
            .orElse(null)
    );
  }

}*/
