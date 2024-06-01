package me.localx.icons.straight.bold

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

public val Icons.Bold.TimeForward: ImageVector
    get() {
        if (_timeForward != null) {
            return _timeForward!!
        }
        _timeForward = Builder(name = "TimeForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(15.179f, 0.0111f, 18.2244f, 1.2798f, 20.471f, 3.529f)
                    lineTo(23.0f, 1.0f)
                    verticalLineTo(6.909f)
                    curveTo(23.0001f, 7.0523f, 22.972f, 7.1942f, 22.9172f, 7.3267f)
                    curveTo(22.8624f, 7.4591f, 22.7821f, 7.5794f, 22.6808f, 7.6807f)
                    curveTo(22.5794f, 7.7821f, 22.4591f, 7.8624f, 22.3267f, 7.9172f)
                    curveTo(22.1942f, 7.972f, 22.0523f, 8.0001f, 21.909f, 8.0f)
                    horizontalLineTo(16.0f)
                    lineTo(18.353f, 5.647f)
                    curveTo(16.8798f, 4.1809f, 14.9438f, 3.2708f, 12.8748f, 3.0719f)
                    curveTo(10.8059f, 2.873f, 8.732f, 3.3976f, 7.0064f, 4.5562f)
                    curveTo(5.2808f, 5.7148f, 4.0103f, 7.4358f, 3.4113f, 9.4261f)
                    curveTo(2.8122f, 11.4164f, 2.9217f, 13.5528f, 3.7211f, 15.4714f)
                    curveTo(4.5205f, 17.39f, 5.9604f, 18.9721f, 7.7954f, 19.9482f)
                    curveTo(9.6304f, 20.9243f, 11.747f, 21.2341f, 13.7848f, 20.8247f)
                    curveTo(15.8225f, 20.4153f, 17.6553f, 19.3121f, 18.9709f, 17.703f)
                    curveTo(20.2866f, 16.0939f, 21.0036f, 14.0785f, 21.0f, 12.0f)
                    horizontalLineTo(24.0f)
                    curveTo(24.0f, 14.3734f, 23.2962f, 16.6935f, 21.9776f, 18.6668f)
                    curveTo(20.6591f, 20.6402f, 18.7849f, 22.1783f, 16.5922f, 23.0866f)
                    curveTo(14.3995f, 23.9948f, 11.9867f, 24.2324f, 9.6589f, 23.7694f)
                    curveTo(7.3312f, 23.3064f, 5.1929f, 22.1635f, 3.5147f, 20.4853f)
                    curveTo(1.8365f, 18.8071f, 0.6936f, 16.6689f, 0.2306f, 14.3411f)
                    curveTo(-0.2324f, 12.0133f, 0.0052f, 9.6005f, 0.9135f, 7.4078f)
                    curveTo(1.8217f, 5.2151f, 3.3598f, 3.3409f, 5.3332f, 2.0224f)
                    curveTo(7.3066f, 0.7038f, 9.6266f, 0.0f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.9998f, 6.9994f)
                    verticalLineTo(13.6204f)
                    lineTo(13.4388f, 17.0604f)
                    lineTo(15.5608f, 14.9384f)
                    lineTo(12.9998f, 12.3784f)
                    verticalLineTo(6.9994f)
                    horizontalLineTo(9.9998f)
                    close()
                }
            }
        }
        .build()
        return _timeForward!!
    }

private var _timeForward: ImageVector? = null
