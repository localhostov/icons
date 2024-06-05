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

public val Icons.Outline.Badminton: ImageVector
    get() {
        if (_badminton != null) {
            return _badminton!!
        }
        _badminton = Builder(name = "Badminton", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.932f, 2.068f)
                curveTo(20.427f, 0.562f, 18.332f, -0.167f, 16.04f, 0.03f)
                curveToRelative(-2.231f, 0.186f, -4.395f, 1.223f, -6.091f, 2.919f)
                reflectiveCurveToRelative(-2.733f, 3.859f, -2.919f, 6.091f)
                curveToRelative(-0.161f, 1.931f, 0.333f, 3.713f, 1.389f, 5.128f)
                lineToRelative(-2.935f, 2.935f)
                curveToRelative(-0.733f, -0.223f, -1.561f, -0.055f, -2.14f, 0.524f)
                lineToRelative(-2.716f, 2.716f)
                curveToRelative(-0.836f, 0.836f, -0.836f, 2.195f, 0.0f, 3.03f)
                curveToRelative(0.836f, 0.836f, 2.195f, 0.836f, 3.03f, 0.0f)
                lineToRelative(2.716f, -2.716f)
                curveToRelative(0.579f, -0.579f, 0.747f, -1.407f, 0.524f, -2.14f)
                lineToRelative(2.935f, -2.935f)
                curveToRelative(1.238f, 0.923f, 2.756f, 1.418f, 4.411f, 1.418f)
                curveToRelative(0.237f, 0.0f, 0.476f, -0.01f, 0.718f, -0.03f)
                curveToRelative(2.231f, -0.186f, 4.395f, -1.223f, 6.091f, -2.919f)
                curveToRelative(1.696f, -1.696f, 2.733f, -3.859f, 2.919f, -6.091f)
                curveToRelative(0.191f, -2.294f, -0.532f, -4.387f, -2.038f, -5.893f)
                close()
                moveTo(21.977f, 7.794f)
                curveToRelative(-0.147f, 1.761f, -0.978f, 3.481f, -2.34f, 4.843f)
                reflectiveCurveToRelative(-3.082f, 2.193f, -4.843f, 2.34f)
                curveToRelative(-1.699f, 0.142f, -3.229f, -0.377f, -4.312f, -1.459f)
                curveToRelative(-1.083f, -1.083f, -1.601f, -2.614f, -1.459f, -4.312f)
                curveToRelative(0.147f, -1.761f, 0.978f, -3.481f, 2.34f, -4.843f)
                curveToRelative(1.362f, -1.362f, 3.083f, -2.193f, 4.843f, -2.34f)
                curveToRelative(0.184f, -0.015f, 0.365f, -0.022f, 0.545f, -0.022f)
                curveToRelative(1.479f, 0.0f, 2.802f, 0.517f, 3.768f, 1.482f)
                curveToRelative(1.083f, 1.083f, 1.601f, 2.614f, 1.459f, 4.312f)
                close()
                moveTo(23.429f, 22.797f)
                curveToRelative(0.244f, 0.57f, -0.174f, 1.204f, -0.794f, 1.204f)
                horizontalLineToRelative(-4.291f)
                curveToRelative(-0.62f, 0.0f, -1.038f, -0.634f, -0.794f, -1.204f)
                lineToRelative(1.42f, -2.296f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                lineToRelative(1.459f, 2.296f)
                close()
            }
        }
        .build()
        return _badminton!!
    }

private var _badminton: ImageVector? = null
