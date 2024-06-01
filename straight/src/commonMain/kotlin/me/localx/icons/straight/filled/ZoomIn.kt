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

public val Icons.Filled.ZoomIn: ImageVector
    get() {
        if (_zoomIn != null) {
            return _zoomIn!!
        }
        _zoomIn = Builder(name = "ZoomIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.7431f, 16.3281f)
                    curveTo(19.3665f, 14.3416f, 20.1644f, 11.8072f, 19.9718f, 9.249f)
                    curveTo(19.7791f, 6.6908f, 18.6106f, 4.3045f, 16.708f, 2.5836f)
                    curveTo(14.8054f, 0.8627f, 12.3141f, -0.0611f, 9.7495f, 0.0031f)
                    curveTo(7.1848f, 0.0674f, 4.743f, 1.1149f, 2.9289f, 2.9289f)
                    curveTo(1.1149f, 4.743f, 0.0674f, 7.1848f, 0.0031f, 9.7495f)
                    curveTo(-0.0611f, 12.3141f, 0.8627f, 14.8054f, 2.5836f, 16.708f)
                    curveTo(4.3045f, 18.6106f, 6.6908f, 19.7791f, 9.249f, 19.9718f)
                    curveTo(11.8072f, 20.1644f, 14.3416f, 19.3665f, 16.3281f, 17.7431f)
                    lineTo(22.5861f, 24.0001f)
                    lineTo(24.0001f, 22.5861f)
                    lineTo(17.7431f, 16.3281f)
                    close()
                    moveTo(14.0001f, 11.0001f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(14.0001f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(11.0001f)
                    horizontalLineTo(6.0001f)
                    verticalLineTo(9.0001f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(6.0001f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(9.0001f)
                    horizontalLineTo(14.0001f)
                    verticalLineTo(11.0001f)
                    close()
                }
            }
        }
        .build()
        return _zoomIn!!
    }

private var _zoomIn: ImageVector? = null
