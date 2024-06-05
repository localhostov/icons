package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.ThermometerAlt: ImageVector
    get() {
        if (_thermometerAlt != null) {
            return _thermometerAlt!!
        }
        _thermometerAlt = Builder(name = "ThermometerAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.389f, 1.611f)
                curveToRelative(-2.145f, -2.145f, -5.634f, -2.144f, -7.778f, 0.0f)
                lineTo(4.332f, 11.891f)
                curveToRelative(-1.666f, 1.666f, -1.458f, 5.202f, -1.242f, 6.899f)
                lineTo(0.012f, 21.867f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(3.077f, -3.077f)
                curveToRelative(0.57f, 0.072f, 1.348f, 0.144f, 2.193f, 0.144f)
                curveToRelative(1.669f, 0.0f, 3.6f, -0.279f, 4.707f, -1.386f)
                lineToRelative(10.28f, -10.28f)
                curveToRelative(1.039f, -1.038f, 1.611f, -2.419f, 1.611f, -3.889f)
                reflectiveCurveToRelative(-0.572f, -2.851f, -1.611f, -3.889f)
                close()
                moveTo(20.268f, 7.267f)
                lineToRelative(-10.28f, 10.28f)
                curveToRelative(-0.485f, 0.484f, -2.284f, 0.594f, -3.971f, 0.435f)
                curveToRelative(-0.162f, -1.687f, -0.05f, -3.485f, 0.435f, -3.971f)
                lineToRelative(0.437f, -0.437f)
                lineToRelative(1.909f, 1.909f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.909f, -1.909f)
                lineToRelative(1.52f, -1.52f)
                lineToRelative(1.909f, 1.909f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.909f, -1.909f)
                lineToRelative(1.581f, -1.581f)
                lineToRelative(1.909f, 1.909f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.909f, -1.909f)
                lineToRelative(0.378f, -0.378f)
                curveToRelative(0.975f, -0.975f, 2.562f, -0.975f, 3.536f, 0.0f)
                curveToRelative(0.472f, 0.472f, 0.732f, 1.1f, 0.732f, 1.768f)
                reflectiveCurveToRelative(-0.26f, 1.295f, -0.732f, 1.768f)
                close()
            }
        }
        .build()
        return _thermometerAlt!!
    }

private var _thermometerAlt: ImageVector? = null
