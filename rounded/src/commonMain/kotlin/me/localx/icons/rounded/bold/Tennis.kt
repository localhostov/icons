package me.localx.icons.rounded.bold

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
                moveToRelative(20.491f, 3.509f)
                arcToRelative(11.995f, 11.995f, 0.0f, true, false, 0.0f, 16.971f)
                arcToRelative(12.014f, 12.014f, 0.0f, false, false, 0.0f, -16.971f)
                close()
                moveTo(20.766f, 9.985f)
                arcToRelative(7.086f, 7.086f, 0.0f, false, true, -6.752f, -6.752f)
                arcToRelative(8.92f, 8.92f, 0.0f, false, true, 6.752f, 6.752f)
                close()
                moveTo(3.245f, 14.0f)
                arcToRelative(7.088f, 7.088f, 0.0f, false, true, 6.755f, 6.755f)
                arcToRelative(8.917f, 8.917f, 0.0f, false, true, -6.755f, -6.755f)
                close()
                moveTo(18.37f, 18.359f)
                arcToRelative(8.958f, 8.958f, 0.0f, false, true, -5.38f, 2.573f)
                arcToRelative(10.04f, 10.04f, 0.0f, false, false, -9.922f, -9.922f)
                arcToRelative(8.959f, 8.959f, 0.0f, false, true, 7.953f, -7.953f)
                arcToRelative(10.058f, 10.058f, 0.0f, false, false, 9.921f, 9.931f)
                arcToRelative(8.956f, 8.956f, 0.0f, false, true, -2.572f, 5.371f)
                close()
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
