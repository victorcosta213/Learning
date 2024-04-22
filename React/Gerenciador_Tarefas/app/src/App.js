import React, { useState, useReducer } from "react";
import Todo from "./components/Todo";
import TodoForms from "./components/TodoForms";
import Search from "./components/Search";
import './App.css';


const todoReducer = (state, action) => {
  switch (action.type) {
    case 'ADD_TODO':
      return [...state, action.payload];
    case 'REMOVE_TODO':
      return state.filter(todo => todo.id !== action.payload);
    case 'COMPLETE_TODO':
      return state.map(todo =>
        todo.id === action.payload ? { ...todo, isCompleted: !todo.isCompleted } : todo
      );
    default:
      return state;
  }
};

function App() {
  const initialTodos = [
    {
      id:1,
      text:"Criar funcionalidades X no Sistema",
      category:"Trabalho",
      isCompleted: false,
      createdAt: new Date()
    },
    {
      id:2,
      text:"Ir para a academia",
      category:"Pessoal",
      isCompleted: false,
      createdAt: new Date()
    },
    {
      id:3,
      text:"Estudar React",
      category:"Estudos",
      isCompleted: false,
      createdAt: new Date()
    }
  ];


  const [todos, dispatch] = useReducer(todoReducer, initialTodos);
  const [search, setSearch] = useState("");

  const addTodo = (text, category) => {
    dispatch({
      type: 'ADD_TODO',
      payload: {
        id: Math.floor(Math.random() * 1000),
        text,
        category,
        isCompleted: false,
        createdAt: new Date()
      }
    });
  };

  const removeTodo = (id) => {
    dispatch({
      type: 'REMOVE_TODO',
      payload: id
    });
  };

  const completeTodo = (id) => {
    dispatch({
      type: 'COMPLETE_TODO',
      payload: id
    });
  };

  return (
    <div className="app">
      <h1>Gerenciador de Tarefas</h1>
      <Search search={search} setSearch={setSearch}/>
      <div className="todo-list">
        {todos.reduce((filteredTodos, todo) => {
          if (todo.text.toLowerCase().includes(search.toLowerCase())) {
            filteredTodos.push(
              <Todo
                key={todo.id}
                todo={todo}
                removeTodo={removeTodo}
                completeTodo={completeTodo}
              
              />
            );
          }
          return filteredTodos;
        }, [])}
      </div>
      <TodoForms addTodo={addTodo}/>
    </div>
  );
}

export default App;

