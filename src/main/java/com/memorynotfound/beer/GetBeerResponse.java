//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.11.24 ʱ�� 10:44:08 PM CST 
//


package com.memorynotfound.beer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beer" type="{http://memorynotfound.com/beer}beer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "beer"
})
@XmlRootElement(name = "getBeerResponse")
public class GetBeerResponse {

    protected Beer beer;

    /**
     * ��ȡbeer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Beer }
     *     
     */
    public Beer getBeer() {
        return beer;
    }

    /**
     * ����beer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Beer }
     *     
     */
    public void setBeer(Beer value) {
        this.beer = value;
    }

}
