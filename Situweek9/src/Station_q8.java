import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Write the program that tell you which line pass through particular stations.
        Just use Zone 1 stations name. (Challenge)*/
        public class Station_q8 {
    public static void main(String[] args) {//Main Method

    }

    Map<String, List<String>> stationsToLines = createStationLineMap(); //
    //zone 1 station names
    List<String> zone1Stations = Arrays.asList(
            "Bond Street", "Victoria", "Embankment",
            "London Bridge", "Euston", "Oxford Circus"
    );


    {
        for (String station : zone1Stations) {
            List<String> lines = stationsToLines.get(station);
            if (lines != null) {
                System.out.println(station + " is  served by the folowing lines :" + lines);
            } else {
                System.out.println(station + " is not served by any lines in zone1.");
            }
        }
    }
    Map<String, List<String>> createStationLineMap() {
        // Create a HashMap to map stations to lines
        Map<String, List<String>> stationsToLines = new HashMap<>();

        stationsToLines.put("Bond Street", Arrays.asList("Central", "jubilee"));
        stationsToLines.put("Victoria", Arrays.asList("Victoria", "Dictrict"));
        stationsToLines.put("Embankment", Arrays.asList("District", "Circle"));
        stationsToLines.put("London Bridge", Arrays.asList("Bakerloo", "Circle"));
        stationsToLines.put("Euston", Arrays.asList("Northen", "Victoria"));
        stationsToLines.put("Oxford Circus", Arrays.asList("Bakerloo", "Central"));
        return stationsToLines;
    }
}










