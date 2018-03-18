package com.example.asus.primadi_1202154151_modul4;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class CariGambar extends AppCompatActivity {
    private EditText mInputLink;
    private Button tombolCari;
    private ImageView mTampilGambar;
    private ProgressDialog dialogprogress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_gambar);
        mInputLink = findViewById(R.id.inputLink);
        tombolCari = findViewById(R.id.buttonCari);
        mTampilGambar = findViewById(R.id.tampilGambar);
    }

    public void tombolCari(View view) { loadImageInit();}

    private void loadImageInit(){
            String ImgUrl = mInputLink.getText().toString();
            //mencari gambar di internet
            new loadImage().execute(ImgUrl);
    }

    private class loadImage extends AsyncTask<String, Void, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Membuat Progress Dialog
            dialogprogress = new ProgressDialog(CariGambar.this);
            dialogprogress.setMessage("Please Wait");
            dialogprogress.show();
        }

        @Override
        protected String doInBackground(String... params) {
            return params[0];
        }

        @Override
        protected void onPostExecute(String ImgUrl) {
            super.onPostExecute(ImgUrl);
            //memakai library picasso untuk mengambil gambar dari internet
            Picasso.get().load(ImgUrl).into(mTampilGambar);

            // menghilangkan Progress Dialog
            dialogprogress.dismiss();
        }
    }
    }
