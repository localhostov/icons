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

public val Icons.Filled.Ftp: ImageVector
    get() {
        if (_ftp != null) {
            return _ftp!!
        }
        _ftp = Builder(name = "Ftp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0f, 5.0f)
                    verticalLineTo(4.0f)
                    curveTo(3.0f, 2.9391f, 3.4214f, 1.9217f, 4.1716f, 1.1716f)
                    curveTo(4.9217f, 0.4214f, 5.9391f, 0.0f, 7.0f, 0.0f)
                    horizontalLineTo(8.47f)
                    curveTo(9.0771f, -5.0E-4f, 9.67f, 0.1836f, 10.17f, 0.528f)
                    lineTo(12.055f, 1.828f)
                    curveTo(12.222f, 1.9411f, 12.4193f, 2.0011f, 12.621f, 2.0f)
                    horizontalLineTo(17.0f)
                    curveTo(17.8842f, 2.0033f, 18.7424f, 2.2995f, 19.4404f, 2.8423f)
                    curveTo(20.1385f, 3.3851f, 20.637f, 4.1439f, 20.858f, 5.0f)
                    horizontalLineTo(3.0f)
                    close()
                    moveTo(23.0f, 20.0f)
                    horizontalLineTo(14.816f)
                    curveTo(14.6666f, 19.5818f, 14.4262f, 19.2019f, 14.1122f, 18.8879f)
                    curveTo(13.7981f, 18.5738f, 13.4182f, 18.3334f, 13.0f, 18.184f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(17.0f)
                    curveTo(18.0609f, 15.0f, 19.0783f, 14.5786f, 19.8284f, 13.8284f)
                    curveTo(20.5786f, 13.0783f, 21.0f, 12.0609f, 21.0f, 11.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(11.0f)
                    curveTo(3.0f, 12.0609f, 3.4214f, 13.0783f, 4.1716f, 13.8284f)
                    curveTo(4.9217f, 14.5786f, 5.9391f, 15.0f, 7.0f, 15.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(18.184f)
                    curveTo(10.5818f, 18.3334f, 10.2019f, 18.5738f, 9.8878f, 18.8879f)
                    curveTo(9.5738f, 19.2019f, 9.3334f, 19.5818f, 9.184f, 20.0f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 20.0f, 0.4804f, 20.1054f, 0.2929f, 20.2929f)
                    curveTo(0.1054f, 20.4804f, 0.0f, 20.7348f, 0.0f, 21.0f)
                    curveTo(0.0f, 21.2652f, 0.1054f, 21.5196f, 0.2929f, 21.7071f)
                    curveTo(0.4804f, 21.8946f, 0.7348f, 22.0f, 1.0f, 22.0f)
                    horizontalLineTo(9.184f)
                    curveTo(9.3876f, 22.5845f, 9.7682f, 23.0912f, 10.2727f, 23.4498f)
                    curveTo(10.7773f, 23.8083f, 11.381f, 24.001f, 12.0f, 24.001f)
                    curveTo(12.619f, 24.001f, 13.2227f, 23.8083f, 13.7273f, 23.4498f)
                    curveTo(14.2318f, 23.0912f, 14.6124f, 22.5845f, 14.816f, 22.0f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 22.0f, 23.5196f, 21.8946f, 23.7071f, 21.7071f)
                    curveTo(23.8946f, 21.5196f, 24.0f, 21.2652f, 24.0f, 21.0f)
                    curveTo(24.0f, 20.7348f, 23.8946f, 20.4804f, 23.7071f, 20.2929f)
                    curveTo(23.5196f, 20.1054f, 23.2652f, 20.0f, 23.0f, 20.0f)
                    close()
                }
            }
        }
        .build()
        return _ftp!!
    }

private var _ftp: ImageVector? = null
