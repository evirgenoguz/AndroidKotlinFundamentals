package com.evirgenoguz.bootcamprecyclerview

import androidx.recyclerview.widget.DiffUtil

class TodoDiffUtilCallBack: DiffUtil.ItemCallback<TodoModel>() {


    override fun areItemsTheSame(oldItem: TodoModel, newItem: TodoModel): Boolean {
        return oldItem.todoId == newItem.todoId
    }

    override fun areContentsTheSame(oldItem: TodoModel, newItem: TodoModel): Boolean {
        return oldItem == newItem
    }


}