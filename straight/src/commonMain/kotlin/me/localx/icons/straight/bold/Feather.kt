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

public val Icons.Bold.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.122f, 0.879f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, false, -2.559f, -0.847f)
                arcToRelative(28.427f, 28.427f, 0.0f, false, false, -15.263f, 7.585f)
                arcToRelative(7.862f, 7.862f, 0.0f, false, false, -0.968f, 9.932f)
                lineToRelative(-4.268f, 4.265f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(4.268f, -4.269f)
                arcToRelative(7.614f, 7.614f, 0.0f, false, false, 4.285f, 1.326f)
                arcToRelative(8.325f, 8.325f, 0.0f, false, false, 6.0f, -2.588f)
                arcToRelative(28.731f, 28.731f, 0.0f, false, false, 7.23f, -14.989f)
                arcToRelative(2.957f, 2.957f, 0.0f, false, false, -0.847f, -2.537f)
                close()
                moveTo(6.006f, 13.42f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, 1.417f, -3.686f)
                curveToRelative(0.189f, -0.189f, 0.384f, -0.362f, 0.577f, -0.541f)
                verticalLineToRelative(4.686f)
                lineToRelative(-1.488f, 1.488f)
                arcToRelative(4.856f, 4.856f, 0.0f, false, true, -0.506f, -1.947f)
                close()
                moveTo(14.572f, 16.331f)
                arcToRelative(5.131f, 5.131f, 0.0f, false, true, -5.949f, 1.169f)
                lineToRelative(4.5f, -4.5f)
                horizontalLineToRelative(4.061f)
                arcToRelative(22.074f, 22.074f, 0.0f, false, true, -2.612f, 3.331f)
                close()
                moveTo(18.836f, 10.0f)
                horizontalLineToRelative(-2.715f)
                lineToRelative(1.94f, -1.939f)
                lineToRelative(-2.122f, -2.122f)
                lineToRelative(-4.939f, 4.94f)
                verticalLineToRelative(-4.026f)
                arcToRelative(26.735f, 26.735f, 0.0f, false, true, 10.0f, -3.863f)
                arcToRelative(26.5f, 26.5f, 0.0f, false, true, -2.164f, 7.01f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
