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

public val Icons.Bold.SensorSmoke: ImageVector
    get() {
        if (_sensorSmoke != null) {
            return _sensorSmoke!!
        }
        _sensorSmoke = Builder(name = "SensorSmoke", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.953f, 22.748f)
                curveToRelative(-0.174f, 0.677f, -0.784f, 1.126f, -1.452f, 1.126f)
                curveToRelative(-0.124f, 0.0f, -0.25f, -0.015f, -0.375f, -0.048f)
                curveToRelative(-2.429f, -0.625f, -4.126f, -2.815f, -4.126f, -5.326f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.467f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.142f, 0.771f, 2.138f, 1.874f, 2.422f)
                curveToRelative(0.802f, 0.206f, 1.285f, 1.024f, 1.079f, 1.826f)
                close()
                moveTo(6.5f, 5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(10.0f, 6.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(23.401f, 17.889f)
                curveToRelative(-0.724f, -1.14f, -1.849f, -1.751f, -3.015f, -1.859f)
                curveToRelative(-0.553f, -0.051f, -1.007f, -0.402f, -1.198f, -0.923f)
                curveToRelative(-0.778f, -2.118f, -3.008f, -3.529f, -5.496f, -2.993f)
                curveToRelative(-1.491f, 0.321f, -2.749f, 1.407f, -3.324f, 2.82f)
                curveToRelative(-0.414f, 1.017f, -0.453f, 1.979f, -0.248f, 2.849f)
                curveToRelative(0.136f, 0.575f, -0.093f, 1.197f, -0.634f, 1.434f)
                curveToRelative(-0.493f, 0.216f, -0.931f, 0.599f, -1.226f, 1.159f)
                curveToRelative(-0.381f, 0.723f, -0.362f, 1.626f, 0.045f, 2.334f)
                curveToRelative(0.495f, 0.86f, 1.344f, 1.29f, 2.193f, 1.29f)
                curveToRelative(0.64f, 0.0f, 8.477f, 0.0f, 9.5f, 0.0f)
                curveToRelative(1.307f, 0.0f, 2.615f, -0.637f, 3.417f, -1.911f)
                curveToRelative(0.796f, -1.265f, 0.786f, -2.939f, -0.016f, -4.2f)
                close()
            }
        }
        .build()
        return _sensorSmoke!!
    }

private var _sensorSmoke: ImageVector? = null
