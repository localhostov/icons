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

public val Icons.Outline.Fox: ImageVector
    get() {
        if (_fox != null) {
            return _fox!!
        }
        _fox = Builder(name = "Fox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.241f, 0.435f)
                arcToRelative(1.983f, 1.983f, 0.0f, false, false, -1.7f, -0.383f)
                arcTo(6.132f, 6.132f, 0.0f, false, false, 17.4f, 3.782f)
                arcTo(21.876f, 21.876f, 0.0f, false, false, 12.0f, 3.0f)
                arcToRelative(21.876f, 21.876f, 0.0f, false, false, -5.4f, 0.782f)
                arcTo(6.133f, 6.133f, 0.0f, false, false, 2.456f, 0.052f)
                arcToRelative(1.982f, 1.982f, 0.0f, false, false, -1.7f, 0.383f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.006f)
                lineTo(0.0f, 9.858f)
                arcToRelative(10.927f, 10.927f, 0.0f, false, false, 3.222f, 7.778f)
                lineToRelative(4.657f, 4.657f)
                arcToRelative(5.862f, 5.862f, 0.0f, false, false, 8.242f, 0.0f)
                lineToRelative(4.657f, -4.657f)
                arcTo(10.931f, 10.931f, 0.0f, false, false, 24.0f, 9.858f)
                lineTo(24.0f, 2.006f)
                arcTo(1.994f, 1.994f, 0.0f, false, false, 23.241f, 0.435f)
                close()
                moveTo(5.051f, 5.316f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.264f, 0.633f)
                arcTo(20.924f, 20.924f, 0.0f, false, true, 12.0f, 5.0f)
                arcToRelative(20.934f, 20.934f, 0.0f, false, true, 5.685f, 0.949f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.263f, -0.633f)
                curveToRelative(0.617f, -1.849f, 1.671f, -2.995f, 3.052f, -3.31f)
                lineTo(22.0f, 8.173f)
                curveToRelative(-2.428f, 0.559f, -9.0f, 2.811f, -9.0f, 10.827f)
                verticalLineToRelative(0.184f)
                arcToRelative(2.868f, 2.868f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 19.0f)
                curveTo(11.0f, 10.985f, 4.429f, 8.732f, 2.0f, 8.173f)
                lineTo(2.0f, 2.0f)
                curveTo(3.381f, 2.321f, 4.435f, 3.468f, 5.051f, 5.316f)
                close()
                moveTo(4.636f, 16.222f)
                arcToRelative(8.929f, 8.929f, 0.0f, false, true, -2.618f, -6.0f)
                arcTo(11.431f, 11.431f, 0.0f, false, true, 4.0f, 10.945f)
                lineTo(4.0f, 11.0f)
                arcToRelative(3.781f, 3.781f, 0.0f, false, false, 3.6f, 2.978f)
                arcTo(8.852f, 8.852f, 0.0f, false, true, 9.0f, 19.0f)
                verticalLineToRelative(1.586f)
                close()
                moveTo(19.364f, 16.222f)
                lineTo(15.0f, 20.586f)
                lineTo(15.0f, 19.0f)
                arcToRelative(8.852f, 8.852f, 0.0f, false, true, 1.4f, -5.022f)
                arcTo(3.783f, 3.783f, 0.0f, false, false, 20.0f, 11.0f)
                verticalLineToRelative(-0.055f)
                arcToRelative(11.431f, 11.431f, 0.0f, false, true, 1.982f, -0.722f)
                arcTo(8.929f, 8.929f, 0.0f, false, true, 19.364f, 16.222f)
                close()
            }
        }
        .build()
        return _fox!!
    }

private var _fox: ImageVector? = null
