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

public val Icons.Filled.CallMissed: ImageVector
    get() {
        if (_callMissed != null) {
            return _callMissed!!
        }
        _callMissed = Builder(name = "CallMissed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 20.2509f)
                    verticalLineTo(23.9999f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(19.2549f)
                    curveTo(14.7007f, 18.7696f, 13.3269f, 18.5141f, 11.94f, 18.4999f)
                    curveTo(10.592f, 18.5031f, 9.2563f, 18.7553f, 8.0f, 19.2439f)
                    verticalLineTo(23.9999f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.2499f)
                    curveTo(0.0015f, 19.5445f, 0.1431f, 18.8464f, 0.4165f, 18.1961f)
                    curveTo(0.69f, 17.5459f, 1.0899f, 16.9564f, 1.593f, 16.4619f)
                    curveTo(3.741f, 14.3139f, 7.63f, 13.0209f, 12.0f, 12.9999f)
                    curveTo(16.364f, 13.0129f, 20.192f, 14.2409f, 22.412f, 16.4619f)
                    curveTo(22.9143f, 16.9569f, 23.3133f, 17.5468f, 23.5859f, 18.1972f)
                    curveTo(23.8585f, 18.8476f, 23.9992f, 19.5457f, 24.0f, 20.2509f)
                    close()
                    moveTo(5.0f, 4.3889f)
                    lineTo(10.928f, 10.3379f)
                    curveTo(11.1337f, 10.5454f, 11.3786f, 10.71f, 11.6485f, 10.8221f)
                    curveTo(11.9183f, 10.9342f, 12.2078f, 10.9916f, 12.5f, 10.9909f)
                    curveTo(12.7917f, 10.9921f, 13.0808f, 10.9352f, 13.3503f, 10.8236f)
                    curveTo(13.6198f, 10.712f, 13.8645f, 10.5479f, 14.07f, 10.3409f)
                    lineTo(20.954f, 3.4569f)
                    lineTo(19.543f, 2.0429f)
                    lineTo(12.659f, 8.9269f)
                    curveTo(12.6385f, 8.9474f, 12.6142f, 8.9636f, 12.5874f, 8.9746f)
                    curveTo(12.5607f, 8.9856f, 12.5319f, 8.9911f, 12.503f, 8.9909f)
                    curveTo(12.4738f, 8.991f, 12.4449f, 8.9853f, 12.418f, 8.9742f)
                    curveTo(12.391f, 8.963f, 12.3666f, 8.9466f, 12.346f, 8.9259f)
                    lineTo(6.439f, 2.9999f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(0.9999f)
                    horizontalLineTo(5.5f)
                    curveTo(4.841f, 0.9967f, 4.2077f, 1.2551f, 3.739f, 1.7184f)
                    curveTo(3.2703f, 2.1816f, 3.0045f, 2.8119f, 3.0f, 3.4709f)
                    verticalLineTo(7.9999f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(4.3889f)
                    close()
                }
            }
        }
        .build()
        return _callMissed!!
    }

private var _callMissed: ImageVector? = null
