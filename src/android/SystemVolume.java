package br.com.fansilva.systemvolume;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import android.util.Log;

public class SystemVolume extends CordovaPlugin {
	
	public SystemVolume(){ }

	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if(action.equals("setSystemVolume")) {
			this.setSystemVolume(args.getDouble(0));
		} else if(action.equals("setVoiceCallVolume")) {
			this.setVoiceCallVolume(args.getDouble(0));
		}  else if(action.equals("setRingVolume")) {
			this.setRingVolume(args.getDouble(0));
		}  else if(action.equals("setAlarmVolume")) {
			this.setAlarmVolume(args.getDouble(0));
		}  else if(action.equals("setMusicVolume")) {
			this.setMusicVolume(args.getDouble(0));
		}  else if(action.equals("setAccessibilityVolume")) {
			this.setAccessibilityVolume(args.getDouble(0));
		}  else {
			return false;
		}
		callbackContext.success();
		return true;
	}

	public void setVoiceCallVolume(double volume) {
		AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);

		Log.d("SystemVolume", "Setting Voice Call Volume");

		am.setStreamVolume(
			AudioManager.STREAM_VOICE_CALL,
			(int) (am.getStreamMaxVolume(AudioManager.STREAM_VOICE_CALL) * volume),
			0);
	}

	public void setRingVolume(double volume) {
		AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);

		Log.d("SystemVolume", "Setting Ring Volume");

		am.setStreamVolume(
			AudioManager.STREAM_RING,
			(int) (am.getStreamMaxVolume(AudioManager.STREAM_RING) * volume),
			0);
	}

	public void setAlarmVolume(double volume) {
		AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);

		Log.d("SystemVolume", "Setting Alarm Volume");

		am.setStreamVolume(
			AudioManager.STREAM_ALARM,
			(int) (am.getStreamMaxVolume(AudioManager.STREAM_ALARM) * volume),
			0);
	}

	public void setMusicVolume(double volume) {
		AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);

		Log.d("SystemVolume", "Setting Music Volume");

		am.setStreamVolume(
			AudioManager.STREAM_MUSIC,
			(int) (am.getStreamMaxVolume(AudioManager.STREAM_MUSIC) * volume),
			0);
	}

	public void setSystemVolume(double volume) {
		AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);

		Log.d("SystemVolume", "Setting System Volume");

		am.setStreamVolume(
			AudioManager.STREAM_SYSTEM,
			(int) (am.getStreamMaxVolume(AudioManager.STREAM_SYSTEM) * volume),
			0);
	}

	public void setAccessibilityVolume(double volume) {
		AudioManager am = (AudioManager) this.cordova.getActivity().getSystemService(Context.AUDIO_SERVICE);

		Log.d("SystemVolume", "Setting System Volume");

		am.setStreamVolume(
			AudioManager.STREAM_ACCESSIBILITY,
			(int) (am.getStreamMaxVolume(AudioManager.STREAM_ACCESSIBILITY) * volume),
			0);
	}

}