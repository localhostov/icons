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

public val Icons.Filled.CalendarPen: ImageVector
    get() {
        if (_calendarPen != null) {
            return _calendarPen!!
        }
        _calendarPen = Builder(name = "CalendarPen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(23.257f, 12.742f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0.0f)
                lineToRelative(-7.668f, 7.667f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(7.667f, -7.667f)
                curveToRelative(0.479f, -0.48f, 0.744f, -1.117f, 0.744f, -1.795f)
                reflectiveCurveToRelative(-0.264f, -1.316f, -0.744f, -1.795f)
                close()
                moveTo(21.462f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(14.0f)
                lineTo(10.0f, 24.0f)
                verticalLineToRelative(-4.419f)
                lineToRelative(8.254f, -8.252f)
                curveToRelative(0.855f, -0.856f, 1.995f, -1.329f, 3.209f, -1.329f)
                close()
            }
        }
        .build()
        return _calendarPen!!
    }

private var _calendarPen: ImageVector? = null
