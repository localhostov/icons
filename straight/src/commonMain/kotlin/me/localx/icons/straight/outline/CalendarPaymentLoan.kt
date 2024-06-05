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

public val Icons.Outline.CalendarPaymentLoan: ImageVector
    get() {
        if (_calendarPaymentLoan != null) {
            return _calendarPaymentLoan!!
        }
        _calendarPaymentLoan = Builder(name = "CalendarPaymentLoan", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.47f, 14.253f)
                curveToRelative(0.603f, -0.633f, 1.162f, -1.438f, 1.162f, -2.253f)
                horizontalLineToRelative(-5.263f)
                curveToRelative(0.0f, 0.815f, 0.559f, 1.62f, 1.162f, 2.253f)
                curveToRelative(-2.451f, 0.813f, -4.53f, 3.511f, -4.53f, 6.258f)
                curveToRelative(0.0f, 1.923f, 1.57f, 3.488f, 3.5f, 3.488f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.565f, 3.5f, -3.488f)
                curveToRelative(0.0f, -2.748f, -2.079f, -5.446f, -4.53f, -6.258f)
                close()
                moveTo(20.5f, 22.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.667f, -1.5f, -1.488f)
                curveToRelative(0.0f, -2.192f, 2.056f, -4.512f, 4.0f, -4.512f)
                reflectiveCurveToRelative(4.0f, 2.319f, 4.0f, 4.512f)
                curveToRelative(0.0f, 0.821f, -0.673f, 1.488f, -1.5f, 1.488f)
                close()
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(11.257f)
                curveToRelative(-0.479f, -0.579f, -0.836f, -1.259f, -1.046f, -2.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _calendarPaymentLoan!!
    }

private var _calendarPaymentLoan: ImageVector? = null
