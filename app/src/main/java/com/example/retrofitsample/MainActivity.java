package com.example.retrofitsample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = NetworkService.getApiClient().create(ApiInterface.class);

        final TextView helloTextView = (TextView) findViewById(R.id.hello);
        helloTextView.setText("Şerafettin Kötü Kedi!...");

        try {
            Call<Token> token = apiInterface.getToken("LoginMethod","hcelik","1");

            token.enqueue(new Callback<Token>() {
                @Override
                public void onResponse(Call<Token> call, Response<Token> response) {
                    if(response.body().isSuccess()){
                        helloTextView.setText(response.body().getValues().getUsername() + " " + response.body().getValues().getFullName());
                    }
                    else {
                        helloTextView.setText(response.body().getMessage());
                    }
                }

                @Override
                public void onFailure(Call<Token> call, Throwable t) {
                    helloTextView.setText("Bir hata oluştu!...");
                }
            });
        }
        catch(Exception ex) {
            helloTextView.setText("Hata oldu!...");
        }

        /*
        NetworkService.getInstance()
                .getJSONApi()
                .getToken("hcelik","1")
                .enqueue(new Callback<Token>() {
                    @Override
                    public void onResponse(@NonNull Call<Post> call, @NonNull Response<Post> response) {
                        Post post = response.body();
                        // post nesnesi ile isteğiniz veriyi çağırabilirsiniz. Örneğin post.getTitle(), post.getBody() vs.
                        helloTextView.setText(post.getTitle());
                    }

                    @Override
                    public void onFailure(@NonNull Call<Post> call, @NonNull Throwable t) {
                        t.printStackTrace();
                    }
                });*/
    }
}