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

public val Icons.Bold.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.375f, 0.065f)
                    curveTo(21.037f, 0.12f, 9.179f, 0.721f, 4.92f, 4.979f)
                    curveTo(3.2423f, 6.67f, 2.222f, 8.9035f, 2.0422f, 11.2788f)
                    curveTo(1.8624f, 13.6541f, 2.5349f, 16.0157f, 3.939f, 17.94f)
                    lineTo(0.007f, 21.879f)
                    lineTo(2.128f, 24.0f)
                    lineTo(6.06f, 20.061f)
                    curveTo(7.9844f, 21.4649f, 10.346f, 22.1373f, 12.7212f, 21.9575f)
                    curveTo(15.0964f, 21.7777f, 17.3299f, 20.7576f, 19.021f, 19.08f)
                    curveTo(23.363f, 14.738f, 23.889f, 2.946f, 23.935f, 1.616f)
                    lineTo(23.991f, 0.0f)
                    lineTo(22.375f, 0.065f)
                    close()
                    moveTo(16.9f, 16.958f)
                    curveTo(15.7744f, 18.0768f, 14.302f, 18.7798f, 12.7244f, 18.9519f)
                    curveTo(11.1467f, 19.124f, 9.5574f, 18.7548f, 8.217f, 17.905f)
                    lineTo(16.937f, 9.186f)
                    lineTo(14.814f, 7.064f)
                    lineTo(6.1f, 15.784f)
                    curveTo(5.2493f, 14.4441f, 4.8792f, 12.8549f, 5.0504f, 11.277f)
                    curveTo(5.2215f, 9.6992f, 5.9238f, 8.2263f, 7.042f, 7.1f)
                    curveTo(9.554f, 4.587f, 16.78f, 3.505f, 20.842f, 3.168f)
                    curveTo(20.523f, 7.206f, 19.465f, 14.393f, 16.9f, 16.958f)
                    close()
                }
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
