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

public val Icons.Bold.Mobile: ImageVector
    get() {
        if (_mobile != null) {
            return _mobile!!
        }
        _mobile = Builder(name = "Mobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5001f, 0.0f)
                    horizontalLineTo(5.5001f)
                    curveTo(4.5719f, 0.0f, 3.6816f, 0.3687f, 3.0252f, 1.0251f)
                    curveTo(2.3689f, 1.6815f, 2.0001f, 2.5717f, 2.0001f, 3.5f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0001f)
                    verticalLineTo(3.5f)
                    curveTo(22.0001f, 2.5717f, 21.6314f, 1.6815f, 20.975f, 1.0251f)
                    curveTo(20.3186f, 0.3687f, 19.4284f, 0.0f, 18.5001f, 0.0f)
                    close()
                    moveTo(19.0001f, 21.0f)
                    horizontalLineTo(13.5001f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(10.5001f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(5.0001f)
                    verticalLineTo(3.5f)
                    curveTo(5.0001f, 3.3674f, 5.0528f, 3.2402f, 5.1466f, 3.1465f)
                    curveTo(5.2403f, 3.0527f, 5.3675f, 3.0f, 5.5001f, 3.0f)
                    horizontalLineTo(18.5001f)
                    curveTo(18.6327f, 3.0f, 18.7599f, 3.0527f, 18.8537f, 3.1465f)
                    curveTo(18.9474f, 3.2402f, 19.0001f, 3.3674f, 19.0001f, 3.5f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(8.0001f, 15.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(15.0f)
                    close()
                    moveTo(14.5531f, 5.729f)
                    curveTo(14.3515f, 5.2236f, 14.0044f, 4.7895f, 13.5558f, 4.4816f)
                    curveTo(13.1072f, 4.1737f, 12.5773f, 4.0059f, 12.0332f, 3.9994f)
                    curveTo(11.4891f, 3.993f, 10.9554f, 4.1483f, 10.4996f, 4.4455f)
                    curveTo(10.0439f, 4.7427f, 9.6866f, 5.1685f, 9.4731f, 5.669f)
                    lineTo(8.8001f, 7.16f)
                    curveTo(8.2721f, 8.3241f, 7.9993f, 9.5877f, 8.0001f, 10.866f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(10.866f)
                    curveTo(16.0014f, 9.5877f, 15.7286f, 8.3239f, 15.2001f, 7.16f)
                    lineTo(14.5531f, 5.729f)
                    close()
                }
            }
        }
        .build()
        return _mobile!!
    }

private var _mobile: ImageVector? = null
