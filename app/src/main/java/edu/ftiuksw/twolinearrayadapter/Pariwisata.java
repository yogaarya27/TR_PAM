package edu.ftiuksw.twolinearrayadapter;

import com.google.gson.annotations.SerializedName;

public class Pariwisata {

    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;
    @SerializedName("elevation")
    private String elevation;
    @SerializedName("webpage")
    private String webpage;
    @SerializedName("foto")
    private String foto;
    @SerializedName("phone")
    private String phone;
    @SerializedName("deskripsi")
    private String deskripsi;

    public Pariwisata(String id, String title, String lat, String lng, String elevation, String webpage, String foto, String phone, String deskripsi) {
        this.id = id;
        this.title = title;
        this.lat = lat;
        this.lng = lng;
        this.elevation = elevation;
        this.webpage = webpage;
        this.foto = foto;
        this.phone = phone;
        this.deskripsi = deskripsi;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public String getElevation() {
        return elevation;
    }

    public String getWebpage() {
        return webpage;
    }

    public String getFoto() {
        return foto;
    }

    public String getPhone() {
        return phone;
    }

    public String getDeskripsi() {
        return deskripsi;
    }


}
