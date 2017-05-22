package pares;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.io.IOException;
import java.util.Base64;
import java.util.Base64.*;
import java.io.ByteArrayOutputStream;
import java.util.IllegalFormatException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import pares.Model;


public class Parser
{
    private String raw;
    private String xmlAsString;
    private Model pares;

    public Parser(String pares)
    {
        raw = pares;
    }

    public void Parse() throws Exception
    {
        byte[] toByte;
        byte[] decZip;

        toByte = Parser.decodeBase64(this.raw);
        decZip = Parser.unzip(toByte);
        xmlAsString = new String(decZip);
        pares = new Model();
        Document domDoc = newDOMBuilder(xmlAsString);
        pares.setDOM(domDoc);
    }



    public static byte[] decodeBase64(String data) throws IllegalArgumentException
    {
        Decoder dec = Base64.getDecoder();
        return dec.decode(data);
    }

    public static byte[] unzip(byte[] data) throws DataFormatException,IOException
    {
        Inflater dec = new Inflater();
        dec.setInput(data);
        ByteArrayOutputStream bos = new ByteArrayOutputStream(data.length);
        byte[] buf = new byte[1024];

        while (!dec.finished()) {
            int count = dec.inflate(buf);
            bos.write(buf, 0, count);

        }
        bos.close();
        return bos.toByteArray();
    }

    private Document newDOMBuilder(String rawXml) throws Exception
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        StringBuilder xmlStringBuilder = new StringBuilder();
        xmlStringBuilder.append(rawXml);
        ByteArrayInputStream input =  new ByteArrayInputStream(xmlStringBuilder.toString().getBytes("UTF-8"));
        return builder.parse(input);
    }
}
