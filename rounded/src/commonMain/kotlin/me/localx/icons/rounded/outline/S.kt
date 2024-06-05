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

public val Icons.Outline.S: ImageVector
    get() {
        if (_s != null) {
            return _s!!
        }
        _s = Builder(name = "S", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.151f, 24.0f)
                horizontalLineTo(7.917f)
                curveToRelative(-3.263f, 0.0f, -5.917f, -2.654f, -5.917f, -5.917f)
                verticalLineToRelative(-1.083f)
                curveToRelative(0.005f, -1.308f, 1.995f, -1.307f, 2.0f, 0.0f)
                verticalLineToRelative(1.083f)
                curveToRelative(0.0f, 2.16f, 1.757f, 3.917f, 3.917f, 3.917f)
                horizontalLineToRelative(8.234f)
                curveToRelative(4.441f, -0.016f, 5.282f, -6.386f, 1.01f, -7.562f)
                lineToRelative(-10.846f, -2.945f)
                curveTo(-0.195f, 9.644f, 1.077f, 0.077f, 7.849f, 0.0f)
                horizontalLineToRelative(8.234f)
                curveToRelative(3.263f, 0.0f, 5.917f, 2.654f, 5.917f, 5.917f)
                verticalLineToRelative(1.083f)
                curveToRelative(-0.005f, 1.308f, -1.995f, 1.307f, -2.0f, 0.0f)
                verticalLineToRelative(-1.083f)
                curveToRelative(0.0f, -2.16f, -1.757f, -3.917f, -3.917f, -3.917f)
                horizontalLineTo(7.849f)
                curveToRelative(-4.441f, 0.016f, -5.282f, 6.386f, -1.01f, 7.562f)
                lineToRelative(10.846f, 2.945f)
                curveToRelative(6.511f, 1.848f, 5.238f, 11.415f, -1.533f, 11.492f)
                close()
            }
        }
        .build()
        return _s!!
    }

private var _s: ImageVector? = null
