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

public val Icons.Bold.LeftFromBracket: ImageVector
    get() {
        if (_leftFromBracket != null) {
            return _leftFromBracket!!
        }
        _leftFromBracket = Builder(name = "LeftFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.646f)
                curveToRelative(-0.007f, -1.363f, -0.825f, -2.579f, -2.085f, -3.097f)
                curveToRelative(-1.262f, -0.519f, -2.697f, -0.231f, -3.658f, 0.731f)
                lineTo(1.26f, 8.959f)
                reflectiveCurveToRelative(-0.002f, 0.002f, -0.002f, 0.002f)
                curveToRelative(-1.674f, 1.674f, -1.674f, 4.398f, 0.002f, 6.077f)
                lineToRelative(5.995f, 5.97f)
                curveToRelative(0.646f, 0.646f, 1.503f, 0.989f, 2.378f, 0.989f)
                curveToRelative(0.432f, 0.0f, 0.867f, -0.083f, 1.284f, -0.254f)
                curveToRelative(1.261f, -0.519f, 2.078f, -1.736f, 2.083f, -3.105f)
                verticalLineToRelative(-1.639f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(15.0f, 13.5f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(3.133f)
                curveToRelative(0.0f, 0.162f, -0.076f, 0.275f, -0.226f, 0.336f)
                curveToRelative(-0.15f, 0.063f, -0.283f, 0.035f, -0.399f, -0.083f)
                lineTo(3.38f, 12.916f)
                curveToRelative(-0.505f, -0.505f, -0.505f, -1.328f, 0.0f, -1.833f)
                lineToRelative(5.998f, -5.972f)
                curveToRelative(0.114f, -0.115f, 0.249f, -0.142f, 0.396f, -0.08f)
                curveToRelative(0.149f, 0.062f, 0.226f, 0.175f, 0.227f, 0.329f)
                verticalLineToRelative(3.14f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.271f, 0.0f, 0.5f, 0.229f, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _leftFromBracket!!
    }

private var _leftFromBracket: ImageVector? = null
