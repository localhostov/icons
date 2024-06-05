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

public val Icons.Filled.SensorSmoke: ImageVector
    get() {
        if (_sensorSmoke != null) {
            return _sensorSmoke!!
        }
        _sensorSmoke = Builder(name = "SensorSmoke", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.297f, 16.785f)
                curveToRelative(1.818f, 0.491f, 3.075f, 2.347f, 2.603f, 4.4f)
                curveToRelative(-0.303f, 1.322f, -1.379f, 2.392f, -2.701f, 2.694f)
                curveToRelative(-0.267f, 0.061f, -0.531f, 0.093f, -0.788f, 0.098f)
                curveToRelative(-1.467f, 0.028f, -7.92f, 0.035f, -9.189f, 0.0f)
                curveToRelative(-0.181f, -0.005f, -0.367f, -0.031f, -0.556f, -0.081f)
                curveToRelative(-0.762f, -0.2f, -1.384f, -0.823f, -1.584f, -1.584f)
                curveToRelative(-0.315f, -1.196f, 0.314f, -2.293f, 1.302f, -2.717f)
                curveToRelative(0.424f, -0.182f, 0.68f, -0.625f, 0.583f, -1.076f)
                curveToRelative(-0.138f, -0.641f, -0.141f, -1.331f, 0.034f, -2.047f)
                curveToRelative(0.432f, -1.773f, 1.91f, -3.158f, 3.716f, -3.421f)
                curveToRelative(2.193f, -0.32f, 4.144f, 0.919f, 4.913f, 2.773f)
                curveToRelative(0.349f, 0.836f, 1.364f, 0.88f, 1.669f, 0.962f)
                close()
                moveTo(7.671f, 24.0f)
                horizontalLineToRelative(-2.671f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(11.005f)
                curveToRelative(-0.616f, -0.523f, -1.35f, -0.926f, -2.183f, -1.15f)
                curveToRelative(0.0f, 0.0f, -0.43f, -0.09f, -0.476f, -0.1f)
                curveToRelative(-1.233f, -2.599f, -4.03f, -4.105f, -6.915f, -3.684f)
                curveToRelative(-2.586f, 0.377f, -4.744f, 2.358f, -5.37f, 4.926f)
                curveToRelative(-0.173f, 0.713f, -0.229f, 1.431f, -0.167f, 2.141f)
                curveToRelative(-1.5f, 1.004f, -2.222f, 2.858f, -1.743f, 4.683f)
                curveToRelative(0.112f, 0.425f, 0.294f, 0.819f, 0.523f, 1.18f)
                close()
                moveTo(5.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(7.0f, 4.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _sensorSmoke!!
    }

private var _sensorSmoke: ImageVector? = null
