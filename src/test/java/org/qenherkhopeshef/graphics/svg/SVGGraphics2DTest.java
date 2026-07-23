package org.qenherkhopeshef.graphics.svg;

import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;
import org.qenherkhopeshef.graphics.utils.DoubleDimensions;

/**
 * Test various scenarii for SVGGraphics2D.
 * add those called "create...." will create svg files in folder build/reports/output
 * SVGGraphics2DTest
 */
public class SVGGraphics2DTest {

    private static Writer createWriter(String testName) {
        try {
            File outputFile = new File("build/reports/output/" + testName + ".svg");
            outputFile.getParentFile().mkdirs();
            return new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * test the creation of a filled blue triangle.
     * @throws IOException 
     */
    @Test
    public void createFilledShape() throws IOException {
        var writer = createWriter("filledShape");
        SVGGraphics2D svgGraphics2D = new SVGGraphics2D(writer, new DoubleDimensions(200, 200));
        svgGraphics2D.setColor(java.awt.Color.BLUE);
        java.awt.Polygon triangle = new java.awt.Polygon();
        triangle.addPoint(0, 0);
        triangle.addPoint(0, 100);
        triangle.addPoint(100, 60);
        svgGraphics2D.fill(triangle);
        svgGraphics2D.dispose();
    }

    @Test
    public void createDrawShape() throws IOException {
        var writer = createWriter("drawShape");
        SVGGraphics2D svgGraphics2D = new SVGGraphics2D(writer, new DoubleDimensions(200, 200));
        svgGraphics2D.setColor(java.awt.Color.BLUE);
        GeneralPath pol = new GeneralPath();
		float halfStroke= 1/2f;
        float width=200;
        float height=200;
		pol.moveTo(width-halfStroke, halfStroke);
		pol.lineTo(halfStroke, halfStroke);
		pol.lineTo(halfStroke, height-halfStroke);
		pol.lineTo(width-halfStroke, height-halfStroke);		
        svgGraphics2D.draw(pol);
        svgGraphics2D.dispose();
    }

    @Test
    public void createDrawShapeMirrored() throws IOException {
        var writer = createWriter("drawShapeMirrored");
        SVGGraphics2D svgGraphics2D = new SVGGraphics2D(writer, new DoubleDimensions(200, 200));
        svgGraphics2D.transform(new AffineTransform(-1, 0, 0, 1, 200
                    , 0));
        svgGraphics2D.setColor(java.awt.Color.BLUE);
        GeneralPath pol = new GeneralPath();
		float halfStroke= 1/2f;
        float width=200;
        float height=200;
		pol.moveTo(width-halfStroke, halfStroke);
		pol.lineTo(halfStroke, halfStroke);
		pol.lineTo(halfStroke, height-halfStroke);
		pol.lineTo(width-halfStroke, height-halfStroke);		
        svgGraphics2D.draw(pol);
        svgGraphics2D.dispose();
    }
}
