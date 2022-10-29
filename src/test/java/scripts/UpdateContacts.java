package scripts;

import com.google.gson.*;
import com.intuit.karate.*;
import org.junit.jupiter.api.*;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import pojo.*;

import java.io.*;
import java.util.*;

import static common.Constants.*;
import static utils.CsvReader.*;

public class UpdateContacts {

    private Gson gson;
    private ContactData contactData;
    private Map<String, Object> args;
    private String test1 = "test1";

    @BeforeClass()
    public void prepare() {
        gson = new Gson();
        args = new HashMap();
        contactData = getContactData(CSV_CONTACT_DATA, test1).get(0);
        List<Contact> contacts = getContact(CSV_CONTACT, test1);
        Contact contact = contacts.get(0);
        contact.setVariables(getVariables(CSV_VARIABLES, test1));
        contact.setCac(getCacCSV(CSV_CAC, test1).get(0));
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
