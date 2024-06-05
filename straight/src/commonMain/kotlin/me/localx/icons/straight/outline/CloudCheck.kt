package me.localx.icons.straight.outline

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

public val Icons.Outline.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = Builder(name = "CloudCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 15.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-0.237f)
                lineToRelative(2.415f, -2.415f)
                arcToRelative(5.992f, 5.992f, 0.0f, false, false, -1.378f, -11.525f)
                lineToRelative(-0.758f, -0.1f)
                lineToRelative(-0.1f, -0.758f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.942f, 0.798f)
                arcToRelative(5.945f, 5.945f, 0.0f, false, false, 1.182f, 3.563f)
                lineToRelative(0.884f, 1.192f)
                lineToRelative(-1.438f, 0.371f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, false, 0.872f, 6.874f)
                horizontalLineToRelative(0.121f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-2.121f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, true, -2.6f, -10.329f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, true, -0.9f, -3.671f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.791f, -1.791f)
                arcToRelative(8.022f, 8.022f, 0.0f, false, true, 6.209f, 7.791f)
                close()
                moveTo(13.813f, 22.121f)
                lineTo(19.467f, 16.467f)
                lineTo(18.053f, 15.053f)
                lineTo(12.4f, 20.707f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-3.386f, -3.384f)
                lineToRelative(-1.413f, 1.414f)
                lineToRelative(3.384f, 3.384f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.242f, 0.0f)
                close()
            }
        }
        .build()
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
