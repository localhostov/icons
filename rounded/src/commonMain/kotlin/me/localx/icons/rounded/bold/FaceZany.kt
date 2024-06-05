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

public val Icons.Bold.FaceZany: ImageVector
    get() {
        if (_faceZany != null) {
            return _faceZany!!
        }
        _faceZany = Builder(name = "FaceZany", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(17.0f, 8.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.159f, 1.218f, 6.142f, 3.429f, 8.398f)
                curveToRelative(0.581f, 0.593f, 1.53f, 0.602f, 2.121f, 0.021f)
                curveToRelative(0.592f, -0.58f, 0.602f, -1.529f, 0.021f, -2.121f)
                curveToRelative(-1.658f, -1.692f, -2.571f, -3.929f, -2.571f, -6.298f)
                curveTo(3.0f, 7.038f, 7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                curveToRelative(0.0f, 3.809f, -2.411f, 7.22f, -6.0f, 8.488f)
                curveToRelative(-0.781f, 0.276f, -1.19f, 1.133f, -0.914f, 1.914f)
                curveToRelative(0.218f, 0.616f, 0.796f, 1.0f, 1.414f, 1.0f)
                curveToRelative(0.166f, 0.0f, 0.335f, -0.028f, 0.5f, -0.086f)
                curveToRelative(4.785f, -1.691f, 8.0f, -6.239f, 8.0f, -11.316f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.0f, 18.471f)
                curveToRelative(2.889f, -1.215f, 3.891f, -3.919f, 3.997f, -5.399f)
                curveToRelative(0.001f, -0.015f, -0.006f, -0.022f, -0.007f, -0.035f)
                curveToRelative(0.01f, -0.275f, -0.083f, -0.551f, -0.297f, -0.756f)
                curveToRelative(-0.396f, -0.382f, -1.03f, -0.372f, -1.414f, 0.026f)
                curveToRelative(-3.179f, 3.302f, -8.296f, 3.692f, -8.347f, 3.696f)
                curveToRelative(-0.527f, 0.036f, -0.919f, 0.477f, -0.921f, 0.996f)
                horizontalLineToRelative(-0.012f)
                verticalLineToRelative(2.001f)
                curveToRelative(0.0f, 1.5f, 1.0f, 3.0f, 2.5f, 3.0f)
                reflectiveCurveToRelative(2.5f, -1.5f, 2.5f, -3.0f)
                verticalLineToRelative(-1.847f)
                curveToRelative(0.64f, -0.214f, 1.314f, -0.479f, 2.0f, -0.812f)
                verticalLineToRelative(2.13f)
                close()
            }
        }
        .build()
        return _faceZany!!
    }

private var _faceZany: ImageVector? = null
