package com.example.furniture.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.example.furniture.R;
import com.example.furniture.databinding.FragmentHomeBinding;
import com.example.furniture.models.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    List<CategoryModel> list_category = new ArrayList<>();
    CategoryAdapter adapter;
    LottieAnimationView  lotty_sale, lotty_werbung;
    NavController navController;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        lotty_werbung = binding.lottyWerbung;
        lotty_werbung.setAnimation(R.raw.fur);
        lotty_werbung.setRepeatCount(LottieDrawable.INFINITE);

        lotty_sale = binding.lottySale;
        lotty_sale.setAnimation(R.raw.sale);
        lotty_sale.setRepeatCount(LottieDrawable.INFINITE);


        createList();
        adapter = new CategoryAdapter();
        adapter.setMain_list(list_category);
        binding.rvCatalogCategory.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_category.add(new CategoryModel("Для спальни", R.drawable.bed_parlament));
        list_category.add(new CategoryModel("Для гостиной", R.drawable.sofa_yellow));
        list_category.add(new CategoryModel("Кухонная мебель", R.drawable.kuh_furn));
        list_category.add(new CategoryModel("Юношеские гарнитуры", R.drawable.detskii_garnitur58));
        list_category.add(new CategoryModel("Садовая мебель", R.drawable.garden_furn));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.saleCardView.setOnClickListener(v-> {
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_home_to_fragmentSale);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}