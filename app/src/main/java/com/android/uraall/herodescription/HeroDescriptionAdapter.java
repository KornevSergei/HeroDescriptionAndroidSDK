package com.android.uraall.herodescription;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HeroDescriptionAdapter extends RecyclerView.Adapter<HeroDescriptionAdapter.HeroDescriptionViewHolder> {

    //создаём аррейлист из героев
    ArrayList<HeroDescriptionItem> heroDescriptionItems;
    Context context;

    public HeroDescriptionAdapter(ArrayList<HeroDescriptionItem> heroDescriptionItems,
                                  Context context) {
        this.heroDescriptionItems = heroDescriptionItems;
        this.context = context;
    }

    @NonNull
    @Override
    public HeroDescriptionViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hero_description_item,
                viewGroup, false);
        HeroDescriptionViewHolder heroDescriptionViewHolder = new HeroDescriptionViewHolder(view);
        return heroDescriptionViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HeroDescriptionViewHolder viewHolder, int i) {
        HeroDescriptionItem heroDescriptionItem = heroDescriptionItems.get(i);

        //присваиваем героям из Аррейлиста параметры
        viewHolder.heroImageView.setImageResource(heroDescriptionItem.getImageResource());
        viewHolder.title.setText(heroDescriptionItem.getTitle());
        viewHolder.description.setText(heroDescriptionItem.getPosition());
    }

    @Override
    public int getItemCount() {
        return heroDescriptionItems.size();
    }

    class HeroDescriptionViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener {

        //обозначем поля
        public ImageView heroImageView;
        public TextView title;
        public TextView description;

        public HeroDescriptionViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            //связываем поля с разметкой
            heroImageView = itemView.findViewById(R.id.heroImageView);
            title = itemView.findViewById(R.id.titleTextView);
            description = itemView.findViewById(R.id.descriptionTextView);
        }

        //добавляем клик
        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            HeroDescriptionItem heroDescriptionItem = heroDescriptionItems.get(position);

            //добавляём клик по контексту "..." и передаём информацию в Интант
            Intent intent = new Intent(context, DescriptionActivity.class);
            intent.putExtra("imageResource", heroDescriptionItem.getImageResource());
            intent.putExtra("title", heroDescriptionItem.getTitle());
            intent.putExtra("description", heroDescriptionItem.getPosition());
            intent.putExtra("description", heroDescriptionItem.getDescription());
            context.startActivity(intent);
        }
    }


}
