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

public val Icons.Bold.Seedling: ImageVector
    get() {
        if (_seedling != null) {
            return _seedling!!
        }
        _seedling = Builder(name = "Seedling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.103f, 0.711f)
                curveToRelative(-0.584f, -0.532f, -1.365f, -0.784f, -2.14f, -0.692f)
                curveToRelative(-4.731f, 0.56f, -7.477f, 3.44f, -8.963f, 6.477f)
                curveTo(10.514f, 3.458f, 7.768f, 0.578f, 3.038f, 0.019f)
                curveToRelative(-0.776f, -0.09f, -1.557f, 0.16f, -2.141f, 0.692f)
                curveTo(0.308f, 1.249f, -0.02f, 2.012f, 0.0f, 2.806f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.087f, 3.384f, 1.192f, 6.071f, 3.283f, 7.985f)
                curveToRelative(2.362f, 2.163f, 5.393f, 2.758f, 7.216f, 2.912f)
                verticalLineToRelative(8.796f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-8.796f)
                curveToRelative(1.823f, -0.154f, 4.854f, -0.75f, 7.216f, -2.912f)
                curveToRelative(2.091f, -1.915f, 3.196f, -4.601f, 3.283f, -7.985f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.02f, -0.793f, -0.308f, -1.557f, -0.897f, -2.095f)
                close()
                moveTo(5.295f, 8.565f)
                curveToRelative(-1.397f, -1.287f, -2.165f, -3.144f, -2.283f, -5.523f)
                curveToRelative(5.122f, 0.777f, 6.748f, 5.169f, 7.26f, 7.622f)
                curveToRelative(-1.405f, -0.177f, -3.438f, -0.682f, -4.977f, -2.098f)
                close()
                moveTo(18.705f, 8.565f)
                curveToRelative(-1.538f, 1.417f, -3.572f, 1.922f, -4.976f, 2.098f)
                curveToRelative(0.512f, -2.455f, 2.138f, -6.845f, 7.259f, -7.622f)
                curveToRelative(-0.118f, 2.379f, -0.886f, 4.236f, -2.283f, 5.523f)
                close()
            }
        }
        .build()
        return _seedling!!
    }

private var _seedling: ImageVector? = null
