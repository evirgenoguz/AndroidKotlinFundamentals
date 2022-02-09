package com.evirgenoguz.bootcamprecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.evirgenoguz.bootcamprecyclerview.databinding.TodoItemDesignBinding

class TodoAdapter(): ListAdapter<TodoModel, TodoAdapter.TodoViewHolder>(TodoDiffUtilCallBack()) {

    var onTodoClick: (TodoModel) -> Unit = {}

    private val todoList = arrayListOf<TodoModel>()



    inner class TodoViewHolder(private val todoItemDesignBinding: TodoItemDesignBinding): RecyclerView.ViewHolder(todoItemDesignBinding.root) {
        fun bind(todo: TodoModel){
            todoItemDesignBinding.todoItem = todo
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoAdapter.TodoViewHolder {
        val todoItemDesignBinding = TodoItemDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoViewHolder(todoItemDesignBinding)
    }

    override fun onBindViewHolder(holder: TodoAdapter.TodoViewHolder, position: Int) {
        val todo = getItem(position)
        holder.bind(todo)

    }





}