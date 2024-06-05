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

public val Icons.Outline.GlobeAlt: ImageVector
    get() {
        if (_globeAlt != null) {
            return _globeAlt!!
        }
        _globeAlt = Builder(name = "GlobeAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, 8.0f, 8.0f)
                close()
                moveTo(13.0f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.0f, 6.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, 6.0f, -6.0f)
                close()
                moveTo(22.907f, 14.773f)
                arcToRelative(11.992f, 11.992f, 0.0f, false, true, -8.907f, 5.166f)
                verticalLineToRelative(2.061f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.051f)
                arcToRelative(11.994f, 11.994f, 0.0f, false, true, -8.257f, -19.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.542f, 1.274f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 15.971f, 12.006f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.651f, 1.13f)
                close()
            }
        }
        .build()
        return _globeAlt!!
    }

private var _globeAlt: ImageVector? = null
