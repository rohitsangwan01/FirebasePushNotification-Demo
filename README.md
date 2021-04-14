# FirebasePushNotification-Demo
Its a Easiest Demo of using Firebase Push Notification in Android App

Just Copy Below lines in AndroidManifest
        <meta-data
            android:name="com.google.firebase.messaging.default_notification_channel_id"
            android:value="default" />

        <service
            android:name=".MyFirebaseMessagingService"
            android:exported="false">
            <intent-filter>
                <action android:name="com.google.firebase.MESSAGING_EVENT"/>
            </intent-filter>
        </service>

And Copy MyFirebaseMessagingService Class in Your Project , and Make sure to import Google_services.json file in project and 
firebase-messaging In Gradle

Thats it, just Enter your Server key in MyFirebaseMessagingService class and Use Easily
