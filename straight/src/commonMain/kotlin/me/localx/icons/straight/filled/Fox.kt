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

public val Icons.Filled.Fox: ImageVector
    get() {
        if (_fox != null) {
            return _fox!!
        }
        _fox = Builder(name = "Fox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                verticalLineTo(8.015f)
                curveToRelative(-5.189f, 0.275f, -10.863f, 3.271f, -11.0f, 10.978f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                lineToRelative(0.0f, -1.0f)
                lineToRelative(0.0f, -0.007f)
                curveTo(11.0f, 12.026f, 6.034f, 9.412f, 3.14f, 8.48f)
                arcTo(10.536f, 10.536f, 0.0f, false, false, 0.0f, 8.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(1.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 6.6f, 3.782f)
                arcTo(21.876f, 21.876f, 0.0f, false, true, 12.0f, 3.0f)
                arcToRelative(21.868f, 21.868f, 0.0f, false, true, 5.4f, 0.782f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 23.0f, 0.0f)
                close()
                moveTo(21.491f, 10.352f)
                arcTo(11.258f, 11.258f, 0.0f, false, false, 20.0f, 10.93f)
                arcToRelative(3.817f, 3.817f, 0.0f, false, true, -3.614f, 3.042f)
                arcTo(8.89f, 8.89f, 0.0f, false, false, 15.0f, 18.993f)
                verticalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(17.993f)
                arcToRelative(5.786f, 5.786f, 0.0f, false, false, -1.386f, -4.021f)
                arcTo(3.817f, 3.817f, 0.0f, false, true, 4.0f, 10.93f)
                arcToRelative(8.974f, 8.974f, 0.0f, false, false, -4.0f, -0.936f)
                verticalLineToRelative(1.935f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.757f, 4.242f)
                lineToRelative(6.95f, 6.95f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.829f, 24.0f)
                horizontalLineToRelative(2.343f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.12f, -0.878f)
                lineToRelative(6.95f, -6.95f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 24.0f, 11.928f)
                verticalLineTo(9.994f)
                arcTo(8.581f, 8.581f, 0.0f, false, false, 21.491f, 10.352f)
                close()
            }
        }
        .build()
        return _fox!!
    }

private var _fox: ImageVector? = null
