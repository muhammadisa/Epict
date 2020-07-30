

<h1 align="center">Welcome to Epict 👋</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-1.0.1-blue.svg?cacheSeconds=2592000" />
  <a href="#" target="_blank">
    <img alt="License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
  </a>
  <img alt="documentation: yes" src="https://img.shields.io/badge/Documentation-Yes-green.svg" />
  <img alt="maintained: yes" src="https://img.shields.io/badge/Maintained-Yes-green.svg" />
</p>


> Short introduction, this is very simple image picker, that allows you to pick image file from gallery or camera, you can integrate your own Uploader ViewModel using this library for upload process using your File Storage API

## Demo

<img src="internet-checker.gif" width="250">

## Install

For installation just add this code in your app build.gradle file

```groovy
implementation 'com.github.muhammadisa:epict:1.0.1'
```

## Setup

1. add /res/xml/file_paths.xml in app level res directory

   ```xml
   <?xml version="1.0" encoding="utf-8"?>
   <paths xmlns:android="http://schemas.android.com/apk/res/android">
       <external-path name="images" path="/"/>
   </paths>
   ```

2. add this code inside AndroidManifest.xml application tag

   ```xml
   <application ...>
       <provider
            android:name="androidx.core.content.FileProvider"
            android:authorities="com.your.app.package.fileprovider"
            android:exported="false"
            android:grantUriPermissions="true">
            <meta-data
                android:name="android.support.FILE_PROVIDER_PATHS"
                android:resource="@xml/file_paths" />
       </provider>
   </application>
   ```

## Simple Usage

##### EpictData creation

```kotlin
// epict data creation
val data = EpictData(
    "Choose",
    "Take photo profile from?",
    "com.your.app.package.fileprovider",
    ImageShape.CIRCLE
)
```

> ImageShape only have 2 shape CIRCLE & SQUARE



##### EpictViews creation

```kotlin
// epict views creation
val views = EpictViews(
    image_view_result, // this is component from your layout screen for views image result
    button_upload, // this is component from your layout screen for call image picker dialog
    button_retract // this is component from your layout screen for retract or remove picked image
)
```



##### Epict initialization

```kotlin
// define lateinit var inside activity class
private lateinit var epict: Epict

// initialize it inside override function onCreate
epict = Epict.Builder()
    .context(this) // required
    .viewModel(PhotoUploaderViewModel()) // optional you can delete
    .data(data) // required
    .views(views) // required
    .build()
```



##### Full example

```kotlin
class MainActivity : AppCompatActivity() {

    // epict lateinit var
    private lateinit var epict: Epict

    // non-MVVM project
    private lateinit var file: File
    private lateinit var absoluteFile: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = EpictData(
            "Choose",
            "Take photo profile from?",
            "com.xoxoer.example.fileprovider",
            ImageShape.CIRCLE
        )
        val views = EpictViews(
            image_view_result,
            button_upload,
            button_retract
        )
        epict = Epict.Builder()
            .context(this) // required
            // viewModel is only worked with MVVM architecture
            // if your project architecture is not MVVM you can't
            // use viewModel
            .viewModel(PhotoUploaderViewModel()) // optional
            .data(data) // required
            .views(views) // required
            .build()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            CAMERA_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) {
                // usage of pick from camera
                // MVVM project
                epict.upload()

                // non-MVVM project
                file = epict.fileResult.get()!!
                absoluteFile = epict.fileAbsolutePath.get()!!
            }
            GALLERY_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) {
                // usage of pick from gallery
                epict.getRealPathFromURI(data?.data)

                // MVVM project
                epict.upload()

                // non-MVVM project
                file = epict.fileResult.get()!!
                absoluteFile = epict.fileAbsolutePath.get()!!
            }
        }
    }
}
```

## Author

👤 **Muhammad Isa Wijaya Kusuma**

* Github: [@muhammadisa](https://github.com/muhammadisa)

## Show your support

Give a ⭐️ if this project helped you!

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_

