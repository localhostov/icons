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

public val Icons.Bold.CalendarPaymentLoan: ImageVector
    get() {
        if (_calendarPaymentLoan != null) {
            return _calendarPaymentLoan!!
        }
        _calendarPaymentLoan = Builder(name = "CalendarPaymentLoan", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.896f, 13.329f)
                curveToRelative(0.63f, -0.644f, 1.235f, -1.482f, 1.235f, -2.329f)
                horizontalLineToRelative(-5.263f)
                curveToRelative(0.0f, 0.848f, 0.605f, 1.685f, 1.235f, 2.329f)
                curveToRelative(-2.773f, 0.758f, -5.104f, 3.646f, -5.104f, 6.682f)
                curveToRelative(0.0f, 2.199f, 1.794f, 3.988f, 4.0f, 3.988f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.789f, 4.0f, -3.988f)
                curveToRelative(0.0f, -3.037f, -2.33f, -5.924f, -5.104f, -6.682f)
                close()
                moveTo(20.0f, 21.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.443f, -1.0f, -0.988f)
                curveToRelative(0.0f, -1.886f, 1.799f, -3.88f, 3.5f, -3.88f)
                reflectiveCurveToRelative(3.5f, 1.995f, 3.5f, 3.88f)
                curveToRelative(0.0f, 0.545f, -0.448f, 0.988f, -1.0f, 0.988f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(3.5f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(6.089f)
                curveToRelative(0.191f, 1.142f, 0.706f, 2.173f, 1.448f, 3.0f)
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
            }
        }
        .build()
        return _calendarPaymentLoan!!
    }

private var _calendarPaymentLoan: ImageVector? = null
