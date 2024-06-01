package me.localx.icons.rounded.outline

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

public val Icons.Outline.Cocktail: ImageVector
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
                    moveTo(23.517f, 2.087f)
                    curveTo(23.1719f, 1.4556f, 22.6633f, 0.9287f, 22.0445f, 0.5615f)
                    curveTo(21.4257f, 0.1943f, 20.7195f, 3.0E-4f, 20.0f, 0.0f)
                    lineTo(4.0f, 0.0f)
                    curveTo(3.2805f, 3.0E-4f, 2.5742f, 0.1943f, 1.9555f, 0.5615f)
                    curveTo(1.3367f, 0.9287f, 0.8281f, 1.4556f, 0.483f, 2.087f)
                    curveTo(0.1351f, 2.7086f, -0.0365f, 3.4134f, -0.0132f, 4.1254f)
                    curveTo(0.01f, 4.8373f, 0.2272f, 5.5294f, 0.615f, 6.127f)
                    curveTo(1.7871f, 7.8267f, 3.3319f, 9.2363f, 5.1317f, 10.2481f)
                    curveTo(6.9315f, 11.2598f, 8.9387f, 11.8471f, 11.0f, 11.965f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(7.0f)
                    curveTo(6.7348f, 22.0f, 6.4804f, 22.1054f, 6.2929f, 22.2929f)
                    curveTo(6.1054f, 22.4804f, 6.0f, 22.7348f, 6.0f, 23.0f)
                    curveTo(6.0f, 23.2652f, 6.1054f, 23.5196f, 6.2929f, 23.7071f)
                    curveTo(6.4804f, 23.8946f, 6.7348f, 24.0f, 7.0f, 24.0f)
                    horizontalLineTo(17.0f)
                    curveTo(17.2652f, 24.0f, 17.5196f, 23.8946f, 17.7071f, 23.7071f)
                    curveTo(17.8946f, 23.5196f, 18.0f, 23.2652f, 18.0f, 23.0f)
                    curveTo(18.0f, 22.7348f, 17.8946f, 22.4804f, 17.7071f, 22.2929f)
                    curveTo(17.5196f, 22.1054f, 17.2652f, 22.0f, 17.0f, 22.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(11.965f)
                    curveTo(15.0613f, 11.8471f, 17.0684f, 11.2598f, 18.8682f, 10.2481f)
                    curveTo(20.668f, 9.2363f, 22.2129f, 7.8267f, 23.385f, 6.127f)
                    curveTo(23.7727f, 5.5294f, 23.99f, 4.8373f, 24.0132f, 4.1254f)
                    curveTo(24.0365f, 3.4134f, 23.8649f, 2.7086f, 23.517f, 2.087f)
                    close()
                    moveTo(4.0f, 2.0f)
                    horizontalLineTo(20.0f)
                    curveTo(20.5304f, 2.0f, 21.0391f, 2.2107f, 21.4142f, 2.5858f)
                    curveTo(21.7893f, 2.9609f, 22.0f, 3.4696f, 22.0f, 4.0f)
                    horizontalLineTo(2.0f)
                    curveTo(2.0f, 3.4696f, 2.2107f, 2.9609f, 2.5858f, 2.5858f)
                    curveTo(2.9609f, 2.2107f, 3.4696f, 2.0f, 4.0f, 2.0f)
                    close()
                    moveTo(12.0f, 10.0f)
                    curveTo(10.3042f, 10.0059f, 8.6263f, 9.6525f, 7.0769f, 8.9631f)
                    curveTo(5.5276f, 8.2736f, 4.1418f, 7.2638f, 3.011f, 6.0f)
                    horizontalLineTo(20.989f)
                    curveTo(19.8584f, 7.2641f, 18.4727f, 8.2741f, 16.9233f, 8.9636f)
                    curveTo(15.3739f, 9.6531f, 13.6959f, 10.0063f, 12.0f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
