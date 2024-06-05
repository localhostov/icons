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

public val Icons.Filled.TimeWatchCalendar: ImageVector
    get() {
        if (_timeWatchCalendar != null) {
            return _timeWatchCalendar!!
        }
        _timeWatchCalendar = Builder(name = "TimeWatchCalendar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.412f)
                lineToRelative(-4.009f, 2.11f)
                lineToRelative(0.971f, 1.748f)
                lineToRelative(5.038f, -2.681f)
                verticalLineToRelative(0.948f)
                curveToRelative(-1.194f, 0.693f, -2.0f, 1.986f, -2.0f, 3.463f)
                verticalLineToRelative(5.951f)
                curveToRelative(-0.832f, -0.075f, -1.651f, -0.24f, -2.443f, -0.501f)
                curveTo(3.037f, 19.961f, 0.0f, 15.762f, 0.0f, 11.0f)
                curveTo(0.0f, 4.935f, 4.935f, 0.0f, 11.0f, 0.0f)
                curveToRelative(5.022f, 0.0f, 9.402f, 3.392f, 10.653f, 8.248f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.002f)
                curveToRelative(0.147f, 0.572f, 0.23f, 1.159f, 0.284f, 1.75f)
                horizontalLineToRelative(-9.937f)
                close()
                moveTo(24.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(12.0f, 19.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-12.0f)
                close()
            }
        }
        .build()
        return _timeWatchCalendar!!
    }

private var _timeWatchCalendar: ImageVector? = null
