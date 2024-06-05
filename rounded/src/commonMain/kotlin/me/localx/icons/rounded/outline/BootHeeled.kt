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

public val Icons.Outline.BootHeeled: ImageVector
    get() {
        if (_bootHeeled != null) {
            return _bootHeeled!!
        }
        _bootHeeled = Builder(name = "BootHeeled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.683f, 15.724f)
                lineToRelative(-5.578f, -2.789f)
                curveToRelative(-0.682f, -0.341f, -1.105f, -1.026f, -1.105f, -1.789f)
                verticalLineToRelative(-7.145f)
                curveToRelative(0.0f, -1.234f, -0.556f, -2.38f, -1.526f, -3.143f)
                curveTo(11.504f, 0.096f, 10.261f, -0.176f, 9.061f, 0.113f)
                lineTo(3.826f, 1.378f)
                curveTo(1.573f, 1.922f, 0.0f, 3.921f, 0.0f, 6.238f)
                verticalLineToRelative(15.762f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-1.444f)
                curveToRelative(0.068f, 0.04f, 0.139f, 0.072f, 0.205f, 0.116f)
                lineToRelative(3.48f, 2.32f)
                curveToRelative(0.988f, 0.659f, 2.139f, 1.008f, 3.328f, 1.008f)
                horizontalLineToRelative(5.077f)
                curveToRelative(1.604f, 0.0f, 2.91f, -1.305f, 2.91f, -2.91f)
                curveToRelative(0.0f, -2.288f, -1.271f, -4.344f, -3.317f, -5.367f)
                close()
                moveTo(7.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.986f)
                reflectiveCurveToRelative(0.009f, 0.0f, 0.014f, 0.0f)
                verticalLineToRelative(1.999f)
                close()
                moveTo(21.09f, 22.0f)
                horizontalLineToRelative(-5.077f)
                curveToRelative(-0.792f, 0.0f, -1.56f, -0.232f, -2.219f, -0.672f)
                lineToRelative(-3.48f, -2.32f)
                curveToRelative(-0.988f, -0.659f, -2.139f, -1.008f, -3.328f, -1.008f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 6.238f)
                curveToRelative(0.0f, -1.391f, 0.944f, -2.589f, 2.295f, -2.916f)
                lineToRelative(1.705f, -0.412f)
                verticalLineToRelative(7.089f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(8.0f, 2.427f)
                lineToRelative(1.53f, -0.37f)
                curveToRelative(0.599f, -0.146f, 1.222f, -0.01f, 1.707f, 0.373f)
                curveToRelative(0.485f, 0.381f, 0.763f, 0.954f, 0.763f, 1.571f)
                verticalLineToRelative(7.145f)
                curveToRelative(0.0f, 1.524f, 0.847f, 2.896f, 2.211f, 3.578f)
                lineToRelative(5.578f, 2.789f)
                curveToRelative(1.364f, 0.682f, 2.211f, 2.052f, 2.211f, 3.578f)
                curveToRelative(0.0f, 0.501f, -0.408f, 0.91f, -0.91f, 0.91f)
                close()
            }
        }
        .build()
        return _bootHeeled!!
    }

private var _bootHeeled: ImageVector? = null
