package me.localx.icons.straight.outline

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

public val Icons.Outline.Mercury: ImageVector
    get() {
        if (_mercury != null) {
            return _mercury!!
        }
        _mercury = Builder(name = "Mercury", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 10.0f)
                curveToRelative(0.0f, -3.009f, -1.67f, -5.635f, -4.132f, -7.001f)
                curveToRelative(1.268f, -0.705f, 2.326f, -1.745f, 3.053f, -2.999f)
                horizontalLineToRelative(-2.639f)
                curveToRelative(-1.027f, 1.221f, -2.564f, 2.0f, -4.281f, 2.0f)
                reflectiveCurveToRelative(-3.254f, -0.779f, -4.281f, -2.0f)
                horizontalLineToRelative(-2.639f)
                curveToRelative(0.727f, 1.254f, 1.785f, 2.294f, 3.053f, 2.999f)
                curveToRelative(-2.462f, 1.366f, -4.132f, 3.992f, -4.132f, 7.001f)
                curveToRelative(0.0f, 4.073f, 3.059f, 7.444f, 7.0f, 7.938f)
                verticalLineToRelative(2.062f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.062f)
                curveToRelative(3.941f, -0.494f, 7.0f, -3.865f, 7.0f, -7.938f)
                close()
                moveTo(6.0f, 10.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _mercury!!
    }

private var _mercury: ImageVector? = null
