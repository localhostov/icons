package me.localx.icons.straight.outline

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

public val Icons.Outline.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.7648f, 9.4571f)
                    lineTo(4.9798f, 0.0181f)
                    verticalLineTo(24.0181f)
                    lineTo(19.7588f, 14.5451f)
                    curveTo(20.189f, 14.2747f, 20.5437f, 13.8997f, 20.7897f, 13.4552f)
                    curveTo(21.0357f, 13.0106f, 21.165f, 12.5109f, 21.1656f, 12.0028f)
                    curveTo(21.1662f, 11.4947f, 21.0381f, 10.9947f, 20.7931f, 10.5495f)
                    curveTo(20.5481f, 10.1044f, 20.1944f, 9.7285f, 19.7648f, 9.4571f)
                    close()
                    moveTo(18.6848f, 12.8521f)
                    lineTo(6.9848f, 20.3521f)
                    verticalLineTo(3.6761f)
                    lineTo(18.6918f, 11.1501f)
                    curveTo(18.8361f, 11.2404f, 18.955f, 11.366f, 19.0372f, 11.5151f)
                    curveTo(19.1194f, 11.6642f, 19.1622f, 11.8318f, 19.1615f, 12.0021f)
                    curveTo(19.1608f, 12.1723f, 19.1167f, 12.3396f, 19.0332f, 12.488f)
                    curveTo(18.9498f, 12.6364f, 18.8299f, 12.761f, 18.6848f, 12.8501f)
                    verticalLineTo(12.8521f)
                    close()
                }
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
