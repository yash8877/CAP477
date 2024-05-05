class Client {
    private Integer clientId;
    private String name;
    private String email;
    private String phonenumber;
    private String country;

    public Client(Integer clientId, String name, String email, String phonenumber, String country) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.country = country;
    }

    // Getters and setters
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return clientId + "," + name + "," + email + "," + phonenumber + "," + country;
    }
}
