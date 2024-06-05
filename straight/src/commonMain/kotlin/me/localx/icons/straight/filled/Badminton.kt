package me.localx.icons.straight.filled

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

public val Icons.Filled.Badminton: ImageVector
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
                curveToRelative(-0.161f, 1.931f, 0.327f, 3.719f, 1.383f, 5.135f)
                lineToRelative(-2.921f, 2.921f)
                curveToRelative(-0.735f, -0.226f, -1.568f, -0.049f, -2.148f, 0.531f)
                lineToRelative(-2.716f, 2.716f)
                curveToRelative(-0.836f, 0.836f, -0.836f, 2.195f, 0.0f, 3.03f)
                curveToRelative(0.836f, 0.836f, 2.195f, 0.836f, 3.03f, 0.0f)
                lineToRelative(2.716f, -2.716f)
                curveToRelative(0.58f, -0.58f, 0.757f, -1.413f, 0.531f, -2.148f)
                lineToRelative(2.921f, -2.921f)
                curveToRelative(1.238f, 0.924f, 2.761f, 1.413f, 4.417f, 1.413f)
                curveToRelative(0.237f, 0.0f, 0.476f, -0.01f, 0.718f, -0.03f)
                curveToRelative(2.231f, -0.186f, 4.395f, -1.223f, 6.091f, -2.919f)
                curveToRelative(1.696f, -1.696f, 2.733f, -3.859f, 2.919f, -6.091f)
                curveToRelative(0.191f, -2.294f, -0.532f, -4.387f, -2.038f, -5.893f)
                close()
                moveTo(22.0f, 20.5f)
                lineToRelative(1.5f, 3.5f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(1.5f, -3.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _badminton!!
    }

private var _badminton: ImageVector? = null
