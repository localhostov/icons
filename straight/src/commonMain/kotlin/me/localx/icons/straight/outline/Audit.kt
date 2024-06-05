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

public val Icons.Outline.Audit: ImageVector
    get() {
        if (_audit != null) {
            return _audit!!
        }
        _audit = Builder(name = "Audit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(22.562f, 23.976f)
                lineToRelative(-3.089f, -3.089f)
                curveToRelative(-0.981f, 0.698f, -2.177f, 1.113f, -3.473f, 1.113f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                curveToRelative(0.0f, 1.296f, -0.415f, 2.492f, -1.113f, 3.473f)
                lineToRelative(3.089f, 3.089f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(16.752f, 18.439f)
                lineToRelative(3.607f, -3.696f)
                lineToRelative(-1.398f, -1.43f)
                lineToRelative(-3.614f, 3.703f)
                lineToRelative(-2.216f, -2.301f)
                lineToRelative(-1.387f, 1.441f)
                lineToRelative(2.182f, 2.268f)
                curveToRelative(0.766f, 0.765f, 2.079f, 0.763f, 2.823f, 0.019f)
                lineToRelative(0.004f, -0.004f)
                close()
                moveTo(4.0f, 12.999f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.062f)
                curveToRelative(0.087f, -0.699f, 0.265f, -1.369f, 0.52f, -2.0f)
                horizontalLineToRelative(-4.582f)
                close()
                moveTo(4.0f, 16.999f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.582f)
                curveToRelative(-0.255f, -0.631f, -0.433f, -1.301f, -0.52f, -2.0f)
                horizontalLineToRelative(-4.062f)
                close()
                moveTo(10.709f, 21.999f)
                curveToRelative(1.41f, 1.245f, 3.262f, 2.0f, 5.291f, 2.0f)
                lineTo(0.0f, 23.999f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(9.414f)
                lineToRelative(7.586f, 7.586f)
                verticalLineToRelative(1.414f)
                horizontalLineToRelative(-9.0f)
                lineTo(11.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(8.709f)
                close()
                moveTo(13.0f, 6.999f)
                horizontalLineToRelative(3.586f)
                lineToRelative(-3.586f, -3.586f)
                verticalLineToRelative(3.586f)
                close()
            }
        }
        .build()
        return _audit!!
    }

private var _audit: ImageVector? = null
