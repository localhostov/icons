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

public val Icons.Bold.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.552f, 13.21f)
                lineTo(20.8f, 6.916f)
                arcTo(9.443f, 9.443f, 0.0f, false, false, 2.486f, 7.4f)
                lineTo(1.132f, 13.489f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 6.5f, 20.182f)
                horizontalLineToRelative(0.4f)
                arcToRelative(5.285f, 5.285f, 0.0f, false, false, 10.154f, 0.0f)
                horizontalLineToRelative(0.193f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.3f, -6.972f)
                close()
                moveTo(19.243f, 16.194f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, -1.991f, 0.988f)
                lineTo(6.5f, 17.182f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.44f, -3.042f)
                lineToRelative(1.354f, -6.1f)
                arcToRelative(6.443f, 6.443f, 0.0f, false, true, 12.5f, -0.326f)
                lineToRelative(1.748f, 6.294f)
                arcTo(2.478f, 2.478f, 0.0f, false, true, 19.243f, 16.194f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
