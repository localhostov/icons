package me.localx.icons.straight.outline

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

public val Icons.Outline.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 14.214f)
                    lineTo(22.0f, 3.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 3.0f, 1.4413f, 3.3161f, 0.8787f, 3.8787f)
                    curveTo(0.3161f, 4.4413f, 0.0f, 5.2043f, 0.0f, 6.0f)
                    lineTo(0.0f, 15.0f)
                    curveTo(0.0f, 15.7956f, 0.3161f, 16.5587f, 0.8787f, 17.1213f)
                    curveTo(1.4413f, 17.6839f, 2.2043f, 18.0f, 3.0f, 18.0f)
                    horizontalLineTo(7.712f)
                    lineTo(9.626f, 21.879f)
                    curveTo(9.9488f, 22.5313f, 10.495f, 23.046f, 11.1652f, 23.3296f)
                    curveTo(11.8355f, 23.6131f, 12.5852f, 23.6466f, 13.2781f, 23.424f)
                    curveTo(13.971f, 23.2014f, 14.561f, 22.7375f, 14.9407f, 22.1166f)
                    curveTo(15.3203f, 21.4958f, 15.4645f, 20.7592f, 15.347f, 20.041f)
                    lineTo(15.011f, 18.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(14.214f)
                    close()
                    moveTo(2.0f, 15.0f)
                    verticalLineTo(6.0f)
                    curveTo(2.0f, 5.7348f, 2.1054f, 5.4804f, 2.2929f, 5.2929f)
                    curveTo(2.4804f, 5.1054f, 2.7348f, 5.0f, 3.0f, 5.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 16.0f, 2.4804f, 15.8946f, 2.2929f, 15.7071f)
                    curveTo(2.1054f, 15.5196f, 2.0f, 15.2652f, 2.0f, 15.0f)
                    close()
                    moveTo(22.0f, 16.0f)
                    horizontalLineTo(12.655f)
                    lineTo(13.374f, 20.365f)
                    curveTo(13.3994f, 20.5135f, 13.3916f, 20.6658f, 13.3513f, 20.811f)
                    curveTo(13.3111f, 20.9562f, 13.2392f, 21.0908f, 13.141f, 21.205f)
                    curveTo(13.0257f, 21.329f, 12.8826f, 21.4239f, 12.7236f, 21.4819f)
                    curveTo(12.5645f, 21.5398f, 12.3939f, 21.5593f, 12.2259f, 21.5386f)
                    curveTo(12.0578f, 21.5179f, 11.8971f, 21.4577f, 11.7568f, 21.3628f)
                    curveTo(11.6166f, 21.268f, 11.5008f, 21.1412f, 11.419f, 20.993f)
                    lineTo(9.0f, 16.091f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(20.33f)
                    lineTo(22.0f, 14.3f)
                    verticalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
