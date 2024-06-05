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

public val Icons.Bold.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 9.788f)
                verticalLineToRelative(-3.788f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.776f)
                curveToRelative(-0.621f, -1.742f, -2.271f, -3.0f, -4.224f, -3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(5.288f)
                curveToRelative(-1.181f, 0.787f, -2.0f, 1.964f, -2.0f, 3.212f)
                curveToRelative(0.0f, 0.519f, 0.163f, 1.115f, 0.28f, 1.378f)
                curveToRelative(0.746f, 2.009f, 3.031f, 4.506f, 7.168f, 5.018f)
                curveToRelative(-0.257f, 1.583f, -1.948f, 1.604f, -1.948f, 1.604f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                curveToRelative(0.0f, 0.0f, -1.692f, -0.021f, -1.948f, -1.604f)
                curveToRelative(4.137f, -0.512f, 6.422f, -3.009f, 7.168f, -5.018f)
                curveToRelative(0.117f, -0.263f, 0.28f, -1.018f, 0.28f, -1.554f)
                curveToRelative(0.0f, -1.028f, -0.818f, -2.248f, -2.0f, -3.035f)
                close()
                moveTo(8.0f, 4.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(17.995f, 13.034f)
                curveToRelative(-0.048f, 0.192f, -0.576f, 0.966f, -5.995f, 0.966f)
                curveToRelative(-5.11f, 0.0f, -5.901f, -0.643f, -5.995f, -0.965f)
                curveToRelative(0.053f, -0.195f, 0.425f, -0.747f, 1.227f, -1.035f)
                horizontalLineToRelative(9.535f)
                curveToRelative(0.784f, 0.281f, 1.162f, 0.819f, 1.229f, 1.026f)
                curveToRelative(0.0f, 0.002f, 0.0f, 0.006f, -0.001f, 0.008f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
