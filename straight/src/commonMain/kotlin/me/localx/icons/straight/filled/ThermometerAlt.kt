package me.localx.icons.straight.filled

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

public val Icons.Filled.ThermometerAlt: ImageVector
    get() {
        if (_thermometerAlt != null) {
            return _thermometerAlt!!
        }
        _thermometerAlt = Builder(name = "ThermometerAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.536f, 1.465f)
                curveToRelative(-1.949f, -1.949f, -5.122f, -1.949f, -7.071f, 0.0f)
                lineToRelative(-1.232f, 1.232f)
                lineToRelative(3.036f, 3.035f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.036f, -3.035f)
                lineToRelative(-2.288f, 2.288f)
                lineToRelative(3.035f, 3.036f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.035f, -3.036f)
                lineToRelative(-2.227f, 2.227f)
                lineToRelative(3.035f, 3.035f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.035f, -3.035f)
                lineToRelative(-1.247f, 1.247f)
                curveToRelative(-1.598f, 1.597f, -1.281f, 5.221f, -1.067f, 6.724f)
                lineTo(0.033f, 22.553f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.129f, -3.128f)
                curveToRelative(0.572f, 0.082f, 1.448f, 0.178f, 2.407f, 0.178f)
                curveToRelative(1.559f, 0.0f, 3.327f, -0.255f, 4.316f, -1.245f)
                lineToRelative(11.236f, -11.236f)
                curveToRelative(0.944f, -0.944f, 1.464f, -2.199f, 1.464f, -3.535f)
                reflectiveCurveToRelative(-0.52f, -2.591f, -1.464f, -3.535f)
                close()
            }
        }
        .build()
        return _thermometerAlt!!
    }

private var _thermometerAlt: ImageVector? = null
