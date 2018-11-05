package edu.ecu.cs.csci3030.surfaces;

/**
 * A listing of the shapes on a canvas.
 *
 * This represents a list of the shapes present on a canvas. It displays
 * the list, with shapes included as thumbnails with their current colors,
 * but does not show relative positions.
 *
 * @author Mark Hills
 * @version 1.0
 */
public class ShapeList implements ISurface, ICanvasObserver{
    @Override
    public String getSurfaceName() {
        return "Shape List";
    }

    @Override
    public void update() {
        System.out.println("Something changed in the Shape");
    }

}
