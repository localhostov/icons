package me.localx.icons.straight.outline

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

public val Icons.Outline.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = Builder(name = "ZoomOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9949f, 22.583f)
                    lineTo(17.7465f, 16.3346f)
                    curveTo(21.2404f, 12.0614f, 20.6086f, 5.765f, 16.3355f, 2.2711f)
                    curveTo(12.0624f, -1.2228f, 5.7659f, -0.5911f, 2.272f, 3.682f)
                    curveTo(-1.2219f, 7.9552f, -0.5902f, 14.2516f, 3.683f, 17.7455f)
                    curveTo(7.3636f, 20.755f, 12.6549f, 20.755f, 16.3355f, 17.7455f)
                    lineTo(22.584f, 23.9939f)
                    lineTo(23.9949f, 22.583f)
                    close()
                    moveTo(10.0252f, 18.0069f)
                    curveTo(5.6165f, 18.0069f, 2.0425f, 14.4329f, 2.0425f, 10.0243f)
                    curveTo(2.0425f, 5.6156f, 5.6165f, 2.0416f, 10.0252f, 2.0416f)
                    curveTo(14.4339f, 2.0416f, 18.0079f, 5.6156f, 18.0079f, 10.0243f)
                    curveTo(18.003f, 14.4309f, 14.4319f, 18.002f, 10.0252f, 18.0069f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0167f, 9.0264f)
                    horizontalLineTo(6.0341f)
                    verticalLineTo(11.0221f)
                    horizontalLineTo(14.0167f)
                    verticalLineTo(9.0264f)
                    close()
                }
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
