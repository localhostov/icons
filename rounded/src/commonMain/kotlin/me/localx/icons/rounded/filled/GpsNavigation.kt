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

public val Icons.Filled.GpsNavigation: ImageVector
    get() {
        if (_gpsNavigation != null) {
            return _gpsNavigation!!
        }
        _gpsNavigation = Builder(name = "GpsNavigation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.551f)
                curveToRelative(-0.474f, 4.992f, -4.457f, 8.975f, -9.449f, 9.449f)
                verticalLineToRelative(0.551f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-0.551f)
                curveToRelative(-4.992f, -0.474f, -8.975f, -4.457f, -9.449f, -9.449f)
                horizontalLineToRelative(-0.551f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.556f)
                curveToRelative(0.264f, -2.786f, 1.615f, -5.349f, 3.813f, -7.141f)
                curveToRelative(0.428f, -0.348f, 1.058f, -0.286f, 1.407f, 0.143f)
                curveToRelative(0.349f, 0.428f, 0.285f, 1.058f, -0.143f, 1.407f)
                curveToRelative(-1.729f, 1.41f, -2.815f, 3.409f, -3.071f, 5.591f)
                horizontalLineToRelative(1.439f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.436f)
                curveToRelative(0.458f, 3.888f, 3.548f, 6.977f, 7.436f, 7.436f)
                verticalLineToRelative(-1.436f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.436f)
                curveToRelative(3.888f, -0.458f, 6.977f, -3.548f, 7.436f, -7.436f)
                horizontalLineToRelative(-1.436f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.439f)
                curveToRelative(-0.256f, -2.182f, -1.342f, -4.18f, -3.071f, -5.591f)
                curveToRelative(-0.428f, -0.349f, -0.492f, -0.979f, -0.143f, -1.407f)
                curveToRelative(0.349f, -0.429f, 0.98f, -0.491f, 1.407f, -0.143f)
                curveToRelative(2.198f, 1.792f, 3.549f, 4.354f, 3.813f, 7.141f)
                horizontalLineToRelative(0.556f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(16.795f, 7.725f)
                lineTo(13.456f, 0.876f)
                curveToRelative(-0.326f, -0.583f, -0.891f, -0.874f, -1.456f, -0.876f)
                curveToRelative(-0.565f, 0.002f, -1.13f, 0.293f, -1.456f, 0.876f)
                lineToRelative(-3.339f, 6.849f)
                curveToRelative(-0.706f, 1.256f, 0.535f, 2.725f, 1.812f, 2.145f)
                lineToRelative(2.983f, -1.355f)
                lineToRelative(2.983f, 1.355f)
                curveToRelative(1.277f, 0.58f, 2.518f, -0.889f, 1.812f, -2.145f)
                close()
            }
        }
        .build()
        return _gpsNavigation!!
    }

private var _gpsNavigation: ImageVector? = null
