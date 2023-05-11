public interface AbstractTrain {
    void refueling();


    void departure();

    void statusChange(int k);

    void unloading();

    void loading();

    void setIsEmpty(int k);
}
