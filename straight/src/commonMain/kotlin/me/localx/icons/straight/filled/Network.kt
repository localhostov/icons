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

public val Icons.Filled.Network: ImageVector
    get() {
        if (_network != null) {
            return _network!!
        }
        _network = Builder(name = "Network", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 22.0f)
                    horizontalLineTo(14.816f)
                    curveTo(14.6124f, 22.5845f, 14.2318f, 23.0912f, 13.7273f, 23.4498f)
                    curveTo(13.2227f, 23.8083f, 12.619f, 24.0009f, 12.0f, 24.0009f)
                    curveTo(11.381f, 24.0009f, 10.7773f, 23.8083f, 10.2727f, 23.4498f)
                    curveTo(9.7682f, 23.0912f, 9.3876f, 22.5845f, 9.184f, 22.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(9.184f)
                    curveTo(9.3334f, 19.5818f, 9.5738f, 19.2019f, 9.8878f, 18.8878f)
                    curveTo(10.2019f, 18.5738f, 10.5818f, 18.3334f, 11.0f, 18.184f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 14.0f, 3.4413f, 13.6839f, 2.8787f, 13.1213f)
                    curveTo(2.3161f, 12.5587f, 2.0f, 11.7956f, 2.0f, 11.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(8.586f)
                    lineTo(9.586f, 11.0f)
                    horizontalLineTo(14.414f)
                    lineTo(15.414f, 10.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(11.0f)
                    curveTo(22.0f, 11.7956f, 21.6839f, 12.5587f, 21.1213f, 13.1213f)
                    curveTo(20.5587f, 13.6839f, 19.7956f, 14.0f, 19.0f, 14.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(18.184f)
                    curveTo(13.4182f, 18.3334f, 13.7981f, 18.5738f, 14.1122f, 18.8878f)
                    curveTo(14.4262f, 19.2019f, 14.6666f, 19.5818f, 14.816f, 20.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(22.0f)
                    close()
                    moveTo(10.414f, 9.0f)
                    horizontalLineTo(13.586f)
                    lineTo(14.586f, 8.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(3.0f)
                    curveTo(21.0f, 2.2043f, 20.6839f, 1.4413f, 20.1213f, 0.8787f)
                    curveTo(19.5587f, 0.3161f, 18.7956f, 0.0f, 18.0f, 0.0f)
                    lineTo(6.0f, 0.0f)
                    curveTo(5.2043f, 0.0f, 4.4413f, 0.3161f, 3.8787f, 0.8787f)
                    curveTo(3.3161f, 1.4413f, 3.0f, 2.2043f, 3.0f, 3.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(9.414f)
                    lineTo(10.414f, 9.0f)
                    close()
                }
            }
        }
        .build()
        return _network!!
    }

private var _network: ImageVector? = null
