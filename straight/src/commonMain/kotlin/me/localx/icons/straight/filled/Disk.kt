package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Disk: ImageVector
    get() {
        if (_disk != null) {
            return _disk!!
        }
        _disk = Builder(name = "Disk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.9998f, 0.0f)
                    horizontalLineTo(6.9998f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(16.9998f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9998f, 16.0f)
                    curveTo(13.1044f, 16.0f, 13.9998f, 15.1046f, 13.9998f, 14.0f)
                    curveTo(13.9998f, 12.8954f, 13.1044f, 12.0f, 11.9998f, 12.0f)
                    curveTo(10.8952f, 12.0f, 9.9998f, 12.8954f, 9.9998f, 14.0f)
                    curveTo(9.9998f, 15.1046f, 10.8952f, 16.0f, 11.9998f, 16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 0.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.0f)
                    lineTo(19.0f, 0.0f)
                    close()
                    moveTo(12.0f, 18.0f)
                    curveTo(11.2089f, 18.0f, 10.4355f, 17.7654f, 9.7777f, 17.3259f)
                    curveTo(9.1199f, 16.8864f, 8.6072f, 16.2616f, 8.3045f, 15.5307f)
                    curveTo(8.0017f, 14.7998f, 7.9225f, 13.9956f, 8.0769f, 13.2196f)
                    curveTo(8.2312f, 12.4437f, 8.6122f, 11.731f, 9.1716f, 11.1716f)
                    curveTo(9.731f, 10.6122f, 10.4437f, 10.2312f, 11.2196f, 10.0769f)
                    curveTo(11.9956f, 9.9225f, 12.7998f, 10.0017f, 13.5307f, 10.3045f)
                    curveTo(14.2616f, 10.6072f, 14.8864f, 11.1199f, 15.3259f, 11.7777f)
                    curveTo(15.7654f, 12.4355f, 16.0f, 13.2089f, 16.0f, 14.0f)
                    curveTo(16.0f, 15.0609f, 15.5786f, 16.0783f, 14.8284f, 16.8284f)
                    curveTo(14.0783f, 17.5786f, 13.0609f, 18.0f, 12.0f, 18.0f)
                    close()
                }
            }
        }
        .build()
        return _disk!!
    }

private var _disk: ImageVector? = null
