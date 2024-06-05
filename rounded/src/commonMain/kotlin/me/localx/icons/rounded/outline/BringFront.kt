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

public val Icons.Outline.BringFront: ImageVector
    get() {
        if (_bringFront != null) {
            return _bringFront!!
        }
        _bringFront = Builder(name = "BringFront", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(10.0f, 8.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(3.94f, 10.33f)
                curveToRelative(0.18f, -0.52f, -0.09f, -1.09f, -0.61f, -1.28f)
                curveToRelative(-0.8f, -0.28f, -1.33f, -1.04f, -1.33f, -1.89f)
                verticalLineToRelative(-3.17f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.17f)
                curveToRelative(0.85f, 0.0f, 1.6f, 0.54f, 1.89f, 1.33f)
                curveToRelative(0.18f, 0.52f, 0.76f, 0.8f, 1.28f, 0.61f)
                curveToRelative(0.52f, -0.18f, 0.79f, -0.76f, 0.61f, -1.28f)
                curveToRelative(-0.56f, -1.59f, -2.08f, -2.67f, -3.77f, -2.67f)
                horizontalLineToRelative(-3.17f)
                curveTo(1.79f, 0.0f, 0.0f, 1.79f, 0.0f, 4.0f)
                verticalLineToRelative(3.17f)
                curveToRelative(0.0f, 1.69f, 1.07f, 3.21f, 2.67f, 3.77f)
                curveToRelative(0.11f, 0.04f, 0.22f, 0.06f, 0.33f, 0.06f)
                curveToRelative(0.41f, 0.0f, 0.8f, -0.26f, 0.94f, -0.67f)
                close()
                moveTo(24.0f, 20.0f)
                verticalLineToRelative(-3.17f)
                curveToRelative(0.0f, -1.69f, -1.07f, -3.21f, -2.67f, -3.77f)
                curveToRelative(-0.52f, -0.19f, -1.09f, 0.09f, -1.28f, 0.61f)
                curveToRelative(-0.18f, 0.52f, 0.09f, 1.09f, 0.61f, 1.28f)
                curveToRelative(0.8f, 0.28f, 1.33f, 1.04f, 1.33f, 1.89f)
                verticalLineToRelative(3.17f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.17f)
                curveToRelative(-0.85f, 0.0f, -1.6f, -0.54f, -1.89f, -1.33f)
                curveToRelative(-0.18f, -0.52f, -0.76f, -0.79f, -1.28f, -0.61f)
                curveToRelative(-0.52f, 0.18f, -0.79f, 0.76f, -0.61f, 1.28f)
                curveToRelative(0.56f, 1.59f, 2.08f, 2.67f, 3.77f, 2.67f)
                horizontalLineToRelative(3.17f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _bringFront!!
    }

private var _bringFront: ImageVector? = null
