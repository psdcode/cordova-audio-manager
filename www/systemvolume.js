var exec = require('cordova/exec')

module.exports = {
  setSystemVolume: function (volume) {
    exec(null, null, 'SystemVolume', 'setSystemVolume', [volume])
  },
  setVoiceCallVolume: function (volume) {
    exec(null, null, 'SystemVolume', 'setVoiceCallVolume', [volume])
  },
  setRingVolume: function (volume) {
    exec(null, null, 'SystemVolume', 'setRingVolume', [volume])
  },
  setAlarmVolume: function (volume) {
    exec(null, null, 'SystemVolume', 'setAlarmVolume', [volume])
  },
  setMusicVolume: function (volume) {
    exec(null, null, 'SystemVolume', 'setMusicVolume', [volume])
  },
  setAccessibilityVolume: function (volume) {
    exec(null, null, 'SystemVolume', 'setAccessibilityVolume', [volume])
  },
  setRingerMode: function (mode) {
    exec(null, null, 'SystemVolume', 'setRingerMode', [mode])
  },
  getRingerMode: function () {
    return exec(null, null, 'SystemVolume', 'getRingerMode', [])
  },
}
