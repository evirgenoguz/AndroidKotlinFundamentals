package com.evirgenoguz.bootcamprecyclerview

object TodoDb {

    fun getTodos(): ArrayList<TodoModel> {

        val todoList = arrayListOf<TodoModel>()

        todoList.add(TodoModel(1, "Alışverise Git"))
        todoList.add(TodoModel(2, "Selam"))
        todoList.add(TodoModel(3, "Tatlım"))
        todoList.add(TodoModel(4, "Deneme"))
        todoList.add(TodoModel(5, "Deneme 1 2"))
        todoList.add(TodoModel(6, "aliveli"))
        todoList.add(TodoModel(7, "kırkdokuelli"))
        todoList.add(TodoModel(8, "ben seni yendim"))
        todoList.add(TodoModel(9, "ben seni yendim"))
        todoList.add(TodoModel(10, "ben seni yendim"))
        todoList.add(TodoModel(11, "ben seni yendim"))
        todoList.add(TodoModel(12, "ben seni yendim"))
        todoList.add(TodoModel(13, "ben seni yendim"))
        todoList.add(TodoModel(14, "ben seni yendim"))
        todoList.add(TodoModel(15, "ben seni yendim"))

        return todoList
    }


}