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

public val Icons.Filled.Floor: ImageVector
    get() {
        if (_floor != null) {
            return _floor!!
        }
        _floor = Builder(name = "Floor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.997f, 19.548f)
                curveToRelative(-0.765f, 0.0f, -1.527f, -0.193f, -2.207f, -0.579f)
                lineTo(0.51f, 13.752f)
                curveToRelative(-0.481f, -0.271f, -0.652f, -0.88f, -0.381f, -1.362f)
                curveToRelative(0.271f, -0.482f, 0.879f, -0.653f, 1.362f, -0.381f)
                lineToRelative(9.283f, 5.219f)
                curveToRelative(0.746f, 0.423f, 1.708f, 0.423f, 2.452f, 0.001f)
                lineToRelative(9.271f, -5.426f)
                curveToRelative(0.474f, -0.28f, 1.088f, -0.119f, 1.368f, 0.357f)
                curveToRelative(0.278f, 0.477f, 0.118f, 1.089f, -0.358f, 1.368f)
                lineToRelative(-9.282f, 5.433f)
                curveToRelative(-0.689f, 0.391f, -1.458f, 0.586f, -2.226f, 0.586f)
                close()
                moveTo(14.223f, 23.415f)
                lineToRelative(9.282f, -5.433f)
                curveToRelative(0.477f, -0.279f, 0.637f, -0.892f, 0.358f, -1.368f)
                curveToRelative(-0.28f, -0.478f, -0.895f, -0.637f, -1.368f, -0.358f)
                lineToRelative(-9.271f, 5.426f)
                curveToRelative(-0.744f, 0.422f, -1.706f, 0.421f, -2.452f, -0.001f)
                lineTo(1.49f, 16.462f)
                curveToRelative(-0.482f, -0.272f, -1.091f, -0.1f, -1.362f, 0.381f)
                curveToRelative(-0.271f, 0.481f, -0.1f, 1.091f, 0.381f, 1.362f)
                lineToRelative(9.28f, 5.217f)
                curveToRelative(0.68f, 0.386f, 1.442f, 0.58f, 2.207f, 0.58f)
                reflectiveCurveToRelative(1.537f, -0.195f, 2.226f, -0.586f)
                close()
                moveTo(22.804f, 5.458f)
                lineToRelative(-3.833f, 2.16f)
                lineToRelative(3.632f, 2.047f)
                lineToRelative(0.157f, -0.089f)
                curveToRelative(0.776f, -0.44f, 1.239f, -1.215f, 1.239f, -2.075f)
                curveToRelative(0.0f, -0.842f, -0.449f, -1.598f, -1.196f, -2.042f)
                close()
                moveTo(17.931f, 2.687f)
                lineToRelative(-6.321f, 3.562f)
                lineToRelative(2.858f, 1.61f)
                lineToRelative(6.312f, -3.557f)
                lineToRelative(-2.849f, -1.615f)
                close()
                moveTo(7.098f, 6.496f)
                lineTo(15.901f, 1.536f)
                lineToRelative(-1.69f, -0.958f)
                curveToRelative(-1.362f, -0.772f, -3.058f, -0.772f, -4.421f, 0.0f)
                lineToRelative(-6.577f, 3.729f)
                lineToRelative(3.886f, 2.19f)
                close()
                moveTo(9.574f, 7.396f)
                lineToRelative(-6.107f, 3.441f)
                lineToRelative(2.85f, 1.615f)
                lineToRelative(6.115f, -3.446f)
                lineToRelative(-2.858f, -1.611f)
                close()
                moveTo(16.934f, 8.765f)
                lineToRelative(-8.587f, 4.839f)
                lineToRelative(1.443f, 0.818f)
                curveToRelative(0.682f, 0.387f, 1.446f, 0.58f, 2.21f, 0.58f)
                reflectiveCurveToRelative(1.529f, -0.193f, 2.211f, -0.58f)
                lineToRelative(6.362f, -3.607f)
                lineToRelative(-3.638f, -2.05f)
                close()
                moveTo(1.239f, 9.575f)
                lineToRelative(0.197f, 0.112f)
                lineToRelative(3.626f, -2.043f)
                lineToRelative(-3.872f, -2.182f)
                curveToRelative(-0.743f, 0.445f, -1.19f, 1.199f, -1.19f, 2.038f)
                curveToRelative(0.0f, 0.859f, 0.463f, 1.635f, 1.239f, 2.075f)
                close()
            }
        }
        .build()
        return _floor!!
    }

private var _floor: ImageVector? = null
