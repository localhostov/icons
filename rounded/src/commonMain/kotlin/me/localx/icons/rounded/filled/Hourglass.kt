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

public val Icons.Filled.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0002f, 24.0f)
                    horizontalLineTo(7.0051f)
                    curveTo(6.4268f, 23.9994f, 5.8553f, 23.8741f, 5.3298f, 23.6325f)
                    curveTo(4.8043f, 23.3908f, 4.3371f, 23.0387f, 3.9602f, 22.6f)
                    curveTo(3.5893f, 22.1705f, 3.3155f, 21.666f, 3.1574f, 21.121f)
                    curveTo(2.9994f, 20.576f, 2.9607f, 20.0033f, 3.0442f, 19.442f)
                    curveTo(3.5807f, 16.5173f, 5.1408f, 13.8792f, 7.4451f, 12.0f)
                    curveTo(5.1407f, 10.1202f, 3.5809f, 7.4812f, 3.0452f, 4.556f)
                    curveTo(2.9619f, 3.9951f, 3.0005f, 3.4228f, 3.1584f, 2.8782f)
                    curveTo(3.3163f, 2.3336f, 3.5898f, 1.8294f, 3.9602f, 1.4f)
                    curveTo(4.3371f, 0.9613f, 4.8043f, 0.6092f, 5.3298f, 0.3675f)
                    curveTo(5.8553f, 0.1259f, 6.4268f, 6.0E-4f, 7.0051f, 0.0f)
                    lineTo(17.0002f, 0.0f)
                    curveTo(17.5784f, 5.0E-4f, 18.1497f, 0.1259f, 18.6751f, 0.3675f)
                    curveTo(19.2004f, 0.6091f, 19.6674f, 0.9613f, 20.0442f, 1.4f)
                    curveTo(20.415f, 1.829f, 20.689f, 2.3328f, 20.8475f, 2.8773f)
                    curveTo(21.0059f, 3.4218f, 21.045f, 3.994f, 20.9622f, 4.555f)
                    curveTo(20.4205f, 7.4809f, 18.8572f, 10.1194f, 16.5512f, 12.0f)
                    curveTo(18.8559f, 13.8822f, 20.4174f, 16.5217f, 20.9572f, 19.448f)
                    curveTo(21.0401f, 20.0091f, 21.001f, 20.5815f, 20.8426f, 21.1262f)
                    curveTo(20.6842f, 21.6708f, 20.4101f, 22.1749f, 20.0392f, 22.604f)
                    curveTo(19.6626f, 23.0413f, 19.1963f, 23.3924f, 18.6718f, 23.6333f)
                    curveTo(18.1474f, 23.8742f, 17.5773f, 23.9993f, 17.0002f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
