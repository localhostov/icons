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

public val Icons.Bold.SummaryCheck: ImageVector
    get() {
        if (_summaryCheck != null) {
            return _summaryCheck!!
        }
        _summaryCheck = Builder(name = "SummaryCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.721f, 24.0f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                lineTo(3.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(2.5f)
                lineTo(8.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.5f, 2.0f)
                horizontalLineToRelative(2.5f)
                lineTo(14.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(20.0f, 10.262f)
                curveToRelative(-0.64f, -0.165f, -1.308f, -0.262f, -2.0f, -0.262f)
                curveToRelative(-0.339f, 0.0f, -0.672f, 0.028f, -1.0f, 0.069f)
                lineTo(17.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(7.087f)
                curveToRelative(0.471f, 1.162f, 1.208f, 2.185f, 2.134f, 3.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(22.359f, 16.744f)
                lineToRelative(-1.398f, -1.43f)
                lineToRelative(-3.614f, 3.703f)
                lineToRelative(-2.216f, -2.301f)
                lineToRelative(-1.387f, 1.441f)
                lineToRelative(2.182f, 2.268f)
                curveToRelative(0.766f, 0.765f, 2.079f, 0.763f, 2.823f, 0.019f)
                lineToRelative(0.004f, -0.004f)
                lineToRelative(3.607f, -3.696f)
                close()
                moveTo(5.0f, 15.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                lineTo(5.0f, 12.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(3.0f)
                lineTo(15.0f, 10.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _summaryCheck!!
    }

private var _summaryCheck: ImageVector? = null
