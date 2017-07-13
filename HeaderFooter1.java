
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;


public class HeaderFooter1 extends PdfPageEventHelper{ 

    @Override
    public void onStartPage(PdfWriter writer,Document document) {
    	com.itextpdf.text.Rectangle rect = writer.getBoxSize(null);
        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase("Apartment User's List"), rect.getTop(), rect.getTop(), 0);
ColumnText.showTextAligned(writer.getDirectContent(),
    Element.ALIGN_RIGHT,
    new Phrase(String.format("%d", writer.getPageNumber())),rect.getRight(), rect.getBottom() - 18, 0);   
    }

    
    @Override
    public void onEndPage(PdfWriter writer,Document document) {
    	 com.itextpdf.text.Rectangle rect = writer.getBoxSize(null);
        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase(""), rect.getLeft(), rect.getBottom(), 0);
        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase("Page:"), rect.getRight(), rect.getBottom(), 0);
    }
}
