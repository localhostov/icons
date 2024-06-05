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

public val Icons.Bold.CalendarDays: ImageVector
    get() {
        if (_calendarDays != null) {
            return _calendarDays!!
        }
        _calendarDays = Builder(name = "CalendarDays", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.02f)
                verticalLineToRelative(-0.52f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(8.0f, 2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.52f)
                curveTo(2.2f, 2.28f, 0.0f, 4.64f, 0.0f, 7.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0.0f, -2.86f, -2.2f, -5.22f, -5.0f, -5.48f)
                close()
                moveTo(10.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(14.0f, 17.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(3.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(17.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(5.5f, 5.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.21f, 0.0f, 2.22f, 0.86f, 2.45f, 2.0f)
                lineTo(3.05f, 7.0f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2.0f, 2.45f, -2.0f)
                close()
                moveTo(3.0f, 18.5f)
                verticalLineToRelative(-1.5f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18.5f, 21.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _calendarDays!!
    }

private var _calendarDays: ImageVector? = null
