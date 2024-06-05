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

public val Icons.Outline.Equality: ImageVector
    get() {
        if (_equality != null) {
            return _equality!!
        }
        _equality = Builder(name = "Equality", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.21f, 2.0f)
                horizontalLineToRelative(-7.21f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.0f)
                lineTo(3.79f, 2.0f)
                lineTo(0.0f, 12.83f)
                verticalLineToRelative(0.67f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-0.67f)
                lineTo(5.909f, 4.0f)
                horizontalLineToRelative(5.091f)
                lineTo(11.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(20.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(5.091f)
                lineToRelative(-3.091f, 8.83f)
                verticalLineToRelative(0.67f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-0.67f)
                lineToRelative(-3.79f, -10.83f)
                close()
                moveTo(4.5f, 16.0f)
                curveToRelative(-1.208f, 0.0f, -2.217f, -0.86f, -2.449f, -2.0f)
                lineTo(6.949f, 14.0f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.449f, 2.0f)
                close()
                moveTo(6.591f, 12.0f)
                lineTo(2.409f, 12.0f)
                lineToRelative(2.091f, -5.973f)
                lineToRelative(2.091f, 5.973f)
                close()
                moveTo(19.5f, 6.027f)
                lineToRelative(2.091f, 5.973f)
                horizontalLineToRelative(-4.181f)
                lineToRelative(2.091f, -5.973f)
                close()
                moveTo(19.5f, 16.0f)
                curveToRelative(-1.208f, 0.0f, -2.217f, -0.86f, -2.449f, -2.0f)
                horizontalLineToRelative(4.899f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.449f, 2.0f)
                close()
            }
        }
        .build()
        return _equality!!
    }

private var _equality: ImageVector? = null
