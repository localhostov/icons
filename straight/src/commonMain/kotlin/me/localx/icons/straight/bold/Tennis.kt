package me.localx.icons.straight.bold

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

public val Icons.Bold.Tennis: ImageVector
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
                moveTo(20.761f, 9.992f)
                arcToRelative(7.088f, 7.088f, 0.0f, false, true, -6.752f, -6.753f)
                arcToRelative(8.924f, 8.924f, 0.0f, false, true, 6.752f, 6.753f)
                close()
                moveTo(3.239f, 14.009f)
                arcToRelative(7.086f, 7.086f, 0.0f, false, true, 6.752f, 6.752f)
                arcToRelative(8.924f, 8.924f, 0.0f, false, true, -6.752f, -6.752f)
                close()
                moveTo(18.364f, 18.364f)
                arcToRelative(8.948f, 8.948f, 0.0f, false, true, -5.38f, 2.573f)
                arcToRelative(10.042f, 10.042f, 0.0f, false, false, -9.921f, -9.922f)
                arcToRelative(8.959f, 8.959f, 0.0f, false, true, 7.953f, -7.952f)
                arcToRelative(10.058f, 10.058f, 0.0f, false, false, 9.92f, 9.931f)
                arcToRelative(8.948f, 8.948f, 0.0f, false, true, -2.572f, 5.37f)
                close()
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
