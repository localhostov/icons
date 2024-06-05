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

public val Icons.Bold.CloudDisabled: ImageVector
    get() {
        if (_cloudDisabled != null) {
            return _cloudDisabled!!
        }
        _cloudDisabled = Builder(name = "CloudDisabled", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.082f, 19.961f)
                arcToRelative(7.585f, 7.585f, 0.0f, false, false, 1.893f, -4.461f)
                arcToRelative(8.111f, 8.111f, 0.0f, false, false, -5.749f, -8.434f)
                arcToRelative(0.489f, 0.489f, 0.0f, false, true, -0.328f, -0.335f)
                arcToRelative(8.189f, 8.189f, 0.0f, false, false, -12.959f, -3.913f)
                lineToRelative(-2.378f, -2.379f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 2.122f)
                lineToRelative(21.0f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                close()
                moveTo(9.31f, 4.057f)
                arcToRelative(5.172f, 5.172f, 0.0f, false, true, 5.724f, 3.565f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.313f, 2.313f)
                arcToRelative(5.126f, 5.126f, 0.0f, false, true, 3.637f, 5.33f)
                arcToRelative(4.556f, 4.556f, 0.0f, false, true, -1.037f, 2.561f)
                lineToRelative(-12.856f, -12.856f)
                arcToRelative(5.068f, 5.068f, 0.0f, false, true, 2.219f, -0.913f)
                close()
                moveTo(16.0f, 21.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-8.53f)
                arcToRelative(6.061f, 6.061f, 0.0f, false, true, -5.91f, -4.937f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, 2.286f, -5.463f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, 0.109f, -0.532f)
                arcToRelative(7.966f, 7.966f, 0.0f, false, true, -0.374f, -1.259f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.935f, -0.618f)
                arcToRelative(5.041f, 5.041f, 0.0f, false, false, 0.235f, 0.791f)
                arcToRelative(3.411f, 3.411f, 0.0f, false, true, -1.126f, 4.033f)
                arcToRelative(2.729f, 2.729f, 0.0f, false, false, -1.1f, 2.623f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 2.945f, 2.362f)
                horizontalLineToRelative(8.53f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _cloudDisabled!!
    }

private var _cloudDisabled: ImageVector? = null
