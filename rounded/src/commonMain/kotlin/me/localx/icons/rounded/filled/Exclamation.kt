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

public val Icons.Filled.Exclamation: ImageVector
    get() {
        if (_exclamation != null) {
            return _exclamation!!
        }
        _exclamation = Builder(name = "Exclamation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 24.0f)
                    curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                    curveTo(24.0f, 5.3726f, 18.6274f, 0.0f, 12.0f, 0.0f)
                    curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                    curveTo(0.0072f, 18.6245f, 5.3755f, 23.9928f, 12.0f, 24.0f)
                    close()
                    moveTo(11.0f, 6.0f)
                    curveTo(11.0f, 5.4477f, 11.4477f, 5.0f, 12.0f, 5.0f)
                    curveTo(12.5523f, 5.0f, 13.0f, 5.4477f, 13.0f, 6.0f)
                    verticalLineTo(14.0f)
                    curveTo(13.0f, 14.5523f, 12.5523f, 15.0f, 12.0f, 15.0f)
                    curveTo(11.4477f, 15.0f, 11.0f, 14.5523f, 11.0f, 14.0f)
                    verticalLineTo(6.0f)
                    close()
                    moveTo(12.0f, 18.0f)
                    curveTo(12.5523f, 18.0f, 13.0f, 18.4477f, 13.0f, 19.0f)
                    curveTo(13.0f, 19.5523f, 12.5523f, 20.0f, 12.0f, 20.0f)
                    curveTo(11.4477f, 20.0f, 11.0f, 19.5523f, 11.0f, 19.0f)
                    curveTo(11.0f, 18.4477f, 11.4477f, 18.0f, 12.0f, 18.0f)
                    close()
                }
            }
        }
        .build()
        return _exclamation!!
    }

private var _exclamation: ImageVector? = null
