package me.localx.icons.straight.bold

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

public val Icons.Bold.Duration: ImageVector
    get() {
        if (_duration != null) {
            return _duration!!
        }
        _duration = Builder(name = "Duration", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 17.0f)
                horizontalLineToRelative(-7.0f)
                reflectiveCurveToRelative(0.0f, -0.407f, 0.0f, -0.909f)
                curveToRelative(0.0f, -1.901f, 1.212f, -3.274f, 2.223f, -4.091f)
                curveToRelative(-1.012f, -0.817f, -2.223f, -2.19f, -2.223f, -4.091f)
                curveToRelative(0.0f, -0.502f, 0.399f, -0.909f, 0.891f, -0.909f)
                horizontalLineToRelative(5.218f)
                curveToRelative(0.492f, 0.0f, 0.891f, 0.407f, 0.891f, 0.909f)
                curveToRelative(0.0f, 1.895f, -1.204f, 3.272f, -2.214f, 4.091f)
                curveToRelative(1.01f, 0.819f, 2.214f, 2.196f, 2.214f, 4.091f)
                curveToRelative(0.0f, 0.502f, 0.0f, 0.909f, 0.0f, 0.909f)
                close()
                moveTo(7.135f, 4.427f)
                lineToRelative(-1.624f, -2.522f)
                curveToRelative(-0.962f, 0.62f, -1.83f, 1.372f, -2.58f, 2.238f)
                lineToRelative(2.267f, 1.965f)
                curveToRelative(0.563f, -0.65f, 1.215f, -1.215f, 1.938f, -1.68f)
                close()
                moveTo(12.0f, 3.0f)
                lineTo(12.0f, 0.0f)
                curveToRelative(-1.15f, 0.0f, -2.288f, 0.163f, -3.381f, 0.483f)
                lineToRelative(0.845f, 2.879f)
                curveToRelative(0.819f, -0.24f, 1.672f, -0.362f, 2.536f, -0.362f)
                close()
                moveTo(3.09f, 13.283f)
                lineToRelative(-2.97f, 0.424f)
                curveToRelative(0.162f, 1.135f, 0.485f, 2.239f, 0.962f, 3.281f)
                lineToRelative(2.729f, -1.248f)
                curveToRelative(-0.357f, -0.78f, -0.599f, -1.606f, -0.721f, -2.457f)
                close()
                moveTo(3.811f, 8.262f)
                lineToRelative(-2.729f, -1.248f)
                curveToRelative(-0.477f, 1.042f, -0.8f, 2.146f, -0.961f, 3.28f)
                lineToRelative(2.97f, 0.423f)
                curveToRelative(0.121f, -0.849f, 0.363f, -1.675f, 0.72f, -2.455f)
                close()
                moveTo(19.969f, 3.031f)
                lineToRelative(2.031f, -2.031f)
                horizontalLineToRelative(-4.909f)
                curveToRelative(-0.602f, 0.0f, -1.091f, 0.488f, -1.091f, 1.091f)
                verticalLineToRelative(4.909f)
                lineToRelative(1.837f, -1.837f)
                curveToRelative(1.99f, 1.702f, 3.163f, 4.193f, 3.163f, 6.837f)
                curveToRelative(0.0f, 4.962f, -4.037f, 9.0f, -9.0f, 9.0f)
                curveToRelative(-2.557f, 0.0f, -5.002f, -1.094f, -6.708f, -3.0f)
                lineToRelative(-2.235f, 2.001f)
                curveToRelative(2.275f, 2.542f, 5.535f, 4.0f, 8.944f, 4.0f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -3.446f, -1.486f, -6.705f, -4.031f, -8.969f)
                close()
            }
        }
        .build()
        return _duration!!
    }

private var _duration: ImageVector? = null
