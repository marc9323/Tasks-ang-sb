import { Component, OnInit } from '@angular/core';
import {Task} from "./task.model";

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {
    tasks: Task[] = [];

  constructor() { }

  ngOnInit() {
      this.tasks.push(new Task(1, "Task 1", true, "07/27/73"));
      this.tasks.push(new Task(1, "Task 2", false, "07/27/73"));
      this.tasks.push(new Task(1, "Task 3", true, "07/27/73"));
  }

  getDueDateLabel(task: Task){
      return task.completed ? '' : 'alert alert-danger'
  }

  onTaskChange(event, task) {
      //this.taskService.saveTask(task, event.target.checked).subscribe();
      console.log("task has changed");
  }

}
