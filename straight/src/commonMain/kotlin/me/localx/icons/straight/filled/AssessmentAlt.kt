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

public val Icons.Filled.AssessmentAlt: ImageVector
    get() {
        if (_assessmentAlt != null) {
            return _assessmentAlt!!
        }
        _assessmentAlt = Builder(name = "AssessmentAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.086f, 20.0f)
                horizontalLineToRelative(-3.086f)
                reflectiveCurveToRelative(0.0f, -3.086f, 0.0f, -3.086f)
                lineToRelative(7.275f, -7.275f)
                curveToRelative(0.852f, -0.852f, 2.234f, -0.852f, 3.086f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.852f, 0.852f, 0.852f, 2.234f, 0.0f, 3.086f)
                lineToRelative(-7.275f, 7.275f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveTo(0.0f, 9.314f, 0.0f, 6.0f)
                reflectiveCurveTo(2.686f, 0.0f, 6.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(10.359f, 4.744f)
                lineToRelative(-1.398f, -1.43f)
                lineToRelative(-3.614f, 3.703f)
                lineToRelative(-2.216f, -2.301f)
                lineToRelative(-1.387f, 1.441f)
                lineToRelative(2.182f, 2.268f)
                curveToRelative(0.766f, 0.765f, 2.079f, 0.763f, 2.823f, 0.019f)
                lineToRelative(0.004f, -0.004f)
                lineToRelative(3.607f, -3.696f)
                close()
                moveTo(16.917f, 22.0f)
                horizontalLineToRelative(-5.914f)
                verticalLineToRelative(-5.914f)
                lineToRelative(7.861f, -7.861f)
                curveToRelative(0.456f, -0.456f, 0.995f, -0.771f, 1.566f, -0.972f)
                curveToRelative(-0.545f, -0.756f, -1.427f, -1.253f, -2.43f, -1.253f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, 4.418f, -3.582f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-1.062f, 0.0f, -2.073f, -0.211f, -3.0f, -0.587f)
                verticalLineToRelative(10.587f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-6.083f)
                lineToRelative(-4.083f, 4.083f)
                close()
            }
        }
        .build()
        return _assessmentAlt!!
    }

private var _assessmentAlt: ImageVector? = null
