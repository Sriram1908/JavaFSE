package DesignPatternsandPrinciples.Exercise2.FactoryMethodPatternExample;


//import DesignPatternsandPrinciples.Exercise2.FactoryMethodPatternExample.*;


import javax.print.Doc;

class WordDocument implements Document{

    public void open(){
        System.out.println("In word openeing doc");
    }
}

class ExcelDocument implements Document{

    public void open(){
        System.out.println("In Excel opening excel");
    }
}

class PdfDocument implements Document{

    public void open(){
        System.out.println("In pdf opening pdf");
    }
}

abstract class DocumentFactory{

    abstract Document createDocument();
}

class WordFactory extends DocumentFactory{

    public Document createDocument(){
        return new WordDocument();
    }
}
class ExcelFactory extends DocumentFactory{

    public Document createDocument(){
        return  new ExcelDocument();
    }
}
class PdfFactory extends DocumentFactory{

    public Document createDocument(){
       return new PdfDocument();
    }
}

public class concrete {

    static void main() {

    }
}
