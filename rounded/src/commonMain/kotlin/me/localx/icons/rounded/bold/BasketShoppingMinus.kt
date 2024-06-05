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

public val Icons.Bold.BasketShoppingMinus: ImageVector
    get() {
        if (_basketShoppingMinus != null) {
            return _basketShoppingMinus!!
        }
        _basketShoppingMinus = Builder(name = "BasketShoppingMinus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.163f, 9.212f)
                curveToRelative(-0.57f, -0.659f, -1.363f, -1.058f, -2.216f, -1.165f)
                curveTo(20.464f, 3.53f, 16.637f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.534f, 3.532f, 3.053f, 8.05f)
                curveToRelative(-0.842f, 0.113f, -1.623f, 0.51f, -2.186f, 1.161f)
                curveTo(0.202f, 9.981f, -0.096f, 11.0f, 0.052f, 12.008f)
                lineToRelative(1.006f, 6.863f)
                curveToRelative(0.429f, 2.924f, 2.981f, 5.129f, 5.937f, 5.129f)
                horizontalLineToRelative(10.039f)
                curveToRelative(2.956f, 0.0f, 5.508f, -2.205f, 5.937f, -5.129f)
                lineToRelative(1.006f, -6.863f)
                curveToRelative(0.148f, -1.006f, -0.149f, -2.026f, -0.814f, -2.796f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(2.964f, 0.0f, 5.426f, 2.166f, 5.908f, 5.0f)
                lineTo(6.092f, 8.0f)
                curveToRelative(0.482f, -2.834f, 2.944f, -5.0f, 5.908f, -5.0f)
                close()
                moveTo(20.003f, 18.435f)
                curveToRelative(-0.215f, 1.462f, -1.491f, 2.565f, -2.969f, 2.565f)
                lineTo(6.995f, 21.0f)
                curveToRelative(-1.478f, 0.0f, -2.754f, -1.103f, -2.969f, -2.565f)
                lineToRelative(-1.006f, -6.862f)
                curveToRelative(-0.029f, -0.197f, 0.061f, -0.335f, 0.116f, -0.4f)
                curveToRelative(0.056f, -0.064f, 0.179f, -0.173f, 0.378f, -0.173f)
                lineTo(20.514f, 11.0f)
                curveToRelative(0.199f, 0.0f, 0.323f, 0.108f, 0.379f, 0.173f)
                curveToRelative(0.056f, 0.064f, 0.145f, 0.202f, 0.116f, 0.399f)
                lineToRelative(-1.006f, 6.863f)
                close()
                moveTo(16.0f, 16.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _basketShoppingMinus!!
    }

private var _basketShoppingMinus: ImageVector? = null
