package ru.yandex.practicum.contacts.presentation.base;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

public class BaseListDiffCallback<T> extends DiffUtil.ItemCallback<T> implements ListDiffInterface<T> {








    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return theSameAs(newItem);
    }

    @SuppressLint("DiffUtilEquals")
    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.equals(newItem);
    }
    
    @Override
    public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        return newItem;
    }

}
