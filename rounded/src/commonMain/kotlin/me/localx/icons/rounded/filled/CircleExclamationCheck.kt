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

public val Icons.Filled.CircleExclamationCheck: ImageVector
    get() {
        if (_circleExclamationCheck != null) {
            return _circleExclamationCheck!!
        }
        _circleExclamationCheck = Builder(name = "CircleExclamationCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.004f, 15.0f)
                curveToRelative(-0.802f, 0.0f, -1.606f, -0.306f, -2.219f, -0.918f)
                lineToRelative(-1.463f, -1.347f)
                curveToRelative(-0.406f, -0.374f, -0.432f, -1.007f, -0.058f, -1.413f)
                curveToRelative(0.375f, -0.405f, 1.007f, -0.43f, 1.413f, -0.058f)
                lineToRelative(1.492f, 1.375f)
                curveToRelative(0.472f, 0.47f, 1.189f, 0.469f, 1.631f, 0.028f)
                lineToRelative(3.504f, -3.387f)
                curveToRelative(0.398f, -0.383f, 1.03f, -0.373f, 1.414f, 0.023f)
                curveToRelative(0.384f, 0.397f, 0.373f, 1.03f, -0.023f, 1.414f)
                lineToRelative(-3.492f, 3.375f)
                curveToRelative(-0.604f, 0.604f, -1.4f, 0.906f, -2.199f, 0.906f)
                close()
                moveTo(16.612f, 16.786f)
                curveToRelative(-1.593f, 2.529f, -4.403f, 4.214f, -7.612f, 4.214f)
                curveTo(4.029f, 21.0f, 0.0f, 16.971f, 0.0f, 12.0f)
                reflectiveCurveTo(4.029f, 3.0f, 9.0f, 3.0f)
                curveToRelative(4.483f, 0.0f, 8.189f, 3.281f, 8.876f, 7.57f)
                lineToRelative(-0.847f, -0.78f)
                curveToRelative(-1.216f, -1.114f, -3.113f, -1.033f, -4.235f, 0.178f)
                curveToRelative(-0.542f, 0.589f, -0.823f, 1.354f, -0.79f, 2.154f)
                curveToRelative(0.032f, 0.801f, 0.375f, 1.542f, 0.965f, 2.085f)
                lineToRelative(1.403f, 1.289f)
                curveToRelative(0.631f, 0.631f, 1.405f, 1.055f, 2.241f, 1.29f)
                close()
                moveTo(8.0f, 12.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(10.5f, 16.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _circleExclamationCheck!!
    }

private var _circleExclamationCheck: ImageVector? = null
