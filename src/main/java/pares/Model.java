package pares;

import org.w3c.dom.Document;

public class Model {

    private int acquirerBIN;
    private char merchantID;
    private String xid;
    private char date;
    private int amount;
    private int currency;
    private int exponent;
    private char txTime;
    private char txStatus;
    private String txECI;
    private String txCAVV;
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

    public void setXID( String XID)
    {
        this.xid = XID;
    }

    public String getXID()
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

    public void setTXCAVV(String txCAVV)
    {
        this.txCAVV = txCAVV;
    }

    public String getTXCAVV()
    {
        return this.txCAVV;
    }

    public void setTXECI(String txECI)
    {
        this.txECI = txECI;
    }

    public String getTXECI()
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

    public Model(Document dom) throws Exception
    {
        this.setDOM(dom);
        this.init();
    }

    public Model()
    {
    }

    public void init() throws Exception
    {

            setXID(
                    dom.getElementsByTagName("xid").item(0).getTextContent()
            );
            setTXECI(
                    dom.getElementsByTagName("eci").item(0).getTextContent()
            );

            setTXCAVV(
                    dom.getElementsByTagName("cavv").item(0).getTextContent()
            );

    }
}
