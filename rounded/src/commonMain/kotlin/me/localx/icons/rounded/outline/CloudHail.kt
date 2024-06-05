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

public val Icons.Outline.CloudHail: ImageVector
    get() {
        if (_cloudHail != null) {
            return _cloudHail!!
        }
        _cloudHail = Builder(name = "CloudHail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.385f, -1.923f)
                curveToRelative(4.967f, -2.007f, 4.218f, -9.47f, -1.032f, -10.473f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, true, -2.158f, -1.672f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.086f, 6.967f)
                arcTo(6.142f, 6.142f, 0.0f, false, false, 4.11f, 9.148f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, -0.964f, 2.762f)
                arcToRelative(3.523f, 3.523f, 0.0f, false, false, 0.41f, 5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.112f, 1.662f)
                arcTo(5.535f, 5.535f, 0.0f, false, true, 1.8f, 10.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.345f, -0.9f)
                arcToRelative(8.147f, 8.147f, 0.0f, false, true, -0.033f, -2.889f)
                arcTo(7.946f, 7.946f, 0.0f, false, true, 8.5f, 0.137f)
                arcToRelative(8.062f, 8.062f, 0.0f, false, true, 8.735f, 4.44f)
                arcToRelative(1.036f, 1.036f, 0.0f, false, false, 0.742f, 0.569f)
                curveToRelative(7.187f, 1.424f, 8.193f, 11.484f, 1.411f, 14.278f)
                arcTo(0.992f, 0.992f, 0.0f, false, true, 19.0f, 19.5f)
                close()
                moveTo(7.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 15.0f)
                close()
                moveTo(11.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 15.0f)
                close()
                moveTo(15.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 15.0f)
                close()
                moveTo(6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 19.0f)
                close()
                moveTo(10.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 19.0f)
                close()
                moveTo(14.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 19.0f)
                close()
                moveTo(5.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 23.0f)
                close()
                moveTo(9.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 23.0f)
                close()
                moveTo(13.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 23.0f)
                close()
            }
        }
        .build()
        return _cloudHail!!
    }

private var _cloudHail: ImageVector? = null
