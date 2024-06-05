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

public val Icons.Filled.ThreeLeafClover: ImageVector
    get() {
        if (_threeLeafClover != null) {
            return _threeLeafClover!!
        }
        _threeLeafClover = Builder(name = "ThreeLeafClover", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.154f, 3.142f)
                curveToRelative(0.0f, -1.747f, 1.345f, -3.142f, 2.999f, -3.142f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.898f, 0.0f, 1.741f, 0.422f, 2.315f, 1.156f)
                lineToRelative(0.685f, 0.877f)
                lineToRelative(0.684f, -0.877f)
                curveToRelative(0.574f, -0.735f, 1.417f, -1.156f, 2.315f, -1.156f)
                horizontalLineToRelative(0.002f)
                curveToRelative(1.654f, 0.0f, 2.999f, 1.394f, 2.999f, 3.142f)
                curveToRelative(0.0f, 3.134f, -4.129f, 6.935f, -5.654f, 8.161f)
                curveToRelative(-0.334f, 0.268f, -0.801f, 0.262f, -1.128f, -0.014f)
                curveToRelative(-1.462f, -1.239f, -5.218f, -5.025f, -5.218f, -8.146f)
                close()
                moveTo(24.0f, 11.001f)
                verticalLineToRelative(-0.002f)
                curveToRelative(0.0f, -1.654f, -1.394f, -2.999f, -3.142f, -2.999f)
                curveToRelative(-3.853f, 0.0f, -8.846f, 6.485f, -8.858f, 6.5f)
                curveToRelative(-0.017f, -0.02f, -5.006f, -6.5f, -8.858f, -6.5f)
                curveToRelative(-1.747f, 0.0f, -3.142f, 1.345f, -3.142f, 2.999f)
                verticalLineToRelative(0.002f)
                curveToRelative(0.0f, 0.898f, 0.422f, 1.741f, 1.156f, 2.315f)
                lineToRelative(0.877f, 0.684f)
                lineToRelative(-0.877f, 0.685f)
                curveToRelative(-0.735f, 0.574f, -1.156f, 1.417f, -1.156f, 2.315f)
                lineTo(0.0f, 17.0f)
                curveToRelative(0.0f, 1.655f, 1.394f, 3.0f, 3.142f, 3.0f)
                curveToRelative(2.547f, 0.0f, 5.942f, -2.643f, 7.77f, -4.425f)
                curveToRelative(0.039f, 2.219f, 0.727f, 6.013f, 4.591f, 8.274f)
                curveToRelative(0.148f, 0.087f, 0.312f, 0.151f, 0.497f, 0.151f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.368f, -0.208f, -0.675f, -0.503f, -0.849f)
                curveToRelative(-3.07f, -1.797f, -3.569f, -4.905f, -3.588f, -6.664f)
                curveToRelative(1.822f, 1.776f, 5.341f, 4.513f, 7.95f, 4.513f)
                curveToRelative(1.747f, 0.0f, 3.142f, -1.345f, 3.142f, -2.999f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.899f, -0.422f, -1.742f, -1.156f, -2.316f)
                lineToRelative(-0.877f, -0.685f)
                lineToRelative(0.877f, -0.684f)
                curveToRelative(0.735f, -0.574f, 1.156f, -1.417f, 1.156f, -2.315f)
                close()
            }
        }
        .build()
        return _threeLeafClover!!
    }

private var _threeLeafClover: ImageVector? = null
