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

public val Icons.Bold.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.5f, 4.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 4.0f, 1.6815f, 4.3688f, 1.0251f, 5.0251f)
                    curveTo(0.3687f, 5.6815f, 0.0f, 6.5717f, 0.0f, 7.5f)
                    lineTo(0.0f, 11.5f)
                    curveTo(0.0016f, 12.083f, 0.1487f, 12.6564f, 0.4282f, 13.1681f)
                    curveTo(0.7076f, 13.6797f, 1.1104f, 14.1135f, 1.6f, 14.43f)
                    lineTo(5.85f, 24.0f)
                    horizontalLineTo(7.25f)
                    curveTo(7.7082f, 23.9997f, 8.1591f, 23.8851f, 8.5618f, 23.6664f)
                    curveTo(8.9645f, 23.4477f, 9.3062f, 23.1319f, 9.5559f, 22.7477f)
                    curveTo(9.8056f, 22.3635f, 9.9554f, 21.923f, 9.9918f, 21.4663f)
                    curveTo(10.0281f, 21.0095f, 9.9498f, 20.5509f, 9.764f, 20.132f)
                    lineTo(7.481f, 15.0f)
                    horizontalLineTo(10.5f)
                    curveTo(13.149f, 15.0f, 15.0f, 16.645f, 15.0f, 19.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(15.0f)
                    curveTo(15.0f, 2.355f, 13.149f, 4.0f, 10.5f, 4.0f)
                    close()
                    moveTo(10.5f, 12.0f)
                    horizontalLineTo(3.5f)
                    curveTo(3.3674f, 12.0f, 3.2402f, 11.9473f, 3.1465f, 11.8536f)
                    curveTo(3.0527f, 11.7598f, 3.0f, 11.6326f, 3.0f, 11.5f)
                    verticalLineTo(7.5f)
                    curveTo(3.0f, 7.3674f, 3.0527f, 7.2402f, 3.1465f, 7.1465f)
                    curveTo(3.2402f, 7.0527f, 3.3674f, 7.0f, 3.5f, 7.0f)
                    horizontalLineTo(10.5f)
                    curveTo(12.1f, 7.0181f, 13.6683f, 6.5532f, 15.0f, 5.666f)
                    verticalLineTo(13.334f)
                    curveTo(13.6683f, 12.4468f, 12.1f, 11.9819f, 10.5f, 12.0f)
                    close()
                    moveTo(21.061f, 12.185f)
                    lineTo(23.349f, 14.473f)
                    lineTo(21.228f, 16.594f)
                    lineTo(18.939f, 14.306f)
                    lineTo(21.061f, 12.185f)
                    close()
                    moveTo(21.1f, 6.844f)
                    lineTo(18.978f, 4.723f)
                    lineTo(21.228f, 2.473f)
                    lineTo(23.349f, 4.594f)
                    lineTo(21.1f, 6.844f)
                    close()
                    moveTo(24.0f, 8.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(24.0f)
                    close()
                }
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
