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

public val Icons.Outline.PhoneCross: ImageVector
    get() {
        if (_phoneCross != null) {
            return _phoneCross!!
        }
        _phoneCross = Builder(name = "PhoneCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 16.653f)
                lineToRelative(-2.34f, -1.8f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -4.281f, 0.006f)
                lineTo(14.91f, 16.027f)
                arcTo(12.781f, 12.781f, 0.0f, false, true, 7.979f, 9.082f)
                lineTo(9.137f, 7.626f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.007f, -4.282f)
                lineTo(7.346f, 1.0f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, false, -0.086f, -0.1f)
                arcTo(3.081f, 3.081f, 0.0f, false, false, 2.934f, 0.859f)
                lineToRelative(-1.15f, 1.0f)
                curveToRelative(-7.719f, 8.21f, 12.2f, 28.145f, 20.4f, 20.3f)
                lineToRelative(0.91f, -1.049f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.0f, -4.378f)
                arcTo(1.125f, 1.125f, 0.0f, false, false, 23.0f, 16.653f)
                close()
                moveTo(21.636f, 19.753f)
                lineTo(20.725f, 20.803f)
                curveTo(14.788f, 26.418f, -2.5f, 10.114f, 3.147f, 3.325f)
                lineToRelative(1.15f, -1.0f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 1.51f, -0.039f)
                lineTo(7.593f, 4.609f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.086f, 0.1f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 0.0f, 1.549f)
                arcTo(0.849f, 0.849f, 0.0f, false, false, 7.6f, 6.34f)
                lineTo(6.044f, 8.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.145f, 1.0f)
                arcToRelative(15.009f, 15.009f, 0.0f, false, false, 8.822f, 8.811f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.979f, -0.152f)
                lineTo(17.66f, 16.4f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, 0.084f, -0.076f)
                arcToRelative(1.128f, 1.128f, 0.0f, false, true, 1.647f, 0.086f)
                lineToRelative(2.326f, 1.787f)
                arcTo(1.121f, 1.121f, 0.0f, false, true, 21.632f, 19.754f)
                close()
                moveTo(23.707f, 6.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 1.414f)
                lineTo(20.0f, 5.414f)
                lineTo(17.707f, 7.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineTo(18.586f, 4.0f)
                lineTo(16.293f, 1.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.707f, 0.293f)
                lineTo(20.0f, 2.586f)
                lineTo(22.293f, 0.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                lineTo(21.414f, 4.0f)
                close()
            }
        }
        .build()
        return _phoneCross!!
    }

private var _phoneCross: ImageVector? = null
