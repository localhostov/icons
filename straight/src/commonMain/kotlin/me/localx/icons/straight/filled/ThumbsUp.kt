package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0f, 8.0006f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 8.0006f, 1.4413f, 8.3167f, 0.8787f, 8.8793f)
                    curveTo(0.3161f, 9.4419f, 0.0f, 10.205f, 0.0f, 11.0006f)
                    lineTo(0.0f, 19.0006f)
                    curveTo(0.0f, 19.7963f, 0.3161f, 20.5593f, 0.8787f, 21.1219f)
                    curveTo(1.4413f, 21.6845f, 2.2043f, 22.0006f, 3.0f, 22.0006f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(8.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.9996f, 7.9997f)
                    lineTo(14.5546f, 4.6717f)
                    curveTo(14.6507f, 4.1758f, 14.5786f, 3.6619f, 14.3497f, 3.2116f)
                    curveTo(14.1207f, 2.7613f, 13.748f, 2.4003f, 13.2906f, 2.1857f)
                    curveTo(12.7661f, 1.9567f, 12.1739f, 1.9365f, 11.635f, 2.1293f)
                    curveTo(11.0961f, 2.322f, 10.651f, 2.7131f, 10.3906f, 3.2227f)
                    lineTo(7.9996f, 7.9997f)
                    verticalLineTo(21.9997f)
                    horizontalLineTo(21.9996f)
                    lineTo(23.9996f, 10.9997f)
                    verticalLineTo(7.9997f)
                    horizontalLineTo(13.9996f)
                    close()
                }
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
