package me.localx.icons.straight.bold

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Raindrops: ImageVector
    get() {
        if (_raindrops != null) {
            return _raindrops!!
        }
        _raindrops = Builder(name = "Raindrops", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.411f, 24.0f)
                arcToRelative(6.589f, 6.589f, 0.0f, false, true, -4.658f, -11.247f)
                lineToRelative(4.658f, -4.939f)
                lineToRelative(4.69f, 4.97f)
                arcToRelative(6.584f, 6.584f, 0.0f, false, true, -0.031f, 9.286f)
                horizontalLineToRelative(0.0f)
                arcTo(6.554f, 6.554f, 0.0f, false, true, 17.411f, 24.0f)
                close()
                moveTo(17.411f, 12.186f)
                lineTo(14.9f, 14.843f)
                arcToRelative(3.589f, 3.589f, 0.0f, true, false, 5.045f, 0.031f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.625f, 13.5f)
                arcTo(5.625f, 5.625f, 0.0f, false, true, 1.647f, 3.9f)
                lineTo(5.625f, 0.006f)
                lineToRelative(3.966f, 3.88f)
                arcTo(5.649f, 5.649f, 0.0f, false, true, 9.6f, 11.852f)
                horizontalLineToRelative(0.0f)
                arcTo(5.586f, 5.586f, 0.0f, false, true, 5.625f, 13.5f)
                close()
                moveTo(5.625f, 4.2f)
                lineTo(3.757f, 6.03f)
                arcToRelative(2.624f, 2.624f, 0.0f, false, false, 0.012f, 3.7f)
                arcToRelative(2.689f, 2.689f, 0.0f, false, false, 3.711f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.634f, 2.634f, 0.0f, false, false, 0.0f, -3.712f)
                close()
            }
        }
        .build()
        return _raindrops!!
    }

private var _raindrops: ImageVector? = null
