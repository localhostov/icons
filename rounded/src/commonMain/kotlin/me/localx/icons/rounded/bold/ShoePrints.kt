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

public val Icons.Bold.ShoePrints: ImageVector
    get() {
        if (_shoePrints != null) {
            return _shoePrints!!
        }
        _shoePrints = Builder(name = "ShoePrints", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.056f, 3.0f)
                curveToRelative(-2.513f, 0.0f, -5.056f, 2.347f, -5.056f, 6.833f)
                curveToRelative(0.0f, 1.722f, 0.873f, 3.292f, 1.717f, 4.812f)
                curveToRelative(0.658f, 1.185f, 1.339f, 2.411f, 1.339f, 3.355f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.146f, 0.197f, -1.924f, 0.426f, -2.826f)
                curveToRelative(0.243f, -0.957f, 0.519f, -2.042f, 0.519f, -3.563f)
                curveToRelative(0.0f, -7.064f, -4.291f, -8.611f, -5.944f, -8.611f)
                close()
                moveTo(16.0f, 9.833f)
                curveToRelative(0.0f, -2.517f, 1.034f, -3.833f, 2.054f, -3.833f)
                curveToRelative(0.03f, 0.0f, 2.946f, 0.206f, 2.946f, 5.611f)
                curveToRelative(0.0f, 1.146f, -0.197f, 1.924f, -0.426f, 2.826f)
                curveToRelative(-0.243f, 0.957f, -0.519f, 2.042f, -0.519f, 3.563f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.722f, -0.873f, -3.292f, -1.717f, -4.812f)
                curveToRelative(-0.658f, -1.185f, -1.339f, -2.411f, -1.339f, -3.355f)
                close()
                moveTo(5.944f, 0.0f)
                curveTo(4.291f, 0.0f, 0.0f, 1.547f, 0.0f, 8.611f)
                curveToRelative(0.0f, 1.521f, 0.275f, 2.606f, 0.519f, 3.563f)
                curveToRelative(0.229f, 0.901f, 0.426f, 1.68f, 0.426f, 2.826f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.944f, 0.681f, -2.17f, 1.339f, -3.355f)
                curveToRelative(0.844f, -1.519f, 1.717f, -3.089f, 1.717f, -4.812f)
                curveTo(11.0f, 2.347f, 8.457f, 0.0f, 5.944f, 0.0f)
                close()
                moveTo(6.661f, 10.188f)
                curveToRelative(-0.844f, 1.519f, -1.717f, 3.089f, -1.717f, 4.812f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.521f, -0.275f, -2.606f, -0.519f, -3.563f)
                curveToRelative(-0.229f, -0.901f, -0.426f, -1.68f, -0.426f, -2.826f)
                curveToRelative(0.0f, -5.405f, 2.916f, -5.611f, 2.944f, -5.611f)
                curveToRelative(1.021f, 0.0f, 2.056f, 1.317f, 2.056f, 3.833f)
                curveToRelative(0.0f, 0.944f, -0.681f, 2.17f, -1.339f, 3.355f)
                close()
            }
        }
        .build()
        return _shoePrints!!
    }

private var _shoePrints: ImageVector? = null
