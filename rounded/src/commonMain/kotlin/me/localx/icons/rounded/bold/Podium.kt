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

public val Icons.Bold.Podium: ImageVector
    get() {
        if (_podium != null) {
            return _podium!!
        }
        _podium = Builder(name = "Podium", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 9.0f)
                lineTo(5.0f, 9.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.0f, 0.0f, 0.659f, -0.006f, 0.736f, -0.019f)
                curveToRelative(0.455f, 0.618f, 1.188f, 1.019f, 2.014f, 1.019f)
                horizontalLineToRelative(4.25f)
                curveToRelative(3.287f, -0.056f, 3.285f, -4.945f, 0.0f, -5.0f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(-0.826f, 0.0f, -1.559f, 0.401f, -2.014f, 1.019f)
                curveToRelative(-0.077f, -0.012f, -0.736f, -0.019f, -0.736f, -0.019f)
                curveTo(4.467f, 1.0f, 2.0f, 3.467f, 2.0f, 6.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.972f, 0.033f, -1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(0.729f)
                lineToRelative(1.234f, 7.403f)
                curveToRelative(0.443f, 2.664f, 2.725f, 4.597f, 5.425f, 4.597f)
                horizontalLineToRelative(6.223f)
                curveToRelative(2.7f, 0.0f, 4.982f, -1.933f, 5.425f, -4.596f)
                lineToRelative(1.234f, -7.404f)
                horizontalLineToRelative(0.729f)
                curveToRelative(1.972f, -0.033f, 1.971f, -2.967f, 0.0f, -3.0f)
                close()
                moveTo(17.578f, 18.911f)
                curveToRelative(-0.202f, 1.21f, -1.239f, 2.089f, -2.466f, 2.089f)
                horizontalLineToRelative(-6.223f)
                curveToRelative(-1.228f, 0.0f, -2.265f, -0.879f, -2.466f, -2.09f)
                lineToRelative(-1.152f, -6.91f)
                horizontalLineToRelative(13.459f)
                lineToRelative(-1.152f, 6.911f)
                close()
            }
        }
        .build()
        return _podium!!
    }

private var _podium: ImageVector? = null
