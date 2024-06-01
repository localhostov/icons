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

public val Icons.Bold.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.4998f, 0.0f)
                    horizontalLineTo(6.4998f)
                    curveTo(5.0417f, 0.0019f, 3.6439f, 0.5819f, 2.6128f, 1.613f)
                    curveTo(1.5818f, 2.644f, 1.0017f, 4.0419f, 0.9998f, 5.5f)
                    verticalLineTo(20.472f)
                    curveTo(1.0006f, 21.1724f, 1.2114f, 21.8564f, 1.6051f, 22.4356f)
                    curveTo(1.9988f, 23.0149f, 2.5572f, 23.4627f, 3.2081f, 23.7212f)
                    curveTo(3.8591f, 23.9796f, 4.5726f, 24.0369f, 5.2564f, 23.8855f)
                    curveTo(5.9402f, 23.7341f, 6.5628f, 23.3811f, 7.0438f, 22.872f)
                    lineTo(11.9558f, 17.672f)
                    lineTo(16.9688f, 22.922f)
                    curveTo(17.4514f, 23.4272f, 18.0741f, 23.7764f, 18.7567f, 23.9248f)
                    curveTo(19.4394f, 24.0731f, 20.1509f, 24.0137f, 20.7995f, 23.7543f)
                    curveTo(21.4482f, 23.4949f, 22.0044f, 23.0473f, 22.3965f, 22.4691f)
                    curveTo(22.7886f, 21.8909f, 22.9988f, 21.2086f, 22.9998f, 20.51f)
                    verticalLineTo(5.5f)
                    curveTo(22.998f, 4.0419f, 22.4179f, 2.644f, 21.3869f, 1.613f)
                    curveTo(20.3558f, 0.5819f, 18.958f, 0.0019f, 17.4998f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(19.9998f, 20.51f)
                    curveTo(19.9997f, 20.6097f, 19.9697f, 20.7071f, 19.9137f, 20.7896f)
                    curveTo(19.8577f, 20.8722f, 19.7784f, 20.9361f, 19.6858f, 20.9732f)
                    curveTo(19.5933f, 21.0103f, 19.4917f, 21.0188f, 19.3943f, 20.9978f)
                    curveTo(19.2968f, 20.9767f, 19.2078f, 20.927f, 19.1388f, 20.855f)
                    lineTo(13.0388f, 14.464f)
                    curveTo(12.8983f, 14.3168f, 12.7293f, 14.1998f, 12.5421f, 14.12f)
                    curveTo(12.3548f, 14.0403f, 12.1533f, 13.9994f, 11.9498f, 14.0f)
                    curveTo(11.7464f, 14.0006f, 11.5452f, 14.0426f, 11.3585f, 14.1234f)
                    curveTo(11.1718f, 14.2042f, 11.0035f, 14.3221f, 10.8638f, 14.47f)
                    lineTo(4.8639f, 20.815f)
                    curveTo(4.7969f, 20.8906f, 4.7077f, 20.9431f, 4.6091f, 20.9651f)
                    curveTo(4.5105f, 20.987f, 4.4075f, 20.9771f, 4.3148f, 20.937f)
                    curveTo(4.2194f, 20.9036f, 4.1372f, 20.8403f, 4.0805f, 20.7566f)
                    curveTo(4.0237f, 20.6728f, 3.9955f, 20.5731f, 3.9999f, 20.472f)
                    verticalLineTo(5.5f)
                    curveTo(3.9999f, 4.837f, 4.2632f, 4.2011f, 4.7321f, 3.7322f)
                    curveTo(5.2009f, 3.2634f, 5.8368f, 3.0f, 6.4998f, 3.0f)
                    horizontalLineTo(17.4998f)
                    curveTo(18.1629f, 3.0f, 18.7988f, 3.2634f, 19.2676f, 3.7322f)
                    curveTo(19.7365f, 4.2011f, 19.9998f, 4.837f, 19.9998f, 5.5f)
                    verticalLineTo(20.51f)
                    close()
                }
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
