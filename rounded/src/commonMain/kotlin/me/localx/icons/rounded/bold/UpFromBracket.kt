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

public val Icons.Bold.UpFromBracket: ImageVector
    get() {
        if (_upFromBracket != null) {
            return _upFromBracket!!
        }
        _upFromBracket = Builder(name = "UpFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.361f, 13.0f)
                horizontalLineToRelative(1.639f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.646f)
                curveToRelative(1.363f, -0.006f, 2.578f, -0.825f, 3.097f, -2.085f)
                curveToRelative(0.519f, -1.26f, 0.23f, -2.697f, -0.731f, -3.658f)
                lineTo(15.04f, 1.259f)
                reflectiveCurveToRelative(0.0f, -0.001f, -0.002f, -0.002f)
                curveToRelative(-1.675f, -1.672f, -4.399f, -1.673f, -6.076f, 0.003f)
                lineTo(2.991f, 7.255f)
                curveToRelative(-0.965f, 0.964f, -1.253f, 2.402f, -0.734f, 3.663f)
                curveToRelative(0.519f, 1.26f, 1.735f, 2.078f, 3.104f, 2.083f)
                close()
                moveTo(5.113f, 9.375f)
                lineTo(11.084f, 3.38f)
                curveToRelative(0.505f, -0.505f, 1.327f, -0.506f, 1.833f, 0.0f)
                lineToRelative(5.972f, 5.998f)
                curveToRelative(0.114f, 0.114f, 0.142f, 0.248f, 0.08f, 0.397f)
                reflectiveCurveToRelative(-0.175f, 0.225f, -0.329f, 0.226f)
                horizontalLineToRelative(-3.14f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.271f, -0.229f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.133f)
                curveToRelative(-0.162f, 0.0f, -0.275f, -0.076f, -0.336f, -0.225f)
                curveToRelative(-0.062f, -0.149f, -0.035f, -0.283f, 0.083f, -0.4f)
                close()
                moveTo(24.0f, 16.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _upFromBracket!!
    }

private var _upFromBracket: ImageVector? = null
