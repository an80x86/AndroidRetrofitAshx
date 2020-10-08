package com.example.retrofitsample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static ApiInterface apiInterface;
    private Token publicToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = NetworkService.getApiClient().create(ApiInterface.class);

        final TextView helloTextView = (TextView) findViewById(R.id.hello);
        helloTextView.setText("Giriş yapılıyor....");

        final Button btn = (Button) findViewById(R.id.button_id);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Call<Branch> result = apiInterface.GetBranch("Branch","hcelik","1", publicToken);

                    result.enqueue(new Callback<Branch>() {
                        @Override
                        public void onResponse(Call<Branch> call, Response<Branch> response) {
                            if(response.body().isSuccess()){
                                String str = "";
                                for (Value value : response.body().getValues()) {
                                    str += value.getBranchDesc() + "\n";
                                }
                                helloTextView.setText(str);
                            }
                            else {
                                helloTextView.setText(response.body().getMessage());
                            }
                        }

                        @Override
                        public void onFailure(Call<Branch> call, Throwable t) {
                            helloTextView.setText("Bir hata oluştu!... 2");
                        }
                    });

                }
                catch(Exception ex) {
                    helloTextView.setText("Hata oldu!... 2");
                }

            }
        });

        try {
            Call<Token> result = apiInterface.getToken("LoginMethod","hcelik","1");

            result.enqueue(new Callback<Token>() {
                @Override
                public void onResponse(Call<Token> call, Response<Token> response) {
                    if(response.body().isSuccess()){
                        publicToken = response.body();
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
    }
}