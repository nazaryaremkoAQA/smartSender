package scripts;

import com.google.gson.*;
import com.intuit.karate.*;
import org.junit.jupiter.api.*;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import pojo.*;
import utils.*;

import java.io.*;
import java.util.*;

import static common.Constants.*;

public class UpdateContacts {

    private Gson gson;
    private ContactData contactData;
    private Map<String, Object> args;
    private String test1 = "test1";
    private CsvReader csvReader;

    @BeforeClass()
    public void prepare() {
        gson = new Gson();
        args = new HashMap();
        csvReader = new CsvReader();

        contactData = (ContactData) csvReader.getCsvData(CSV_CONTACT_DATA, test1,ContactData.class).get(0);
        List<Contact> contacts = csvReader.getCsvData(CSV_CONTACT, test1,Contact.class);
        Contact contact = contacts.get(0);
        contact.setVariables(csvReader.getCsvData(CSV_VARIABLES, test1, Contact.Variables.class));
        contact.setCac((Contact.Cac) csvReader.getCsvData(CSV_CAC, test1, Contact.Cac.class).get(0));
        contactData.setContacts(contacts);
        args.put("jsonBody", new GsonBuilder().create().toJson(contactData));
        args.put("partUrl", "/contacts/update");
        args.put("accessToken", "NzdiZmZjYTBiNDZiYmNjZGY2ZjE4MjkwNTZjMmM2NjU=");
    }

    @Test()
    public void updateContact() {
        Map<String, Object> result = Runner.runFeature(new File(SRC_TEST_JAVA + File.separator + "UpdateContact.feature"), args, false);
        ResponseUpdate response = gson.fromJson(result.get("response").toString(), ResponseUpdate.class);
        String requestId = response.getRequestId();
        Assertions.assertEquals(response.getResult(), true);
        Assertions.assertTrue(!requestId.isEmpty() && requestId instanceof String);
        Assertions.assertTrue(response.getErrors().size() == 0);
        Assertions.assertEquals(result.get("status"), 200);
    }
}
