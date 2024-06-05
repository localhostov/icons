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

public val Icons.Outline.Invest: ImageVector
    get() {
        if (_invest != null) {
            return _invest!!
        }
        _invest = Builder(name = "Invest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.501f, 7.205f)
                curveToRelative(-0.479f, -0.277f, -1.09f, -0.114f, -1.367f, 0.365f)
                curveToRelative(-0.276f, 0.479f, -0.113f, 1.09f, 0.365f, 1.367f)
                curveToRelative(2.16f, 1.249f, 3.501f, 3.573f, 3.501f, 6.064f)
                curveToRelative(0.0f, 1.57f, -0.52f, 3.021f, -1.396f, 4.19f)
                lineToRelative(-4.604f, -4.604f)
                lineTo(13.0f, 3.0f)
                lineToRelative(1.293f, 1.293f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-2.293f, -2.293f)
                curveToRelative(-0.779f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                lineToRelative(-2.293f, 2.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                reflectiveCurveToRelative(1.023f, 0.391f, 1.414f, 0.0f)
                lineToRelative(1.293f, -1.293f)
                verticalLineToRelative(3.056f)
                curveToRelative(-4.494f, 0.499f, -8.0f, 4.32f, -8.0f, 8.944f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -3.203f, -1.724f, -6.19f, -4.499f, -7.795f)
                close()
                moveTo(5.0f, 15.0f)
                curveToRelative(0.0f, -3.52f, 2.612f, -6.442f, 6.0f, -6.928f)
                verticalLineToRelative(6.514f)
                curveToRelative(0.0f, 0.526f, 0.213f, 1.042f, 0.586f, 1.414f)
                lineToRelative(4.604f, 4.604f)
                curveToRelative(-1.169f, 0.876f, -2.62f, 1.396f, -4.19f, 1.396f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _invest!!
    }

private var _invest: ImageVector? = null
