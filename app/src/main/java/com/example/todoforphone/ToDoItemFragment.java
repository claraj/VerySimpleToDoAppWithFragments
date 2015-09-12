package com.example.todoforphone;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by admin on 9/10/15.
 */
public class ToDoItemFragment extends Fragment {

	TextView toDoDetail;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_to_do_item_details, group, false);

		toDoDetail = (TextView) view.findViewById(R.id.to_do_detail_text);
		String itemText = getArguments().getString(ToDoManagerActivity.TODO_DETAIL);
		toDoDetail.setText(itemText);

		return view;
	}
}
