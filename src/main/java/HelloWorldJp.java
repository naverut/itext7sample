import java.io.File;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class HelloWorldJp {
    public static void main(String[] args) throws Exception {
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(new File("HelloWorldJp.pdf"));
        // 平成角ゴシック
        PdfFont font = PdfFontFactory.createFont("HeiseiKakuGo-W5", "UniJIS-UCS2-H");

        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);
 
        // Initialize document
        Document document = new Document(pdf);
 
        //Add paragraph to the document
        document.add(new Paragraph("こんにちは～世界！").setFont(font));
 
        //Close document
        document.close();
   }
}