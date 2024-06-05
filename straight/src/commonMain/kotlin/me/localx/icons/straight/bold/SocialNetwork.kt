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

public val Icons.Bold.SocialNetwork: ImageVector
    get() {
        if (_socialNetwork != null) {
            return _socialNetwork!!
        }
        _socialNetwork = Builder(name = "SocialNetwork", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.543f, 7.0f)
                lineToRelative(0.182f, -1.072f)
                arcToRelative(3.39f, 3.39f, 0.0f, false, false, -0.035f, -1.46f)
                arcTo(3.451f, 3.451f, 0.0f, false, false, 9.226f, 3.8f)
                lineTo(7.59f, 7.0f)
                lineTo(3.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(22.02f, 22.0f)
                lineTo(24.0f, 11.345f)
                lineTo(24.025f, 7.0f)
                close()
                moveTo(3.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                verticalLineToRelative(9.0f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(21.0f, 10.934f)
                lineTo(19.5f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 8.861f)
                lineTo(11.919f, 5.1f)
                arcToRelative(0.446f, 0.446f, 0.0f, false, true, 0.4f, -0.243f)
                arcToRelative(0.445f, 0.445f, 0.0f, false, true, 0.438f, 0.52f)
                lineTo(11.974f, 10.0f)
                lineTo(21.0f, 10.0f)
                close()
            }
        }
        .build()
        return _socialNetwork!!
    }

private var _socialNetwork: ImageVector? = null
