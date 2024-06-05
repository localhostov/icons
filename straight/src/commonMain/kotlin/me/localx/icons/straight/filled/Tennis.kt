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

public val Icons.Filled.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(name = "Tennis", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.145f, 0.06f)
                arcToRelative(11.979f, 11.979f, 0.0f, false, true, 10.8f, 10.8f)
                arcToRelative(9.336f, 9.336f, 0.0f, false, true, -10.8f, -10.8f)
                close()
                moveTo(8.276f, 15.723f)
                arcToRelative(9.278f, 9.278f, 0.0f, false, false, -8.215f, -2.569f)
                arcToRelative(11.978f, 11.978f, 0.0f, false, false, 10.785f, 10.785f)
                arcToRelative(9.283f, 9.283f, 0.0f, false, false, -2.57f, -8.216f)
                close()
                moveTo(22.357f, 13.0f)
                arcToRelative(11.335f, 11.335f, 0.0f, false, true, -11.224f, -12.953f)
                arcToRelative(11.936f, 11.936f, 0.0f, false, false, -11.086f, 11.095f)
                arcToRelative(11.249f, 11.249f, 0.0f, false, true, 12.81f, 12.811f)
                arcToRelative(11.937f, 11.937f, 0.0f, false, false, 11.1f, -11.078f)
                arcToRelative(11.465f, 11.465f, 0.0f, false, true, -1.6f, 0.125f)
                close()
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
