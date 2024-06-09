import { Component, EventEmitter, Input, Output } from '@angular/core';
import { PaginationModel } from '../../core/models/pagination';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-danpagination',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './danpagination.component.html',
  styleUrl: './danpagination.component.css'
})
export class DanpaginationComponent {
  @Input({required:true}) data!:PaginationModel
  @Output() onGetNumberPage:EventEmitter<number> = new EventEmitter<number>()

    danPaginate(page: number) {
       this.onGetNumberPage.emit(page)
    }
}
