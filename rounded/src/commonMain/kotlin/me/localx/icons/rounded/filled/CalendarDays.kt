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

public val Icons.Filled.CalendarDays: ImageVector
    get() {
        if (_calendarDays != null) {
            return _calendarDays!!
        }
        _calendarDays = Builder(name = "CalendarDays", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(4.0f, 12.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 12.0f)
                close()
                moveTo(4.0f, 14.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(13.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(11.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(4.0f, 20.0f)
                lineTo(0.1f, 20.0f)
                curveToRelative(0.4f, 1.96f, 1.94f, 3.5f, 3.9f, 3.9f)
                verticalLineToRelative(-3.9f)
                close()
                moveTo(11.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(20.0f, 20.0f)
                verticalLineToRelative(3.9f)
                curveToRelative(1.96f, -0.4f, 3.5f, -1.94f, 3.9f, -3.9f)
                horizontalLineToRelative(-3.9f)
                close()
                moveTo(23.9f, 6.0f)
                curveToRelative(-0.46f, -2.28f, -2.48f, -4.0f, -4.9f, -4.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 2.0f)
                lineTo(8.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(2.59f, 2.0f, 0.57f, 3.72f, 0.1f, 6.0f)
                lineTo(23.9f, 6.0f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(20.0f, 8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _calendarDays!!
    }

private var _calendarDays: ImageVector? = null
