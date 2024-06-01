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

public val Icons.Filled.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0001f, 13.5004f)
                    curveTo(24.0001f, 13.8287f, 23.9355f, 14.1538f, 23.8098f, 14.4571f)
                    curveTo(23.6842f, 14.7604f, 23.5f, 15.036f, 23.2679f, 15.2682f)
                    curveTo(23.0357f, 15.5003f, 22.7601f, 15.6845f, 22.4568f, 15.8101f)
                    curveTo(22.1535f, 15.9357f, 21.8284f, 16.0004f, 21.5001f, 16.0004f)
                    horizontalLineTo(17.4641f)
                    lineTo(13.2381f, 22.4874f)
                    curveTo(12.978f, 22.9488f, 12.5994f, 23.3323f, 12.1414f, 23.5983f)
                    curveTo(11.6835f, 23.8643f, 11.1627f, 24.0031f, 10.6331f, 24.0004f)
                    curveTo(10.2082f, 24.0005f, 9.7895f, 23.8976f, 9.4131f, 23.7005f)
                    curveTo(9.0366f, 23.5035f, 8.7135f, 23.218f, 8.4715f, 22.8688f)
                    curveTo(8.2295f, 22.5195f, 8.0757f, 22.1167f, 8.0234f, 21.695f)
                    curveTo(7.9711f, 21.2733f, 8.0218f, 20.8452f, 8.1711f, 20.4474f)
                    lineTo(10.0191f, 16.0004f)
                    horizontalLineTo(6.0001f)
                    curveTo(5.295f, 16.0004f, 4.6024f, 15.8141f, 3.9925f, 15.4602f)
                    curveTo(3.3826f, 15.1064f, 2.877f, 14.5976f, 2.5271f, 13.9854f)
                    lineTo(0.2001f, 10.1604f)
                    curveTo(0.1007f, 9.9953f, 0.0353f, 9.8119f, 0.0079f, 9.6212f)
                    curveTo(-0.0195f, 9.4304f, -0.0084f, 9.236f, 0.0406f, 9.0496f)
                    curveTo(0.0895f, 8.8632f, 0.1753f, 8.6884f, 0.2929f, 8.5357f)
                    curveTo(0.4104f, 8.383f, 0.5574f, 8.2554f, 0.7251f, 8.1604f)
                    curveTo(0.9913f, 8.0209f, 1.295f, 7.9699f, 1.5921f, 8.0148f)
                    curveTo(1.8892f, 8.0598f, 2.1642f, 8.1984f, 2.3771f, 8.4104f)
                    lineTo(3.7941f, 9.8284f)
                    curveTo(4.5441f, 10.5786f, 5.5613f, 11.0002f, 6.6221f, 11.0004f)
                    horizontalLineTo(21.5001f)
                    curveTo(21.8284f, 11.0004f, 22.1535f, 11.0651f, 22.4568f, 11.1907f)
                    curveTo(22.7601f, 11.3163f, 23.0357f, 11.5005f, 23.2679f, 11.7326f)
                    curveTo(23.5f, 11.9648f, 23.6842f, 12.2404f, 23.8098f, 12.5437f)
                    curveTo(23.9355f, 12.847f, 24.0001f, 13.1721f, 24.0001f, 13.5004f)
                    close()
                    moveTo(17.7311f, 9.0004f)
                    lineTo(13.2311f, 1.5134f)
                    curveTo(12.9714f, 1.0524f, 12.5932f, 0.6691f, 12.1358f, 0.4031f)
                    curveTo(11.6784f, 0.1372f, 11.1583f, -0.0019f, 10.6291f, 4.0E-4f)
                    curveTo(10.2043f, 5.0E-4f, 9.7858f, 0.1036f, 9.4094f, 0.3007f)
                    curveTo(9.0331f, 0.4979f, 8.7101f, 0.7832f, 8.4681f, 1.1324f)
                    curveTo(8.2261f, 1.4817f, 8.0723f, 1.8843f, 8.0199f, 2.3059f)
                    curveTo(7.9675f, 2.7275f, 8.018f, 3.1556f, 8.1671f, 3.5534f)
                    lineTo(10.2851f, 9.0004f)
                    horizontalLineTo(17.7311f)
                    close()
                }
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
