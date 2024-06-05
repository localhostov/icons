package me.localx.icons.straight.bold

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

public val Icons.Bold.FireSmoke: ImageVector
    get() {
        if (_fireSmoke != null) {
            return _fireSmoke!!
        }
        _fireSmoke = Builder(name = "FireSmoke", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 23.988f)
                lineTo(4.5f, 23.988f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                curveToRelative(0.0f, -2.069f, 1.404f, -3.817f, 3.31f, -4.34f)
                curveToRelative(0.78f, -2.438f, 3.049f, -4.16f, 5.69f, -4.16f)
                curveToRelative(1.057f, 0.0f, 2.09f, 0.286f, 3.0f, 0.818f)
                curveToRelative(0.91f, -0.533f, 1.943f, -0.818f, 3.0f, -0.818f)
                curveToRelative(2.641f, 0.0f, 4.91f, 1.722f, 5.69f, 4.16f)
                curveToRelative(1.906f, 0.523f, 3.31f, 2.271f, 3.31f, 4.34f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(4.419f, 17.99f)
                curveToRelative(-0.79f, 0.042f, -1.419f, 0.698f, -1.419f, 1.498f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.799f, -0.628f, -1.454f, -1.416f, -1.498f)
                lineToRelative(-1.477f, 0.002f)
                lineToRelative(-0.148f, -1.334f)
                curveToRelative(-0.169f, -1.522f, -1.441f, -2.67f, -2.959f, -2.67f)
                curveToRelative(-0.932f, 0.0f, -1.6f, 0.425f, -1.996f, 0.782f)
                lineToRelative(-1.004f, 0.905f)
                lineToRelative(-1.004f, -0.905f)
                curveToRelative(-0.396f, -0.357f, -1.064f, -0.782f, -1.996f, -0.782f)
                curveToRelative(-1.518f, 0.0f, -2.791f, 1.148f, -2.959f, 2.67f)
                lineToRelative(-0.148f, 1.334f)
                lineToRelative(-1.474f, -0.003f)
                close()
                moveTo(19.0f, 8.988f)
                verticalLineToRelative(-0.008f)
                curveToRelative(-0.01f, -4.167f, -3.895f, -6.937f, -4.675f, -7.45f)
                lineToRelative(-2.325f, -1.53f)
                reflectiveCurveToRelative(-1.0f, 1.284f, -1.0f, 2.284f)
                curveToRelative(0.0f, 1.5f, 1.0f, 1.954f, 1.0f, 2.954f)
                curveToRelative(0.0f, 0.828f, -0.462f, 1.75f, -1.741f, 1.75f)
                reflectiveCurveToRelative(-1.759f, -0.922f, -1.759f, -1.75f)
                curveToRelative(0.0f, -1.0f, 1.0f, -2.75f, 1.0f, -2.75f)
                curveToRelative(0.0f, 0.0f, -4.498f, 1.5f, -4.498f, 6.48f)
                lineToRelative(-0.002f, 0.02f)
                verticalLineToRelative(0.012f)
                curveToRelative(0.0f, 0.349f, 0.035f, 0.689f, 0.085f, 1.024f)
                lineToRelative(0.005f, 0.005f)
                curveToRelative(1.166f, -0.658f, 2.498f, -1.041f, 3.909f, -1.041f)
                curveToRelative(1.028f, 0.0f, 2.048f, 0.203f, 3.0f, 0.593f)
                curveToRelative(0.952f, -0.39f, 1.972f, -0.593f, 3.0f, -0.593f)
                curveToRelative(1.411f, 0.0f, 2.743f, 0.383f, 3.909f, 1.041f)
                lineToRelative(0.005f, -0.005f)
                curveToRelative(0.05f, -0.337f, 0.084f, -0.679f, 0.085f, -1.029f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.006f)
                close()
            }
        }
        .build()
        return _fireSmoke!!
    }

private var _fireSmoke: ImageVector? = null
