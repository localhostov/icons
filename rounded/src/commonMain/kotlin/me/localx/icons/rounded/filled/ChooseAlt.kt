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

public val Icons.Filled.ChooseAlt: ImageVector
    get() {
        if (_chooseAlt != null) {
            return _chooseAlt!!
        }
        _chooseAlt = Builder(name = "ChooseAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 1.025f, -0.618f, 1.903f, -1.5f, 2.289f)
                verticalLineToRelative(1.211f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.211f)
                curveToRelative(-0.882f, -0.386f, -1.5f, -1.264f, -1.5f, -2.289f)
                close()
                moveTo(16.809f, 9.462f)
                curveToRelative(0.204f, 0.0f, 0.41f, -0.062f, 0.588f, -0.191f)
                lineToRelative(0.85f, -0.619f)
                curveToRelative(0.37f, 0.216f, 0.794f, 0.349f, 1.254f, 0.349f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.186f, 0.023f, 0.365f, 0.062f, 0.539f)
                lineToRelative(-0.843f, 0.614f)
                curveToRelative(-0.446f, 0.325f, -0.545f, 0.951f, -0.22f, 1.397f)
                curveToRelative(0.196f, 0.269f, 0.501f, 0.411f, 0.81f, 0.411f)
                close()
                moveTo(5.754f, 8.651f)
                lineToRelative(0.85f, 0.619f)
                curveToRelative(0.178f, 0.129f, 0.384f, 0.191f, 0.588f, 0.191f)
                curveToRelative(0.309f, 0.0f, 0.613f, -0.143f, 0.81f, -0.411f)
                curveToRelative(0.325f, -0.446f, 0.227f, -1.072f, -0.22f, -1.397f)
                lineToRelative(-0.843f, -0.614f)
                curveToRelative(0.038f, -0.174f, 0.062f, -0.354f, 0.062f, -0.539f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.459f, 0.0f, 0.884f, -0.133f, 1.254f, -0.349f)
                close()
                moveTo(19.83f, 18.753f)
                lineToRelative(-5.829f, -2.292f)
                verticalLineToRelative(-5.462f)
                curveToRelative(0.0f, -0.996f, -0.681f, -1.92f, -1.664f, -2.08f)
                curveToRelative(-1.253f, -0.204f, -2.336f, 0.758f, -2.336f, 1.973f)
                verticalLineToRelative(9.924f)
                curveToRelative(-1.076f, -0.886f, -2.111f, -1.752f, -2.145f, -1.784f)
                curveToRelative(-0.922f, -0.861f, -2.373f, -0.813f, -3.235f, 0.109f)
                curveToRelative(-0.863f, 0.923f, -0.819f, 2.372f, 0.098f, 3.23f)
                lineToRelative(1.821f, 1.628f)
                horizontalLineToRelative(16.462f)
                verticalLineToRelative(-0.593f)
                curveToRelative(0.0f, -2.055f, -1.258f, -3.901f, -3.171f, -4.653f)
                close()
            }
        }
        .build()
        return _chooseAlt!!
    }

private var _chooseAlt: ImageVector? = null
