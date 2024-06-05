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

public val Icons.Outline.CalendarDay: ImageVector
    get() {
        if (_calendarDay != null) {
            return _calendarDay!!
        }
        _calendarDay = Builder(name = "CalendarDay", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.002f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.002f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.002f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(1.348f, 2.0f, 0.002f, 3.346f, 0.002f, 5.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.002f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.002f, 4.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.002f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.002f, 22.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.002f, 22.0f)
                close()
            }
        }
        .build()
        return _calendarDay!!
    }

private var _calendarDay: ImageVector? = null
