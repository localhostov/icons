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

public val Icons.Filled.TreeAlt: ImageVector
    get() {
        if (_treeAlt != null) {
            return _treeAlt!!
        }
        _treeAlt = Builder(name = "TreeAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.91f, 15.483f)
                curveToRelative(0.32f, -0.236f, 0.589f, -0.544f, 0.781f, -0.91f)
                curveToRelative(0.462f, -0.88f, 0.399f, -1.935f, -0.166f, -2.753f)
                curveToRelative(-0.025f, -0.036f, -1.885f, -2.091f, -1.885f, -2.091f)
                curveToRelative(0.458f, -0.231f, 0.839f, -0.601f, 1.083f, -1.073f)
                curveToRelative(0.42f, -0.811f, 0.353f, -1.778f, -0.176f, -2.526f)
                curveToRelative(-0.021f, -0.03f, -4.664f, -5.285f, -4.664f, -5.285f)
                curveToRelative(-0.947f, -1.074f, -2.821f, -1.075f, -3.771f, 0.0f)
                curveToRelative(0.0f, 0.0f, -4.643f, 5.254f, -4.663f, 5.284f)
                curveToRelative(-0.528f, 0.747f, -0.596f, 1.715f, -0.176f, 2.526f)
                curveToRelative(0.244f, 0.472f, 0.626f, 0.842f, 1.084f, 1.073f)
                curveToRelative(0.0f, 0.0f, -1.86f, 2.055f, -1.886f, 2.091f)
                curveToRelative(-0.564f, 0.818f, -0.627f, 1.873f, -0.165f, 2.753f)
                curveToRelative(0.192f, 0.366f, 0.462f, 0.674f, 0.781f, 0.91f)
                curveToRelative(0.0f, 0.0f, -1.536f, 1.785f, -1.557f, 1.815f)
                curveToRelative(-0.635f, 0.921f, -0.706f, 2.108f, -0.186f, 3.098f)
                curveToRelative(0.52f, 0.99f, 1.537f, 1.604f, 2.655f, 1.604f)
                horizontalLineToRelative(4.997f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.117f, -0.001f, 2.133f, -0.616f, 2.652f, -1.604f)
                curveToRelative(0.52f, -0.99f, 0.449f, -2.177f, -0.186f, -3.098f)
                curveToRelative(-0.02f, -0.03f, -1.557f, -1.814f, -1.557f, -1.814f)
                close()
            }
        }
        .build()
        return _treeAlt!!
    }

private var _treeAlt: ImageVector? = null
