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

public val Icons.Outline.CircleN: ImageVector
    get() {
        if (_circleN != null) {
            return _circleN!!
        }
        _circleN = Builder(name = "CircleN", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.039f, 0.02f)
                curveTo(5.422f, 0.02f, 0.039f, 5.402f, 0.039f, 12.02f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.655f, 0.02f, 12.039f, 0.02f)
                close()
                moveTo(12.039f, 22.02f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.524f, 2.02f, 12.039f, 2.02f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(17.039f, 7.27f)
                verticalLineToRelative(8.639f)
                curveToRelative(0.0f, 1.018f, -0.678f, 1.845f, -1.688f, 2.057f)
                curveToRelative(-0.154f, 0.033f, -0.308f, 0.049f, -0.459f, 0.049f)
                curveToRelative(-0.837f, 0.0f, -1.599f, -0.48f, -1.946f, -1.268f)
                lineToRelative(-3.649f, -8.662f)
                curveToRelative(-0.008f, -0.018f, -0.033f, -0.077f, -0.158f, -0.054f)
                curveToRelative(-0.1f, 0.021f, -0.1f, 0.062f, -0.1f, 0.1f)
                verticalLineToRelative(8.64f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-8.64f)
                curveToRelative(0.0f, -1.018f, 0.678f, -1.844f, 1.688f, -2.057f)
                curveToRelative(1.007f, -0.21f, 1.997f, 0.29f, 2.406f, 1.219f)
                lineToRelative(3.649f, 8.662f)
                curveToRelative(0.008f, 0.02f, 0.038f, 0.085f, 0.157f, 0.054f)
                curveToRelative(0.1f, -0.021f, 0.1f, -0.062f, 0.1f, -0.1f)
                lineTo(15.039f, 7.27f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _circleN!!
    }

private var _circleN: ImageVector? = null
