public class TobysBadmintonShop {
  int badmintonRacquetPrice = 2500;
  int shuttleCockPrice = 100;
  int badmintonGripPrice = 200;
  String shuttlecock = "Shuttlecock";
  String badmintonGrip = "Badminton Grip";

  void tobysBadmintonItem() {
    System.out.println(shuttlecock + " " + shuttleCockPrice);
    System.out.println(badmintonGrip + " " + badmintonGripPrice);
  }

  void tobysBadmintonShopExpensive() {
    System.out.println("The most Expensive in Tobys Badminton Shop is Badminton Racquet" + " with the price of " + badmintonRacquetPrice);
  }

  void tobysBadmintonLeastItem() {
    System.out.println("The Least Expensive item of Tobys Badminton Shop is " + shuttlecock + " with the price of " + shuttleCockPrice);
  }
}


