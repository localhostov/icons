package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.4422f, 11.988f)
                    curveTo(21.6852f, 11.9947f, 21.0492f, 12.5586f, 20.9518f, 13.3093f)
                    curveTo(20.2306f, 18.2367f, 15.6515f, 21.6465f, 10.7241f, 20.9253f)
                    curveTo(5.7967f, 20.2041f, 2.3869f, 15.625f, 3.108f, 10.6976f)
                    curveTo(3.8292f, 5.7702f, 8.4083f, 2.3604f, 13.3357f, 3.0816f)
                    curveTo(15.0153f, 3.3274f, 16.5914f, 4.0424f, 17.8827f, 5.1442f)
                    lineTo(16.7516f, 6.2754f)
                    curveTo(16.3607f, 6.6663f, 16.3608f, 7.3001f, 16.7518f, 7.691f)
                    curveTo(16.9402f, 7.8793f, 17.1959f, 7.9848f, 17.4623f, 7.984f)
                    horizontalLineTo(22.0528f)
                    curveTo(22.6056f, 7.984f, 23.0538f, 7.5359f, 23.0538f, 6.9831f)
                    verticalLineTo(2.3925f)
                    curveTo(23.0537f, 1.8397f, 22.6054f, 1.3916f, 22.0526f, 1.3917f)
                    curveTo(21.7872f, 1.3918f, 21.5327f, 1.4972f, 21.3451f, 1.6848f)
                    lineTo(20.0118f, 3.0181f)
                    curveTo(15.0513f, -1.3767f, 7.4673f, -0.9182f, 3.0724f, 4.0423f)
                    curveTo(-1.3225f, 9.0028f, -0.8639f, 16.5869f, 4.0966f, 20.9818f)
                    curveTo(9.0571f, 25.3767f, 16.6411f, 24.9181f, 21.036f, 19.9576f)
                    curveTo(22.5831f, 18.2113f, 23.5876f, 16.052f, 23.9267f, 13.7437f)
                    curveTo(24.0594f, 12.9173f, 23.497f, 12.1398f, 22.6706f, 12.0071f)
                    curveTo(22.5951f, 11.995f, 22.5188f, 11.9886f, 22.4422f, 11.988f)
                    close()
                }
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null
