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

public val Icons.Filled.Label: ImageVector
    get() {
        if (_label != null) {
            return _label!!
        }
        _label = Builder(name = "Label", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.9999f, 7.177f)
                    verticalLineTo(19.0f)
                    curveTo(2.0015f, 20.3256f, 2.5288f, 21.5965f, 3.4661f, 22.5338f)
                    curveTo(4.4035f, 23.4712f, 5.6743f, 23.9985f, 6.9999f, 24.0f)
                    horizontalLineTo(16.9999f)
                    curveTo(18.3255f, 23.9985f, 19.5964f, 23.4712f, 20.5337f, 22.5338f)
                    curveTo(21.471f, 21.5965f, 21.9983f, 20.3256f, 21.9999f, 19.0f)
                    verticalLineTo(7.177f)
                    curveTo(21.9998f, 6.6421f, 21.8567f, 6.117f, 21.5854f, 5.6559f)
                    curveTo(21.3141f, 5.1949f, 20.9245f, 4.8148f, 20.4569f, 4.555f)
                    lineTo(12.4859f, 0.126f)
                    curveTo(12.3373f, 0.0434f, 12.17f, 0.0f, 11.9999f, 0.0f)
                    curveTo(11.8298f, 0.0f, 11.6626f, 0.0434f, 11.5139f, 0.126f)
                    lineTo(3.5429f, 4.555f)
                    curveTo(3.0753f, 4.8148f, 2.6857f, 5.1949f, 2.4144f, 5.6559f)
                    curveTo(2.1431f, 6.117f, 2.0f, 6.6421f, 1.9999f, 7.177f)
                    close()
                    moveTo(11.9999f, 5.5f)
                    curveTo(12.2966f, 5.5f, 12.5866f, 5.588f, 12.8333f, 5.7528f)
                    curveTo(13.0799f, 5.9177f, 13.2722f, 6.1519f, 13.3857f, 6.426f)
                    curveTo(13.4993f, 6.7001f, 13.529f, 7.0017f, 13.4711f, 7.2927f)
                    curveTo(13.4132f, 7.5837f, 13.2703f, 7.8509f, 13.0606f, 8.0607f)
                    curveTo(12.8508f, 8.2705f, 12.5835f, 8.4133f, 12.2925f, 8.4712f)
                    curveTo(12.0016f, 8.5291f, 11.7f, 8.4994f, 11.4259f, 8.3859f)
                    curveTo(11.1518f, 8.2723f, 10.9175f, 8.0801f, 10.7527f, 7.8334f)
                    curveTo(10.5879f, 7.5867f, 10.4999f, 7.2967f, 10.4999f, 7.0f)
                    curveTo(10.4999f, 6.6022f, 10.6579f, 6.2207f, 10.9392f, 5.9394f)
                    curveTo(11.2206f, 5.6581f, 11.6021f, 5.5f, 11.9999f, 5.5f)
                    close()
                }
            }
        }
        .build()
        return _label!!
    }

private var _label: ImageVector? = null
