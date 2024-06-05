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

public val Icons.Filled.UserCowboy: ImageVector
    get() {
        if (_userCowboy != null) {
            return _userCowboy!!
        }
        _userCowboy = Builder(name = "UserCowboy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.779f, 2.627f)
                curveToRelative(-0.144f, 0.179f, -3.617f, 4.373f, -11.779f, 4.373f)
                reflectiveCurveTo(0.365f, 2.806f, 0.221f, 2.627f)
                curveToRelative(-0.346f, -0.43f, -0.279f, -1.06f, 0.151f, -1.406f)
                curveToRelative(0.43f, -0.345f, 1.056f, -0.279f, 1.403f, 0.148f)
                curveToRelative(0.094f, 0.114f, 1.542f, 1.807f, 4.786f, 2.841f)
                curveToRelative(0.694f, -2.213f, 1.914f, -4.21f, 3.009f, -4.21f)
                curveToRelative(1.142f, 0.0f, 1.717f, 0.481f, 2.098f, 0.8f)
                curveToRelative(0.24f, 0.2f, 0.255f, 0.2f, 0.332f, 0.2f)
                reflectiveCurveToRelative(0.092f, 0.0f, 0.332f, -0.2f)
                curveToRelative(0.381f, -0.318f, 0.956f, -0.8f, 2.098f, -0.8f)
                curveToRelative(1.094f, 0.0f, 2.315f, 1.996f, 3.01f, 4.209f)
                curveToRelative(3.253f, -1.037f, 4.701f, -2.738f, 4.785f, -2.841f)
                curveToRelative(0.351f, -0.425f, 0.979f, -0.489f, 1.405f, -0.141f)
                curveToRelative(0.426f, 0.348f, 0.494f, 0.972f, 0.149f, 1.399f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(3.235f, 0.0f, 5.872f, -2.574f, 5.989f, -5.781f)
                curveToRelative(-1.676f, 0.469f, -3.662f, 0.781f, -5.989f, 0.781f)
                reflectiveCurveToRelative(-4.31f, -0.314f, -5.989f, -0.783f)
                curveToRelative(0.115f, 3.208f, 2.754f, 5.783f, 5.989f, 5.783f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-3.987f, 0.0f, -7.422f, 2.947f, -7.99f, 6.856f)
                curveToRelative(-0.042f, 0.287f, 0.043f, 0.578f, 0.233f, 0.798f)
                reflectiveCurveToRelative(0.466f, 0.346f, 0.756f, 0.346f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.291f, 0.0f, 0.566f, -0.126f, 0.756f, -0.346f)
                reflectiveCurveToRelative(0.275f, -0.511f, 0.233f, -0.798f)
                curveToRelative(-0.567f, -3.909f, -4.002f, -6.856f, -7.99f, -6.856f)
                close()
            }
        }
        .build()
        return _userCowboy!!
    }

private var _userCowboy: ImageVector? = null
