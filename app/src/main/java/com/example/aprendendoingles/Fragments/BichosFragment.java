package com.example.aprendendoingles.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.aprendendoingles.R;


public class BichosFragment extends Fragment implements View.OnClickListener {

    private ImageView imageVaca,imageOvelha,imageMacaco,imageLeao,imageGato,imageCachorro,
            imageSarinha, imageMandinha;

    private MediaPlayer mediaPlayer;

    public BichosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        imageVaca = view.findViewById(R.id.imageVaca);
        imageOvelha = view.findViewById(R.id.imageOvelha);
        imageMacaco = view.findViewById(R.id.imageMacaco);
        imageLeao = view.findViewById(R.id.imageLeao);
        imageGato = view.findViewById(R.id.imageGato);
        imageCachorro = view.findViewById(R.id.imageCachorro);
        imageSarinha = view.findViewById(R.id.imageSarinha);
        imageMandinha = view.findViewById(R.id.imageMandinha);

        imageVaca.setOnClickListener(this);
        imageOvelha.setOnClickListener(this);
        imageMacaco.setOnClickListener(this);
        imageLeao.setOnClickListener(this);
        imageGato.setOnClickListener(this);
        imageCachorro.setOnClickListener(this);
        imageSarinha.setOnClickListener(this);
        imageMandinha.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.imageVaca :
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cow);
                tocarSom();
                break;
            case R.id.imageOvelha:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sheep);
                tocarSom();
                break;
            case R.id.imageMacaco:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.monkey);
                tocarSom();
                break;
            case R.id.imageLeao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lion);
                tocarSom();
                break;
            case R.id.imageGato:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cat);
                tocarSom();
                break;
            case R.id.imageCachorro:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
                tocarSom();
                break;
            case R.id.imageSarinha:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sarinha);
                tocarSom();
                break;
            case R.id.imageMandinha:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.mandinha);
                tocarSom();
                break;
        }

        Log.i("Elemento Clicado", "Item: " + view.getId() );
    }

    public void tocarSom(){
        if ( mediaPlayer != null ){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();
                }
            });
        }
    }
}