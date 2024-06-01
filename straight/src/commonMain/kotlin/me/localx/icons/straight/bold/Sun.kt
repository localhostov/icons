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

public val Icons.Bold.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 13.5f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(19.854f)
                    curveTo(19.6507f, 9.4277f, 19.2286f, 8.4089f, 18.614f, 7.507f)
                    lineTo(21.546f, 4.575f)
                    lineTo(19.425f, 2.454f)
                    lineTo(16.493f, 5.386f)
                    curveTo(15.5912f, 4.7712f, 14.5723f, 4.3491f, 13.5f, 4.146f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(4.146f)
                    curveTo(9.4277f, 4.3491f, 8.4088f, 4.7712f, 7.507f, 5.386f)
                    lineTo(4.575f, 2.454f)
                    lineTo(2.454f, 4.575f)
                    lineTo(5.386f, 7.507f)
                    curveTo(4.7714f, 8.4089f, 4.3493f, 9.4277f, 4.146f, 10.5f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.5f)
                    horizontalLineTo(4.146f)
                    curveTo(4.3493f, 14.5723f, 4.7714f, 15.5911f, 5.386f, 16.493f)
                    lineTo(2.454f, 19.425f)
                    lineTo(4.575f, 21.546f)
                    lineTo(7.507f, 18.614f)
                    curveTo(8.4088f, 19.2288f, 9.4277f, 19.6509f, 10.5f, 19.854f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(19.854f)
                    curveTo(14.5723f, 19.6509f, 15.5912f, 19.2288f, 16.493f, 18.614f)
                    lineTo(19.425f, 21.546f)
                    lineTo(21.546f, 19.425f)
                    lineTo(18.614f, 16.493f)
                    curveTo(19.2286f, 15.5911f, 19.6507f, 14.5723f, 19.854f, 13.5f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(12.0f, 17.0f)
                    curveTo(5.392f, 16.79f, 5.394f, 7.209f, 12.0f, 7.0f)
                    curveTo(18.608f, 7.21f, 18.606f, 16.791f, 12.0f, 17.0f)
                    close()
                }
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
