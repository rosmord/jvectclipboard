# JVectClipboard Swing graphical library

JVectClipboard is a simple Swing graphical library to 
allow copy/paste to various graphical formats.

It was custom made for the JSesh software, and doesn't provide functions (such as gradient paints) which are not needed by JSesh.

Its font handling is also a bit primitive.

See https://comp.qenherkhopeshef.org/blog/jvectcutandpaste for (slightly outdated) documentation.

## Various tech notes

I had a hard time finding back why JSesh PDF copy/paste worked, and my examples did not. 
To declare PDF as a legitimate copy/paste format, you need to execute the following code.

~~~
 ((SystemFlavorMap) SystemFlavorMap.getDefaultFlavorMap())
                .addUnencodedNativeForFlavor(PDFTransferable.PDF_FLAVOR, "PDF");
~~~

## History


8.1.1
: fixed a bug in SVG: lines width were not correctly set in the SVG output for some transformations (it could be negative).

8.1.0
: modified the SVG output to add SVG version.
