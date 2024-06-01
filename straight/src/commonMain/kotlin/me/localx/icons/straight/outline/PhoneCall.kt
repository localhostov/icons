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

public val Icons.Outline.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.2002f, 16.261f)
                    curveTo(11.2886f, 15.0282f, 8.9733f, 12.7075f, 7.7472f, 9.793f)
                    lineTo(11.1472f, 6.387f)
                    lineTo(4.8872f, 0.122f)
                    lineTo(1.7162f, 3.292f)
                    curveTo(1.1662f, 3.8451f, 0.7314f, 4.5019f, 0.4368f, 5.2242f)
                    curveTo(0.1423f, 5.9465f, -0.0061f, 6.72f, 2.0E-4f, 7.5f)
                    curveTo(2.0E-4f, 14.748f, 9.2522f, 24.0f, 16.5002f, 24.0f)
                    curveTo(17.2801f, 24.0068f, 18.0537f, 23.8586f, 18.7759f, 23.5641f)
                    curveTo(19.4981f, 23.2695f, 20.1545f, 22.8344f, 20.7072f, 22.284f)
                    lineTo(23.8782f, 19.113f)
                    lineTo(17.6132f, 12.848f)
                    lineTo(14.2002f, 16.261f)
                    close()
                    moveTo(19.2922f, 20.87f)
                    curveTo(18.925f, 21.234f, 18.489f, 21.5214f, 18.0097f, 21.7154f)
                    curveTo(17.5304f, 21.9094f, 17.0173f, 22.0061f, 16.5002f, 22.0f)
                    curveTo(10.2672f, 22.0f, 2.0002f, 13.733f, 2.0002f, 7.5f)
                    curveTo(1.9943f, 6.9828f, 2.0912f, 6.4696f, 2.2852f, 5.9902f)
                    curveTo(2.4791f, 5.5107f, 2.7664f, 5.0746f, 3.1302f, 4.707f)
                    lineTo(4.8872f, 2.95f)
                    lineTo(8.3242f, 6.387f)
                    lineTo(5.3892f, 9.322f)
                    lineTo(5.6342f, 9.936f)
                    curveTo(6.3555f, 11.8653f, 7.483f, 13.6171f, 8.9404f, 15.0725f)
                    curveTo(10.3977f, 16.528f, 12.151f, 17.6533f, 14.0812f, 18.372f)
                    lineTo(14.6872f, 18.603f)
                    lineTo(17.6132f, 15.676f)
                    lineTo(21.0502f, 19.113f)
                    lineTo(19.2922f, 20.87f)
                    close()
                    moveTo(14.0002f, 2.0f)
                    verticalLineTo(0.0f)
                    curveTo(16.6515f, 0.0029f, 19.1933f, 1.0574f, 21.0681f, 2.9321f)
                    curveTo(22.9428f, 4.8069f, 23.9973f, 7.3487f, 24.0002f, 10.0f)
                    horizontalLineTo(22.0002f)
                    curveTo(21.9978f, 7.879f, 21.1542f, 5.8456f, 19.6544f, 4.3458f)
                    curveTo(18.1547f, 2.846f, 16.1212f, 2.0024f, 14.0002f, 2.0f)
                    close()
                    moveTo(14.0002f, 6.0f)
                    verticalLineTo(4.0f)
                    curveTo(15.591f, 4.0016f, 17.1162f, 4.6342f, 18.2411f, 5.7591f)
                    curveTo(19.366f, 6.884f, 19.9986f, 8.4092f, 20.0002f, 10.0f)
                    horizontalLineTo(18.0002f)
                    curveTo(18.0002f, 8.9391f, 17.5788f, 7.9217f, 16.8286f, 7.1716f)
                    curveTo(16.0785f, 6.4214f, 15.0611f, 6.0f, 14.0002f, 6.0f)
                    close()
                }
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
