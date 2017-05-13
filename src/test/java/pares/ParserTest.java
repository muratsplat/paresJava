package pares;

import org.junit.Test;
import static org.junit.Assert.*;
import pares.Parser;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;

public class ParserTest {

    @Test
    public void evaluatesExpression() throws IOException
    {
        String raw;
        raw = new String(this.simplePARes(), Charset.defaultCharset());

        Parser pares = new Parser("asasasas");
        assertTrue(pares.parse());
    }

    public byte[] simplePARes() throws IOException
    {
        return Files.readAllBytes(Paths.get("src/test/testData/PARes.txt"));
    }
}

