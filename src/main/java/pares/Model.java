package pares;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.w3c.dom.Document;

public class Model {

    private int acquirerBIN;
    private char merchantID;
    private char xid;
    private char date;
    private int amount;
    private int currency;
    private int exponent;
    private char txTime;
    private char txStatus;
    private char txECI;
    private char txCAVV;
    private char txCAVVAlgorithm;
    private String rawXml;
    private Document dom;

    public void setAcquirerBIN(int bin)
    {
        acquirerBIN = bin;
    }

    public int getAcquirerBIN()
    {
        return acquirerBIN;
    }

    public void setMerchantID(char merchantID)
    {
        this.merchantID = merchantID;
    }

    public char getMerchantID()
    {
        return this.merchantID;
    }

    public void setXID( char XID)
    {
        this.xid = XID;
    }

    public char getXID()
    {
        return this.xid;
    }

    public void setDate(char date)
    {
        this.date = date;
    }

    public char getDate()
    {
        return this.date;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public int getAmount()
    {
        return this.amount;
    }

    public void setExponent(int exponent)
    {
        this.exponent = exponent;
    }

    public int getExponent()
    {
        return this.exponent;
    }

    public void setCurrency(int currency)
    {
        this.currency = currency;
    }

    public int getCurrency()
    {
        return this.currency;
    }

    public void setTXTime(char txTime)
    {
        this.txTime = txTime;
    }

    public char getTXTime()
    {
        return this.txTime;
    }

    public void setTXStatus(char txStatus)
    {
        this.txStatus = txStatus;
    }

    public char getTXStatus()
    {
        return this.txStatus;
    }

    public void setTXCAVV(char $txCAVV)
    {
        this.txCAVV = txCAVV;
    }

    public char getTXCAVV()
    {
        return this.txCAVV;
    }

    public void setTXECI(char txECI)
    {
        this.txECI = txECI;
    }

    public char getTXECI()
    {
        return this.txECI;
    }

    public void setTXCAVVAlgorithm(char txCAVVAlgorithm)
    {
        this.txCAVVAlgorithm = txCAVVAlgorithm;
    }

    public char getTXcavvAlgorithm()
    {
        return this.txCAVVAlgorithm;
    }

    public void setRawXml(String xml)
    {
        this.rawXml = xml;
    }

    public String getRawXml(String xml)
    {
        return this.rawXml;
    }

    public Document getDOM()
    {
        return dom;
    }

    public void setDOM(Document domDoc)
    {
        dom = domDoc;
    }
    
    public Model(Document dom)
    {
        this.setDOM(dom);
    }

    public void init() throws Exception
    {

    }
}
