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

public val Icons.Outline.TintSlash: ImageVector
    get() {
        if (_tintSlash != null) {
            return _tintSlash!!
        }
        _tintSlash = Builder(name = "TintSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.0f)
                curveToRelative(-2.938f, 0.0f, -5.7f, -1.145f, -7.778f, -3.222f)
                curveToRelative(-2.078f, -2.078f, -3.222f, -4.841f, -3.222f, -7.778f)
                curveToRelative(0.0f, -1.38f, 0.453f, -2.89f, 1.345f, -4.487f)
                curveToRelative(0.269f, -0.482f, 0.877f, -0.655f, 1.36f, -0.386f)
                curveToRelative(0.482f, 0.27f, 0.655f, 0.878f, 0.386f, 1.36f)
                curveToRelative(-0.724f, 1.297f, -1.091f, 2.479f, -1.091f, 3.513f)
                curveToRelative(0.0f, 2.403f, 0.937f, 4.664f, 2.636f, 6.364f)
                curveToRelative(1.7f, 1.699f, 3.96f, 2.636f, 6.364f, 2.636f)
                curveToRelative(1.404f, 0.0f, 2.804f, -0.332f, 4.05f, -0.96f)
                curveToRelative(0.491f, -0.251f, 1.094f, -0.051f, 1.343f, 0.442f)
                reflectiveCurveToRelative(0.051f, 1.095f, -0.442f, 1.343f)
                curveToRelative(-1.523f, 0.769f, -3.235f, 1.175f, -4.95f, 1.175f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(-0.467f, 0.0f, -0.919f, 0.165f, -1.272f, 0.465f)
                curveToRelative(-1.061f, 0.9f, -2.082f, 1.869f, -2.953f, 2.801f)
                lineToRelative(-0.046f, 0.049f)
                lineToRelative(11.006f, 11.006f)
                curveToRelative(0.829f, -1.287f, 1.265f, -2.774f, 1.265f, -4.322f)
                curveToRelative(0.0f, -2.395f, -2.515f, -5.959f, -6.728f, -9.534f)
                curveToRelative(-0.353f, -0.3f, -0.805f, -0.465f, -1.272f, -0.465f)
                moveTo(1.0f, 0.0f)
                curveToRelative(0.256f, 0.0f, 0.512f, 0.098f, 0.707f, 0.293f)
                lineToRelative(4.607f, 4.607f)
                curveToRelative(1.064f, -1.138f, 2.169f, -2.153f, 3.12f, -2.96f)
                curveToRelative(0.738f, -0.627f, 1.652f, -0.94f, 2.566f, -0.94f)
                reflectiveCurveToRelative(1.828f, 0.313f, 2.566f, 0.94f)
                curveToRelative(2.963f, 2.514f, 7.434f, 7.048f, 7.434f, 11.059f)
                curveToRelative(0.0f, 2.02f, -0.608f, 4.04f, -1.825f, 5.762f)
                lineToRelative(3.532f, 3.532f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                curveToRelative(0.195f, -0.195f, 0.451f, -0.293f, 0.707f, -0.293f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _tintSlash!!
    }

private var _tintSlash: ImageVector? = null
