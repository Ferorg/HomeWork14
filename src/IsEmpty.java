public enum IsEmpty {
    Loaded("Загружен"),
    EMPTY("Пустой");
    private String IsEmpty;

    IsEmpty(String isEmpty) {
        this.IsEmpty = isEmpty;
    }

    public String getIsEmpty() {
        return IsEmpty;
    }

    public void setIsEmpty(String isEmpty) {
        IsEmpty = isEmpty;
    }
}
