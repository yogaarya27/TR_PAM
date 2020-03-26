package edu.ftiuksw.twolinearrayadapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIList {

    @GET("pariwisata")
    Call<ArrayList<Pariwisata>> getAllPariwisata();

    @GET("pegawai")
    Call<ArrayList<Pegawai>> getAllPegawai();

}
