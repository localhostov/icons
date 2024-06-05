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

public val Icons.Outline.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(name = "Tennis", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.485f, 3.515f)
                arcToRelative(11.994f, 11.994f, 0.0f, true, false, 0.0f, 16.97f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, 0.0f, -16.97f)
                close()
                moveTo(21.934f, 10.932f)
                arcToRelative(7.964f, 7.964f, 0.0f, false, true, -8.865f, -8.866f)
                arcToRelative(9.961f, 9.961f, 0.0f, false, true, 8.865f, 8.866f)
                close()
                moveTo(2.066f, 13.068f)
                arcToRelative(7.964f, 7.964f, 0.0f, false, true, 8.865f, 8.866f)
                arcToRelative(9.961f, 9.961f, 0.0f, false, true, -8.865f, -8.866f)
                close()
                moveTo(19.071f, 19.068f)
                arcToRelative(9.947f, 9.947f, 0.0f, false, true, -6.127f, 2.879f)
                arcToRelative(9.971f, 9.971f, 0.0f, false, false, -10.9f, -10.894f)
                arcToRelative(9.979f, 9.979f, 0.0f, false, true, 9.012f, -9.003f)
                arcToRelative(9.986f, 9.986f, 0.0f, false, false, 9.944f, 10.95f)
                curveToRelative(0.317f, 0.0f, 0.635f, -0.016f, 0.953f, -0.046f)
                arcToRelative(9.951f, 9.951f, 0.0f, false, true, -2.882f, 6.117f)
                close()
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
