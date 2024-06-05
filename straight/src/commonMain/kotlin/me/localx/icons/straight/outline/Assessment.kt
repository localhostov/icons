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

public val Icons.Outline.Assessment: ImageVector
    get() {
        if (_assessment != null) {
            return _assessment!!
        }
        _assessment = Builder(name = "Assessment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(8.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 22.0f)
                lineTo(2.0f, 3.001f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.447f, 1.0f, 0.999f)
                verticalLineToRelative(3.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                verticalLineToRelative(2.214f)
                curveToRelative(0.708f, 0.201f, 1.382f, 0.499f, 2.0f, 0.857f)
                verticalLineToRelative(-2.071f)
                horizontalLineToRelative(0.0f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.345f, 0.0f, 0.0f, 1.347f, 0.0f, 3.001f)
                verticalLineToRelative(20.999f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.004f)
                lineToRelative(7.921f, 0.003f)
                curveToRelative(-1.993f, -0.019f, -3.804f, -0.776f, -5.195f, -1.999f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(23.553f, 22.139f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.666f, -2.666f)
                curveToRelative(-0.981f, 0.698f, -2.177f, 1.113f, -3.473f, 1.113f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                curveToRelative(0.0f, 1.296f, -0.415f, 2.492f, -1.113f, 3.473f)
                lineToRelative(2.666f, 2.666f)
                close()
                moveTo(20.359f, 14.744f)
                lineToRelative(-1.398f, -1.43f)
                lineToRelative(-3.614f, 3.703f)
                lineToRelative(-2.216f, -2.301f)
                lineToRelative(-1.387f, 1.441f)
                lineToRelative(2.182f, 2.268f)
                curveToRelative(0.766f, 0.765f, 2.079f, 0.763f, 2.823f, 0.019f)
                lineToRelative(0.004f, -0.004f)
                lineToRelative(3.607f, -3.696f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _assessment!!
    }

private var _assessment: ImageVector? = null
