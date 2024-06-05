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

public val Icons.Filled.Audit: ImageVector
    get() {
        if (_audit != null) {
            return _audit!!
        }
        _audit = Builder(name = "Audit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(15.0f, 0.586f)
                lineToRelative(4.414f, 4.414f)
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
                moveTo(8.589f, 18.999f)
                horizontalLineToRelative(-4.589f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.069f)
                curveToRelative(-0.041f, -0.328f, -0.069f, -0.661f, -0.069f, -1.0f)
                reflectiveCurveToRelative(0.028f, -0.672f, 0.069f, -1.0f)
                horizontalLineToRelative(-4.069f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.589f)
                curveToRelative(0.295f, -0.726f, 0.692f, -1.398f, 1.176f, -2.0f)
                horizontalLineToRelative(-5.765f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.136f)
                curveToRelative(1.147f, -0.636f, 2.463f, -1.0f, 3.864f, -1.0f)
                curveToRelative(1.458f, 0.0f, 2.822f, 0.398f, 4.0f, 1.082f)
                verticalLineToRelative(-2.082f)
                horizontalLineToRelative(-7.0f)
                lineTo(13.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(-3.35f, 0.0f, -6.221f, -2.072f, -7.411f, -5.0f)
                close()
            }
        }
        .build()
        return _audit!!
    }

private var _audit: ImageVector? = null
