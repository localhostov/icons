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
                moveToRelative(0.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 4.243f, 2.243f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 8.0f)
                close()
                moveTo(19.33f, 14.627f)
                curveToRelative(0.382f, -0.372f, 0.771f, -0.814f, 1.052f, -1.294f)
                curveToRelative(0.346f, -0.59f, -0.115f, -1.333f, -0.799f, -1.333f)
                horizontalLineToRelative(-3.167f)
                curveToRelative(-0.684f, 0.0f, -1.144f, 0.743f, -0.799f, 1.333f)
                curveToRelative(0.281f, 0.48f, 0.67f, 0.922f, 1.052f, 1.294f)
                curveToRelative(-2.495f, 0.779f, -4.67f, 3.581f, -4.67f, 6.387f)
                curveToRelative(0.0f, 1.649f, 1.343f, 2.986f, 3.0f, 2.986f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.337f, 3.0f, -2.986f)
                curveToRelative(0.0f, -2.806f, -2.174f, -5.608f, -4.67f, -6.387f)
                close()
                moveTo(10.0f, 21.014f)
                curveToRelative(0.0f, -2.697f, 1.506f, -5.424f, 3.7f, -7.065f)
                curveToRelative(-0.314f, -0.799f, -0.253f, -1.716f, 0.185f, -2.479f)
                curveToRelative(0.52f, -0.907f, 1.489f, -1.47f, 2.531f, -1.47f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.021f)
                curveToRelative(-0.632f, -0.835f, -1.021f, -1.862f, -1.021f, -2.986f)
                close()
            }
        }
        .build()
        return _calendarPaymentLoan!!
    }

private var _calendarPaymentLoan: ImageVector? = null
