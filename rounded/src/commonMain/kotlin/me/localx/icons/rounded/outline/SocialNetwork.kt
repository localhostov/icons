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

public val Icons.Outline.SocialNetwork: ImageVector
    get() {
        if (_socialNetwork != null) {
            return _socialNetwork!!
        }
        _socialNetwork = Builder(name = "SocialNetwork", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.773f, 7.721f)
                arcTo(4.994f, 4.994f, 0.0f, false, false, 19.0f, 6.0f)
                lineTo(15.011f, 6.0f)
                lineToRelative(0.336f, -2.041f)
                arcTo(3.037f, 3.037f, 0.0f, false, false, 9.626f, 2.122f)
                lineTo(7.712f, 6.0f)
                lineTo(5.0f, 6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(18.3f, 21.0f)
                arcToRelative(5.024f, 5.024f, 0.0f, false, false, 4.951f, -4.3f)
                lineToRelative(0.705f, -5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 22.773f, 7.721f)
                close()
                moveTo(2.0f, 16.0f)
                lineTo(2.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                lineTo(7.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 16.0f)
                close()
                moveTo(21.971f, 11.419f)
                lineTo(21.265f, 16.419f)
                arcTo(3.012f, 3.012f, 0.0f, false, true, 18.3f, 19.0f)
                lineTo(9.0f, 19.0f)
                lineTo(9.0f, 7.734f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.23f, -0.292f)
                lineToRelative(2.189f, -4.435f)
                arcTo(1.07f, 1.07f, 0.0f, false, true, 13.141f, 2.8f)
                arcToRelative(1.024f, 1.024f, 0.0f, false, true, 0.233f, 0.84f)
                lineToRelative(-0.528f, 3.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.833f, 8.0f)
                lineTo(19.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.971f, 3.419f)
                close()
            }
        }
        .build()
        return _socialNetwork!!
    }

private var _socialNetwork: ImageVector? = null
