package generics.challenge;

public class Main {
    public static void main(String[] args) {
        var natioalParks = new Park[] {
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "37.8651, -119.5383"),
                new Park("Yosemite", "36.7782, -119.4179")
        };

        Layer<Park> nationalParks = new Layer<>(natioalParks);
        nationalParks.renderLayer();

        var majorRivers = new River[] {
                new River("Mississippi", "38.6270, -90.1994", "37.0902, -95.7129", "38.6270, -90.1994"),
                new River("Missouri", "38.6270, -90.1994", "38.6270, -90.1994", "38.6270, -90.1994"),
        };

        Layer<River> majorRiversLayer = new Layer<>(majorRivers);
        majorRiversLayer.addElelements(
                new River("Colorado", "38.6270, -90.1994", "38.6270, -90.1994", "38.6270, -90.1994"),
                new River("Rio Grande", "38.6270, -90.1994", "38.6270, -90.1994", "38.6270, -90.1994")
        );
        majorRiversLayer.renderLayer();
    }
}
