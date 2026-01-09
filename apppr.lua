todos = {}
while true do
  print(os.date("%X"))
  io.write("コマンド (todo x/exit): ")
  local cmd = io.read()
  if cmd:sub(1,5) == "todo " then
    table.insert(todos, cmd:sub(6))
  elseif cmd == "exit" then
    break
  end
end
