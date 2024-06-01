package me.localx.icons.rounded.filled

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

public val Icons.Filled.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.327f, 12.0001f)
                    curveTo(0.356f, 11.9071f, 0.369f, 11.8101f, 0.402f, 11.7181f)
                    lineTo(3.1f, 4.2911f)
                    curveTo(3.4523f, 3.3274f, 4.092f, 2.4951f, 4.9325f, 1.9065f)
                    curveTo(5.773f, 1.318f, 6.7739f, 1.0016f, 7.8f, 1.0001f)
                    horizontalLineTo(16.2f)
                    curveTo(17.2262f, 1.0015f, 18.2273f, 1.318f, 19.0679f, 1.9068f)
                    curveTo(19.9084f, 2.4955f, 20.548f, 3.3282f, 20.9f, 4.2921f)
                    lineTo(23.6f, 11.7181f)
                    curveTo(23.633f, 11.8101f, 23.646f, 11.9071f, 23.675f, 12.0001f)
                    horizontalLineTo(0.327f)
                    close()
                    moveTo(20.0f, 14.0001f)
                    verticalLineTo(16.0001f)
                    curveTo(20.0f, 16.2653f, 19.8946f, 16.5197f, 19.7071f, 16.7072f)
                    curveTo(19.5196f, 16.8948f, 19.2652f, 17.0001f, 19.0f, 17.0001f)
                    curveTo(18.7348f, 17.0001f, 18.4804f, 16.8948f, 18.2929f, 16.7072f)
                    curveTo(18.1054f, 16.5197f, 18.0f, 16.2653f, 18.0f, 16.0001f)
                    verticalLineTo(14.0001f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(16.0001f)
                    curveTo(6.0f, 16.2653f, 5.8946f, 16.5197f, 5.7071f, 16.7072f)
                    curveTo(5.5196f, 16.8948f, 5.2652f, 17.0001f, 5.0f, 17.0001f)
                    curveTo(4.7348f, 17.0001f, 4.4804f, 16.8948f, 4.2929f, 16.7072f)
                    curveTo(4.1054f, 16.5197f, 4.0f, 16.2653f, 4.0f, 16.0001f)
                    verticalLineTo(14.0001f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0001f)
                    curveTo(0.0013f, 16.9719f, 0.2857f, 17.9222f, 0.8185f, 18.7349f)
                    curveTo(1.3513f, 19.5476f, 2.1094f, 20.1874f, 3.0f, 20.5761f)
                    verticalLineTo(22.0001f)
                    curveTo(3.0f, 22.5306f, 3.2107f, 23.0393f, 3.5858f, 23.4143f)
                    curveTo(3.9609f, 23.7894f, 4.4696f, 24.0001f, 5.0f, 24.0001f)
                    curveTo(5.5304f, 24.0001f, 6.0391f, 23.7894f, 6.4142f, 23.4143f)
                    curveTo(6.7893f, 23.0393f, 7.0f, 22.5306f, 7.0f, 22.0001f)
                    verticalLineTo(21.0001f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(22.0001f)
                    curveTo(17.0f, 22.5306f, 17.2107f, 23.0393f, 17.5858f, 23.4143f)
                    curveTo(17.9609f, 23.7894f, 18.4696f, 24.0001f, 19.0f, 24.0001f)
                    curveTo(19.5304f, 24.0001f, 20.0391f, 23.7894f, 20.4142f, 23.4143f)
                    curveTo(20.7893f, 23.0393f, 21.0f, 22.5306f, 21.0f, 22.0001f)
                    verticalLineTo(20.5761f)
                    curveTo(21.8906f, 20.1874f, 22.6487f, 19.5476f, 23.1815f, 18.7349f)
                    curveTo(23.7143f, 17.9222f, 23.9987f, 16.9719f, 24.0f, 16.0001f)
                    verticalLineTo(14.0001f)
                    horizontalLineTo(20.0f)
                    close()
                }
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
