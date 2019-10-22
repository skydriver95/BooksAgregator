package com.example.booksagregator.ui.userpanel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.booksagregator.R;

public class UserPanelFragment extends Fragment {

    private UserPanelViewModel userPanelViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        userPanelViewModel =
                ViewModelProviders.of(this).get(UserPanelViewModel.class);
        View root = inflater.inflate(R.layout.fragment_user_panel, container, false);

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
//        final TextView textView = root.findViewById(R.id.text_gallery);
//        userPanelViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}