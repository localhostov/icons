package me.localx.icons.straight.filled

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

public val Icons.Filled.MaskCarnival: ImageVector
    get() {
        if (_maskCarnival != null) {
            return _maskCarnival!!
        }
        _maskCarnival = Builder(name = "MaskCarnival", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 10.0f)
                    curveTo(19.6134f, 10.0316f, 16.2503f, 10.5665f, 13.021f, 11.587f)
                    curveTo(13.238f, 8.549f, 15.828f, 7.0f, 19.0f, 7.0f)
                    curveTo(19.5304f, 7.0f, 20.0391f, 6.7893f, 20.4142f, 6.4142f)
                    curveTo(20.7893f, 6.0391f, 21.0f, 5.5304f, 21.0f, 5.0f)
                    curveTo(21.0f, 4.4696f, 20.7893f, 3.9609f, 20.4142f, 3.5858f)
                    curveTo(20.0391f, 3.2107f, 19.5304f, 3.0f, 19.0f, 3.0f)
                    curveTo(15.686f, 3.0f, 13.0f, 4.686f, 13.0f, 8.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(8.0f)
                    curveTo(11.0f, 4.686f, 8.314f, 3.0f, 5.0f, 3.0f)
                    curveTo(4.4696f, 3.0f, 3.9609f, 3.2107f, 3.5858f, 3.5858f)
                    curveTo(3.2107f, 3.9609f, 3.0f, 4.4696f, 3.0f, 5.0f)
                    curveTo(3.0f, 5.5304f, 3.2107f, 6.0391f, 3.5858f, 6.4142f)
                    curveTo(3.9609f, 6.7893f, 4.4696f, 7.0f, 5.0f, 7.0f)
                    curveTo(8.172f, 7.0f, 10.762f, 8.549f, 10.979f, 11.587f)
                    curveTo(7.7497f, 10.5666f, 4.3866f, 10.0318f, 1.0f, 10.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(11.0f)
                    curveTo(0.0f, 22.311f, 4.386f, 24.0f, 7.0f, 24.0f)
                    curveTo(8.1155f, 23.9402f, 9.1841f, 23.5316f, 10.055f, 22.832f)
                    curveTo(10.6059f, 22.3669f, 11.2832f, 22.0772f, 12.0f, 22.0f)
                    curveTo(12.7168f, 22.0772f, 13.3941f, 22.3669f, 13.945f, 22.832f)
                    curveTo(14.8159f, 23.5316f, 15.8845f, 23.9402f, 17.0f, 24.0f)
                    curveTo(19.614f, 24.0f, 24.0f, 22.311f, 24.0f, 11.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(23.0f)
                    close()
                    moveTo(6.123f, 19.362f)
                    curveTo(4.583f, 19.756f, 4.242f, 17.815f, 3.77f, 15.0f)
                    curveTo(5.9033f, 15.3428f, 7.9998f, 15.8848f, 10.032f, 16.619f)
                    lineTo(10.994f, 16.998f)
                    curveTo(8.761f, 17.216f, 7.3f, 19.061f, 6.123f, 19.362f)
                    close()
                    moveTo(17.849f, 19.362f)
                    curveTo(16.674f, 19.062f, 15.211f, 17.216f, 12.978f, 16.998f)
                    lineTo(13.94f, 16.619f)
                    curveTo(15.9715f, 15.885f, 18.0673f, 15.3429f, 20.2f, 15.0f)
                    curveTo(19.73f, 17.815f, 19.389f, 19.756f, 17.849f, 19.362f)
                    close()
                }
            }
        }
        .build()
        return _maskCarnival!!
    }

private var _maskCarnival: ImageVector? = null
