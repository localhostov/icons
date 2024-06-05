package me.localx.icons.straight.outline

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
                moveToRelative(10.0f, 5.857f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.731f)
                lineToRelative(-4.372f, 2.429f)
                lineToRelative(-0.971f, -1.748f)
                lineToRelative(3.343f, -1.857f)
                verticalLineToRelative(-4.555f)
                close()
                moveTo(2.0f, 11.0f)
                curveTo(2.0f, 6.038f, 6.037f, 2.0f, 11.0f, 2.0f)
                curveToRelative(4.109f, 0.0f, 7.694f, 2.775f, 8.716f, 6.749f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.001f)
                curveToRelative(0.106f, 0.409f, 0.175f, 0.828f, 0.221f, 1.25f)
                horizontalLineToRelative(2.0f)
                curveToRelative(-0.054f, -0.591f, -0.137f, -1.178f, -0.284f, -1.75f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.002f)
                curveTo(20.402f, 3.392f, 16.022f, 0.0f, 11.0f, 0.0f)
                curveTo(4.935f, 0.0f, 0.0f, 4.935f, 0.0f, 11.0f)
                curveToRelative(0.0f, 4.762f, 3.037f, 8.961f, 7.557f, 10.45f)
                curveToRelative(0.792f, 0.261f, 1.611f, 0.426f, 2.443f, 0.501f)
                verticalLineToRelative(-2.03f)
                curveToRelative(-0.618f, -0.068f, -1.229f, -0.177f, -1.818f, -0.371f)
                curveToRelative(-3.697f, -1.218f, -6.182f, -4.654f, -6.182f, -8.55f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(22.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _timeWatchCalendar!!
    }

private var _timeWatchCalendar: ImageVector? = null
