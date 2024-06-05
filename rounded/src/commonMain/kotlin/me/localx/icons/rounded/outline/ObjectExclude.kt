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

public val Icons.Outline.ObjectExclude: ImageVector
    get() {
        if (_objectExclude != null) {
            return _objectExclude!!
        }
        _objectExclude = Builder(name = "ObjectExclude", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.24f, 0.0f, 0.0f, 2.24f, 0.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 14.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(11.87f, 9.03f)
                curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.36f, 1.37f)
                curveToRelative(-0.47f, 0.27f, -0.86f, 0.67f, -1.13f, 1.15f)
                curveToRelative(-0.18f, 0.33f, -0.52f, 0.51f, -0.88f, 0.51f)
                curveToRelative(-0.16f, 0.0f, -0.33f, -0.04f, -0.48f, -0.13f)
                curveToRelative(-0.48f, -0.27f, -0.66f, -0.88f, -0.39f, -1.36f)
                curveToRelative(0.44f, -0.79f, 1.09f, -1.45f, 1.87f, -1.91f)
                curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.36f)
                close()
                moveTo(15.33f, 13.5f)
                curveToRelative(-0.44f, 0.76f, -1.07f, 1.39f, -1.83f, 1.83f)
                curveToRelative(-0.16f, 0.09f, -0.33f, 0.13f, -0.5f, 0.13f)
                curveToRelative(-0.35f, 0.0f, -0.68f, -0.18f, -0.87f, -0.5f)
                curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.36f, -1.37f)
                curveToRelative(0.46f, -0.26f, 0.84f, -0.64f, 1.1f, -1.1f)
                curveToRelative(0.28f, -0.48f, 0.89f, -0.64f, 1.37f, -0.37f)
                curveToRelative(0.48f, 0.28f, 0.64f, 0.89f, 0.37f, 1.37f)
                close()
            }
        }
        .build()
        return _objectExclude!!
    }

private var _objectExclude: ImageVector? = null
