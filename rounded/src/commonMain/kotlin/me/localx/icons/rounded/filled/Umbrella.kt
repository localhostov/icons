package me.localx.icons.rounded.filled

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

public val Icons.Filled.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.7172f, 9.549f)
                    curveTo(22.7682f, 7.4517f, 21.2725f, 5.6483f, 19.387f, 4.3277f)
                    curveTo(17.5015f, 3.0071f, 15.2955f, 2.218f, 13.0002f, 2.043f)
                    verticalLineTo(1.0f)
                    curveTo(13.0002f, 0.7348f, 12.8948f, 0.4804f, 12.7073f, 0.2929f)
                    curveTo(12.5197f, 0.1054f, 12.2654f, 0.0f, 12.0002f, 0.0f)
                    curveTo(11.735f, 0.0f, 11.4806f, 0.1054f, 11.2931f, 0.2929f)
                    curveTo(11.1055f, 0.4804f, 11.0002f, 0.7348f, 11.0002f, 1.0f)
                    verticalLineTo(2.043f)
                    curveTo(8.7023f, 2.2162f, 6.4934f, 3.0044f, 4.605f, 4.325f)
                    curveTo(2.7166f, 5.6457f, 1.2183f, 7.45f, 0.2672f, 9.549f)
                    curveTo(0.0281f, 10.149f, -0.06f, 10.7985f, 0.0107f, 11.4405f)
                    curveTo(0.0813f, 12.0825f, 0.3084f, 12.6973f, 0.6722f, 13.231f)
                    curveTo(1.0398f, 13.7757f, 1.5354f, 14.2218f, 2.1157f, 14.5303f)
                    curveTo(2.696f, 14.8387f, 3.343f, 15.0f, 4.0002f, 15.0f)
                    horizontalLineTo(11.0002f)
                    verticalLineTo(21.0f)
                    curveTo(11.0002f, 21.2652f, 10.8948f, 21.5196f, 10.7073f, 21.7071f)
                    curveTo(10.5197f, 21.8946f, 10.2654f, 22.0f, 10.0002f, 22.0f)
                    curveTo(9.735f, 22.0f, 9.4806f, 21.8946f, 9.2931f, 21.7071f)
                    curveTo(9.1055f, 21.5196f, 9.0002f, 21.2652f, 9.0002f, 21.0f)
                    curveTo(9.0002f, 20.7348f, 8.8948f, 20.4804f, 8.7073f, 20.2929f)
                    curveTo(8.5197f, 20.1054f, 8.2654f, 20.0f, 8.0002f, 20.0f)
                    curveTo(7.735f, 20.0f, 7.4806f, 20.1054f, 7.2931f, 20.2929f)
                    curveTo(7.1055f, 20.4804f, 7.0002f, 20.7348f, 7.0002f, 21.0f)
                    curveTo(7.0002f, 21.7956f, 7.3162f, 22.5587f, 7.8788f, 23.1213f)
                    curveTo(8.4415f, 23.6839f, 9.2045f, 24.0f, 10.0002f, 24.0f)
                    curveTo(10.7958f, 24.0f, 11.5589f, 23.6839f, 12.1215f, 23.1213f)
                    curveTo(12.6841f, 22.5587f, 13.0002f, 21.7956f, 13.0002f, 21.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(19.9832f)
                    curveTo(20.6404f, 15.0f, 21.2877f, 14.8387f, 21.8681f, 14.5303f)
                    curveTo(22.4485f, 14.2218f, 22.9444f, 13.7757f, 23.3122f, 13.231f)
                    curveTo(23.6757f, 12.6972f, 23.9027f, 12.0824f, 23.9733f, 11.4404f)
                    curveTo(24.0439f, 10.7985f, 23.956f, 10.149f, 23.7172f, 9.549f)
                    close()
                }
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
