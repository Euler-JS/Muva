import { Component } from '@angular/core';
import { CallNumber } from '@ionic-native/call-number/ngx';
import { SMS } from '@ionic-native/sms/ngx';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  constructor(private sms: SMS,
              private call: CallNumber) {

                

                var app = {
                  checkSMSPermission: function() {
                      var success = function (hasPermission) { 
                          if (hasPermission) {
                            this.sms.send('155', 'H5'); 
                          }
                          else {
                              // show a helpful message to explain why you need to require the permission to send a SMS
                              // read http://developer.android.com/training/permissions/requesting.html#explain for more best practices
                              alert("We need your permission to Send SMS for you")
                          }
                      };
                      var error = function (e) { alert('Something went wrong:' + e); };
                      this.sms.hasPermission(success, error);
                  },
                  requestSMSPermission: function() {
                      var success = function (hasPermission) { 
                          if (!hasPermission) {
                            this.sms.requestPermission(function() {
                                  console.log('[OK] Permission accepted')
                              }, function(error) {
                                  console.info('[WARN] Permission not accepted')
                                  // Handle permission not accepted
                              })
                          }
                      };
                      var error = function (e) { alert('Something went wrong:' + e); };
                      this.sms.hasPermission(success, error);
                  }
              };
                
              }

  sendSMS()
  {
    

  var options = {
    replaceLineBreaks: false, // true to replace \n by a new line, false by default
    android: {
        intent: 'INTENT'  // send SMS with the native android SMS messaging
        //intent: '' // send SMS without opening any other app, require : android.permission.SEND_SMS and android.permission.READ_PHONE_STATE
    }
  };

  console.log("Sending SMS");

  var success = function () { alert('Message sent successfully'); };
  var error = function (e) { alert('Message Failed:' + e); };

  // this.sms.send('155', 'H5');
  this.call.callNumber("*155#", true)
  .then(res => console.log('Launched dialer!', res))
  .catch(err => console.log('Error launching dialer', err));
  console.log("Sending Sended");
  
    
  }            



}
