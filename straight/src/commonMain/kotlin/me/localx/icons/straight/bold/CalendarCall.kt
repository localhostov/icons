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

public val Icons.Bold.CalendarCall: ImageVector
    get() {
        if (_calendarCall != null) {
            return _calendarCall!!
        }
        _calendarCall = Builder(name = "CalendarCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.5f)
                verticalLineToRelative(13.499f)
                lineToRelative(-3.0f, -3.0f)
                verticalLineToRelative(-6.999f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(9.202f)
                curveToRelative(0.861f, 1.138f, 1.917f, 2.171f, 3.071f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.287f, 19.114f)
                lineToRelative(-1.775f, 1.775f)
                curveToRelative(-2.027f, -0.773f, -3.521f, -2.208f, -4.403f, -4.403f)
                lineToRelative(1.775f, -1.775f)
                lineToRelative(-2.712f, -2.712f)
                lineToRelative(-1.378f, 1.378f)
                curveToRelative(-0.54f, 0.539f, -0.795f, 1.249f, -0.795f, 1.957f)
                curveToRelative(0.0f, 3.914f, 5.032f, 8.665f, 8.665f, 8.665f)
                curveToRelative(0.708f, 0.0f, 1.418f, -0.256f, 1.957f, -0.795f)
                lineToRelative(1.378f, -1.378f)
                lineToRelative(-2.712f, -2.712f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _calendarCall!!
    }

private var _calendarCall: ImageVector? = null
