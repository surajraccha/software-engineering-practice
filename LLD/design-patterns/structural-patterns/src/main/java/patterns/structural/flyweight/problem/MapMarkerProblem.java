package patterns.structural.flyweight.problem;

import java.util.ArrayList;
import java.util.List;

public class MapMarkerProblem {
    public List<MapMarker> createMarkers() {
        List<MapMarker> markers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            markers.add(new MapMarker(i, i, "hospital", "red-cross-icon-bytes", "red"));
        }
        return markers;
    }

    public record MapMarker(int x, int y, String type, String iconBytes, String color) {
    }
}
