package pojo;

import com.fasterxml.jackson.annotation.*;
import com.opencsv.bean.*;

import java.util.*;

public class Contact {

    @CsvBindByName(column = "contact")
    @JsonProperty("contact")
    private String contact;


    @CsvBindByName(column = "name")
    @JsonProperty("name")
    private String name;

    @CsvBindByName(column = "email")
    @JsonProperty("email")
    private String email;

    @CsvBindByName(column = "userId")
    @JsonProperty("userId")
    private String userId;

    @CsvBindByName(column = "active")
    @JsonProperty("active")
    private Boolean active;

    @CsvBindByName(column = "emailSubscribe")
    @JsonProperty("emailSubscribe")
    private Boolean emailSubscribe;

    @CsvBindByName(column = "smsSubscribe")
    @JsonProperty("smsSubscribe")
    private Boolean smsSubscribe;

    @CsvBindByName(column = "desktopWebPushSubscribe")
    @JsonProperty("desktopWebPushSubscribe")
    private Boolean desktopWebPushSubscribe;

    @CsvBindByName(column = "mobileWebPushSubscribe")
    @JsonProperty("mobileWebPushSubscribe")
    private Boolean mobileWebPushSubscribe;

    @CsvBindByName(column = "telegramSubscribe")
    @JsonProperty("telegramSubscribe")
    private Boolean telegramSubscribe;

    @CsvBindByName(column = "firstName")
    @JsonProperty("firstName")
    private String firstName;

    @CsvBindByName(column = "lastName")
    @JsonProperty("lastName")
    private String lastName;

    @CsvBindByName(column = "contactBirthday")
    @JsonProperty("contactBirthday")
    private String contactBirthday;

    @CsvBindByName(column = "contactLanguage")
    @JsonProperty("contactLanguage")
    private String contactLanguage;


    @CsvBindByName(column = "contactGender")
    @JsonProperty("contactGender")
    private Integer contactGender;


    @CsvBindByName(column = "contactTimezone")
    @JsonProperty("contactTimezone")
    private String contactTimezone;

    @CsvBindByName(column = "contactScore")
    @JsonProperty("contactScore")
    private Integer contactScore;


    @CsvBindByName(column = "avatarLink")
    @JsonProperty("avatarLink")
    private String avatarLink;


    @CsvBindByName(column = "facebookLink")
    @JsonProperty("facebookLink")
    private String facebookLink;

    @CsvBindByName(column = "instagramLink")
    @JsonProperty("instagramLink")
    private String instagramLink;

    @CsvBindByName(column = "linkedInLink")
    @JsonProperty("linkedInLink")
    private String linkedInLink;

    @CsvBindByName(column = "twitterLink")
    @JsonProperty("twitterLink")
    private String twitterLink;

    @CsvBindByName(column = "tiktokLink")
    @JsonProperty("tiktokLink")
    private String tiktokLink;

    @JsonProperty("cac")
    private Cac cac;

    @JsonProperty("variables")
    private List<Variables> variables;

    public static class Cac {

        @CsvBindByName(column = "value")
        @JsonProperty("value")
        private String value;

        @CsvBindByName(column = "currency")
        @JsonProperty("currency")
        private String currency;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value.trim();
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency.trim();
        }
    }

    public static class Variables {

        @CsvBindByName(column = "name")

        @JsonProperty("name")
        private String name;

        @CsvBindByName(column = "value")
        @JsonProperty("value")
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name.trim();
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value.trim();
        }
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId.trim();
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = Boolean.valueOf(String.valueOf(active).trim());
        ;
        ;
        ;
    }

    public Boolean getEmailSubscribe() {
        return emailSubscribe;
    }

    public void setEmailSubscribe(Boolean emailSubscribe) {
        this.emailSubscribe = Boolean.valueOf(String.valueOf(emailSubscribe).trim());
        ;
        ;
        ;
    }

    public Boolean getSmsSubscribe() {
        return smsSubscribe;
    }

    public void setSmsSubscribe(Boolean smsSubscribe) {
        this.smsSubscribe = Boolean.valueOf(String.valueOf(smsSubscribe).trim());
        ;
        ;
    }

    public Boolean getDesktopWebPushSubscribe() {
        return desktopWebPushSubscribe;
    }

    public void setDesktopWebPushSubscribe(Boolean desktopWebPushSubscribe) {
        this.desktopWebPushSubscribe = Boolean.valueOf(String.valueOf(desktopWebPushSubscribe).trim());
        ;
    }

    public Boolean getMobileWebPushSubscribe() {
        return mobileWebPushSubscribe;
    }

    public void setMobileWebPushSubscribe(Boolean mobileWebPushSubscribe) {
        this.mobileWebPushSubscribe = Boolean.valueOf(String.valueOf(mobileWebPushSubscribe).trim());
    }

    public Boolean getTelegramSubscribe() {
        return telegramSubscribe;
    }

    public void setTelegramSubscribe(Boolean telegramSubscribe) {
        this.telegramSubscribe = Boolean.valueOf(String.valueOf(telegramSubscribe).trim());
        ;
        ;
        ;
        ;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.trim();
    }

    public String getContactBirthday() {
        return contactBirthday;
    }

    public void setContactBirthday(String contactBirthday) {
        this.contactBirthday = contactBirthday.trim();
    }

    public String getContactLanguage() {
        return contactLanguage;
    }

    public void setContactLanguage(String contactLanguage) {
        this.contactLanguage = contactLanguage.trim();
    }

    public Integer getContactGender() {
        return contactGender;
    }

    public void setContactGender(Integer contactGender) {
        this.contactGender = Integer.valueOf(String.valueOf(contactGender).trim());
    }

    public String getContactTimezone() {
        return contactTimezone;
    }

    public void setContactTimezone(String contactTimezone) {
        this.contactTimezone = contactTimezone.trim();
    }

    public Integer getContactScore() {
        return contactScore;
    }

    public void setContactScore(Integer contactScore) {
        this.contactScore = Integer.valueOf(String.valueOf(contactScore).trim());
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink.trim();
    }

    public String getFacebookLink() {
        return facebookLink;
    }

    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink.trim();
    }

    public String getInstagramLink() {
        return instagramLink;
    }

    public void setInstagramLink(String instagramLink) {
        this.instagramLink = instagramLink.trim();
    }

    public String getLinkedInLink() {
        return linkedInLink;
    }

    public void setLinkedInLink(String linkedInLink) {
        this.linkedInLink = linkedInLink.trim();
    }

    public String getTwitterLink() {
        return twitterLink;
    }

    public void setTwitterLink(String twitterLink) {
        this.twitterLink = twitterLink.trim();
    }

    public String getTiktokLink() {
        return tiktokLink;
    }

    public void setTiktokLink(String tiktokLink) {
        this.tiktokLink = tiktokLink.trim();
    }

    public Cac getCac() {
        return cac;
    }

    public void setCac(Cac cac) {
        this.cac = cac;
    }

    public List<Variables> getVariables() {
        return variables;
    }

    public void setVariables(List<Variables> variables) {
        this.variables = variables;
    }

}
