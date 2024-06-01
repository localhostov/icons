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
                    moveTo(7.0f, 21.0001f)
                    verticalLineTo(24.0001f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(21.0001f)
                    horizontalLineTo(7.0f)
                    close()
                    moveTo(17.0f, 21.0001f)
                    verticalLineTo(24.0001f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(21.0001f)
                    horizontalLineTo(17.0f)
                    close()
                    moveTo(23.221f, 11.0001f)
                    curveTo(23.033f, 10.2821f, 22.821f, 9.5711f, 22.562f, 8.8691f)
                    lineTo(20.418f, 2.9751f)
                    curveTo(20.2068f, 2.3971f, 19.8234f, 1.8979f, 19.3194f, 1.5447f)
                    curveTo(18.8155f, 1.1915f, 18.2154f, 1.0014f, 17.6f, 1.0001f)
                    horizontalLineTo(6.4f)
                    curveTo(5.7846f, 1.0014f, 5.1845f, 1.1915f, 4.6806f, 1.5447f)
                    curveTo(4.1766f, 1.8979f, 3.7932f, 2.3971f, 3.582f, 2.9751f)
                    lineTo(1.438f, 8.8691f)
                    curveTo(1.183f, 9.5711f, 0.967f, 10.2821f, 0.779f, 11.0001f)
                    horizontalLineTo(23.221f)
                    close()
                    moveTo(24.0f, 17.0321f)
                    verticalLineTo(19.0001f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(17.0321f)
                    curveTo(0.0011f, 15.6808f, 0.1169f, 14.3319f, 0.346f, 13.0001f)
                    horizontalLineTo(23.654f)
                    curveTo(23.8831f, 14.3319f, 23.9989f, 15.6808f, 24.0f, 17.0321f)
                    close()
                    moveTo(5.0f, 15.0001f)
                    curveTo(4.7348f, 15.0001f, 4.4804f, 15.1055f, 4.2929f, 15.293f)
                    curveTo(4.1054f, 15.4806f, 4.0f, 15.7349f, 4.0f, 16.0001f)
                    curveTo(4.0f, 16.2653f, 4.1054f, 16.5197f, 4.2929f, 16.7072f)
                    curveTo(4.4804f, 16.8948f, 4.7348f, 17.0001f, 5.0f, 17.0001f)
                    curveTo(5.2652f, 17.0001f, 5.5196f, 16.8948f, 5.7071f, 16.7072f)
                    curveTo(5.8946f, 16.5197f, 6.0f, 16.2653f, 6.0f, 16.0001f)
                    curveTo(6.0f, 15.7349f, 5.8946f, 15.4806f, 5.7071f, 15.293f)
                    curveTo(5.5196f, 15.1055f, 5.2652f, 15.0001f, 5.0f, 15.0001f)
                    close()
                    moveTo(19.0f, 15.0001f)
                    curveTo(18.7348f, 15.0001f, 18.4804f, 15.1055f, 18.2929f, 15.293f)
                    curveTo(18.1054f, 15.4806f, 18.0f, 15.7349f, 18.0f, 16.0001f)
                    curveTo(18.0f, 16.2653f, 18.1054f, 16.5197f, 18.2929f, 16.7072f)
                    curveTo(18.4804f, 16.8948f, 18.7348f, 17.0001f, 19.0f, 17.0001f)
                    curveTo(19.2652f, 17.0001f, 19.5196f, 16.8948f, 19.7071f, 16.7072f)
                    curveTo(19.8946f, 16.5197f, 20.0f, 16.2653f, 20.0f, 16.0001f)
                    curveTo(20.0f, 15.7349f, 19.8946f, 15.4806f, 19.7071f, 15.293f)
                    curveTo(19.5196f, 15.1055f, 19.2652f, 15.0001f, 19.0f, 15.0001f)
                    close()
                }
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
