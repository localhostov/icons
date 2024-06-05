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

public val Icons.Filled.CalendarPaymentLoan: ImageVector
    get() {
        if (_calendarPaymentLoan != null) {
            return _calendarPaymentLoan!!
        }
        _calendarPaymentLoan = Builder(name = "CalendarPaymentLoan", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.014f)
                curveToRelative(0.0f, 1.649f, -1.343f, 2.986f, -3.0f, 2.986f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.337f, -3.0f, -2.986f)
                curveToRelative(0.0f, -2.871f, 2.273f, -5.752f, 4.84f, -6.452f)
                curveToRelative(-0.706f, -0.667f, -1.472f, -1.608f, -1.472f, -2.562f)
                horizontalLineToRelative(5.263f)
                curveToRelative(0.0f, 0.954f, -0.766f, 1.896f, -1.472f, 2.562f)
                curveToRelative(2.567f, 0.699f, 4.84f, 3.581f, 4.84f, 6.452f)
                close()
                moveTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
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
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10.0f, 21.014f)
                curveToRelative(0.0f, -2.736f, 1.572f, -5.521f, 3.814f, -7.155f)
                curveToRelative(-0.297f, -0.618f, -0.446f, -1.238f, -0.446f, -1.858f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 10.001f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(11.021f)
                curveToRelative(-0.632f, -0.835f, -1.021f, -1.862f, -1.021f, -2.986f)
                close()
            }
        }
        .build()
        return _calendarPaymentLoan!!
    }

private var _calendarPaymentLoan: ImageVector? = null
