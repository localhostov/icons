package me.localx.icons.rounded.filled

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
                horizontalLineToRelative(-7.317f)
                arcToRelative(5.844f, 5.844f, 0.0f, false, true, -5.626f, -4.7f)
                arcToRelative(5.446f, 5.446f, 0.0f, false, true, 2.885f, -5.651f)
                arcToRelative(7.652f, 7.652f, 0.0f, false, true, -0.8f, -5.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.49f, -0.841f)
                arcToRelative(1.085f, 1.085f, 0.0f, false, false, 0.721f, 0.732f)
                arcToRelative(8.024f, 8.024f, 0.0f, false, true, 2.98f, 1.674f)
                curveToRelative(-0.11f, -0.008f, -0.218f, -0.034f, -0.333f, -0.034f)
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
