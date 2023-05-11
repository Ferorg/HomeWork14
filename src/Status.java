public enum Status {
    OnMyWay("В пути"),
    Loading("Загружается"),
    Unloads("Разгружается");
    private String Status;


    Status(String status) {
        this.Status = status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
