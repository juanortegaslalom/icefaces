import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { EmployeeDirectoryComponent } from './components/employee-directory/employee-directory.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, EmployeeDirectoryComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Employee Directory - Angular';
}