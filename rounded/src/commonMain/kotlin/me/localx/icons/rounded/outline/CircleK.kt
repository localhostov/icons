package me.localx.icons.rounded.outline

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

public val Icons.Outline.CircleK: ImageVector
    get() {
        if (_circleK != null) {
            return _circleK!!
        }
        _circleK = Builder(name = "CircleK", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.038f, 0.019f)
                curveTo(5.421f, 0.019f, 0.038f, 5.402f, 0.038f, 12.019f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.384f, 12.0f, -12.0f)
                reflectiveCurveTo(18.655f, 0.019f, 12.038f, 0.019f)
                close()
                moveTo(12.038f, 22.019f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.524f, 2.019f, 12.038f, 2.019f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(16.819f, 7.643f)
                lineToRelative(-3.501f, 4.375f)
                lineToRelative(3.501f, 4.375f)
                curveToRelative(0.345f, 0.432f, 0.274f, 1.061f, -0.156f, 1.406f)
                curveToRelative(-0.185f, 0.147f, -0.405f, 0.219f, -0.624f, 0.219f)
                curveToRelative(-0.294f, 0.0f, -0.584f, -0.129f, -0.782f, -0.375f)
                lineToRelative(-3.699f, -4.625f)
                horizontalLineToRelative(-2.519f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(7.039f, 7.019f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.519f)
                lineToRelative(3.7f, -4.625f)
                curveToRelative(0.346f, -0.43f, 0.974f, -0.501f, 1.406f, -0.156f)
                curveToRelative(0.431f, 0.345f, 0.501f, 0.974f, 0.156f, 1.405f)
                close()
            }
        }
        .build()
        return _circleK!!
    }

private var _circleK: ImageVector? = null
