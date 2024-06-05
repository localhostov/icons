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

public val Icons.Bold.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.7f, 9.886f)
                arcToRelative(12.63f, 12.63f, 0.0f, false, false, -10.2f, -7.786f)
                verticalLineToRelative(-0.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(0.607f)
                arcToRelative(12.831f, 12.831f, 0.0f, false, false, -10.2f, 7.779f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, false, 0.508f, 4.214f)
                arcToRelative(4.348f, 4.348f, 0.0f, false, false, 3.569f, 1.9f)
                horizontalLineToRelative(6.123f)
                verticalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.495f, 0.086f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.983f, 0.328f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 7.478f, -0.414f)
                verticalLineToRelative(-4.25f)
                horizontalLineToRelative(6.123f)
                arcToRelative(4.348f, 4.348f, 0.0f, false, false, 3.569f, -1.9f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, false, 0.508f, -4.214f)
                close()
                moveTo(20.722f, 12.4f)
                arcToRelative(1.335f, 1.335f, 0.0f, false, true, -1.1f, 0.6f)
                horizontalLineToRelative(-15.245f)
                arcToRelative(1.335f, 1.335f, 0.0f, false, true, -1.1f, -0.6f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, -0.177f, -1.446f)
                arcToRelative(9.749f, 9.749f, 0.0f, false, true, 8.908f, -5.954f)
                arcToRelative(9.736f, 9.736f, 0.0f, false, true, 8.892f, 5.954f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, -0.178f, 1.446f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
