package me.localx.icons.rounded.filled

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

public val Icons.Filled.Loading: ImageVector
    get() {
        if (_loading != null) {
            return _loading!!
        }
        _loading = Builder(name = "Loading", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(13.0f, 23.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(17.379f, 4.715f)
                lineTo(18.379f, 2.984f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.731f, -1.0f)
                lineToRelative(-1.0f, 1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.365f, 1.366f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 0.5f, 0.135f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.866f, -0.501f)
                close()
                moveTo(7.349f, 22.015f)
                lineTo(8.349f, 20.284f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.731f, -1.0f)
                lineToRelative(-1.0f, 1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.364f, 1.366f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, false, 0.5f, 0.135f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.867f, -0.498f)
                close()
                moveTo(5.079f, 7.987f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.364f, -1.366f)
                lineToRelative(-1.731f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.731f)
                lineToRelative(1.731f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.366f, -0.365f)
                close()
                moveTo(22.379f, 18.018f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.364f, -1.367f)
                lineToRelative(-1.731f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.731f)
                lineToRelative(1.731f, 1.0f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 0.5f, 0.135f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.867f, -0.499f)
                close()
                moveTo(7.987f, 5.079f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.365f, -1.366f)
                lineToRelative(-1.0f, -1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.731f, 1.0f)
                lineToRelative(1.0f, 1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.866f, 0.5f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 0.5f, -0.134f)
                close()
                moveTo(18.018f, 22.379f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.364f, -1.366f)
                lineToRelative(-1.0f, -1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.731f, 1.0f)
                lineToRelative(1.0f, 1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.367f, 0.364f)
                close()
                moveTo(20.287f, 8.349f)
                lineTo(22.018f, 7.349f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.731f)
                lineToRelative(-1.731f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.731f)
                close()
                moveTo(2.987f, 18.379f)
                lineTo(4.718f, 17.379f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.731f)
                lineToRelative(-1.731f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, 1.866f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 0.497f, -0.132f)
                close()
            }
        }
        .build()
        return _loading!!
    }

private var _loading: ImageVector? = null
