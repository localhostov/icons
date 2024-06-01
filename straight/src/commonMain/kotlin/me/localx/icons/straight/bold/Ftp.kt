package me.localx.icons.straight.bold

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

public val Icons.Bold.Ftp: ImageVector
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
                    moveTo(24.0f, 19.0f)
                    horizontalLineTo(15.149f)
                    curveTo(14.8034f, 18.2784f, 14.2216f, 17.6966f, 13.5f, 17.351f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(5.5f)
                    curveTo(21.0f, 4.5717f, 20.6313f, 3.6815f, 19.9749f, 3.0251f)
                    curveTo(19.3185f, 2.3688f, 18.4283f, 2.0f, 17.5f, 2.0f)
                    horizontalLineTo(12.466f)
                    lineTo(9.557f, 0.0f)
                    horizontalLineTo(6.5f)
                    curveTo(5.5717f, 0.0f, 4.6815f, 0.3687f, 4.0251f, 1.0251f)
                    curveTo(3.3688f, 1.6815f, 3.0f, 2.5717f, 3.0f, 3.5f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(17.351f)
                    curveTo(9.7784f, 17.6966f, 9.1966f, 18.2784f, 8.851f, 19.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(8.851f)
                    curveTo(9.1316f, 22.5985f, 9.5769f, 23.1047f, 10.1348f, 23.4593f)
                    curveTo(10.6926f, 23.8139f, 11.34f, 24.0022f, 12.001f, 24.0022f)
                    curveTo(12.662f, 24.0022f, 13.3094f, 23.8139f, 13.8672f, 23.4593f)
                    curveTo(14.4251f, 23.1047f, 14.8704f, 22.5985f, 15.151f, 22.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(6.0f, 7.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(7.0f)
                    close()
                }
            }
        }
        .build()
        return _ftp!!
    }

private var _ftp: ImageVector? = null
