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

public val Icons.Bold.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.46f, 2.273f)
                    curveTo(23.084f, 1.5851f, 22.5298f, 1.0111f, 21.8556f, 0.6112f)
                    curveTo(21.1814f, 0.2113f, 20.4119f, 1.0E-4f, 19.628f, 0.0f)
                    lineTo(4.372f, 0.0f)
                    curveTo(3.5881f, 1.0E-4f, 2.8186f, 0.2113f, 2.1444f, 0.6112f)
                    curveTo(1.4702f, 1.0111f, 0.916f, 1.5851f, 0.54f, 2.273f)
                    curveTo(0.1603f, 2.9517f, -0.0269f, 3.7212f, -0.0016f, 4.4985f)
                    curveTo(0.0238f, 5.2758f, 0.2608f, 6.0315f, 0.684f, 6.684f)
                    curveTo(1.7815f, 8.3609f, 3.2254f, 9.7832f, 4.9186f, 10.8554f)
                    curveTo(6.6117f, 11.9276f, 8.5149f, 12.6248f, 10.5f, 12.9f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(7.5f)
                    curveTo(7.1022f, 21.0f, 6.7206f, 21.158f, 6.4393f, 21.4393f)
                    curveTo(6.158f, 21.7206f, 6.0f, 22.1022f, 6.0f, 22.5f)
                    curveTo(6.0f, 22.8978f, 6.158f, 23.2794f, 6.4393f, 23.5607f)
                    curveTo(6.7206f, 23.842f, 7.1022f, 24.0f, 7.5f, 24.0f)
                    horizontalLineTo(16.5f)
                    curveTo(16.8978f, 24.0f, 17.2793f, 23.842f, 17.5606f, 23.5607f)
                    curveTo(17.842f, 23.2794f, 18.0f, 22.8978f, 18.0f, 22.5f)
                    curveTo(18.0f, 22.1022f, 17.842f, 21.7206f, 17.5606f, 21.4393f)
                    curveTo(17.2793f, 21.158f, 16.8978f, 21.0f, 16.5f, 21.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(12.9f)
                    curveTo(15.4852f, 12.6247f, 17.3884f, 11.9274f, 19.0816f, 10.855f)
                    curveTo(20.7747f, 9.7826f, 22.2186f, 8.3601f, 23.316f, 6.683f)
                    curveTo(23.7389f, 6.0306f, 23.9759f, 5.2751f, 24.0012f, 4.498f)
                    curveTo(24.0266f, 3.7209f, 23.8395f, 2.9516f, 23.46f, 2.273f)
                    close()
                    moveTo(12.0f, 10.0f)
                    curveTo(10.2384f, 9.9289f, 8.5192f, 9.4381f, 6.9856f, 8.5684f)
                    curveTo(5.452f, 7.6987f, 4.1483f, 6.4753f, 3.183f, 5.0f)
                    horizontalLineTo(20.817f)
                    curveTo(19.8516f, 6.4752f, 18.5479f, 7.6986f, 17.0143f, 8.5683f)
                    curveTo(15.4807f, 9.438f, 13.7616f, 9.9288f, 12.0f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
