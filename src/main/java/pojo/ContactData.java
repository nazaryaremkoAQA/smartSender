package pojo;

import com.fasterxml.jackson.annotation.*;
import com.opencsv.bean.*;

import java.util.*;

public class ContactData {

    @CsvBindByName(column = "contactListId")
    @JsonProperty("contactListId")
    private String contactListId;

    @CsvBindByName(column = "webHookUri")
    @JsonProperty("webHookUri")
    private String webHookUri;


    @CsvBindByName(column = "upsert")
    @JsonProperty("upsert")
    private Boolean upsert;

    @JsonProperty("contacts")
    private List<Contact> contacts;

    public String getContactListId() {
        return contactListId;
    }

    public void setContactListId(String contactListId) {
        this.contactListId = contactListId.trim();
    }

    public String getWebHookUri() {
        return webHookUri;
    }

    public void setWebHookUri(String webHookUri) {
        this.webHookUri = webHookUri.trim();
    }

    public Boolean getUpsert() {
        return upsert;
    }

    public void setUpsert(Boolean upsert) {
        this.upsert = Boolean.valueOf(String.valueOf(upsert).trim());
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "contactListId='" + contactListId + '\'' +
                ", webHookUri='" + webHookUri + '\'' +
                ", upsert=" + upsert +
                ", contacts=" + contacts +
                '}';
    }
}
