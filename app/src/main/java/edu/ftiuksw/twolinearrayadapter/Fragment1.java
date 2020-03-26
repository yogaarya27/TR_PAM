package edu.ftiuksw.twolinearrayadapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.android.volley.RequestQueue;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import java.util.ArrayList;


public class Fragment1 extends ListFragment {

    private String name, id, c;
    private ArrayList<Contact> contacts = new ArrayList<>();


    public Fragment1(){
        APIList apis = RetrofitClient.getRetrofitClient().create(APIList.class);
        //Preparing Request
        Call<ArrayList<Pariwisata>> call = apis.getAllPariwisata();
        //Request server
        call.enqueue(new Callback<ArrayList<Pariwisata>>() {
            @Override
            public void onResponse(Call<ArrayList<Pariwisata>> call, Response<ArrayList<Pariwisata>> response) {
                ArrayList<Pariwisata> data = response.body();
                for(int a=0; a<data.size();a++){
                    Pariwisata i = data.get(a);
                    contacts.add(new Contact(i.getId(),i.getTitle()));
                }
            }
            @Override
            public void onFailure(Call<ArrayList<Pariwisata>> call, Throwable t) {

            }
        });
        contacts.add(new Contact("08918938123","pratyaksa"));
        contacts.add(new Contact("07717277819","ocsa"));

    }




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContactAdapter adapter = new ContactAdapter(getActivity().getApplicationContext(), contacts);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }
}
