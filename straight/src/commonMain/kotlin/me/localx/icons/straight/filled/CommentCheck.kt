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

public val Icons.Filled.CommentCheck: ImageVector
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
                    moveTo(12.0f, 0.0f)
                    curveTo(8.8174f, 0.0f, 5.7652f, 1.2643f, 3.5147f, 3.5147f)
                    curveTo(1.2643f, 5.7652f, 0.0f, 8.8174f, 0.0f, 12.0f)
                    curveTo(0.0f, 15.1826f, 1.2643f, 18.2348f, 3.5147f, 20.4853f)
                    curveTo(5.7652f, 22.7357f, 8.8174f, 24.0f, 12.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(12.0f)
                    curveTo(23.9966f, 8.8185f, 22.7312f, 5.7682f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(11.909f, 16.419f)
                    curveTo(11.5342f, 16.7924f, 11.0266f, 17.0021f, 10.4975f, 17.0021f)
                    curveTo(9.9684f, 17.0021f, 9.4608f, 16.7924f, 9.086f, 16.419f)
                    lineTo(5.3f, 12.715f)
                    lineTo(6.7f, 11.285f)
                    lineTo(10.493f, 14.992f)
                    lineTo(17.299f, 8.292f)
                    lineTo(18.699f, 9.716f)
                    lineTo(11.909f, 16.419f)
                    close()
                }
            }
        }
        .build()
        return _commentCheck!!
    }

private var _commentCheck: ImageVector? = null
