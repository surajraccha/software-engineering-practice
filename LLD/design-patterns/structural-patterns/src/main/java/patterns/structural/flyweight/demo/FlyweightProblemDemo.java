package patterns.structural.flyweight.demo;

import java.util.List;
import patterns.structural.flyweight.problem.MapMarkerProblem;
import patterns.structural.flyweight.problem.MapMarkerProblem.MapMarker;

public class FlyweightProblemDemo {
    public static void main(String[] args) {
        List<MapMarker> markers = new MapMarkerProblem().createMarkers();
        System.out.println("Markers created: " + markers.size());
        System.out.println("First icon object id: " + System.identityHashCode(markers.get(0).iconBytes()));
        System.out.println("Problem: each marker stores repeated type, icon, and color data.");
    }
}
