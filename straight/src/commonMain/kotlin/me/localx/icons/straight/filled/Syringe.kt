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

public val Icons.Filled.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.5348f, 7.3241f)
                    lineTo(23.9648f, 5.9241f)
                    lineTo(18.2148f, 0.0511f)
                    lineTo(16.7848f, 1.4511f)
                    lineTo(19.0408f, 3.7511f)
                    lineTo(16.8618f, 5.7921f)
                    lineTo(15.9498f, 4.8791f)
                    curveTo(15.3887f, 4.3184f, 14.6283f, 4.0027f, 13.835f, 4.0012f)
                    curveTo(13.0417f, 3.9997f, 12.2801f, 4.3125f, 11.7168f, 4.8711f)
                    lineTo(14.9228f, 8.0771f)
                    lineTo(13.5088f, 9.4911f)
                    lineTo(10.2998f, 6.2841f)
                    lineTo(8.7158f, 7.8701f)
                    lineTo(11.9228f, 11.0771f)
                    lineTo(10.5088f, 12.4911f)
                    lineTo(7.2998f, 9.2841f)
                    lineTo(5.7158f, 10.8701f)
                    lineTo(8.9228f, 14.0771f)
                    lineTo(7.5089f, 15.4911f)
                    lineTo(4.2998f, 12.2841f)
                    lineTo(2.9999f, 13.5861f)
                    verticalLineTo(19.5861f)
                    lineTo(0.0428f, 22.5431f)
                    lineTo(1.4569f, 23.9571f)
                    lineTo(4.4138f, 21.0001f)
                    horizontalLineTo(10.4138f)
                    lineTo(19.1208f, 12.2931f)
                    curveTo(19.3995f, 12.0145f, 19.6205f, 11.6838f, 19.7713f, 11.3198f)
                    curveTo(19.9221f, 10.9557f, 19.9997f, 10.5656f, 19.9997f, 10.1716f)
                    curveTo(19.9997f, 9.7776f, 19.9221f, 9.3874f, 19.7713f, 9.0234f)
                    curveTo(19.6205f, 8.6594f, 19.3995f, 8.3287f, 19.1208f, 8.0501f)
                    lineTo(18.2768f, 7.2071f)
                    lineTo(20.4398f, 5.1841f)
                    lineTo(22.5348f, 7.3241f)
                    close()
                }
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
