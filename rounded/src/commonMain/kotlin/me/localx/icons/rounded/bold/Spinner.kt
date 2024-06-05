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

public val Icons.Bold.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.001f, viewportHeight = 512.001f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.078f, 512.0f)
                curveTo(126.693f, 511.962f, 12.108f, 397.316f, 12.146f, 255.932f)
                reflectiveCurveTo(126.83f, -0.038f, 268.215f, 0.0f)
                curveToRelative(96.559f, 0.026f, 184.888f, 54.38f, 228.428f, 140.565f)
                curveToRelative(7.695f, 15.91f, 1.035f, 35.046f, -14.875f, 42.74f)
                curveToRelative(-15.501f, 7.497f, -34.155f, 1.384f, -42.213f, -13.834f)
                curveTo(391.771f, 74.81f, 276.296f, 36.808f, 181.634f, 84.592f)
                reflectiveCurveTo(48.97f, 247.851f, 96.754f, 342.513f)
                reflectiveCurveToRelative(163.259f, 132.664f, 257.921f, 84.88f)
                curveToRelative(36.48f, -18.414f, 66.133f, -47.987f, 84.646f, -84.417f)
                curveToRelative(8.018f, -15.753f, 27.287f, -22.023f, 43.04f, -14.005f)
                curveToRelative(15.753f, 8.018f, 22.023f, 27.287f, 14.005f, 43.04f)
                lineToRelative(0.0f, 0.0f)
                curveTo(452.852f, 458.077f, 364.519f, 512.244f, 268.078f, 512.0f)
                close()
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
