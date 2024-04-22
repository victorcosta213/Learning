import React, { useState } from "react";

function TodoForms({ addTodo }) {
  const [text, setText] = useState("");
  const [category, setCategory] = useState("");
  const [date, setDate] = useState(""); 

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!text || !category || !date) return;
    addTodo(text, category, date); 
    setText("");
    setCategory("");
    setDate("");
  };

  return (
    <div className="todo-form">
      <h2>Criar Tarefa:</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Digite o título"
          value={text}
          onChange={(e) => setText(e.target.value)}
        />
        <select
          value={category}
          onChange={(e) => setCategory(e.target.value)}
        >
          <option value="">Selecione uma categoria</option>
          <option value="Trabalho">Trabalho</option>
          <option value="Pessoal">Pessoal</option>
          <option value="Estudos">Estudos</option>
        </select>
        <input
          type="date"
          value={date}
          onChange={(e) => setDate(e.target.value)}
        />
        <button type="submit">Criar</button>
      </form>
    </div>
  );
}

export default TodoForms;
