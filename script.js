// 時計
function updateClock(){
  const now = new Date();
  document.getElementById("clock").innerText = now.toLocaleTimeString();
}
setInterval(updateClock, 1000);

// Todo
function addTodo(){
  const val = document.getElementById("todoInput").value;
  if(val) {
    const li = document.createElement("li");
    li.innerText = val;
    document.getElementById("todoList").appendChild(li);
    document.getElementById("todoInput").value="";
  }
}
