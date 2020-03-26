package edu.ftiuksw.twolinearrayadapter;

import com.google.gson.annotations.SerializedName;

public class Pegawai {

    @SerializedName("_id")
    private String _id;
    @SerializedName("index")
    private Integer index;
    @SerializedName("salary")
    private String salary;
    @SerializedName("name")
    private String name;
    @SerializedName("age")
    private Integer age;

    public Pegawai(String _id, Integer index, String salary, String name, Integer age) {
        this._id = _id;
        this.index = index;
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public String get_id() {
        return _id;
    }

    public Integer getIndex() {
        return index;
    }

    public String getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


}
