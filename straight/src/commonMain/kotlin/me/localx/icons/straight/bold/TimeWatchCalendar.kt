package me.localx.icons.straight.bold

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

public val Icons.Bold.TimeWatchCalendar: ImageVector
    get() {
        if (_timeWatchCalendar != null) {
            return _timeWatchCalendar!!
        }
        _timeWatchCalendar = Builder(name = "TimeWatchCalendar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(15.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(9.0f, 5.357f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.026f)
                lineToRelative(-4.629f, 2.571f)
                lineToRelative(-1.457f, -2.622f)
                lineToRelative(3.086f, -1.715f)
                verticalLineToRelative(-4.26f)
                close()
                moveTo(10.0f, 17.975f)
                verticalLineToRelative(3.0f)
                curveToRelative(-5.557f, -0.264f, -10.0f, -4.854f, -10.0f, -10.475f)
                curveTo(0.0f, 4.71f, 4.71f, 0.0f, 10.5f, 0.0f)
                curveToRelative(5.621f, 0.0f, 10.211f, 4.443f, 10.475f, 10.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.259f, -3.902f, -3.508f, -7.0f, -7.475f, -7.0f)
                curveToRelative(-4.136f, 0.0f, -7.5f, 3.364f, -7.5f, 7.5f)
                curveToRelative(0.0f, 3.967f, 3.098f, 7.216f, 7.0f, 7.475f)
                close()
            }
        }
        .build()
        return _timeWatchCalendar!!
    }

private var _timeWatchCalendar: ImageVector? = null
