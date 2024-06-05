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

public val Icons.Filled.Pets: ImageVector
    get() {
        if (_pets != null) {
            return _pets!!
        }
        _pets = Builder(name = "Pets", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.861f, 20.132f)
                curveToRelative(0.169f, 0.291f, 0.231f, 0.629f, 0.177f, 0.962f)
                lineToRelative(-0.197f, 1.224f)
                curveToRelative(-0.156f, 0.97f, -0.993f, 1.683f, -1.975f, 1.683f)
                lineTo(6.773f, 24.001f)
                curveToRelative(-0.977f, 0.0f, -1.68f, -0.919f, -1.459f, -1.871f)
                curveToRelative(0.954f, -4.097f, 4.079f, -6.335f, 6.686f, -7.868f)
                verticalLineToRelative(-0.261f)
                curveToRelative(0.0f, -1.237f, 0.748f, -2.457f, 1.817f, -2.921f)
                curveToRelative(0.558f, -0.242f, 1.183f, 0.178f, 1.183f, 0.786f)
                verticalLineToRelative(2.466f)
                curveToRelative(0.717f, 0.271f, 1.362f, 0.625f, 1.576f, 0.724f)
                curveToRelative(1.322f, 0.612f, 2.127f, 1.563f, 2.319f, 3.077f)
                curveToRelative(0.047f, 0.375f, 0.621f, 1.405f, 0.967f, 2.0f)
                close()
                moveTo(21.5f, 6.0f)
                horizontalLineToRelative(-0.227f)
                curveToRelative(-0.829f, 0.0f, -1.609f, -0.365f, -2.14f, -1.002f)
                lineToRelative(-0.229f, -0.275f)
                curveToRelative(-0.912f, -1.094f, -2.251f, -1.722f, -3.676f, -1.722f)
                horizontalLineToRelative(-1.227f)
                lineTo(14.001f, 0.865f)
                curveToRelative(0.0f, -0.586f, -0.59f, -1.029f, -1.133f, -0.807f)
                curveToRelative(-1.095f, 0.447f, -1.867f, 1.686f, -1.867f, 2.942f)
                verticalLineToRelative(0.706f)
                lineToRelative(-2.57f, 3.998f)
                curveToRelative(-0.924f, 1.438f, -2.497f, 2.296f, -4.206f, 2.296f)
                lineTo(1.0f, 10.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.614f)
                curveToRelative(-0.341f, -0.716f, -0.433f, -1.529f, -0.249f, -2.324f)
                curveToRelative(1.026f, -4.407f, 4.01f, -6.927f, 6.721f, -8.623f)
                curveToRelative(0.306f, -1.68f, 1.409f, -3.146f, 2.934f, -3.809f)
                curveToRelative(0.88f, -0.382f, 1.885f, -0.295f, 2.689f, 0.232f)
                curveToRelative(0.809f, 0.53f, 1.291f, 1.423f, 1.291f, 2.388f)
                verticalLineToRelative(1.167f)
                curveToRelative(0.472f, 0.219f, 1.311f, 0.682f, 1.689f, 0.967f)
                horizontalLineToRelative(0.311f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _pets!!
    }

private var _pets: ImageVector? = null
