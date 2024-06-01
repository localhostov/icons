package me.localx.icons.straight.bold

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

public val Icons.Bold.ZoomIn: ImageVector
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
                    moveTo(12.0f, 6.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(6.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.9199f, 16.8051f)
                    curveTo(22.3935f, 12.1629f, 21.4463f, 5.5838f, 16.8041f, 2.1102f)
                    curveTo(12.162f, -1.3634f, 5.5829f, -0.4162f, 2.1093f, 4.226f)
                    curveTo(-1.3643f, 8.8681f, -0.4171f, 15.4472f, 4.225f, 18.9208f)
                    curveTo(7.9539f, 21.711f, 13.0753f, 21.711f, 16.8041f, 18.9208f)
                    lineTo(21.8843f, 24.0009f)
                    lineTo(24.0f, 21.8892f)
                    lineTo(18.9199f, 16.8051f)
                    close()
                    moveTo(10.5526f, 18.0243f)
                    curveTo(6.4266f, 18.0243f, 3.0818f, 14.6795f, 3.0818f, 10.5535f)
                    curveTo(3.0818f, 6.4275f, 6.4266f, 3.0827f, 10.5526f, 3.0827f)
                    curveTo(14.6785f, 3.0827f, 18.0234f, 6.4275f, 18.0234f, 10.5535f)
                    curveTo(18.0195f, 14.6779f, 14.677f, 18.0204f, 10.5526f, 18.0243f)
                    close()
                }
            }
        }
        .build()
        return _zoomIn!!
    }

private var _zoomIn: ImageVector? = null
