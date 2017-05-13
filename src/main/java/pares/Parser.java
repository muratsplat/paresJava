package pares;

import java.io.IOException;
import java.util.Base64;
import java.util.Base64.*;
import java.io.ByteArrayOutputStream;
import java.util.IllegalFormatException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;


public class Parser
{
    private String raw;
    private String xmlAsString;

    public Parser(String pares)
    {
        raw = pares;
    }

    public boolean parse()
    {
        byte[] toByte;
        byte[] decZip;
        try {
            toByte = Parser.decodeBase64(this.raw);
            decZip = Parser.unzip(toByte);
        } catch (DataFormatException e) {
            return false;
        } catch (IllegalFormatException e) {
            return false;
        } catch (IOException e) {
            return false;
        }

        xmlAsString = decZip.toString();
        return true;
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
}
