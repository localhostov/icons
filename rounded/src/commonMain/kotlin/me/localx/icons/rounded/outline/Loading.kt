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

public val Icons.Outline.Loading: ImageVector
    get() {
        if (_loading != null) {
            return _loading!!
        }
        _loading = Builder(name = "Loading", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(23.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(18.018f, 1.618f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.367f, 0.364f)
                lineToRelative(-1.0f, 1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.365f, 1.366f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 0.5f, 0.135f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.866f, -0.5f)
                lineToRelative(1.0f, -1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.364f, -1.365f)
                close()
                moveTo(7.987f, 18.921f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.366f, 0.364f)
                lineToRelative(-1.0f, 1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.364f, 1.366f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, false, 0.5f, 0.135f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.867f, -0.5f)
                lineToRelative(1.0f, -1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.365f, -1.365f)
                close()
                moveTo(4.715f, 6.621f)
                lineTo(2.984f, 5.621f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.731f)
                lineToRelative(1.731f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.731f)
                close()
                moveTo(22.015f, 16.651f)
                lineTo(20.284f, 15.651f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.731f)
                lineToRelative(1.731f, 1.0f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 0.5f, 0.135f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, -1.866f)
                close()
                moveTo(7.349f, 1.982f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.731f, 1.0f)
                lineToRelative(1.0f, 1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.866f, 0.5f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 0.5f, -0.135f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.365f, -1.366f)
                close()
                moveTo(17.379f, 19.282f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.731f, 1.0f)
                lineToRelative(1.0f, 1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.731f, -1.0f)
                close()
                moveTo(19.787f, 8.482f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, -0.134f)
                lineToRelative(1.731f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.731f)
                lineToRelative(-1.731f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, 1.865f)
                close()
                moveTo(3.713f, 15.648f)
                lineTo(1.982f, 16.648f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, 1.866f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 0.5f, -0.135f)
                lineToRelative(1.731f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.731f)
                close()
            }
        }
        .build()
        return _loading!!
    }

private var _loading: ImageVector? = null
