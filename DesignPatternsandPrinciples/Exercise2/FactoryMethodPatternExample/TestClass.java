package DesignPatternsandPrinciples.Exercise2.FactoryMethodPatternExample;

public class TestClass {

    static void main() {

        DocumentFactory d = new ExcelFactory();
        Document wordDoc = d.createDocument();

        wordDoc.open();

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}


//it slike we will have an mediator here in which we ask him to get the
// object which is the fatcory method and with it we will acces the method
// for better security

// output

//In Excel opening excel
//In pdf opening pdf
//In Excel opening excel
//
//Process finished with exit code 0
