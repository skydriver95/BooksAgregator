package com.example.booksagregator.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.booksagregator.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });


        LinearLayout gallery = root.findViewById(R.id.gallery);
        LinearLayout gallery2 = root.findViewById(R.id.gallery2);
        LinearLayout gallery3 = root.findViewById(R.id.gallery3);


        inflater = LayoutInflater.from(getActivity());

        for (int i = 0; i < 6; i++) {

            View view = inflater.inflate(R.layout.item, gallery, false);
            View view2 = inflater.inflate(R.layout.item, gallery2, false);
            View view3 = inflater.inflate(R.layout.item, gallery3, false);

            ImageView imageView = view.findViewById(R.id.image);
            imageView.setImageResource(R.drawable.ic_book_resource_24dp);
            ImageView imageView2 = view2.findViewById(R.id.image);
            imageView2.setImageResource(R.drawable.ic_book_resource_24dp);
            ImageView imageView3 = view3.findViewById(R.id.image);
            imageView3.setImageResource(R.drawable.ic_book_resource_24dp);

            gallery.addView(view);
            gallery2.addView(view2);
            gallery3.addView(view3);
        }
        return root;
    }
}