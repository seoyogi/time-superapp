import time
todos = []

def show_clock():
    print(time.strftime("%H:%M:%S"))

def add_todo(task):
    todos.append(task)
    print("追加:", task)

while True:
    show_clock()
    cmd = input("コマンド (todo x/exit): ")
    if cmd.startswith("todo "):
        add_todo(cmd[5:])
    elif cmd == "exit":
        break
    time.sleep(1)
