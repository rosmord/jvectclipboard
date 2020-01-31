package org.qenherkhopeshef.graphics.vectorClipboard;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.awt.datatransfer.*;

/**
 * 
 * PDF export. Needs IText to work.
 *
 * @author rosmord
 *
 */
public class PDFTransferable implements Transferable {


	public static final DataFlavor PDF_FLAVOR = new DataFlavor("application/pdf", "PDF");

	private static final DataFlavor[] flavors = { PDF_FLAVOR };

	static {
		// Declares PDF as a legitimate copy/paste format.
		((SystemFlavorMap) SystemFlavorMap.getDefaultFlavorMap())
				.addUnencodedNativeForFlavor(PDFTransferable.PDF_FLAVOR, "PDF");
	}
	/**
	 * The picture which will be drawn by this transferable.
	 */
	private PDFPicture pdfPicture;

	public PDFTransferable(PDFPicture pdfPicture) {
		this.pdfPicture = pdfPicture;
	}

	public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
		if (flavor.equals(PDF_FLAVOR)) {
			return new ByteArrayInputStream(pdfPicture.getByteArray());
		} else {
			throw new UnsupportedFlavorException(flavor);
		}
	}

	public DataFlavor[] getTransferDataFlavors() {
		return flavors;
	}

	public boolean isDataFlavorSupported(DataFlavor flavor) {
		DataFlavor[] flavors = getTransferDataFlavors();
		return Arrays.asList(flavors).contains(flavor);
	}

}
