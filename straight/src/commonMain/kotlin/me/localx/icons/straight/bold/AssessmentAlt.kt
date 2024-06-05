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

public val Icons.Bold.AssessmentAlt: ImageVector
    get() {
        if (_assessmentAlt != null) {
            return _assessmentAlt!!
        }
        _assessmentAlt = Builder(name = "AssessmentAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.086f, 9.0f)
                horizontalLineToRelative(-3.675f)
                curveToRelative(0.377f, -0.927f, 0.589f, -1.939f, 0.589f, -3.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.766f, 0.0f, 1.47f, 0.255f, 2.047f, 0.674f)
                curveToRelative(-0.242f, 0.157f, -0.473f, 0.338f, -0.685f, 0.551f)
                lineToRelative(-1.775f, 1.775f)
                close()
                moveTo(18.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(-1.061f, 0.0f, -2.073f, -0.212f, -3.0f, -0.589f)
                verticalLineToRelative(10.589f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-7.086f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(1.086f)
                close()
                moveTo(23.361f, 8.639f)
                curveToRelative(-0.852f, -0.852f, -2.234f, -0.852f, -3.086f, 0.0f)
                lineToRelative(-7.275f, 7.275f)
                verticalLineToRelative(3.086f)
                horizontalLineToRelative(3.086f)
                lineToRelative(7.275f, -7.275f)
                curveToRelative(0.852f, -0.852f, 0.852f, -2.234f, 0.0f, -3.086f)
                close()
                moveTo(6.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveTo(2.686f, 0.0f, 6.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.686f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(6.748f, 8.443f)
                lineToRelative(0.004f, -0.004f)
                lineToRelative(3.607f, -3.696f)
                lineToRelative(-1.398f, -1.43f)
                lineToRelative(-3.614f, 3.703f)
                lineToRelative(-2.216f, -2.301f)
                lineToRelative(-1.387f, 1.441f)
                lineToRelative(2.182f, 2.268f)
                curveToRelative(0.766f, 0.765f, 2.079f, 0.763f, 2.823f, 0.019f)
                close()
            }
        }
        .build()
        return _assessmentAlt!!
    }

private var _assessmentAlt: ImageVector? = null
