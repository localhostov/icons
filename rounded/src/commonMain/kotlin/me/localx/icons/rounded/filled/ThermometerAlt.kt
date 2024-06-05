package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveToRelative(22.409f, 1.406f)
                curveToRelative(-1.992f, -1.893f, -5.188f, -1.698f, -7.131f, 0.245f)
                lineToRelative(-1.079f, 1.079f)
                lineToRelative(2.614f, 2.614f)
                curveToRelative(0.391f, 0.39f, 0.391f, 1.024f, 0.0f, 1.414f)
                reflectiveCurveToRelative(-1.024f, 0.391f, -1.414f, 0.0f)
                lineToRelative(-2.614f, -2.614f)
                lineToRelative(-2.288f, 2.288f)
                lineToRelative(2.614f, 2.614f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                lineToRelative(-2.614f, -2.614f)
                lineToRelative(-2.227f, 2.227f)
                lineToRelative(2.614f, 2.614f)
                curveToRelative(0.391f, 0.39f, 0.391f, 1.024f, 0.0f, 1.414f)
                reflectiveCurveToRelative(-1.024f, 0.391f, -1.414f, 0.0f)
                lineToRelative(-2.614f, -2.614f)
                lineToRelative(-1.247f, 1.247f)
                curveToRelative(-1.598f, 1.597f, -1.281f, 5.221f, -1.067f, 6.724f)
                lineToRelative(-2.835f, 2.835f)
                curveToRelative(-0.391f, 0.39f, -0.391f, 1.024f, 0.0f, 1.414f)
                horizontalLineTo(0.293f)
                curveToRelative(0.391f, 0.391f, 1.024f, 0.391f, 1.414f, 0.0f)
                lineToRelative(2.836f, -2.835f)
                curveToRelative(0.572f, 0.082f, 1.448f, 0.178f, 2.407f, 0.178f)
                curveToRelative(1.559f, 0.0f, 3.327f, -0.255f, 4.316f, -1.245f)
                curveToRelative(0.0f, 0.0f, 8.435f, -8.435f, 11.085f, -11.085f)
                curveToRelative(0.853f, -0.853f, 1.463f, -1.947f, 1.588f, -3.147f)
                curveToRelative(0.164f, -1.578f, -0.397f, -3.089f, -1.53f, -4.166f)
                close()
            }
        }
        .build()
        return _thermometerAlt!!
    }

private var _thermometerAlt: ImageVector? = null
