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

public val Icons.Bold.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) {
            return _calendarHeart!!
        }
        _calendarHeart = Builder(name = "CalendarHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 2.0f)
                horizontalLineToRelative(-2.5f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(12.0f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(16.449f, 13.475f)
                curveToRelative(0.0f, 2.592f, -4.5f, 5.775f, -4.5f, 5.775f)
                curveToRelative(0.0f, 0.0f, -4.5f, -3.183f, -4.5f, -5.775f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                reflectiveCurveToRelative(2.25f, 1.108f, 2.25f, 2.475f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                reflectiveCurveToRelative(2.25f, 1.108f, 2.25f, 2.475f)
                close()
            }
        }
        .build()
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
