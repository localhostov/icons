package me.localx.icons.rounded.outline

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

public val Icons.Outline.TimeWatchCalendar: ImageVector
    get() {
        if (_timeWatchCalendar != null) {
            return _timeWatchCalendar!!
        }
        _timeWatchCalendar = Builder(name = "TimeWatchCalendar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 11.0f)
                curveToRelative(0.0f, 0.359f, -0.192f, 0.69f, -0.504f, 0.868f)
                lineToRelative(-3.5f, 2.0f)
                curveToRelative(-0.156f, 0.089f, -0.327f, 0.132f, -0.495f, 0.132f)
                curveToRelative(-0.348f, 0.0f, -0.685f, -0.181f, -0.869f, -0.504f)
                curveToRelative(-0.274f, -0.479f, -0.107f, -1.09f, 0.372f, -1.364f)
                lineToRelative(2.996f, -1.712f)
                verticalLineToRelative(-4.42f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(24.0f, 17.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.302f, 0.839f, -2.402f, 2.0f, -2.816f)
                verticalLineToRelative(-1.184f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.184f)
                curveToRelative(1.161f, 0.414f, 2.0f, 1.514f, 2.0f, 2.816f)
                close()
                moveTo(22.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                close()
                moveTo(9.199f, 19.82f)
                curveToRelative(-4.172f, -0.847f, -7.199f, -4.556f, -7.199f, -8.82f)
                curveTo(2.0f, 6.038f, 6.037f, 2.0f, 11.0f, 2.0f)
                curveToRelative(4.264f, 0.0f, 7.973f, 3.028f, 8.819f, 7.199f)
                curveToRelative(0.11f, 0.541f, 0.636f, 0.893f, 1.18f, 0.781f)
                curveToRelative(0.541f, -0.11f, 0.891f, -0.638f, 0.781f, -1.179f)
                curveTo(20.744f, 3.701f, 16.211f, 0.0f, 11.0f, 0.0f)
                curveTo(4.935f, 0.0f, 0.0f, 4.935f, 0.0f, 11.0f)
                curveToRelative(0.0f, 5.211f, 3.701f, 9.745f, 8.801f, 10.78f)
                curveToRelative(0.067f, 0.014f, 0.135f, 0.02f, 0.2f, 0.02f)
                curveToRelative(0.466f, 0.0f, 0.883f, -0.327f, 0.979f, -0.801f)
                curveToRelative(0.109f, -0.541f, -0.24f, -1.069f, -0.781f, -1.179f)
                close()
            }
        }
        .build()
        return _timeWatchCalendar!!
    }

private var _timeWatchCalendar: ImageVector? = null
