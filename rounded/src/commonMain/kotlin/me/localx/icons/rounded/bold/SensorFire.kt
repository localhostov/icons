package me.localx.icons.rounded.bold

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

public val Icons.Bold.SensorFire: ImageVector
    get() {
        if (_sensorFire != null) {
            return _sensorFire!!
        }
        _sensorFire = Builder(name = "SensorFire", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.468f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(5.0f, 6.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(13.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 17.501f)
                curveToRelative(0.0f, 3.46f, -2.704f, 6.289f, -6.115f, 6.489f)
                curveToRelative(-2.85f, 0.167f, -5.328f, -1.694f, -6.425f, -4.33f)
                curveToRelative(-1.025f, -2.463f, 0.088f, -4.985f, 1.246f, -6.416f)
                curveToRelative(0.302f, -0.373f, 0.892f, -0.305f, 1.086f, 0.133f)
                curveToRelative(0.274f, 0.62f, 0.183f, 1.624f, 0.764f, 1.624f)
                curveToRelative(1.227f, 0.0f, 0.913f, -3.316f, 2.282f, -5.632f)
                curveToRelative(0.243f, -0.411f, 0.807f, -0.491f, 1.163f, -0.174f)
                curveToRelative(2.211f, 1.973f, 6.0f, 4.889f, 6.0f, 8.305f)
                close()
                moveTo(19.159f, 17.625f)
                lineToRelative(-1.103f, -1.103f)
                curveToRelative(-0.307f, -0.307f, -0.805f, -0.307f, -1.112f, 0.0f)
                lineToRelative(-1.103f, 1.103f)
                curveToRelative(-0.942f, 0.942f, -1.11f, 2.487f, -0.243f, 3.499f)
                curveToRelative(1.003f, 1.17f, 2.802f, 1.17f, 3.805f, 0.0f)
                curveToRelative(0.867f, -1.011f, 0.699f, -2.557f, -0.243f, -3.499f)
                close()
            }
        }
        .build()
        return _sensorFire!!
    }

private var _sensorFire: ImageVector? = null
