package money;

import app.FFDateTime;
import users.User;

class Invoice {
    String invoiceNumber;
    FFDateTime issueDate;
    User buyer;
    Money total;
    String itemDescription;
}
