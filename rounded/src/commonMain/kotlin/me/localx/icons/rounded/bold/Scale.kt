package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 2.0004f)
                    horizontalLineTo(16.475f)
                    curveTo(15.783f, 1.2129f, 14.8942f, 0.6233f, 13.8995f, 0.2921f)
                    curveTo(12.9048f, -0.0391f, 11.84f, -0.1001f, 10.814f, 0.1154f)
                    curveTo(9.5635f, 0.3705f, 8.433f, 1.0335f, 7.6f, 2.0004f)
                    horizontalLineTo(5.0f)
                    curveTo(2.1f, 2.0004f, 0.0f, 4.3134f, 0.0f, 7.5004f)
                    verticalLineTo(18.5004f)
                    curveTo(0.0019f, 19.9585f, 0.5819f, 21.3564f, 1.613f, 22.3874f)
                    curveTo(2.644f, 23.4185f, 4.0419f, 23.9986f, 5.5f, 24.0004f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9581f, 23.9986f, 21.356f, 23.4185f, 22.387f, 22.3874f)
                    curveTo(23.4181f, 21.3564f, 23.9981f, 19.9585f, 24.0f, 18.5004f)
                    verticalLineTo(7.5004f)
                    curveTo(23.9981f, 6.0423f, 23.4181f, 4.6444f, 22.387f, 3.6134f)
                    curveTo(21.356f, 2.5823f, 19.9581f, 2.0023f, 18.5f, 2.0004f)
                    close()
                    moveTo(21.0f, 18.5004f)
                    curveTo(21.0f, 19.1635f, 20.7366f, 19.7993f, 20.2678f, 20.2682f)
                    curveTo(19.7989f, 20.737f, 19.163f, 21.0004f, 18.5f, 21.0004f)
                    horizontalLineTo(5.5f)
                    curveTo(4.837f, 21.0004f, 4.2011f, 20.737f, 3.7322f, 20.2682f)
                    curveTo(3.2634f, 19.7993f, 3.0f, 19.1635f, 3.0f, 18.5004f)
                    verticalLineTo(7.5004f)
                    curveTo(3.0f, 7.0834f, 3.1f, 5.0004f, 5.0f, 5.0004f)
                    horizontalLineTo(6.135f)
                    curveTo(6.0563f, 5.4003f, 6.0155f, 5.8068f, 6.013f, 6.2144f)
                    curveTo(6.0142f, 6.9374f, 6.2967f, 7.6316f, 6.8006f, 8.15f)
                    curveTo(7.3045f, 8.6685f, 7.9903f, 8.9706f, 8.713f, 8.9924f)
                    lineTo(11.249f, 4.6694f)
                    curveTo(11.4697f, 4.3379f, 11.813f, 4.1076f, 12.2034f, 4.0292f)
                    curveTo(12.5939f, 3.9508f, 12.9995f, 4.0307f, 13.331f, 4.2514f)
                    curveTo(13.6625f, 4.4721f, 13.8928f, 4.8154f, 13.9712f, 5.2058f)
                    curveTo(14.0496f, 5.5963f, 13.9697f, 6.0019f, 13.749f, 6.3334f)
                    lineTo(12.316f, 9.0004f)
                    horizontalLineTo(15.228f)
                    curveTo(15.6164f, 9.0151f, 16.0033f, 8.9457f, 16.3624f, 8.7971f)
                    curveTo(16.7215f, 8.6485f, 17.0443f, 8.4241f, 17.3087f, 8.1393f)
                    curveTo(17.5731f, 7.8545f, 17.7729f, 7.5159f, 17.8945f, 7.1468f)
                    curveTo(18.016f, 6.7776f, 18.0565f, 6.3866f, 18.013f, 6.0004f)
                    curveTo(18.013f, 6.0164f, 17.976f, 5.3374f, 17.921f, 5.0004f)
                    horizontalLineTo(18.5f)
                    curveTo(19.163f, 5.0004f, 19.7989f, 5.2638f, 20.2678f, 5.7326f)
                    curveTo(20.7366f, 6.2015f, 21.0f, 6.8374f, 21.0f, 7.5004f)
                    verticalLineTo(18.5004f)
                    close()
                }
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
