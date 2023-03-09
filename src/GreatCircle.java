public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args [0]);
        double y1 = Double.parseDouble(args [1]);
        double x2 = Double.parseDouble(args [2]);
        double y2 = Double.parseDouble(args [3]);

        double lat1 = Math.toRadians(x1);
        double lon1 = Math.toRadians(y1);
        double lat2 = Math.toRadians(x2);
        double lon2 = Math.toRadians(y2);


        double total = Math.sin((lat2 - lat1) / 2) * Math.sin((lat2 - lat1) / 2) +
                        Math.cos(lat1) * Math.cos(lat2) * Math.sin((lon2 - lon1) / 2)
                                * Math.sin((lon2 - lon1) / 2);

        double sqrtTotal = Math.sqrt(total);

        double arcSin = 2 * Math.asin(sqrtTotal);
        double distance = 6371.0 * arcSin;


        System.out.println(distance + " kilometers.");

    }
}