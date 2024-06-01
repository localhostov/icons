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

public val Icons.Bold.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 13.5f)
                    curveTo(23.9964f, 10.5788f, 22.9283f, 7.759f, 20.9956f, 5.5686f)
                    curveTo(19.0628f, 3.3782f, 16.398f, 1.9673f, 13.5f, 1.6f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(1.6f)
                    curveTo(7.602f, 1.9673f, 4.9372f, 3.3782f, 3.0044f, 5.5686f)
                    curveTo(1.0717f, 7.759f, 0.0036f, 10.5788f, 0.0f, 13.5f)
                    lineTo(0.0f, 15.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(20.25f)
                    curveTo(10.5f, 20.4489f, 10.421f, 20.6397f, 10.2803f, 20.7803f)
                    curveTo(10.1397f, 20.921f, 9.9489f, 21.0f, 9.75f, 21.0f)
                    curveTo(9.5511f, 21.0f, 9.3603f, 20.921f, 9.2197f, 20.7803f)
                    curveTo(9.079f, 20.6397f, 9.0f, 20.4489f, 9.0f, 20.25f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(20.25f)
                    curveTo(6.0f, 21.2446f, 6.3951f, 22.1984f, 7.0984f, 22.9017f)
                    curveTo(7.8016f, 23.6049f, 8.7554f, 24.0f, 9.75f, 24.0f)
                    curveTo(10.7446f, 24.0f, 11.6984f, 23.6049f, 12.4017f, 22.9017f)
                    curveTo(13.1049f, 22.1984f, 13.5f, 21.2446f, 13.5f, 20.25f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(13.5f)
                    close()
                    moveTo(3.125f, 12.0f)
                    curveTo(3.4784f, 9.9018f, 4.5638f, 7.9966f, 6.1885f, 6.6226f)
                    curveTo(7.8132f, 5.2487f, 9.8722f, 4.4948f, 12.0f, 4.4948f)
                    curveTo(14.1278f, 4.4948f, 16.1868f, 5.2487f, 17.8115f, 6.6226f)
                    curveTo(19.4362f, 7.9966f, 20.5216f, 9.9018f, 20.875f, 12.0f)
                    horizontalLineTo(3.125f)
                    close()
                }
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
