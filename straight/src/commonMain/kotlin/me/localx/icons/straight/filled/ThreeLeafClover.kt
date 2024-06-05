package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                curveToRelative(0.0f, 3.858f, -6.154f, 8.358f, -6.154f, 8.358f)
                curveToRelative(0.0f, 0.0f, -5.846f, -4.5f, -5.846f, -8.358f)
                close()
                moveTo(22.844f, 13.316f)
                lineToRelative(-0.877f, 0.684f)
                lineToRelative(0.877f, 0.685f)
                curveToRelative(0.735f, 0.574f, 1.156f, 1.417f, 1.156f, 2.315f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.655f, -1.394f, 3.0f, -3.142f, 3.0f)
                curveToRelative(-2.609f, 0.0f, -6.128f, -2.737f, -7.95f, -4.513f)
                curveToRelative(0.02f, 1.758f, 0.527f, 4.853f, 3.597f, 6.649f)
                lineToRelative(-1.01f, 1.727f)
                curveToRelative(-3.864f, -2.261f, -4.544f, -6.069f, -4.583f, -8.288f)
                curveToRelative(-1.829f, 1.782f, -5.223f, 4.425f, -7.77f, 4.425f)
                curveToRelative(-1.747f, 0.0f, -3.142f, -1.345f, -3.142f, -2.999f)
                horizontalLineTo(0.0f)
                curveToRelative(0.0f, -0.899f, 0.422f, -1.742f, 1.156f, -2.316f)
                lineToRelative(0.877f, -0.685f)
                lineToRelative(-0.877f, -0.684f)
                curveToRelative(-0.735f, -0.574f, -1.156f, -1.417f, -1.156f, -2.315f)
                verticalLineToRelative(-0.002f)
                curveToRelative(0.0f, -1.654f, 1.394f, -2.999f, 3.142f, -2.999f)
                curveToRelative(3.852f, 0.0f, 8.841f, 6.48f, 8.858f, 6.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.013f, -0.015f, 5.005f, -6.5f, 8.858f, -6.5f)
                curveToRelative(1.747f, 0.0f, 3.142f, 1.345f, 3.142f, 2.999f)
                verticalLineToRelative(0.002f)
                curveToRelative(0.0f, 0.898f, -0.422f, 1.741f, -1.156f, 2.315f)
                close()
            }
        }
        .build()
        return _threeLeafClover!!
    }

private var _threeLeafClover: ImageVector? = null
