package me.localx.icons.straight.outline

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

public val Icons.Outline.VenusMars: ImageVector
    get() {
        if (_venusMars != null) {
            return _venusMars!!
        }
        _venusMars = Builder(name = "VenusMars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 0.0f)
                lineTo(18.0f, 0.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(-2.4f, 2.4f)
                arcToRelative(6.941f, 6.941f, 0.0f, false, false, -7.693f, -0.449f)
                arcTo(6.989f, 6.989f, 0.0f, true, false, 6.0f, 16.92f)
                lineTo(6.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                lineTo(8.0f, 16.927f)
                arcToRelative(6.934f, 6.934f, 0.0f, false, false, 2.491f, -0.88f)
                arcTo(6.986f, 6.986f, 0.0f, false, false, 19.6f, 5.816f)
                lineToRelative(2.4f, -2.4f)
                lineTo(22.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 0.0f)
                close()
                moveTo(2.0f, 10.0f)
                arcTo(4.971f, 4.971f, 0.0f, false, true, 8.788f, 5.344f)
                arcToRelative(6.956f, 6.956f, 0.0f, false, false, 0.0f, 9.312f)
                arcTo(4.971f, 4.971f, 0.0f, false, true, 2.0f, 10.0f)
                close()
                moveTo(14.0f, 15.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.0f, -5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 14.0f, 15.0f)
                close()
            }
        }
        .build()
        return _venusMars!!
    }

private var _venusMars: ImageVector? = null
