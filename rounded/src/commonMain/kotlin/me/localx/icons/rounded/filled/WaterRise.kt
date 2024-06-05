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

public val Icons.Filled.WaterRise: ImageVector
    get() {
        if (_waterRise != null) {
            return _waterRise!!
        }
        _waterRise = Builder(name = "WaterRise", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.332f, 17.978f)
                arcTo(4.185f, 4.185f, 0.0f, false, false, 6.0f, 17.774f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, false, 5.668f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.335f, -1.489f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.39f, -0.822f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -1.886f, 0.0f)
                arcToRelative(2.278f, 2.278f, 0.0f, false, true, -4.114f, 0.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -1.886f, 0.0f)
                arcToRelative(2.278f, 2.278f, 0.0f, false, true, -4.114f, 0.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -1.886f, 0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.389f, 0.822f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.332f, 17.978f)
                close()
                moveTo(22.332f, 21.489f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.39f, -0.822f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -1.886f, 0.0f)
                arcToRelative(2.278f, 2.278f, 0.0f, false, true, -4.114f, 0.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -1.886f, 0.0f)
                arcToRelative(2.278f, 2.278f, 0.0f, false, true, -4.114f, 0.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -1.886f, 0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.389f, 0.822f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.332f, 22.978f)
                arcTo(4.185f, 4.185f, 0.0f, false, false, 6.0f, 22.774f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.334f, 4.334f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, false, 5.668f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.335f, -1.489f)
                close()
                moveTo(15.704f, 3.289f)
                lineTo(12.704f, 0.289f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.705f, 4.708f)
                lineTo(11.0f, 3.415f)
                lineTo(11.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 3.415f)
                lineToRelative(1.3f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.413f, -1.415f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _waterRise!!
    }

private var _waterRise: ImageVector? = null
