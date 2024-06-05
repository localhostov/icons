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

public val Icons.Bold.GolfHole: ImageVector
    get() {
        if (_golfHole != null) {
            return _golfHole!!
        }
        _golfHole = Builder(name = "GolfHole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 16.5f)
                lineTo(10.5f, 2.005f)
                curveTo(10.5f, 0.001f, 12.252f, -0.26f, 13.125f, 0.177f)
                lineToRelative(6.161f, 4.153f)
                curveToRelative(1.045f, 0.773f, 0.921f, 2.372f, -0.23f, 2.974f)
                lineToRelative(-5.556f, 2.725f)
                verticalLineToRelative(6.471f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(17.961f, 10.887f)
                curveToRelative(-0.79f, -0.257f, -1.634f, 0.179f, -1.889f, 0.966f)
                curveToRelative(-0.254f, 0.789f, 0.179f, 1.634f, 0.967f, 1.889f)
                curveToRelative(2.406f, 0.776f, 3.961f, 2.055f, 3.961f, 3.258f)
                curveToRelative(0.0f, 1.888f, -3.849f, 4.0f, -9.0f, 4.0f)
                reflectiveCurveToRelative(-9.0f, -2.112f, -9.0f, -4.0f)
                curveToRelative(0.0f, -1.203f, 1.555f, -2.482f, 3.961f, -3.258f)
                curveToRelative(0.788f, -0.255f, 1.221f, -1.1f, 0.967f, -1.889f)
                curveToRelative(-0.255f, -0.788f, -1.098f, -1.224f, -1.889f, -0.966f)
                curveToRelative(-3.781f, 1.22f, -6.039f, 3.506f, -6.039f, 6.113f)
                curveToRelative(0.0f, 3.991f, 5.159f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(12.0f, -3.009f, 12.0f, -7.0f)
                curveToRelative(0.0f, -2.607f, -2.258f, -4.893f, -6.039f, -6.113f)
                close()
            }
        }
        .build()
        return _golfHole!!
    }

private var _golfHole: ImageVector? = null
