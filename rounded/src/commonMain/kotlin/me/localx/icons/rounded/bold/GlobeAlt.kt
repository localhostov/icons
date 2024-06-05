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

public val Icons.Bold.GlobeAlt: ImageVector
    get() {
        if (_globeAlt != null) {
            return _globeAlt!!
        }
        _globeAlt = Builder(name = "GlobeAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.418f, 15.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, -7.5f, -7.5f)
                arcToRelative(7.508f, 7.508f, 0.0f, false, false, 7.5f, 7.5f)
                close()
                moveTo(13.418f, 3.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -4.5f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, -4.5f)
                close()
                moveTo(23.737f, 14.556f)
                arcToRelative(12.489f, 12.489f, 0.0f, false, true, -9.319f, 5.383f)
                verticalLineToRelative(1.061f)
                horizontalLineToRelative(3.082f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(2.918f)
                verticalLineToRelative(-1.175f)
                arcToRelative(12.489f, 12.489f, 0.0f, false, true, -8.477f, -19.144f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.513f, 1.638f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 15.809f, 10.541f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.474f, 1.7f)
                close()
            }
        }
        .build()
        return _globeAlt!!
    }

private var _globeAlt: ImageVector? = null
