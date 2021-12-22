// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import { Big } from "big.js";
import { NativeModules } from "react-native";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * Cancels all pending scheduled notifications.
 * @returns {Promise.<void>}
 */
export async function CancelAllScheduledNotifications() {
	// BEGIN USER CODE
    // Documentation https://rnfirebase.io/docs/v5.x.x/notifications/reference/Notifications#cancelAllNotifications
    if (NativeModules && !NativeModules.RNFirebase) {
        return Promise.reject(new Error("Firebase module is not available in your app"));
    }
    // eslint-disable-next-line @typescript-eslint/no-var-requires
    const firebase = require("react-native-firebase");
    firebase.notifications().cancelAllNotifications();
    return Promise.resolve();
	// END USER CODE
}
