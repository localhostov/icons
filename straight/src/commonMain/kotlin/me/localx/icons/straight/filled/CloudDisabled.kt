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

public val Icons.Filled.CloudDisabled: ImageVector
    get() {
        if (_cloudDisabled != null) {
            return _cloudDisabled!!
        }
        _cloudDisabled = Builder(name = "CloudDisabled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.855f, 20.4408f)
                    lineTo(23.955f, 22.5408f)
                    lineTo(22.541f, 23.9548f)
                    lineTo(0.043f, 1.4569f)
                    lineTo(1.457f, 0.0428f)
                    lineTo(4.557f, 3.1428f)
                    curveTo(5.584f, 2.1864f, 6.8448f, 1.5173f, 8.2126f, 1.203f)
                    curveTo(9.5804f, 0.8886f, 11.0068f, 0.9402f, 12.3483f, 1.3524f)
                    curveTo(13.6899f, 1.7646f, 14.8991f, 2.5229f, 15.8544f, 3.551f)
                    curveTo(16.8097f, 4.5791f, 17.4773f, 5.8407f, 17.79f, 7.2088f)
                    curveTo(19.1584f, 7.521f, 20.4204f, 8.1883f, 21.4488f, 9.1434f)
                    curveTo(22.4772f, 10.0986f, 23.2357f, 11.308f, 23.6479f, 12.6497f)
                    curveTo(24.0601f, 13.9913f, 24.1114f, 15.4179f, 23.7966f, 16.7858f)
                    curveTo(23.4819f, 18.1536f, 22.8122f, 19.4143f, 21.855f, 20.4408f)
                    close()
                    moveTo(2.0f, 8.9999f)
                    curveTo(1.999f, 10.2783f, 2.3078f, 11.5379f, 2.9f, 12.6708f)
                    curveTo(1.8211f, 13.249f, 0.9664f, 14.1711f, 0.4716f, 15.2906f)
                    curveTo(-0.0231f, 16.4102f, -0.1296f, 17.663f, 0.1692f, 18.85f)
                    curveTo(0.468f, 20.037f, 1.1549f, 21.0901f, 2.1207f, 21.842f)
                    curveTo(3.0866f, 22.5938f, 4.276f, 23.0014f, 5.5f, 22.9998f)
                    horizontalLineTo(16.0f)
                    curveTo(16.8093f, 22.9972f, 17.6134f, 22.8718f, 18.385f, 22.6278f)
                    lineTo(2.372f, 6.6139f)
                    curveTo(2.128f, 7.3858f, 2.0026f, 8.1903f, 2.0f, 8.9999f)
                    close()
                }
            }
        }
        .build()
        return _cloudDisabled!!
    }

private var _cloudDisabled: ImageVector? = null
