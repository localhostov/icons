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

public val Icons.Filled.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.056f, viewportHeight = 512.056f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.437f, 512.055f)
                curveToRelative(96.436f, 0.246f, 184.764f, -53.923f, 228.267f, -139.989f)
                curveToRelative(5.035f, -10.652f, 0.482f, -23.369f, -10.17f, -28.404f)
                curveToRelative(-10.204f, -4.824f, -22.4f, -0.864f, -27.825f, 9.034f)
                curveToRelative(-53.371f, 105.039f, -181.788f, 146.925f, -286.827f, 93.553f)
                curveTo(66.842f, 392.878f, 24.957f, 264.461f, 78.328f, 159.421f)
                reflectiveCurveTo(260.116f, 12.497f, 365.155f, 65.868f)
                curveToRelative(40.469f, 20.563f, 73.324f, 53.498f, 93.788f, 94.017f)
                curveToRelative(4.979f, 10.678f, 17.671f, 15.299f, 28.35f, 10.32f)
                reflectiveCurveToRelative(15.299f, -17.671f, 10.32f, -28.35f)
                curveToRelative(-0.185f, -0.396f, -0.381f, -0.786f, -0.59f, -1.17f)
                curveTo(433.306f, 14.471f, 279.337f, -36.191f, 153.124f, 27.526f)
                reflectiveCurveToRelative(-176.876f, 217.687f, -113.159f, 343.9f)
                curveTo(83.494f, 457.65f, 171.848f, 512.034f, 268.437f, 512.055f)
                close()
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
