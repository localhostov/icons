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

public val Icons.Filled.CalendarClock: ImageVector
    get() {
        if (_calendarClock != null) {
            return _calendarClock!!
        }
        _calendarClock = Builder(name = "CalendarClock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 4.239f, 2.239f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.86f, -3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                close()
                moveTo(19.0f, 17.586f)
                lineToRelative(-1.0f, -1.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.265f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineToRelative(1.293f, 1.293f)
                curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0.0f, -1.414f)
                close()
                moveTo(8.0f, 17.0f)
                curveToRelative(0.0f, -2.829f, 1.308f, -5.35f, 3.349f, -7.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.349f)
                curveToRelative(-2.041f, -1.65f, -3.349f, -4.171f, -3.349f, -7.0f)
                close()
            }
        }
        .build()
        return _calendarClock!!
    }

private var _calendarClock: ImageVector? = null
