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

public val Icons.Bold.Kerning: ImageVector
    get() {
        if (_kerning != null) {
            return _kerning!!
        }
        _kerning = Builder(name = "Kerning", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.93f, 7.954f)
                lineToRelative(-3.072f, 9.661f)
                curveToRelative(-0.263f, 0.828f, -1.01f, 1.385f, -1.858f, 1.385f)
                reflectiveCurveToRelative(-1.595f, -0.557f, -1.858f, -1.385f)
                lineTo(0.07f, 7.954f)
                curveToRelative(-0.251f, -0.789f, 0.186f, -1.633f, 0.975f, -1.884f)
                curveToRelative(0.788f, -0.249f, 1.633f, 0.186f, 1.884f, 0.976f)
                lineToRelative(2.07f, 6.512f)
                lineToRelative(2.07f, -6.512f)
                curveToRelative(0.251f, -0.79f, 1.095f, -1.224f, 1.884f, -0.976f)
                curveToRelative(0.79f, 0.251f, 1.226f, 1.095f, 0.975f, 1.884f)
                close()
                moveTo(22.955f, 18.93f)
                curveToRelative(-0.151f, 0.048f, -0.304f, 0.07f, -0.455f, 0.07f)
                curveToRelative(-0.636f, 0.0f, -1.226f, -0.407f, -1.429f, -1.045f)
                lineToRelative(-0.622f, -1.955f)
                horizontalLineToRelative(-2.897f)
                lineToRelative(-0.622f, 1.955f)
                curveToRelative(-0.251f, 0.789f, -1.096f, 1.224f, -1.884f, 0.975f)
                curveToRelative(-0.79f, -0.252f, -1.226f, -1.095f, -0.975f, -1.885f)
                lineToRelative(3.071f, -9.652f)
                curveToRelative(0.264f, -0.828f, 1.01f, -1.384f, 1.858f, -1.384f)
                reflectiveCurveToRelative(1.594f, 0.556f, 1.858f, 1.384f)
                lineToRelative(3.071f, 9.652f)
                curveToRelative(0.251f, 0.79f, -0.185f, 1.633f, -0.975f, 1.885f)
                close()
                moveTo(20.432f, 13.5f)
                lineToRelative(-1.432f, -4.5f)
                lineToRelative(-1.432f, 4.5f)
                horizontalLineToRelative(2.864f)
                close()
                moveTo(15.955f, 0.07f)
                curveToRelative(-0.786f, -0.249f, -1.633f, 0.186f, -1.884f, 0.975f)
                lineTo(7.389f, 22.045f)
                curveToRelative(-0.251f, 0.79f, 0.185f, 1.633f, 0.975f, 1.885f)
                curveToRelative(0.151f, 0.048f, 0.304f, 0.07f, 0.455f, 0.07f)
                curveToRelative(0.636f, 0.0f, 1.226f, -0.407f, 1.429f, -1.045f)
                lineTo(16.929f, 1.955f)
                curveToRelative(0.251f, -0.79f, -0.185f, -1.633f, -0.975f, -1.885f)
                close()
            }
        }
        .build()
        return _kerning!!
    }

private var _kerning: ImageVector? = null
