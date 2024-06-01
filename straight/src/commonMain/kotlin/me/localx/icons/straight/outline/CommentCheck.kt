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

public val Icons.Outline.CommentCheck: ImageVector
    get() {
        if (_commentCheck != null) {
            return _commentCheck!!
        }
        _commentCheck = Builder(name = "CommentCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 24.0f)
                    horizontalLineTo(12.0f)
                    curveTo(9.6266f, 24.0f, 7.3066f, 23.2962f, 5.3332f, 21.9776f)
                    curveTo(3.3598f, 20.6591f, 1.8217f, 18.7849f, 0.9135f, 16.5922f)
                    curveTo(0.0052f, 14.3995f, -0.2324f, 11.9867f, 0.2306f, 9.6589f)
                    curveTo(0.6936f, 7.3312f, 1.8365f, 5.1929f, 3.5147f, 3.5147f)
                    curveTo(5.1929f, 1.8365f, 7.3312f, 0.6936f, 9.6589f, 0.2306f)
                    curveTo(11.9867f, -0.2324f, 14.3995f, 0.0052f, 16.5922f, 0.9135f)
                    curveTo(18.7849f, 1.8217f, 20.6591f, 3.3598f, 21.9776f, 5.3332f)
                    curveTo(23.2962f, 7.3066f, 24.0f, 9.6266f, 24.0f, 12.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(12.0f, 2.0f)
                    curveTo(9.3478f, 2.0f, 6.8043f, 3.0536f, 4.9289f, 4.9289f)
                    curveTo(3.0536f, 6.8043f, 2.0f, 9.3478f, 2.0f, 12.0f)
                    curveTo(2.0f, 14.6522f, 3.0536f, 17.1957f, 4.9289f, 19.0711f)
                    curveTo(6.8043f, 20.9464f, 9.3478f, 22.0f, 12.0f, 22.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(12.0f)
                    curveTo(21.9971f, 9.3487f, 20.9426f, 6.8069f, 19.0679f, 4.9321f)
                    curveTo(17.1931f, 3.0574f, 14.6513f, 2.0029f, 12.0f, 2.0f)
                    close()
                    moveTo(11.909f, 16.419f)
                    lineTo(18.7f, 9.712f)
                    lineTo(17.3f, 8.288f)
                    lineTo(10.494f, 14.988f)
                    lineTo(6.7f, 11.285f)
                    lineTo(5.3f, 12.715f)
                    lineTo(9.085f, 16.415f)
                    curveTo(9.4599f, 16.7884f, 9.9674f, 16.9981f, 10.4965f, 16.9981f)
                    curveTo(11.0256f, 16.9981f, 11.5332f, 16.7884f, 11.908f, 16.415f)
                    lineTo(11.909f, 16.419f)
                    close()
                }
            }
        }
        .build()
        return _commentCheck!!
    }

private var _commentCheck: ImageVector? = null
