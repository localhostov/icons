package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.CloudShare: ImageVector
    get() {
        if (_cloudShare != null) {
            return _cloudShare!!
        }
        _cloudShare = Builder(name = "CloudShare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 22.0f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, true, -2.6f, -10.329f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, true, -0.9f, -3.671f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.791f, -1.791f)
                arcToRelative(7.981f, 7.981f, 0.0f, false, true, 3.519f, 1.822f)
                curveToRelative(-0.105f, -0.006f, -0.204f, -0.031f, -0.31f, -0.031f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, -4.92f, 4.105f)
                lineToRelative(-0.847f, 0.424f)
                arcToRelative(4.953f, 4.953f, 0.0f, false, false, -2.233f, -0.529f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 10.0f)
                close()
                moveTo(21.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.0f, -3.0f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.037f, 0.363f)
                lineToRelative(-2.96f, 1.481f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 4.312f)
                lineToRelative(2.96f, 1.481f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -0.037f, 0.363f)
                arcToRelative(3.015f, 3.015f, 0.0f, true, false, 0.923f, -2.156f)
                lineToRelative(-2.96f, -1.481f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.037f, -0.363f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -0.037f, -0.363f)
                lineToRelative(2.96f, -1.481f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, false, 2.077f, 0.844f)
                close()
            }
        }
        .build()
        return _cloudShare!!
    }

private var _cloudShare: ImageVector? = null
