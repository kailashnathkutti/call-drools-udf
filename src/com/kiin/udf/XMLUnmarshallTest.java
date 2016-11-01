package com.kiin.udf;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XMLUnmarshallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(FileContent.class);			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			
			String result = "<com.kiin.udf.FileContent>      <site__producer__name>Plateau REALPANIER</site__producer__name>      <site__sender__name>Laboratoire ISLES/SORGUES</site__sender__name>      <order__number>620121074830</order__number>      <orderer__code></orderer__code>      <orderer__group></orderer__group>      <orderer__functional__unit></orderer__functional__unit>      <sample__id></sample__id>      <sample__subtype></sample__subtype>      <sample__rank></sample__rank>      <sample__is__urgent>U</sample__is__urgent>      <sample__is__real></sample__is__real>      <sample__is__aliquot></sample__is__aliquot>      <sample__aliquot__parent__id></sample__aliquot__parent__id>      <sample__type__connection__instrument__code></sample__type__connection__instrument__code>      <sample__type></sample__type>      <sample__type__label></sample__type__label>      <tube__preanalytical__mpl__link__code></tube__preanalytical__mpl__link__code>      <tube__preanalytical__mpl__workcycle></tube__preanalytical__mpl__workcycle>      <tube__preanalytical__mpl__workplace></tube__preanalytical__mpl__workplace>      <parameter__name></parameter__name>      <parameter__with__sample__type__name></parameter__with__sample__type__name>      <parameter__instrument__connection__code></parameter__instrument__connection__code>      <parameter__lis__connection__code></parameter__lis__connection__code>      <parameter__discipline__name></parameter__discipline__name>      <parameter__type></parameter__type>      <event__id></event__id>      <event__datetime>2015-07-21 10:20:20</event__datetime>      <event__actor></event__actor>      <instrument__name></instrument__name>      <instrument__serial__number></instrument__serial__number>      <instrument__mpl__number></instrument__mpl__number>      <instrument__model></instrument__model>      <instrument__parent__name></instrument__parent__name>      <instrument__connection__driver__type></instrument__connection__driver__type>      <lis__connection__code></lis__connection__code>      <parameter__dimension__1></parameter__dimension__1>      <parameter__dimension__2></parameter__dimension__2>      <parameter__dimension__3></parameter__dimension__3>      <parameter__dimension__4></parameter__dimension__4>      <parameter__dimension__5></parameter__dimension__5>      <instrument__dimension__1></instrument__dimension__1>      <instrument__dimension__2></instrument__dimension__2>      <exportation__realisation__date></exportation__realisation__date>      <exportation__date></exportation__date>      <customer__licence__name></customer__licence__name>      <middleware__network__id></middleware__network__id>      <customer__contract__isppm></customer__contract__isppm>      <file__name></file__name>      <dq1__passed>true</dq1__passed>      <dq2__passed>true</dq2__passed>      <dq4__passed>false</dq4__passed>      <dq3__passed>false</dq3__passed>      <valid>false</valid>    </com.kiin.udf.FileContent>";

			String newResult = result.replaceAll("__", "_");
			
			System.out.println("newResult is  -->"+newResult);
			
			FileContent fileOut = (FileContent)jaxbUnmarshaller.unmarshal(new StringReader(result));
			
			System.out.println("result -->"+fileOut.getEvent_datetime());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
