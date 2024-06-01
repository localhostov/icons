package me.localx.icons.straight.bold

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

public val Icons.Bold.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.1221f, 0.8787f)
                    curveTo(22.7921f, 0.5464f, 22.3884f, 0.2966f, 21.9438f, 0.1494f)
                    curveTo(21.4992f, 0.0022f, 21.0262f, -0.0381f, 20.5631f, 0.0317f)
                    curveTo(14.8194f, 0.9394f, 9.4922f, 3.5868f, 5.3001f, 7.6167f)
                    curveTo(4.0142f, 8.9043f, 3.2149f, 10.5982f, 3.0383f, 12.4094f)
                    curveTo(2.8618f, 14.2206f, 3.3191f, 16.0369f, 4.3321f, 17.5487f)
                    lineTo(0.0641f, 21.8137f)
                    lineTo(2.1861f, 23.9357f)
                    lineTo(6.4541f, 19.6667f)
                    curveTo(7.7169f, 20.5289f, 9.21f, 20.991f, 10.7391f, 20.9927f)
                    curveTo(11.862f, 20.9883f, 12.9725f, 20.7567f, 14.0036f, 20.3119f)
                    curveTo(15.0347f, 19.8672f, 15.9652f, 19.2184f, 16.7391f, 18.4047f)
                    curveTo(20.575f, 14.231f, 23.0905f, 9.0158f, 23.9691f, 3.4157f)
                    curveTo(24.0372f, 2.956f, 23.996f, 2.4867f, 23.8488f, 2.0459f)
                    curveTo(23.7017f, 1.6051f, 23.4527f, 1.2052f, 23.1221f, 0.8787f)
                    close()
                    moveTo(6.0061f, 13.4197f)
                    curveTo(5.9736f, 12.7406f, 6.0829f, 12.0622f, 6.3268f, 11.4276f)
                    curveTo(6.5708f, 10.793f, 6.9441f, 10.2161f, 7.4231f, 9.7337f)
                    curveTo(7.6121f, 9.5447f, 7.8071f, 9.3717f, 8.0001f, 9.1927f)
                    verticalLineTo(13.8787f)
                    lineTo(6.5121f, 15.3667f)
                    curveTo(6.2094f, 14.7601f, 6.037f, 14.0969f, 6.0061f, 13.4197f)
                    close()
                    moveTo(14.5721f, 16.3307f)
                    curveTo(13.8333f, 17.1322f, 12.8584f, 17.6776f, 11.7887f, 17.8878f)
                    curveTo(10.7191f, 18.098f, 9.6103f, 17.962f, 8.6231f, 17.4997f)
                    lineTo(13.1231f, 12.9997f)
                    horizontalLineTo(17.1841f)
                    curveTo(16.4221f, 14.1911f, 15.5475f, 15.3066f, 14.5721f, 16.3307f)
                    close()
                    moveTo(18.8361f, 9.9997f)
                    horizontalLineTo(16.1211f)
                    lineTo(18.0611f, 8.0607f)
                    lineTo(15.9391f, 5.9387f)
                    lineTo(11.0001f, 10.8787f)
                    verticalLineTo(6.8527f)
                    curveTo(14.0384f, 4.903f, 17.4401f, 3.589f, 21.0001f, 2.9897f)
                    curveTo(20.6073f, 5.4154f, 19.8789f, 7.7746f, 18.8361f, 9.9997f)
                    close()
                }
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
