#Upload files

The integration token can't be used to upload files because Slack's 'hook' integration does not support
uploading and the Web API does not support integration tokens. Whilst Web API tokens can be made available
to Slack Apps, acquiring and managing one would require further and potentially disruptive changes to the
Jenkins-CI Slack app.

As a workaround a configuration field 'Upload files User token' has been added
which accepts any authorised Slack user's API token.

Using your own token may be undesirable as it would be available to anyone who can see the Jenkins
job configuration. A workaround for this is to create a Slack bot, to do this:
* Login to Slack
* Go to 'Apps & custom integrations'
* Click 'Build your own' (top right)
* Click 'Make a custom integration'
* Click 'Bots'
* Enter a name such as 'jenkinsuploader' and press the big green button
* Note the bot's API token, starting 'xoxb-'
* Optionally upload an avatar icon and fill the description fields
* Click 'Save integration'

You must add your bot to each channel you want it to upload to - to do this go into each channel,
click 'channel settings' then 'Invite team members to join'

Now go to your Jenkins job configuration
* Scroll down to the 'post build actions' section
* Add 'Slack notifications' if not already there
* Click 'Advanced'
* In 'Upload files pattern' enter the comma-separated paths to the files to be uploaded, relative to the
workspace directory. The usual Ant/Jenkins glob format is accepted e.g. **/*.apk
* In 'Upload Files User token' enter the bot's API token from above


