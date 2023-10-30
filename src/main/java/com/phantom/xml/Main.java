package com.phantom.xml;

import com.phantom.xml.parser.AdmHierarchy;
import com.phantom.xml.parser.AdressObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException,IOException {


        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documentAdr = builder.parse(new File("./data/AS_ADDR_OBJ.XML"));
        Document documentAdmHier = builder.parse(new File("./data/AS_ADM_HIERARCHY.XML"));
        Element elementAdress = documentAdr.getDocumentElement();
        Element elementAdmHier = documentAdmHier.getDocumentElement();

        Main main = new Main();
        List<AdressObject> adressObjectsList = main.parsedFilesAddress(elementAdress);
        List<AdmHierarchy> admHierObjectsList = main.parsedFilesAdmHier(elementAdmHier);

        main.findAdressByObjectIDAndData(new long[]{1422396,1450759,1449192,1451562},LocalDate.parse("2010-01-01"),adressObjectsList);
        main.currentFullAddress(adressObjectsList,admHierObjectsList);


    }
    public ArrayList<AdressObject> parsedFilesAddress(Element element) {
        ArrayList<AdressObject> ObjectsList = new ArrayList<>();
        NodeList nodeList = element.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i) instanceof Element) {
                AdressObject newObject = new AdressObject();
                if (((Element) nodeList.item(i)).hasAttribute("ID"))
                    newObject.setId(Long.parseLong(((Element) nodeList.item(i)).getAttribute("ID")));
                if (((Element) nodeList.item(i)).hasAttribute("OBJECTID"))
                    newObject.setObjectID(Long.parseLong(((Element) nodeList.item(i)).getAttribute("OBJECTID")));
                if (((Element) nodeList.item(i)).hasAttribute("OBJECTGUID"))
                    newObject.setObjectGuid(((Element) nodeList.item(i)).getAttribute("OBJECTGUID"));
                if (((Element) nodeList.item(i)).hasAttribute("CHANGEID"))
                    newObject.setChangeId(Long.parseLong(((Element) nodeList.item(i)).getAttribute("CHANGEID")));
                if (((Element) nodeList.item(i)).hasAttribute("NAME"))
                    newObject.setName(((Element) nodeList.item(i)).getAttribute("NAME"));
                if (((Element) nodeList.item(i)).hasAttribute("TYPENAME"))
                    newObject.setTypename(((Element) nodeList.item(i)).getAttribute("TYPENAME"));
                if (((Element) nodeList.item(i)).hasAttribute("LEVEL"))
                    newObject.setLevel(Integer.parseInt(((Element) nodeList.item(i)).getAttribute("LEVEL")));
                if (((Element) nodeList.item(i)).hasAttribute("OPERTYPEID"))
                    newObject.setOperTypeID(Long.parseLong(((Element) nodeList.item(i)).getAttribute("OPERTYPEID")));
                if (((Element) nodeList.item(i)).hasAttribute("PREVID"))
                    newObject.setPrevID(Long.parseLong(((Element) nodeList.item(i)).getAttribute("PREVID")));
                if (((Element) nodeList.item(i)).hasAttribute("NEXTID"))
                    newObject.setNextID(Long.parseLong(((Element) nodeList.item(i)).getAttribute("NEXTID")));
                if (((Element) nodeList.item(i)).hasAttribute("UPDATEDATE"))
                    newObject.setUpdateDate(LocalDate.parse(((Element) nodeList.item(i)).getAttribute("UPDATEDATE")));
                if (((Element) nodeList.item(i)).hasAttribute("STARTDATE"))
                    newObject.setStartDate(LocalDate.parse(((Element) nodeList.item(i)).getAttribute("STARTDATE")));
                if (((Element) nodeList.item(i)).hasAttribute("ENDDATE"))
                    newObject.setEndDate(LocalDate.parse(((Element) nodeList.item(i)).getAttribute("ENDDATE")));
                if (((Element) nodeList.item(i)).hasAttribute("ISACTUAL"))
                    newObject.setIsactual(Integer.parseInt(((Element) nodeList.item(i)).getAttribute("ISACTUAL")));
                if (((Element) nodeList.item(i)).hasAttribute("ISACTIVE"))
                    newObject.setIsactive(Integer.parseInt(((Element) nodeList.item(i)).getAttribute("ISACTIVE")));
            ObjectsList.add(newObject);
         }
        }
        return ObjectsList;
    }

    public ArrayList<AdmHierarchy> parsedFilesAdmHier(Element element) {
        ArrayList<AdmHierarchy> admHierList = new ArrayList<>();
        NodeList nodeList = element.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i) instanceof Element) {
                AdmHierarchy newObject = new AdmHierarchy();
                if (((Element) nodeList.item(i)).hasAttribute("ID"))
                    newObject.setId(Long.parseLong(((Element) nodeList.item(i)).getAttribute("ID")));
                if (((Element) nodeList.item(i)).hasAttribute("OBJECTID"))
                    newObject.setObjectID(Long.parseLong(((Element) nodeList.item(i)).getAttribute("OBJECTID")));
                if (((Element) nodeList.item(i)).hasAttribute("PARENTOBJID"))
                    newObject.setParentObjID(Long.parseLong(((Element) nodeList.item(i)).getAttribute("PARENTOBJID")));
                if (((Element) nodeList.item(i)).hasAttribute("CHANGEID"))
                    newObject.setChangeId(Long.parseLong(((Element) nodeList.item(i)).getAttribute("CHANGEID")));
                if (((Element) nodeList.item(i)).hasAttribute("PREVID"))
                    newObject.setPrevID(Long.parseLong(((Element) nodeList.item(i)).getAttribute("PREVID")));
                if (((Element) nodeList.item(i)).hasAttribute("NEXTID"))
                    newObject.setNextID(Long.parseLong(((Element) nodeList.item(i)).getAttribute("NEXTID")));
                if (((Element) nodeList.item(i)).hasAttribute("UPDATEDATE"))
                    newObject.setUpdateDate(LocalDate.parse(((Element) nodeList.item(i)).getAttribute("UPDATEDATE")));
                if (((Element) nodeList.item(i)).hasAttribute("STARTDATE"))
                    newObject.setStartDate(LocalDate.parse(((Element) nodeList.item(i)).getAttribute("STARTDATE")));
                if (((Element) nodeList.item(i)).hasAttribute("ENDDATE"))
                    newObject.setEndDate(LocalDate.parse(((Element) nodeList.item(i)).getAttribute("ENDDATE")));
                if (((Element) nodeList.item(i)).hasAttribute("ISACTIVE"))
                    newObject.setIsactive(Integer.parseInt(((Element) nodeList.item(i)).getAttribute("ISACTIVE")));
                admHierList.add(newObject);
            }
        }
        return admHierList;
    }

    public void findAdressByObjectIDAndData(long [] objectArray, LocalDate localDate,List<AdressObject> adressObjectsList){
        List<AdressObject> list = adressObjectsList.stream().filter(adress -> (adress.getStartDate().isBefore(localDate) && adress.getEndDate().isAfter(localDate)))
                .collect(Collectors.toList());
        for (int i = 0; i < objectArray.length; i++) {
            long l = objectArray[i];
            list.stream()
                    .filter(adress -> adress.getObjectID() == l)
                    .collect(Collectors.toList()).forEach(x -> System.out.println(x.getObjectID() + " - " + x.getTypename()+ "." + x.getName()));
        }

    }

    public List<AdressObject> findAdressByData(List<AdressObject> adressObjectsList) {
        List<AdressObject> list = adressObjectsList.stream().filter(adress -> (adress.getStartDate().isBefore(LocalDate.now()) &&
                        adress.getEndDate().isAfter(LocalDate.now())))
                .collect(Collectors.toList());
        return list;
    }

    public void currentFullAddress(List<AdressObject> adressObjectsList,List<AdmHierarchy> admHierObjectsList){
        List<AdressObject> currentFullAddress = findAdressByData(adressObjectsList).stream()
                .filter(adressObject -> adressObject.getTypename().equals("проезд")).collect(Collectors.toList());
        for (AdmHierarchy x:admHierObjectsList) {
            for (AdressObject y:currentFullAddress) {
                if (x.getParentObjID() == y.getObjectID()){
                    System.out.println(y.getTypename() + " " + y.getName());
                }
            }
        }

    }
}
