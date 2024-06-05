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

public val Icons.Bold.HomeLocationAlt: ImageVector
    get() {
        if (_homeLocationAlt != null) {
            return _homeLocationAlt!!
        }
        _homeLocationAlt = Builder(name = "HomeLocationAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.924f)
                lineTo(24.0f, 18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 18.5f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                lineTo(21.0f, 9.924f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.1f, -2.073f)
                lineTo(13.3f, 3.4f)
                arcToRelative(2.306f, 2.306f, 0.0f, false, false, -2.593f, 0.0f)
                lineTo(4.1f, 7.851f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 9.924f)
                lineTo(3.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 18.5f)
                lineTo(0.0f, 9.924f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 2.423f, -4.56f)
                lineTo(9.025f, 0.91f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, true, 5.95f, 0.0f)
                lineToRelative(6.6f, 4.454f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 24.0f, 9.924f)
                close()
                moveTo(19.0f, 15.0f)
                arcToRelative(6.95f, 6.95f, 0.0f, false, true, -2.05f, 4.949f)
                lineToRelative(-3.593f, 3.515f)
                arcToRelative(1.932f, 1.932f, 0.0f, false, true, -2.712f, 0.0f)
                lineTo(7.062f, 19.961f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 19.0f, 15.0f)
                close()
                moveTo(16.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.829f, 2.828f)
                lineTo(12.0f, 20.6f)
                lineToRelative(2.84f, -2.779f)
                arcTo(3.963f, 3.963f, 0.0f, false, false, 16.0f, 15.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _homeLocationAlt!!
    }

private var _homeLocationAlt: ImageVector? = null
