/**
 *
 */
package org.qenherkhopeshef.graphics.emf;

/**
 * Opcodes for EMF files.
 * <p>
 * Each constant is the record type value of an EMF (Enhanced Metafile) record,
 * named after the corresponding GDI function.
 * @author rosmord
 */
public interface EMFOpCodes {
	/** EMF record type {@code EMR_ABORTPATH}. */
	int EMR_ABORTPATH= 68;
	/** EMF record type {@code EMR_POLYLINE}. */
	int EMR_POLYLINE= 4;
	/** EMF record type {@code EMR_ANGLEARC}. */
	int EMR_ANGLEARC= 41;
	/** EMF record type {@code EMR_POLYLINE16}. */
	int EMR_POLYLINE16= 87;
	/** EMF record type {@code EMR_ARC}. */
	int EMR_ARC= 45;
	/** EMF record type {@code EMR_POLYLINETO}. */
	int EMR_POLYLINETO= 6;
	/** EMF record type {@code EMR_ARCTO}. */
	int EMR_ARCTO= 55;
	/** EMF record type {@code EMR_POLYLINETO16}. */
	int EMR_POLYLINETO16= 89;
	/** EMF record type {@code EMR_BEGINPATH}. */
	int EMR_BEGINPATH= 59;
	/** EMF record type {@code EMR_POLYPOLYGON}. */
	int EMR_POLYPOLYGON= 8;
	/** EMF record type {@code EMR_BITBLT}. */
	int EMR_BITBLT= 76;
	/** EMF record type {@code EMR_POLYPOLYGON16}. */
	int EMR_POLYPOLYGON16= 91;
	/** EMF record type {@code EMR_CHORD}. */
	int EMR_CHORD= 46;
	/** EMF record type {@code EMR_POLYPOLYLINE}. */
	int EMR_POLYPOLYLINE= 7;
	/** EMF record type {@code EMR_CLOSEFIGURE}. */
	int EMR_CLOSEFIGURE= 61;
	/** EMF record type {@code EMR_POLYPOLYLINE16}. */
	int EMR_POLYPOLYLINE16= 90;
	/** EMF record type {@code EMR_CREATEBRUSHINDIRECT}. */
	int EMR_CREATEBRUSHINDIRECT= 39;
	/** EMF record type {@code EMR_POLYTEXTOUTA}. */
	int EMR_POLYTEXTOUTA= 96;
	/** EMF record type {@code EMR_CREATEDIBPATTERNBRUSHPT}. */
	int EMR_CREATEDIBPATTERNBRUSHPT= 94;
	/** EMF record type {@code EMR_POLYTEXTOUTW}. */
	int EMR_POLYTEXTOUTW= 97;
	/** EMF record type {@code EMR_CREATEMONOBRUSH}. */
	int EMR_CREATEMONOBRUSH= 93;
	/** EMF record type {@code EMR_REALIZEPALETTE}. */
	int EMR_REALIZEPALETTE= 52;
	/** EMF record type {@code EMR_CREATEPALETTE}. */
	int EMR_CREATEPALETTE= 49;
	/** EMF record type {@code EMR_RECTANGLE}. */
	int EMR_RECTANGLE= 43;
	/** EMF record type {@code EMR_CREATEPEN}. */
	int EMR_CREATEPEN= 38;
	/** EMF record type {@code EMR_RESIZEPALETTE}. */
	int EMR_RESIZEPALETTE= 51;
	/** EMF record type {@code EMR_DELETEOBJECT}. */
	int EMR_DELETEOBJECT= 40;
	/** EMF record type {@code EMR_RESTOREDC}. */
	int EMR_RESTOREDC= 34;
	/** EMF record type {@code EMR_ELLIPSE}. */
	int EMR_ELLIPSE= 42;
	/** EMF record type {@code EMR_ROUNDRECT}. */
	int EMR_ROUNDRECT= 44;
	/** EMF record type {@code EMR_ENDPATH}. */
	int EMR_ENDPATH= 60;
	/** EMF record type {@code EMR_SAVEDC}. */
	int EMR_SAVEDC= 33;
	/** EMF record type {@code EMR_EOF}. */
	int EMR_EOF= 14;
	/** EMF record type {@code EMR_SCALEVIEWPORTEXTEX}. */
	int EMR_SCALEVIEWPORTEXTEX= 31;
	/** EMF record type {@code EMR_EXCLUDECLIPRECT}. */
	int EMR_EXCLUDECLIPRECT= 29;
	/** EMF record type {@code EMR_SCALEWINDOWEXTEX}. */
	int EMR_SCALEWINDOWEXTEX= 32;
	/** EMF record type {@code EMR_EXTCREATEFONTINDIRECTW}. */
	int EMR_EXTCREATEFONTINDIRECTW= 82;
	/** EMF record type {@code EMR_SELECTCLIPPATH}. */
	int EMR_SELECTCLIPPATH= 67;
	/** EMF record type {@code EMR_EXTCREATEPEN}. */
	int EMR_EXTCREATEPEN= 95;
	/** EMF record type {@code EMR_SELECTOBJECT}. */
	int EMR_SELECTOBJECT= 37;
	/** EMF record type {@code EMR_EXTFLOODFILL}. */
	int EMR_EXTFLOODFILL= 53;
	/** EMF record type {@code EMR_SELECTPALETTE}. */
	int EMR_SELECTPALETTE= 48;
	/** EMF record type {@code EMR_EXTSELECTCLIPRGN}. */
	int EMR_EXTSELECTCLIPRGN= 75;
	/** EMF record type {@code EMR_SETARCDIRECTION}. */
	int EMR_SETARCDIRECTION= 57;
	/** EMF record type {@code EMR_EXTTEXTOUTA}. */
	int EMR_EXTTEXTOUTA= 83;
	/** EMF record type {@code EMR_SETBKCOLOR}. */
	int EMR_SETBKCOLOR= 25;
	/** EMF record type {@code EMR_EXTTEXTOUTW}. */
	int EMR_EXTTEXTOUTW= 84;
	/** EMF record type {@code EMR_SETBKMODE}. */
	int EMR_SETBKMODE= 18;
	/** EMF record type {@code EMR_FILLPATH}. */
	int EMR_FILLPATH= 62;
	/** EMF record type {@code EMR_SETBRUSHORGEX}. */
	int EMR_SETBRUSHORGEX= 13;
	/** EMF record type {@code EMR_FILLRGN}. */
	int EMR_FILLRGN= 71;
	/** EMF record type {@code EMR_SETCOLORADJUSTMENT}. */
	int EMR_SETCOLORADJUSTMENT= 23;
	/** EMF record type {@code EMR_FLATTENPATH}. */
	int EMR_FLATTENPATH= 65;
	/** EMF record type {@code EMR_SETDIBITSTODEVICE}. */
	int EMR_SETDIBITSTODEVICE= 80;
	/** EMF record type {@code EMR_FRAMERGN}. */
	int EMR_FRAMERGN= 72;
	/** EMF record type {@code EMR_SETMAPMODE}. */
	int EMR_SETMAPMODE= 17;
	/** EMF record type {@code EMR_GDICOMMENT}. */
	int EMR_GDICOMMENT= 70;
	/** EMF record type {@code EMR_SETMAPPERFLAGS}. */
	int EMR_SETMAPPERFLAGS= 16;
	/** EMF record type {@code EMR_HEADER}. */
	int EMR_HEADER= 1;
	/** EMF record type {@code EMR_SETMETARGN}. */
	int EMR_SETMETARGN= 28;
	/** EMF record type {@code EMR_INTERSECTCLIPRECT}. */
	int EMR_INTERSECTCLIPRECT= 30;
	/** EMF record type {@code EMR_SETMITERLIMIT}. */
	int EMR_SETMITERLIMIT= 58;
	/** EMF record type {@code EMR_INVERTRGN}. */
	int EMR_INVERTRGN= 73;
	/** EMF record type {@code EMR_SETPALETTEENTRIES}. */
	int EMR_SETPALETTEENTRIES= 50;
	/** EMF record type {@code EMR_LINETO}. */
	int EMR_LINETO= 54;
	/** EMF record type {@code EMR_SETPIXELV}. */
	int EMR_SETPIXELV= 15;
	/** EMF record type {@code EMR_MASKBLT}. */
	int EMR_MASKBLT= 78;
	/** EMF record type {@code EMR_SETPOLYFILLMODE}. */
	int EMR_SETPOLYFILLMODE= 19;
	/** EMF record type {@code EMR_MODIFYWORLDTRANSFORM}. */
	int EMR_MODIFYWORLDTRANSFORM= 36;
	/** EMF record type {@code EMR_SETROP2}. */
	int EMR_SETROP2= 20;
	/** EMF record type {@code EMR_MOVETOEX}. */
	int EMR_MOVETOEX= 27;
	/** EMF record type {@code EMR_SETSTRETCHBLTMODE}. */
	int EMR_SETSTRETCHBLTMODE= 21;
	/** EMF record type {@code EMR_OFFSETCLIPRGN}. */
	int EMR_OFFSETCLIPRGN= 26;
	/** EMF record type {@code EMR_SETTEXTALIGN}. */
	int EMR_SETTEXTALIGN= 22;
	/** EMF record type {@code EMR_PAINTRGN}. */
	int EMR_PAINTRGN= 74;
	/** EMF record type {@code EMR_SETTEXTCOLOR}. */
	int EMR_SETTEXTCOLOR= 24;
	/** EMF record type {@code EMR_PIE}. */
	int EMR_PIE= 47;
	/** EMF record type {@code EMR_SETVIEWPORTEXTEX}. */
	int EMR_SETVIEWPORTEXTEX= 11;
	/** EMF record type {@code EMR_PLGBLT}. */
	int EMR_PLGBLT= 79;
	/** EMF record type {@code EMR_SETVIEWPORTORGEX}. */
	int EMR_SETVIEWPORTORGEX= 12;
	/** EMF record type {@code EMR_POLYBEZIER}. */
	int EMR_POLYBEZIER= 2;
	/** EMF record type {@code EMR_SETWINDOWEXTEX}. */
	int EMR_SETWINDOWEXTEX= 9;
	/** EMF record type {@code EMR_POLYBEZIER16}. */
	int EMR_POLYBEZIER16= 85;
	/** EMF record type {@code EMR_SETWINDOWORGEX}. */
	int EMR_SETWINDOWORGEX= 10;
	/** EMF record type {@code EMR_POLYBEZIERTO}. */
	int EMR_POLYBEZIERTO= 5;
	/** EMF record type {@code EMR_SETWORLDTRANSFORM}. */
	int EMR_SETWORLDTRANSFORM= 35;
	/** EMF record type {@code EMR_POLYBEZIERTO16}. */
	int EMR_POLYBEZIERTO16= 88;
	/** EMF record type {@code EMR_STRETCHBLT}. */
	int EMR_STRETCHBLT= 77;
	/** EMF record type {@code EMR_POLYDRAW}. */
	int EMR_POLYDRAW= 56;
	/** EMF record type {@code EMR_STRETCHDIBITS}. */
	int EMR_STRETCHDIBITS= 81;
	/** EMF record type {@code EMR_POLYDRAW16}. */
	int EMR_POLYDRAW16= 92;
	/** EMF record type {@code EMR_STROKEANDFILLPATH}. */
	int EMR_STROKEANDFILLPATH= 63;
	/** EMF record type {@code EMR_POLYGON}. */
	int EMR_POLYGON= 3;
	/** EMF record type {@code EMR_STROKEPATH}. */
	int EMR_STROKEPATH= 64;
	/** EMF record type {@code EMR_POLYGON16}. */
	int EMR_POLYGON16= 86;
	/** EMF record type {@code EMR_WIDENPATH}. */
	int EMR_WIDENPATH= 66;
}
