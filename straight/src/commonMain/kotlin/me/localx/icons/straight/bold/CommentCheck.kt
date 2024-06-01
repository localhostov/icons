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

public val Icons.Bold.CommentCheck: ImageVector
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
                    moveTo(10.5f, 17.0f)
                    curveTo(10.1712f, 17.0005f, 9.8455f, 16.936f, 9.5416f, 16.8104f)
                    curveTo(9.2377f, 16.6848f, 8.9616f, 16.5005f, 8.729f, 16.268f)
                    lineTo(5.453f, 13.074f)
                    lineTo(7.547f, 10.926f)
                    lineTo(10.5f, 13.8f)
                    lineTo(16.448f, 7.932f)
                    lineTo(18.556f, 10.068f)
                    lineTo(12.263f, 16.275f)
                    curveTo(12.0315f, 16.5062f, 11.7565f, 16.6892f, 11.4539f, 16.8137f)
                    curveTo(11.1514f, 16.9381f, 10.8272f, 17.0014f, 10.5f, 17.0f)
                    close()
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
                    moveTo(12.0f, 3.0f)
                    curveTo(9.6131f, 3.0f, 7.3239f, 3.9482f, 5.636f, 5.636f)
                    curveTo(3.9482f, 7.3239f, 3.0f, 9.6131f, 3.0f, 12.0f)
                    curveTo(3.0f, 14.387f, 3.9482f, 16.6761f, 5.636f, 18.364f)
                    curveTo(7.3239f, 20.0518f, 9.6131f, 21.0f, 12.0f, 21.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(12.0f)
                    curveTo(20.9974f, 9.6139f, 20.0483f, 7.3262f, 18.361f, 5.639f)
                    curveTo(16.6738f, 3.9517f, 14.3861f, 3.0027f, 12.0f, 3.0f)
                    close()
                }
            }
        }
        .build()
        return _commentCheck!!
    }

private var _commentCheck: ImageVector? = null
