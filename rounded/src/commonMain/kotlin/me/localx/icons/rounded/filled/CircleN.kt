package me.localx.icons.rounded.filled

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

public val Icons.Filled.CircleN: ImageVector
    get() {
        if (_circleN != null) {
            return _circleN!!
        }
        _circleN = Builder(name = "CircleN", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.0f, 15.889f)
                curveToRelative(0.0f, 1.018f, -0.678f, 1.845f, -1.688f, 2.057f)
                curveToRelative(-0.154f, 0.033f, -0.308f, 0.049f, -0.459f, 0.049f)
                curveToRelative(-0.837f, 0.0f, -1.599f, -0.48f, -1.946f, -1.268f)
                lineToRelative(-3.649f, -8.661f)
                curveToRelative(-0.008f, -0.019f, -0.035f, -0.082f, -0.157f, -0.054f)
                curveToRelative(-0.1f, 0.021f, -0.1f, 0.062f, -0.1f, 0.1f)
                verticalLineToRelative(8.639f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-8.639f)
                curveToRelative(0.0f, -1.018f, 0.678f, -1.845f, 1.688f, -2.057f)
                curveToRelative(1.007f, -0.217f, 1.996f, 0.289f, 2.406f, 1.219f)
                lineToRelative(3.649f, 8.661f)
                curveToRelative(0.009f, 0.019f, 0.039f, 0.084f, 0.157f, 0.054f)
                curveToRelative(0.1f, -0.021f, 0.1f, -0.062f, 0.1f, -0.1f)
                lineTo(15.001f, 7.25f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(8.639f)
                close()
            }
        }
        .build()
        return _circleN!!
    }

private var _circleN: ImageVector? = null
