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

public val Icons.Filled.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.4201f, 20.656f)
                    curveTo(9.6165f, 20.6553f, 8.8341f, 20.3977f, 8.1871f, 19.921f)
                    lineTo(1.5461f, 15.051f)
                    curveTo(1.0674f, 14.6995f, 0.6782f, 14.2402f, 0.4099f, 13.7103f)
                    curveTo(0.1416f, 13.1805f, 0.0018f, 12.5949f, 0.0018f, 12.001f)
                    curveTo(0.0018f, 11.4071f, 0.1416f, 10.8215f, 0.4099f, 10.2917f)
                    curveTo(0.6782f, 9.7618f, 1.0674f, 9.3025f, 1.5461f, 8.951f)
                    lineTo(8.1871f, 4.081f)
                    curveTo(8.7318f, 3.6807f, 9.3738f, 3.4337f, 10.0463f, 3.3657f)
                    curveTo(10.7188f, 3.2976f, 11.3972f, 3.4109f, 12.011f, 3.6939f)
                    curveTo(12.6249f, 3.9769f, 13.1517f, 4.4192f, 13.5367f, 4.9748f)
                    curveTo(13.9216f, 5.5303f, 14.1507f, 6.1789f, 14.2001f, 6.853f)
                    lineTo(17.9821f, 4.079f)
                    curveTo(18.546f, 3.6665f, 19.2131f, 3.4183f, 19.9094f, 3.3616f)
                    curveTo(20.6057f, 3.305f, 21.3041f, 3.4422f, 21.9272f, 3.7581f)
                    curveTo(22.5503f, 4.074f, 23.0738f, 4.5563f, 23.4397f, 5.1514f)
                    curveTo(23.8056f, 5.7466f, 23.9996f, 6.4314f, 24.0001f, 7.13f)
                    verticalLineTo(16.87f)
                    curveTo(24.0f, 17.5691f, 23.8061f, 18.2545f, 23.4401f, 18.8502f)
                    curveTo(23.074f, 19.4458f, 22.5502f, 19.9284f, 21.9265f, 20.2444f)
                    curveTo(21.3029f, 20.5604f, 20.6039f, 20.6975f, 19.9071f, 20.6404f)
                    curveTo(19.2104f, 20.5833f, 18.543f, 20.3343f, 17.9791f, 19.921f)
                    lineTo(14.2001f, 17.147f)
                    curveTo(14.1293f, 18.1005f, 13.7006f, 18.9919f, 13.0002f, 19.6426f)
                    curveTo(12.2997f, 20.2934f, 11.3792f, 20.6553f, 10.4231f, 20.656f)
                    horizontalLineTo(10.4201f)
                    close()
                }
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
