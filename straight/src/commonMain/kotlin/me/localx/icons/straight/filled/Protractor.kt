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

public val Icons.Filled.Protractor: ImageVector
    get() {
        if (_protractor != null) {
            return _protractor!!
        }
        _protractor = Builder(name = "Protractor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.977f, 11.27f)
                    curveTo(21.7487f, 8.5009f, 20.4984f, 5.9158f, 18.4695f, 4.0176f)
                    curveTo(16.4406f, 2.1193f, 13.7781f, 1.0437f, 11.0f, 1.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.2043f, 0.0f, 4.4413f, 0.3161f, 3.8787f, 0.8787f)
                    curveTo(3.3161f, 1.4413f, 3.0f, 2.2043f, 3.0f, 3.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(21.0f)
                    curveTo(3.0f, 21.7956f, 3.3161f, 22.5587f, 3.8787f, 23.1213f)
                    curveTo(4.4413f, 23.6839f, 5.2043f, 24.0f, 6.0f, 24.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(23.0f)
                    curveTo(12.5044f, 22.9976f, 13.9924f, 22.6877f, 15.3728f, 22.0895f)
                    curveTo(16.7531f, 21.4912f, 17.9966f, 20.6172f, 19.027f, 19.521f)
                    curveTo(20.0621f, 18.4241f, 20.8586f, 17.1246f, 21.3663f, 15.7045f)
                    curveTo(21.8741f, 14.2844f, 22.082f, 12.7745f, 21.977f, 11.27f)
                    close()
                    moveTo(11.0f, 16.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(11.0f)
                    curveTo(12.0609f, 8.0f, 13.0783f, 8.4214f, 13.8284f, 9.1716f)
                    curveTo(14.5786f, 9.9217f, 15.0f, 10.9391f, 15.0f, 12.0f)
                    curveTo(15.0f, 13.0609f, 14.5786f, 14.0783f, 13.8284f, 14.8284f)
                    curveTo(13.0783f, 15.5786f, 12.0609f, 16.0f, 11.0f, 16.0f)
                    close()
                }
            }
        }
        .build()
        return _protractor!!
    }

private var _protractor: ImageVector? = null
