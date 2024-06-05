package me.localx.icons.rounded.filled

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

public val Icons.Filled.SkillAlt: ImageVector
    get() {
        if (_skillAlt != null) {
            return _skillAlt!!
        }
        _skillAlt = Builder(name = "SkillAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                horizontalLineToRelative(0.494f)
                curveToRelative(2.498f, 0.0f, 4.629f, -1.868f, 4.957f, -4.344f)
                lineToRelative(0.219f, -1.656f)
                horizontalLineToRelative(0.33f)
                curveToRelative(1.299f, 0.0f, 2.0f, -1.03f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.419f, -2.932f, -7.014f, -4.223f, -8.611f)
                curveTo(17.696f, 1.61f, 14.489f, 0.0f, 11.0f, 0.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(0.0f, 12.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                curveTo(1.121f, 10.0f, 0.0f, 11.122f, 0.0f, 12.5f)
                close()
                moveTo(6.0f, 0.0f)
                lineTo(2.0f, 0.0f)
                curveTo(0.895f, 0.0f, 0.0f, 0.895f, 0.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                lineTo(8.0f, 2.0f)
                curveTo(8.0f, 0.895f, 7.105f, 0.0f, 6.0f, 0.0f)
                close()
                moveTo(6.719f, 3.504f)
                lineToRelative(-1.82f, 1.883f)
                curveToRelative(-0.796f, 0.823f, -2.118f, 0.817f, -2.905f, -0.015f)
                lineToRelative(-0.769f, -0.813f)
                curveToRelative(-0.367f, -0.388f, -0.364f, -0.995f, 0.006f, -1.379f)
                curveToRelative(0.395f, -0.411f, 1.054f, -0.408f, 1.445f, 0.006f)
                lineToRelative(0.777f, 0.821f)
                lineToRelative(1.828f, -1.892f)
                curveToRelative(0.391f, -0.405f, 1.04f, -0.407f, 1.433f, -0.004f)
                curveToRelative(0.378f, 0.387f, 0.38f, 1.004f, 0.004f, 1.394f)
                close()
            }
        }
        .build()
        return _skillAlt!!
    }

private var _skillAlt: ImageVector? = null
