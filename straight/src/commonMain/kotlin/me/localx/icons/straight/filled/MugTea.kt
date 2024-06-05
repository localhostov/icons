package me.localx.icons.straight.filled

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

public val Icons.Filled.MugTea: ImageVector
    get() {
        if (_mugTea != null) {
            return _mugTea!!
        }
        _mugTea = Builder(name = "MugTea", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.557f, 12.161f)
                curveToRelative(0.181f, -0.906f, 0.328f, -1.848f, 0.426f, -2.828f)
                arcToRelative(3.05f, 3.05f, 0.0f, false, false, -0.77f, -2.346f)
                arcTo(2.994f, 2.994f, 0.0f, false, false, 18.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                verticalLineToRelative(4.584f)
                lineToRelative(2.0f, 2.0f)
                lineTo(12.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                lineTo(6.0f, 12.586f)
                lineToRelative(2.0f, -2.0f)
                lineTo(8.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.215f, 0.984f)
                arcTo(3.05f, 3.05f, 0.0f, false, false, 0.016f, 9.33f)
                arcTo(31.322f, 31.322f, 0.0f, false, false, 5.194f, 23.592f)
                lineToRelative(0.3f, 0.408f)
                lineTo(15.506f, 24.0f)
                lineToRelative(0.3f, -0.408f)
                arcTo(23.419f, 23.419f, 0.0f, false, false, 17.383f, 21.0f)
                lineTo(19.0f, 21.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                curveTo(24.0f, 13.949f, 22.731f, 12.591f, 20.557f, 12.161f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-0.639f)
                arcToRelative(32.618f, 32.618f, 0.0f, false, false, 1.745f, -4.912f)
                curveTo(21.994f, 14.413f, 22.0f, 15.576f, 22.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 19.0f)
                close()
                moveTo(11.026f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.026f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(15.026f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.026f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.026f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.026f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 13.414f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(1.0f, 1.0f)
                lineTo(10.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                close()
            }
        }
        .build()
        return _mugTea!!
    }

private var _mugTea: ImageVector? = null
