package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.AlarmClock: ImageVector
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
                    moveTo(5.5229f, 1.745f)
                    lineTo(4.4559f, 0.056f)
                    curveTo(2.7298f, 1.0687f, 1.2212f, 2.4128f, 0.0169f, 4.011f)
                    lineTo(1.6799f, 5.12f)
                    curveTo(2.7275f, 3.7543f, 4.0332f, 2.6075f, 5.5229f, 1.745f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.3202f, 5.12f)
                    lineTo(23.9832f, 4.011f)
                    curveTo(22.7789f, 2.4128f, 21.2702f, 1.0687f, 19.5442f, 0.056f)
                    lineTo(18.4772f, 1.745f)
                    curveTo(19.9668f, 2.6075f, 21.2725f, 3.7543f, 22.3202f, 5.12f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0001f, 2.051f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(2.051f)
                    curveTo(8.9544f, 2.2338f, 7.001f, 2.9869f, 5.362f, 4.2246f)
                    curveTo(3.723f, 5.4623f, 2.4641f, 7.1351f, 1.7284f, 9.0527f)
                    curveTo(0.9927f, 10.9702f, 0.8098f, 13.0558f, 1.2004f, 15.0721f)
                    curveTo(1.5911f, 17.0885f, 2.5396f, 18.9548f, 3.9381f, 20.459f)
                    lineTo(2.0101f, 22.577f)
                    lineTo(3.4901f, 23.923f)
                    lineTo(5.4241f, 21.8f)
                    curveTo(7.3183f, 23.2297f, 9.6269f, 24.0031f, 12.0001f, 24.0031f)
                    curveTo(14.3733f, 24.0031f, 16.6819f, 23.2297f, 18.5761f, 21.8f)
                    lineTo(20.5101f, 23.926f)
                    lineTo(21.9901f, 22.58f)
                    lineTo(20.0621f, 20.462f)
                    curveTo(21.4615f, 18.9579f, 22.4108f, 17.0913f, 22.8019f, 15.0745f)
                    curveTo(23.193f, 13.0577f, 23.0103f, 10.9716f, 22.2746f, 9.0534f)
                    curveTo(21.5388f, 7.1353f, 20.2796f, 5.4621f, 18.64f, 4.2242f)
                    curveTo(17.0004f, 2.9863f, 15.0464f, 2.2334f, 13.0001f, 2.051f)
                    close()
                    moveTo(14.2931f, 15.707f)
                    lineTo(11.0001f, 12.414f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(11.586f)
                    lineTo(15.7071f, 14.293f)
                    lineTo(14.2931f, 15.707f)
                    close()
                }
            }
        }
        .build()
        return _alarmClock!!
    }

private var _alarmClock: ImageVector? = null
