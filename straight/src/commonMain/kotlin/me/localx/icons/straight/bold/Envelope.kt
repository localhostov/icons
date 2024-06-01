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

public val Icons.Bold.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 1.0002f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 1.0002f, 1.4413f, 1.3163f, 0.8787f, 1.8789f)
                    curveTo(0.3161f, 2.4415f, 0.0f, 3.2046f, 0.0f, 4.0002f)
                    lineTo(0.0f, 23.0002f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(4.0002f)
                    curveTo(24.0f, 3.2046f, 23.6839f, 2.4415f, 23.1213f, 1.8789f)
                    curveTo(22.5587f, 1.3163f, 21.7956f, 1.0002f, 21.0f, 1.0002f)
                    close()
                    moveTo(20.774f, 4.0002f)
                    lineTo(13.639f, 11.1352f)
                    curveTo(13.1975f, 11.5569f, 12.6105f, 11.7922f, 12.0f, 11.7922f)
                    curveTo(11.3895f, 11.7922f, 10.8025f, 11.5569f, 10.361f, 11.1352f)
                    lineTo(3.226f, 4.0002f)
                    horizontalLineTo(20.774f)
                    close()
                    moveTo(3.0f, 20.0002f)
                    verticalLineTo(8.0172f)
                    lineTo(8.239f, 13.2562f)
                    curveTo(8.7328f, 13.7502f, 9.319f, 14.1421f, 9.9642f, 14.4094f)
                    curveTo(10.6095f, 14.6768f, 11.3011f, 14.8144f, 11.9995f, 14.8144f)
                    curveTo(12.6979f, 14.8144f, 13.3895f, 14.6768f, 14.0348f, 14.4094f)
                    curveTo(14.68f, 14.1421f, 15.2662f, 13.7502f, 15.76f, 13.2562f)
                    lineTo(21.0f, 8.0172f)
                    verticalLineTo(20.0002f)
                    horizontalLineTo(3.0f)
                    close()
                }
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
