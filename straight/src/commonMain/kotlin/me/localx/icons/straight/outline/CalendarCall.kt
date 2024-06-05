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

public val Icons.Outline.CalendarCall: ImageVector
    get() {
        if (_calendarCall != null) {
            return _calendarCall!!
        }
        _calendarCall = Builder(name = "CalendarCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.288f, 19.115f)
                lineToRelative(2.712f, 2.712f)
                lineToRelative(-1.378f, 1.378f)
                curveToRelative(-0.539f, 0.539f, -1.249f, 0.795f, -1.957f, 0.795f)
                curveToRelative(-3.634f, 0.0f, -8.665f, -4.752f, -8.665f, -8.665f)
                curveToRelative(0.0f, -0.708f, 0.255f, -1.418f, 0.795f, -1.957f)
                lineToRelative(1.378f, -1.378f)
                lineToRelative(2.712f, 2.712f)
                lineToRelative(-1.775f, 1.775f)
                curveToRelative(0.882f, 2.195f, 2.376f, 3.63f, 4.403f, 4.403f)
                lineToRelative(1.775f, -1.775f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(24.0f, 5.001f)
                verticalLineToRelative(13.999f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(-6.999f)
                lineTo(2.0f, 10.001f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(11.038f)
                curveToRelative(0.677f, 0.743f, 1.43f, 1.422f, 2.235f, 2.0f)
                lineTo(0.0f, 24.001f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 8.001f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 4.001f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(20.0f)
                close()
            }
        }
        .build()
        return _calendarCall!!
    }

private var _calendarCall: ImageVector? = null
