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
                    moveTo(21.0f, 5.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.0f)
                    curveTo(3.0f, 2.2043f, 3.3161f, 1.4413f, 3.8787f, 0.8787f)
                    curveTo(4.4413f, 0.3161f, 5.2043f, 0.0f, 6.0f, 0.0f)
                    lineTo(9.4f, 0.0f)
                    lineTo(12.31f, 2.0f)
                    horizontalLineTo(18.0f)
                    curveTo(18.7956f, 2.0f, 19.5587f, 2.3161f, 20.1213f, 2.8787f)
                    curveTo(20.6839f, 3.4413f, 21.0f, 4.2043f, 21.0f, 5.0f)
                    close()
                    moveTo(24.0f, 20.0f)
                    horizontalLineTo(14.816f)
                    curveTo(14.6666f, 19.5818f, 14.4262f, 19.2019f, 14.1122f, 18.8878f)
                    curveTo(13.7981f, 18.5738f, 13.4182f, 18.3334f, 13.0f, 18.184f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(18.184f)
                    curveTo(10.5818f, 18.3334f, 10.2019f, 18.5738f, 9.8878f, 18.8878f)
                    curveTo(9.5738f, 19.2019f, 9.3334f, 19.5818f, 9.184f, 20.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(9.184f)
                    curveTo(9.3876f, 22.5845f, 9.7682f, 23.0912f, 10.2727f, 23.4498f)
                    curveTo(10.7773f, 23.8083f, 11.381f, 24.0009f, 12.0f, 24.0009f)
                    curveTo(12.619f, 24.0009f, 13.2227f, 23.8083f, 13.7273f, 23.4498f)
                    curveTo(14.2318f, 23.0912f, 14.6124f, 22.5845f, 14.816f, 22.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(20.0f)
                    close()
                }
            }
        }
        .build()
        return _ftp!!
    }

private var _ftp: ImageVector? = null
