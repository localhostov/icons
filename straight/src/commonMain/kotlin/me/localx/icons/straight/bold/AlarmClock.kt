package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.AlarmClock: ImageVector
    get() {
        if (_alarmClock != null) {
            return _alarmClock!!
        }
        _alarmClock = Builder(name = "AlarmClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0001f, 13.0f)
                    curveTo(21.996f, 10.6102f, 21.1367f, 8.3007f, 19.5777f, 6.4894f)
                    curveTo(18.0186f, 4.6781f, 15.8627f, 3.4847f, 13.5001f, 3.125f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(10.5001f)
                    verticalLineTo(3.125f)
                    curveTo(8.7472f, 3.3879f, 7.0959f, 4.1128f, 5.7159f, 5.2252f)
                    curveTo(4.336f, 6.3376f, 3.2771f, 7.7974f, 2.6481f, 9.4546f)
                    curveTo(2.0192f, 11.1117f, 1.8428f, 12.9065f, 2.1372f, 14.6544f)
                    curveTo(2.4316f, 16.4023f, 3.186f, 18.0403f, 4.3231f, 19.4f)
                    lineTo(1.9061f, 21.974f)
                    lineTo(4.0941f, 24.026f)
                    lineTo(6.5711f, 21.386f)
                    curveTo(8.1859f, 22.4392f, 10.0722f, 23.0f, 12.0001f, 23.0f)
                    curveTo(13.928f, 23.0f, 15.8143f, 22.4392f, 17.4291f, 21.386f)
                    lineTo(19.9061f, 24.026f)
                    lineTo(22.0941f, 21.974f)
                    lineTo(19.6771f, 19.4f)
                    curveTo(21.1795f, 17.606f, 22.002f, 15.34f, 22.0001f, 13.0f)
                    close()
                    moveTo(5.0001f, 13.0f)
                    curveTo(5.0001f, 11.6155f, 5.4106f, 10.2622f, 6.1798f, 9.111f)
                    curveTo(6.949f, 7.9599f, 8.0422f, 7.0627f, 9.3213f, 6.5328f)
                    curveTo(10.6004f, 6.003f, 12.0079f, 5.8644f, 13.3657f, 6.1345f)
                    curveTo(14.7236f, 6.4046f, 15.9709f, 7.0713f, 16.9499f, 8.0503f)
                    curveTo(17.9288f, 9.0292f, 18.5955f, 10.2765f, 18.8656f, 11.6344f)
                    curveTo(19.1357f, 12.9922f, 18.9971f, 14.3997f, 18.4673f, 15.6788f)
                    curveTo(17.9374f, 16.9579f, 17.0402f, 18.0511f, 15.8891f, 18.8203f)
                    curveTo(14.738f, 19.5895f, 13.3846f, 20.0f, 12.0001f, 20.0f)
                    curveTo(10.1442f, 19.9979f, 8.365f, 19.2597f, 7.0527f, 17.9474f)
                    curveTo(5.7404f, 16.6351f, 5.0022f, 14.8559f, 5.0001f, 13.0f)
                    close()
                    moveTo(13.5001f, 11.055f)
                    lineTo(15.9081f, 12.516f)
                    lineTo(14.3161f, 15.059f)
                    lineTo(10.5001f, 12.715f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(13.5001f)
                    verticalLineTo(11.055f)
                    close()
                    moveTo(2.5111f, 5.674f)
                    lineTo(0.0171f, 4.011f)
                    curveTo(1.2214f, 2.4128f, 2.7301f, 1.0686f, 4.4561f, 0.056f)
                    lineTo(6.0561f, 2.586f)
                    curveTo(4.6828f, 3.3721f, 3.4781f, 4.4215f, 2.5111f, 5.674f)
                    close()
                    moveTo(17.9461f, 2.586f)
                    lineTo(19.5461f, 0.056f)
                    curveTo(21.2722f, 1.0686f, 22.7808f, 2.4128f, 23.9851f, 4.011f)
                    lineTo(21.4891f, 5.674f)
                    curveTo(20.5227f, 4.4217f, 19.3187f, 3.3723f, 17.9461f, 2.586f)
                    close()
                }
            }
        }
        .build()
        return _alarmClock!!
    }

private var _alarmClock: ImageVector? = null
