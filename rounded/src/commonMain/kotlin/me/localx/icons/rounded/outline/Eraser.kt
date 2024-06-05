package me.localx.icons.rounded.outline

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

public val Icons.Outline.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 21.0f)
                horizontalLineToRelative(-8.633f)
                lineToRelative(8.174f, -8.205f)
                curveToRelative(1.939f, -1.946f, 1.939f, -5.113f, 0.0f, -7.06f)
                lineToRelative(-3.254f, -3.265f)
                curveToRelative(-0.945f, -0.948f, -2.203f, -1.47f, -3.541f, -1.47f)
                reflectiveCurveToRelative(-2.597f, 0.522f, -3.54f, 1.468f)
                lineTo(1.459f, 13.175f)
                curveToRelative(-1.939f, 1.946f, -1.939f, 5.113f, 0.0f, 7.059f)
                lineToRelative(1.583f, 1.589f)
                curveToRelative(0.745f, 0.748f, 1.777f, 1.177f, 2.834f, 1.177f)
                horizontalLineToRelative(17.124f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(13.62f, 3.882f)
                curveToRelative(0.567f, -0.569f, 1.322f, -0.882f, 2.126f, -0.882f)
                reflectiveCurveToRelative(1.558f, 0.313f, 2.125f, 0.882f)
                lineToRelative(3.254f, 3.265f)
                curveToRelative(1.163f, 1.167f, 1.163f, 3.068f, 0.0f, 4.236f)
                lineToRelative(-4.97f, 4.989f)
                lineToRelative(-7.509f, -7.534f)
                lineToRelative(4.974f, -4.955f)
                close()
                moveTo(5.876f, 21.0f)
                curveToRelative(-0.536f, 0.0f, -1.039f, -0.209f, -1.417f, -0.588f)
                lineToRelative(-1.584f, -1.589f)
                curveToRelative(-1.163f, -1.167f, -1.163f, -3.067f, -0.002f, -4.232f)
                lineToRelative(4.357f, -4.341f)
                lineToRelative(7.514f, 7.54f)
                lineToRelative(-3.199f, 3.211f)
                horizontalLineToRelative(-5.669f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
