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

public val Icons.Bold.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 2.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.598f)
                curveToRelative(-1.496f, 0.196f, -2.944f, 0.684f, -4.251f, 1.441f)
                curveTo(0.032f, 3.955f, -0.213f, 4.872f, 0.202f, 5.589f)
                curveToRelative(0.278f, 0.48f, 0.782f, 0.749f, 1.3f, 0.749f)
                curveToRelative(0.255f, 0.0f, 0.513f, -0.065f, 0.75f, -0.202f)
                curveToRelative(0.849f, -0.492f, 1.783f, -0.814f, 2.749f, -0.987f)
                verticalLineToRelative(2.032f)
                curveToRelative(-2.862f, 0.68f, -5.0f, 3.251f, -5.0f, 6.318f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -3.067f, -2.138f, -5.638f, -5.0f, -6.318f)
                verticalLineToRelative(-2.182f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(10.0f, 13.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(24.0f, 1.294f)
                verticalLineToRelative(4.396f)
                curveToRelative(0.0f, 0.841f, -0.791f, 1.459f, -1.607f, 1.255f)
                lineToRelative(-4.956f, -1.507f)
                curveToRelative(-0.853f, -0.26f, -1.437f, -1.047f, -1.437f, -1.939f)
                reflectiveCurveToRelative(0.581f, -1.676f, 1.432f, -1.938f)
                lineTo(22.393f, 0.039f)
                curveToRelative(0.816f, -0.204f, 1.607f, 0.413f, 1.607f, 1.255f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
