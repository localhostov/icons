package me.localx.icons.rounded.bold

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

public val Icons.Bold.BalletDance: ImageVector
    get() {
        if (_balletDance != null) {
            return _balletDance!!
        }
        _balletDance = Builder(name = "BalletDance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.923f, 12.439f)
                lineToRelative(-8.359f, 2.404f)
                curveToRelative(-0.782f, 0.487f, -1.641f, 0.952f, -2.564f, 1.374f)
                verticalLineToRelative(6.283f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-5.155f)
                curveToRelative(-3.44f, 1.015f, -6.281f, 0.859f, -6.885f, -0.564f)
                curveToRelative(-0.607f, -1.432f, 1.239f, -3.711f, 4.336f, -5.636f)
                curveTo(3.769f, 8.175f, 1.686f, 4.661f, 1.038f, 1.835f)
                curveTo(0.853f, 1.028f, 1.357f, 0.223f, 2.165f, 0.038f)
                curveToRelative(0.805f, -0.185f, 1.613f, 0.319f, 1.797f, 1.126f)
                curveToRelative(0.292f, 1.274f, 1.098f, 3.014f, 2.291f, 4.835f)
                horizontalLineToRelative(4.581f)
                curveToRelative(1.162f, -1.828f, 1.911f, -3.56f, 2.204f, -4.835f)
                curveToRelative(0.219f, -0.956f, 1.309f, -1.484f, 2.233f, -0.955f)
                curveToRelative(0.576f, 0.33f, 0.834f, 1.008f, 0.684f, 1.655f)
                curveToRelative(-0.5f, 2.149f, -1.768f, 4.664f, -3.467f, 7.021f)
                curveToRelative(-0.224f, 0.31f, -0.226f, 0.73f, 0.0f, 1.038f)
                curveToRelative(0.004f, 0.005f, 0.008f, 0.011f, 0.012f, 0.016f)
                curveToRelative(0.346f, 0.469f, 1.044f, 0.479f, 1.399f, 0.017f)
                curveToRelative(0.414f, -0.54f, 0.866f, -1.228f, 1.101f, -1.911f)
                curveToRelative(1.996f, -0.187f, 3.47f, 0.191f, 3.885f, 1.168f)
                curveToRelative(0.16f, 0.378f, 0.141f, 0.817f, -0.018f, 1.292f)
                lineToRelative(3.21f, -0.945f)
                curveToRelative(0.793f, -0.234f, 1.628f, 0.221f, 1.862f, 1.016f)
                curveToRelative(0.234f, 0.794f, -0.221f, 1.628f, -1.016f, 1.862f)
                close()
                moveTo(8.5f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _balletDance!!
    }

private var _balletDance: ImageVector? = null
