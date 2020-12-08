# Wild-Animal-Intrusion-Detection-and-Alerting-System
I have created an android application, which uses AutoML deep learning for detecting the type of wildlife. Then, an alert system is also built into the app such that in case of a wild animal, the time of detection is updated on Fireabase Realtime database, which alerts every smartphone which has the android application.
<br>
### Technical Stack Used <br>
1.) Firebase Realtime Database <br>
2.) AutoML <br>
3.) Android Studio <br>

### Procedure

1.) This app is supposed to act as a surveillance device. Here, user clicks an image. <br>
2.) Firebase Cloud Vision processes the input image. It classifies it into 3 categories : Wild, Domestic and Human. <br>
3.) If a wild animal is detected, a data object containing the date and time of detection in added to the cloud database in realtime. <br>
4.) When a data is added to the database, a push notification with text "ALERT ! INTRUSION DETECTED" is triggered on all devices having this android application. 
