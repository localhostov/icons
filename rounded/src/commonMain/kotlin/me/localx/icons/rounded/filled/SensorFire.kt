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

public val Icons.Filled.SensorFire: ImageVector
    get() {
        if (_sensorFire != null) {
            return _sensorFire!!
        }
        _sensorFire = Builder(name = "SensorFire", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.195f)
                curveToRelative(-0.356f, -0.318f, -0.92f, -0.237f, -1.163f, 0.174f)
                curveToRelative(-1.369f, 2.316f, -1.055f, 5.632f, -2.282f, 5.632f)
                curveToRelative(-0.581f, 0.0f, -0.49f, -1.004f, -0.764f, -1.624f)
                curveToRelative(-0.194f, -0.439f, -0.784f, -0.507f, -1.086f, -0.133f)
                curveToRelative(-1.157f, 1.432f, -2.271f, 3.953f, -1.246f, 6.416f)
                curveToRelative(1.097f, 2.636f, 3.575f, 4.497f, 6.425f, 4.33f)
                curveToRelative(3.41f, -0.199f, 6.115f, -3.028f, 6.115f, -6.489f)
                curveToRelative(0.0f, -3.417f, -3.789f, -6.333f, -6.0f, -8.305f)
                close()
                moveTo(19.402f, 21.123f)
                curveToRelative(-1.003f, 1.17f, -2.802f, 1.17f, -3.805f, 0.0f)
                curveToRelative(-0.867f, -1.011f, -0.699f, -2.557f, 0.243f, -3.499f)
                lineToRelative(1.103f, -1.103f)
                curveToRelative(0.307f, -0.307f, 0.805f, -0.307f, 1.112f, 0.0f)
                lineToRelative(1.103f, 1.103f)
                curveToRelative(0.942f, 0.942f, 1.11f, 2.487f, 0.243f, 3.499f)
                close()
                moveTo(9.613f, 20.428f)
                curveToRelative(-1.324f, -3.181f, -0.075f, -6.446f, 1.536f, -8.441f)
                curveToRelative(0.587f, -0.726f, 1.483f, -1.087f, 2.412f, -0.962f)
                curveToRelative(0.161f, 0.021f, 0.317f, 0.057f, 0.469f, 0.105f)
                curveToRelative(0.229f, -0.898f, 0.548f, -1.869f, 1.085f, -2.778f)
                curveToRelative(0.421f, -0.711f, 1.131f, -1.191f, 1.948f, -1.318f)
                curveToRelative(0.815f, -0.127f, 1.647f, 0.116f, 2.268f, 0.669f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.221f, 0.197f, 0.458f, 0.404f, 0.705f, 0.619f)
                curveToRelative(1.272f, 1.11f, 2.781f, 2.428f, 3.964f, 3.973f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(7.25f)
                curveToRelative(-1.112f, -0.93f, -2.038f, -2.135f, -2.636f, -3.573f)
                close()
                moveTo(4.0f, 5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(8.0f, 5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _sensorFire!!
    }

private var _sensorFire: ImageVector? = null
