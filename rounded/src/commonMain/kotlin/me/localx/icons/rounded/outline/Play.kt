package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.494f, 7.968f)
                lineToRelative(-9.54f, -7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 3.0f, 5.0f)
                lineTo(3.0f, 19.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 7.957f, 4.031f)
                lineToRelative(9.54f, -7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, -8.064f)
                close()
                moveTo(19.31f, 14.418f)
                lineTo(9.77f, 21.418f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 19.0f)
                lineTo(5.0f, 5.0f)
                arcTo(2.948f, 2.948f, 0.0f, false, true, 6.641f, 2.328f)
                arcTo(3.018f, 3.018f, 0.0f, false, true, 8.006f, 2.0f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, true, 1.764f, 0.589f)
                lineToRelative(9.54f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 4.836f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
