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

public val Icons.Bold.Grill: ImageVector
    get() {
        if (_grill != null) {
            return _grill!!
        }
        _grill = Builder(name = "Grill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.29f, 7.3f)
                arcToRelative(3.413f, 3.413f, 0.0f, false, false, -2.7f, -1.3f)
                lineTo(3.41f, 6.0f)
                arcToRelative(3.419f, 3.419f, 0.0f, false, false, -2.7f, 1.3f)
                arcToRelative(3.258f, 3.258f, 0.0f, false, false, -0.615f, 2.795f)
                arcTo(11.468f, 11.468f, 0.0f, false, false, 5.306f, 17.1f)
                lineTo(3.135f, 21.879f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.73f, 1.242f)
                lineToRelative(2.163f, -4.757f)
                arcTo(12.783f, 12.783f, 0.0f, false, false, 10.5f, 18.9f)
                verticalLineToRelative(3.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(13.5f, 18.9f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, false, 2.472f, -0.537f)
                lineToRelative(2.163f, 4.757f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.73f, -1.242f)
                lineTo(18.694f, 17.1f)
                arcToRelative(11.464f, 11.464f, 0.0f, false, false, 5.213f, -7.007f)
                arcTo(3.26f, 3.26f, 0.0f, false, false, 23.29f, 7.3f)
                close()
                moveTo(20.99f, 9.4f)
                arcTo(9.118f, 9.118f, 0.0f, false, true, 12.0f, 16.0f)
                arcTo(9.12f, 9.12f, 0.0f, false, true, 3.007f, 9.392f)
                arcToRelative(0.259f, 0.259f, 0.0f, false, true, 0.057f, -0.237f)
                arcTo(0.423f, 0.423f, 0.0f, false, true, 3.41f, 9.0f)
                lineTo(20.588f, 9.0f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, true, 0.347f, 0.155f)
                arcTo(0.272f, 0.272f, 0.0f, false, true, 20.991f, 9.393f)
                close()
                moveTo(10.5f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(16.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(5.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _grill!!
    }

private var _grill: ImageVector? = null
