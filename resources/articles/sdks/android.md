--------------------------------------------------------------------------------
:title Android SDK
:frontpage
:category
:aside

## Native mobile development

- [Overview](/mobile/overview/)
- [Getting started](/mobile/mobile-development/)
- [Self Service](/mobile/selfservice/)
- [Register](/mobile/register/)
- [Login](/mobile/login/)
- Android
- [iOS](/sdks/ios/)
- [Best practices](/mobile/best-practices/)

:body

The Android SDK simplifies connecting to SPiD and comes in two variants. The core part of the SDK contains the login engine and APIs needed to connect to SPiD. You can use this to do your custom UI implementation. While the networking APIs are exposed, you use these at your own peril as no support will be given to this.

The recommended way to use these SDKs is to implement the UI module. This is highly customizable and will give you complete UIs out of the box. To learn more about the SDKs, please refer to these links:

- [Core SDK](https://github.schibsted.io/spt-identity/identity-sdk-android/blob/master/core/README.md)
- [UI SDK](https://github.schibsted.io/spt-identity/identity-sdk-android/blob/master/ui/README.md)

For support, please contact [support@spid.no](mailto:support@spid.no)


## Getting started
To get started with either SDK, you'll need to request access to SPiD before you can start using them. This process is documented on the [SPiD Techdocs](https://techdocs.spid.no/selfservice/access/) site. Once you have access and have created your client so that you have access to your client ID and secret, you should head over to read up on the documentation.



The Android SDK is built on top of the backend SDK to provide access to functions with minimal effort from 
the developer. Connecting to the SPiD can be done either natively, using a WebView, browser or connecting via
Facebook or Google+.
