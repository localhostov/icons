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

public val Icons.Bold.Washer: ImageVector
    get() {
        if (_washer != null) {
            return _washer!!
        }
        _washer = Builder(name = "Washer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(6.165f, 12.623f)
                curveToRelative(0.815f, -0.412f, 1.74f, -0.563f, 1.775f, -0.568f)
                curveToRelative(1.225f, -0.163f, 2.669f, 0.194f, 4.291f, 1.062f)
                curveToRelative(1.227f, 0.657f, 2.292f, 0.949f, 3.082f, 0.843f)
                curveToRelative(1.405f, -0.147f, 2.272f, -1.216f, 2.48f, -1.5f)
                curveToRelative(-0.681f, -2.566f, -3.013f, -4.46f, -5.793f, -4.46f)
                curveToRelative(-2.839f, 0.0f, -5.212f, 1.974f, -5.835f, 4.623f)
                close()
                moveTo(15.578f, 15.943f)
                curveToRelative(-1.225f, 0.163f, -2.669f, -0.194f, -4.292f, -1.063f)
                curveToRelative(-1.227f, -0.657f, -2.292f, -0.949f, -3.082f, -0.843f)
                curveToRelative(-0.02f, 0.002f, -1.094f, 0.149f, -2.097f, 1.077f)
                curveToRelative(0.523f, 2.78f, 2.96f, 4.885f, 5.892f, 4.885f)
                curveToRelative(2.956f, 0.0f, 5.406f, -2.139f, 5.903f, -4.952f)
                curveToRelative(-1.207f, 0.775f, -2.29f, 0.89f, -2.325f, 0.895f)
                close()
                moveTo(23.0f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(1.0f, 24.0f)
                lineTo(1.0f, 3.5f)
                curveTo(1.0f, 1.57f, 2.57f, 0.0f, 4.5f, 0.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 3.5f)
                close()
                moveTo(8.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _washer!!
    }

private var _washer: ImageVector? = null
