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

public val Icons.Filled.IslandTropical: ImageVector
    get() {
        if (_islandTropical != null) {
            return _islandTropical!!
        }
        _islandTropical = Builder(name = "IslandTropical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 24.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.445f, 0.0f, -0.837f, -0.294f, -0.96f, -0.722f)
                curveToRelative(-0.124f, -0.427f, 0.05f, -0.885f, 0.426f, -1.123f)
                curveToRelative(0.204f, -0.129f, 5.067f, -2.155f, 11.534f, -2.155f)
                reflectiveCurveToRelative(11.33f, 2.026f, 11.534f, 2.155f)
                curveToRelative(0.376f, 0.238f, 0.55f, 0.696f, 0.426f, 1.123f)
                curveToRelative(-0.124f, 0.428f, -0.515f, 0.722f, -0.96f, 0.722f)
                close()
                moveTo(11.997f, 0.002f)
                reflectiveCurveTo(7.934f, -0.145f, 4.738f, 2.11f)
                curveToRelative(-1.801f, 1.271f, -2.942f, 3.034f, -3.595f, 4.33f)
                curveToRelative(-0.388f, 0.771f, 0.234f, 1.686f, 1.05f, 1.546f)
                curveToRelative(1.384f, -0.238f, 3.371f, -0.789f, 5.179f, -2.065f)
                curveTo(10.568f, 3.666f, 11.997f, 0.002f, 11.997f, 0.002f)
                moveToRelative(0.029f, 0.0f)
                reflectiveCurveToRelative(1.43f, 3.665f, 4.625f, 5.919f)
                curveToRelative(1.809f, 1.276f, 3.795f, 1.827f, 5.179f, 2.065f)
                curveToRelative(0.816f, 0.14f, 1.438f, -0.775f, 1.05f, -1.546f)
                curveToRelative(-0.653f, -1.296f, -1.794f, -3.059f, -3.595f, -4.33f)
                curveTo(16.091f, -0.145f, 12.027f, 0.002f, 12.027f, 0.002f)
                moveToRelative(-3.502f, 7.554f)
                curveToRelative(-0.5f, 0.353f, -1.01f, 0.654f, -1.519f, 0.918f)
                curveToRelative(-0.037f, 1.11f, 0.169f, 2.206f, 0.394f, 2.875f)
                curveToRelative(0.196f, 0.582f, 0.961f, 0.834f, 1.538f, 0.507f)
                curveToRelative(1.147f, -0.65f, 2.909f, -2.203f, 3.654f, -3.993f)
                curveToRelative(0.709f, -1.703f, 0.357f, -3.517f, -0.024f, -4.674f)
                curveToRelative(-0.869f, 1.374f, -2.195f, 3.063f, -4.043f, 4.367f)
                close()
                moveTo(16.23f, 8.031f)
                curveToRelative(-0.245f, -0.149f, -0.489f, -0.305f, -0.73f, -0.475f)
                curveToRelative(-0.216f, -0.152f, -0.421f, -0.312f, -0.623f, -0.474f)
                curveToRelative(-0.088f, 0.513f, -0.222f, 1.032f, -0.438f, 1.55f)
                curveToRelative(-0.275f, 0.661f, -0.66f, 1.289f, -1.096f, 1.877f)
                curveToRelative(-0.139f, 2.773f, -0.98f, 5.501f, -1.772f, 7.501f)
                curveToRelative(0.144f, -0.002f, 0.284f, -0.008f, 0.43f, -0.008f)
                curveToRelative(1.634f, 0.0f, 3.173f, 0.125f, 4.583f, 0.317f)
                curveToRelative(0.394f, -2.354f, 0.715f, -5.853f, -0.045f, -9.081f)
                curveToRelative(-0.099f, -0.422f, -0.204f, -0.815f, -0.309f, -1.206f)
                close()
            }
        }
        .build()
        return _islandTropical!!
    }

private var _islandTropical: ImageVector? = null
