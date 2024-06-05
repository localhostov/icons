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

public val Icons.Outline.Swatchbook: ImageVector
    get() {
        if (_swatchbook != null) {
            return _swatchbook!!
        }
        _swatchbook = Builder(name = "Swatchbook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.778f, 13.0f)
                lineToRelative(3.692f, -3.692f)
                lineTo(14.692f, 1.53f)
                lineToRelative(-3.692f, 3.692f)
                lineTo(11.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(18.5f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(18.5f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-5.222f)
                close()
                moveTo(14.693f, 4.358f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(-8.642f, 8.642f)
                verticalLineToRelative(-9.899f)
                lineToRelative(3.692f, -3.692f)
                close()
                moveTo(9.001f, 12.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(9.001f, 2.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(2.0f, 18.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-12.222f)
                lineToRelative(7.0f, -7.0f)
                horizontalLineToRelative(5.222f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(7.0f, 18.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _swatchbook!!
    }

private var _swatchbook: ImageVector? = null
