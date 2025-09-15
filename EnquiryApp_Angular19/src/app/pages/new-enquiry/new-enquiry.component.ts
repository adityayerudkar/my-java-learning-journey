import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-new-enquiry',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './new-enquiry.component.html',
  styleUrl: './new-enquiry.component.css'
})
export class NewEnquiryComponent {

  newEnquiryObj: any =
  {
    enquiryId: 0,
    enquiryTypeId: 0,
    EnquiryStatusId: 0,
    customerName: '',
    mobileNo: '',
    email: '',
    message: '',
    createDate: new Date(),
    resolution:''


  }

 

}
