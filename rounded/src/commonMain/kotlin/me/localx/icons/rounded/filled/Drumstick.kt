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

public val Icons.Filled.Drumstick: ImageVector
    get() {
        if (_drumstick != null) {
            return _drumstick!!
        }
        _drumstick = Builder(name = "Drumstick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.5f, 2.5f)
                    curveTo(19.8937f, 0.9084f, 17.7238f, 0.0155f, 15.4625f, 0.0155f)
                    curveTo(13.2012f, 0.0155f, 11.0314f, 0.9084f, 9.425f, 2.5f)
                    curveTo(7.048f, 4.877f, 6.268f, 10.409f, 6.015f, 13.5f)
                    curveTo(5.9455f, 14.3685f, 6.1501f, 15.2369f, 6.6f, 15.983f)
                    lineTo(2.8f, 19.783f)
                    curveTo(2.6589f, 19.5249f, 2.4451f, 19.314f, 2.185f, 19.1765f)
                    curveTo(1.925f, 19.039f, 1.6302f, 18.981f, 1.3375f, 19.0097f)
                    curveTo(1.0447f, 19.0384f, 0.7669f, 19.1525f, 0.5385f, 19.3379f)
                    curveTo(0.3101f, 19.5233f, 0.1413f, 19.7718f, 0.053f, 20.0524f)
                    curveTo(-0.0353f, 20.333f, -0.0391f, 20.6333f, 0.042f, 20.9161f)
                    curveTo(0.1231f, 21.1989f, 0.2856f, 21.4515f, 0.5092f, 21.6427f)
                    curveTo(0.7327f, 21.8338f, 1.0076f, 21.955f, 1.2995f, 21.9911f)
                    curveTo(1.5915f, 22.0273f, 1.8876f, 21.9768f, 2.151f, 21.846f)
                    curveTo(2.0202f, 22.1094f, 1.9697f, 22.4056f, 2.0059f, 22.6975f)
                    curveTo(2.042f, 22.9894f, 2.1632f, 23.2643f, 2.3544f, 23.4879f)
                    curveTo(2.5455f, 23.7114f, 2.7982f, 23.8739f, 3.0809f, 23.955f)
                    curveTo(3.3637f, 24.0361f, 3.664f, 24.0323f, 3.9446f, 23.944f)
                    curveTo(4.2252f, 23.8557f, 4.4737f, 23.6869f, 4.6591f, 23.4585f)
                    curveTo(4.8445f, 23.2301f, 4.9586f, 22.9523f, 4.9873f, 22.6595f)
                    curveTo(5.016f, 22.3668f, 4.958f, 22.0721f, 4.8205f, 21.812f)
                    curveTo(4.6831f, 21.552f, 4.4721f, 21.3381f, 4.214f, 21.197f)
                    lineTo(8.014f, 17.397f)
                    curveTo(8.7589f, 17.8514f, 9.6283f, 18.0586f, 10.498f, 17.989f)
                    curveTo(13.584f, 17.736f, 19.115f, 16.957f, 21.498f, 14.579f)
                    curveTo(23.0913f, 12.9729f, 23.9856f, 10.8023f, 23.9859f, 8.5399f)
                    curveTo(23.9863f, 6.2776f, 23.0928f, 4.1067f, 21.5f, 2.5f)
                    close()
                }
            }
        }
        .build()
        return _drumstick!!
    }

private var _drumstick: ImageVector? = null
