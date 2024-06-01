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

public val Icons.Bold.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = Builder(name = "Beer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 11.5001f)
                    curveTo(24.0f, 10.5718f, 23.6313f, 9.6816f, 22.9749f, 9.0252f)
                    curveTo(22.3185f, 8.3688f, 21.4283f, 8.0001f, 20.5f, 8.0001f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(4.0001f)
                    horizontalLineTo(16.329f)
                    curveTo(16.1898f, 3.6107f, 15.9717f, 3.2543f, 15.6882f, 2.9532f)
                    curveTo(15.4048f, 2.6521f, 15.0622f, 2.4129f, 14.6818f, 2.2505f)
                    curveTo(14.3015f, 2.0882f, 13.8918f, 2.0062f, 13.4783f, 2.0097f)
                    curveTo(13.0648f, 2.0133f, 12.6565f, 2.1022f, 12.279f, 2.2711f)
                    curveTo(12.0335f, 1.6304f, 11.605f, 1.076f, 11.047f, 0.6768f)
                    curveTo(10.4889f, 0.2776f, 9.8258f, 0.0513f, 9.1401f, 0.026f)
                    curveTo(8.4545f, 6.0E-4f, 7.7765f, 0.1773f, 7.1904f, 0.5342f)
                    curveTo(6.6044f, 0.891f, 6.1362f, 1.4123f, 5.844f, 2.0331f)
                    curveTo(5.1742f, 1.9535f, 4.4974f, 2.1052f, 3.9256f, 2.4629f)
                    curveTo(3.3538f, 2.8207f, 2.9214f, 3.363f, 2.7f, 4.0001f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.5001f)
                    curveTo(0.0f, 21.4283f, 0.3687f, 22.3186f, 1.0251f, 22.975f)
                    curveTo(1.6815f, 23.6313f, 2.5717f, 24.0001f, 3.5f, 24.0001f)
                    horizontalLineTo(15.5f)
                    curveTo(16.4283f, 24.0001f, 17.3185f, 23.6313f, 17.9749f, 22.975f)
                    curveTo(18.6313f, 22.3186f, 19.0f, 21.4283f, 19.0f, 20.5001f)
                    verticalLineTo(19.0001f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(11.5001f)
                    close()
                    moveTo(16.0f, 20.5001f)
                    curveTo(16.0f, 20.6327f, 15.9473f, 20.7599f, 15.8536f, 20.8536f)
                    curveTo(15.7598f, 20.9474f, 15.6326f, 21.0001f, 15.5f, 21.0001f)
                    horizontalLineTo(3.5f)
                    curveTo(3.3674f, 21.0001f, 3.2402f, 20.9474f, 3.1465f, 20.8536f)
                    curveTo(3.0527f, 20.7599f, 3.0f, 20.6327f, 3.0f, 20.5001f)
                    verticalLineTo(7.0001f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(13.0001f)
                    curveTo(5.0f, 13.5305f, 5.2107f, 14.0392f, 5.5858f, 14.4143f)
                    curveTo(5.9609f, 14.7894f, 6.4696f, 15.0001f, 7.0f, 15.0001f)
                    curveTo(7.5304f, 15.0001f, 8.0391f, 14.7894f, 8.4142f, 14.4143f)
                    curveTo(8.7893f, 14.0392f, 9.0f, 13.5305f, 9.0f, 13.0001f)
                    verticalLineTo(7.0001f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(20.5001f)
                    close()
                    moveTo(21.0f, 16.0001f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(11.0001f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 11.0001f, 20.7598f, 11.0528f, 20.8536f, 11.1465f)
                    curveTo(20.9473f, 11.2403f, 21.0f, 11.3675f, 21.0f, 11.5001f)
                    verticalLineTo(16.0001f)
                    close()
                }
            }
        }
        .build()
        return _beer!!
    }

private var _beer: ImageVector? = null
