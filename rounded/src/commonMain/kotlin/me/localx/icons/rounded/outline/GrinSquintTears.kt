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

public val Icons.Outline.GrinSquintTears: ImageVector
    get() {
        if (_grinSquintTears != null) {
            return _grinSquintTears!!
        }
        _grinSquintTears = Builder(name = "GrinSquintTears", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.515f, 18.782f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.329f, -1.817f)
                arcToRelative(15.391f, 15.391f, 0.0f, false, false, 4.079f, -2.7f)
                arcToRelative(15.416f, 15.416f, 0.0f, false, false, 2.7f, -4.079f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.817f, 0.329f)
                arcTo(6.69f, 6.69f, 0.0f, false, true, 10.515f, 18.782f)
                close()
                moveTo(6.627f, 18.3f)
                curveToRelative(-5.954f, 7.53f, 6.93f, 7.556f, 0.974f, 0.0f)
                arcTo(0.637f, 0.637f, 0.0f, false, false, 6.627f, 18.3f)
                close()
                moveTo(4.935f, 4.923f)
                arcToRelative(10.042f, 10.042f, 0.0f, false, true, 13.058f, -0.94f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.2f, -1.6f)
                arcToRelative(12.006f, 12.006f, 0.0f, false, false, -16.8f, 16.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.6f, -1.2f)
                arcTo(10.043f, 10.043f, 0.0f, false, true, 4.935f, 4.923f)
                close()
                moveTo(23.0f, 11.028f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcTo(10.057f, 10.057f, 0.0f, false, true, 12.025f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                arcTo(12.067f, 12.067f, 0.0f, false, false, 24.0f, 12.031f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 11.028f)
                close()
                moveTo(18.307f, 7.6f)
                curveToRelative(7.559f, 5.954f, 7.52f, -6.929f, 0.0f, -0.974f)
                arcTo(0.637f, 0.637f, 0.0f, false, false, 18.307f, 7.6f)
                close()
                moveTo(12.2f, 3.948f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.176f, 0.784f)
                lineToRelative(-0.708f, 3.536f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, 1.177f, 1.177f)
                lineToRelative(3.536f, -0.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.393f, -1.961f)
                lineToRelative(-2.064f, 0.412f)
                lineToRelative(0.412f, -2.064f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.2f, 3.948f)
                close()
                moveTo(8.268f, 10.312f)
                lineToRelative(-3.536f, 0.708f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.393f, 1.96f)
                lineToRelative(2.064f, -0.412f)
                lineToRelative(-0.412f, 2.064f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.961f, 0.393f)
                lineToRelative(0.707f, -3.536f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.177f, -1.177f)
                close()
            }
        }
        .build()
        return _grinSquintTears!!
    }

private var _grinSquintTears: ImageVector? = null
