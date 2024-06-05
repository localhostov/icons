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

public val Icons.Filled.Mountain: ImageVector
    get() {
        if (_mountain != null) {
            return _mountain!!
        }
        _mountain = Builder(name = "Mountain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.735f, 6.918f)
                lineToRelative(2.784f, -5.415f)
                curveToRelative(0.493f, -0.932f, 1.442f, -1.503f, 2.481f, -1.503f)
                reflectiveCurveToRelative(1.988f, 0.572f, 2.476f, 1.493f)
                lineToRelative(2.978f, 5.793f)
                lineToRelative(-2.652f, 4.605f)
                lineToRelative(-0.946f, -1.562f)
                curveToRelative(-0.18f, -0.297f, -0.501f, -0.479f, -0.849f, -0.482f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-0.345f, 0.0f, -0.665f, 0.177f, -0.848f, 0.47f)
                lineToRelative(-1.621f, 2.707f)
                lineToRelative(-3.796f, -6.105f)
                close()
                moveTo(23.625f, 19.29f)
                lineToRelative(-5.082f, -9.887f)
                lineToRelative(-2.101f, 3.649f)
                curveToRelative(-0.344f, 0.587f, -0.949f, 0.938f, -1.623f, 0.943f)
                curveToRelative(-0.686f, -0.043f, -1.284f, -0.336f, -1.633f, -0.913f)
                lineToRelative(-0.198f, -0.328f)
                lineToRelative(-0.827f, 1.323f)
                curveToRelative(-0.36f, 0.576f, -0.981f, 0.921f, -1.66f, 0.922f)
                horizontalLineToRelative(-0.004f)
                curveToRelative(-0.678f, 0.0f, -1.298f, -0.342f, -1.66f, -0.915f)
                lineToRelative(-3.167f, -5.094f)
                lineTo(0.377f, 19.285f)
                curveToRelative(-0.535f, 1.016f, -0.501f, 2.208f, 0.091f, 3.192f)
                curveToRelative(0.591f, 0.981f, 1.626f, 1.567f, 2.769f, 1.567f)
                horizontalLineToRelative(17.524f)
                curveToRelative(1.143f, 0.0f, 2.178f, -0.586f, 2.769f, -1.567f)
                curveToRelative(0.594f, -0.986f, 0.626f, -2.182f, 0.093f, -3.188f)
                close()
            }
        }
        .build()
        return _mountain!!
    }

private var _mountain: ImageVector? = null
