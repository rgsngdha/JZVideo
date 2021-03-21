package org.jzvd.jzvideo

import android.view.SurfaceHolder

abstract class JZMediaInterface(var jzVideoA: JZVideoA?) {

//    var mMediaHandlerThread: HandlerThread? = null
//    var mMediaHandler: Handler? = null
//    var handler: Handler? = null
    
    abstract fun prepare()

    abstract fun start()
    abstract fun pause()
    abstract val isPlaying: Boolean

    abstract fun seekTo(time: Long)
    abstract fun release()
    abstract fun setSurface(surface: SurfaceHolder)

    abstract val currentPosition: Long
    abstract val duration: Long


    abstract fun setVolume(leftVolume: Float, rightVolume: Float)//这种函数应该在demo中自行添加
    abstract fun setSpeed(speed: Float)

//    companion object {
//        var SAVED_SURFACE: SurfaceTexture? = null
//    }
}