package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Camping: ImageVector
    get() {
        if (_camping != null) {
            return _camping!!
        }
        _camping = Builder(name = "Camping", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9997f, -0.0129f)
                    lineTo(0.4077f, 19.6001f)
                    curveTo(0.1453f, 20.0427f, 0.0048f, 20.5469f, 5.0E-4f, 21.0615f)
                    curveTo(-0.0039f, 21.576f, 0.1281f, 22.0825f, 0.383f, 22.5295f)
                    curveTo(0.6379f, 22.9765f, 1.0066f, 23.348f, 1.4516f, 23.6063f)
                    curveTo(1.8967f, 23.8646f, 2.4022f, 24.0005f, 2.9167f, 24.0001f)
                    horizontalLineTo(21.0827f)
                    curveTo(21.5973f, 24.0005f, 22.1028f, 23.8646f, 22.5478f, 23.6063f)
                    curveTo(22.9929f, 23.348f, 23.3616f, 22.9765f, 23.6165f, 22.5295f)
                    curveTo(23.8714f, 22.0825f, 24.0033f, 21.576f, 23.999f, 21.0615f)
                    curveTo(23.9947f, 20.5469f, 23.8541f, 20.0427f, 23.5917f, 19.6001f)
                    lineTo(11.9997f, -0.0129f)
                    close()
                    moveTo(8.9997f, 22.0001f)
                    lineTo(11.9997f, 16.9191f)
                    lineTo(14.9997f, 22.0001f)
                    horizontalLineTo(8.9997f)
                    close()
                    moveTo(21.8797f, 21.5391f)
                    curveTo(21.8009f, 21.6801f, 21.6856f, 21.7973f, 21.5459f, 21.8784f)
                    curveTo(21.4062f, 21.9595f, 21.2473f, 22.0016f, 21.0857f, 22.0001f)
                    horizontalLineTo(17.3257f)
                    lineTo(11.9997f, 12.9871f)
                    lineTo(6.6737f, 22.0001f)
                    horizontalLineTo(2.9167f)
                    curveTo(2.7555f, 22.0003f, 2.5971f, 21.9578f, 2.4576f, 21.877f)
                    curveTo(2.3182f, 21.7962f, 2.2026f, 21.6798f, 2.1226f, 21.5399f)
                    curveTo(2.0427f, 21.3999f, 2.0012f, 21.2412f, 2.0025f, 21.08f)
                    curveTo(2.0037f, 20.9188f, 2.0476f, 20.7608f, 2.1297f, 20.6221f)
                    lineTo(11.9997f, 3.9191f)
                    lineTo(21.8697f, 20.6191f)
                    curveTo(21.9536f, 20.7576f, 21.9984f, 20.9162f, 21.9997f, 21.0781f)
                    curveTo(22.0009f, 21.24f, 21.9584f, 21.3993f, 21.8767f, 21.5391f)
                    horizontalLineTo(21.8797f)
                    close()
                }
            }
        }
        .build()
        return _camping!!
    }

private var _camping: ImageVector? = null
