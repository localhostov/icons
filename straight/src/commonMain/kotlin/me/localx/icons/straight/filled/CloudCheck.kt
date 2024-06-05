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

public val Icons.Filled.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = Builder(name = "CloudCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.791f, 7.209f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.791f, 1.791f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, 0.9f, 3.671f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, false, 2.6f, 10.329f)
                horizontalLineToRelative(10.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.791f, -15.791f)
                close()
                moveTo(13.813f, 19.121f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.242f, 0.0f)
                lineToRelative(-3.384f, -3.384f)
                lineToRelative(1.413f, -1.414f)
                lineToRelative(3.384f, 3.384f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(5.654f, -5.654f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
