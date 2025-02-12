package a1205.hospital;

public class Patient{
    private String name;
    private String disease;
    private String time;

    
    public Patient(String name, String disease, String time) {
        this.name = name;
        this.disease = disease;
        this.time = time;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // public String getPhone() {
    //     return phone;
    // }
    // public void setPhone(String phone) {
    //     this.phone = phone;
    // }
    // public String getAddress() {
    //     return address;
    // }
    // public void setAddress(String address) {
    //     this.address = address;
    // }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "Patient [name=" + name + ", disease=" + disease //, phone=\" + phone + \", address=\" + address + \"
                + ", time=" + time + "]";
    }
    
}
