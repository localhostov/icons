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

public val Icons.Bold.DownFromBracket: ImageVector
    get() {
        if (_downFromBracket != null) {
            return _downFromBracket!!
        }
        _downFromBracket = Builder(name = "DownFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.64f, 11.0f)
                horizontalLineToRelative(-1.64f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.644f)
                curveToRelative(-1.364f, 0.005f, -2.581f, 0.823f, -3.1f, 2.083f)
                curveToRelative(-0.519f, 1.261f, -0.23f, 2.698f, 0.731f, 3.659f)
                lineToRelative(5.977f, 6.001f)
                curveToRelative(0.838f, 0.836f, 1.937f, 1.254f, 3.037f, 1.254f)
                reflectiveCurveToRelative(2.2f, -0.418f, 3.037f, -1.255f)
                curveToRelative(0.0f, 0.0f, 0.001f, 0.0f, 0.002f, -0.002f)
                lineToRelative(5.969f, -5.994f)
                curveToRelative(0.964f, -0.964f, 1.252f, -2.4f, 0.734f, -3.661f)
                curveToRelative(-0.518f, -1.26f, -1.734f, -2.079f, -3.104f, -2.085f)
                close()
                moveTo(18.887f, 14.626f)
                lineToRelative(-5.969f, 5.995f)
                curveToRelative(-0.506f, 0.504f, -1.328f, 0.504f, -1.83f, 0.002f)
                lineToRelative(-5.977f, -6.001f)
                curveToRelative(-0.114f, -0.114f, -0.141f, -0.248f, -0.08f, -0.396f)
                curveToRelative(0.061f, -0.149f, 0.174f, -0.225f, 0.331f, -0.226f)
                horizontalLineToRelative(3.139f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.271f, 0.0f, 0.5f, 0.229f, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.133f)
                curveToRelative(0.161f, 0.0f, 0.274f, 0.077f, 0.336f, 0.227f)
                reflectiveCurveToRelative(0.035f, 0.283f, -0.083f, 0.399f)
                close()
                moveTo(24.001f, 5.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _downFromBracket!!
    }

private var _downFromBracket: ImageVector? = null
