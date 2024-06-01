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

public val Icons.Filled.TimeForward: ImageVector
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
                    curveTo(14.9541f, 0.0089f, 17.8017f, 1.1045f, 20.0f, 3.078f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(5.143f)
                    curveTo(21.9995f, 5.6354f, 21.8037f, 6.1074f, 21.4555f, 6.4555f)
                    curveTo(21.1074f, 6.8036f, 20.6353f, 6.9995f, 20.143f, 7.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(19.121f)
                    curveTo(17.4957f, 3.3536f, 15.3492f, 2.3226f, 13.0481f, 2.0832f)
                    curveTo(10.7471f, 1.8439f, 8.4343f, 2.4109f, 6.5049f, 3.6876f)
                    curveTo(4.5756f, 4.9643f, 3.1495f, 6.8713f, 2.4701f, 9.0828f)
                    curveTo(1.7909f, 11.2943f, 1.9006f, 13.6731f, 2.7806f, 15.8126f)
                    curveTo(3.6605f, 17.9522f, 5.2562f, 19.7199f, 7.2948f, 20.8135f)
                    curveTo(9.3335f, 21.9072f, 11.6887f, 22.259f, 13.9579f, 21.8088f)
                    curveTo(16.2272f, 21.3586f, 18.2697f, 20.1344f, 19.7365f, 18.3454f)
                    curveTo(21.2033f, 16.5564f, 22.0034f, 14.3135f, 22.0f, 12.0f)
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
                    moveTo(10.9997f, 6.9994f)
                    verticalLineTo(12.4134f)
                    lineTo(14.2927f, 15.7064f)
                    lineTo(15.7067f, 14.2924f)
                    lineTo(12.9997f, 11.5854f)
                    verticalLineTo(6.9994f)
                    horizontalLineTo(10.9997f)
                    close()
                }
            }
        }
        .build()
        return _timeForward!!
    }

private var _timeForward: ImageVector? = null
