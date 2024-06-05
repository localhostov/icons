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
                moveToRelative(18.89f, 13.669f)
                curveToRelative(0.337f, -0.331f, 0.678f, -0.71f, 0.947f, -1.126f)
                curveToRelative(0.43f, -0.664f, -0.042f, -1.543f, -0.834f, -1.543f)
                horizontalLineToRelative(-3.006f)
                curveToRelative(-0.792f, 0.0f, -1.265f, 0.878f, -0.834f, 1.543f)
                curveToRelative(0.269f, 0.416f, 0.61f, 0.795f, 0.947f, 1.126f)
                curveToRelative(-2.846f, 0.677f, -5.11f, 3.349f, -5.11f, 6.343f)
                curveToRelative(0.0f, 2.199f, 1.794f, 3.988f, 4.0f, 3.988f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.789f, 4.0f, -3.988f)
                curveToRelative(0.0f, -2.994f, -2.264f, -5.666f, -5.11f, -6.343f)
                close()
                moveTo(20.0f, 21.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.443f, -1.0f, -0.988f)
                curveToRelative(0.0f, -1.978f, 1.882f, -3.512f, 3.5f, -3.512f)
                reflectiveCurveToRelative(3.5f, 1.534f, 3.5f, 3.512f)
                curveToRelative(0.0f, 0.545f, -0.448f, 0.988f, -1.0f, 0.988f)
                close()
                moveTo(24.0f, 7.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(0.0f, 7.5f)
                curveTo(0.0f, 4.467f, 2.467f, 2.0f, 5.5f, 2.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _calendarPaymentLoan!!
    }

private var _calendarPaymentLoan: ImageVector? = null
