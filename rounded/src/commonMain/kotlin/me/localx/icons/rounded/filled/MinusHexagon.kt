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

public val Icons.Filled.MinusHexagon: ImageVector
    get() {
        if (_minusHexagon != null) {
            return _minusHexagon!!
        }
        _minusHexagon = Builder(name = "MinusHexagon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.341f, 9.48f)
                lineToRelative(-3.501f, -6.0f)
                curveToRelative(-0.893f, -1.53f, -2.547f, -2.48f, -4.318f, -2.48f)
                horizontalLineToRelative(-7.071f)
                curveToRelative(-1.771f, 0.0f, -3.426f, 0.951f, -4.319f, 2.48f)
                lineTo(0.631f, 9.48f)
                curveToRelative(-0.906f, 1.554f, -0.906f, 3.485f, 0.0f, 5.039f)
                lineToRelative(3.501f, 6.0f)
                curveToRelative(0.893f, 1.53f, 2.547f, 2.48f, 4.318f, 2.48f)
                horizontalLineToRelative(7.071f)
                curveToRelative(1.771f, 0.0f, 3.426f, -0.95f, 4.319f, -2.48f)
                lineToRelative(3.5f, -6.0f)
                curveToRelative(0.906f, -1.554f, 0.906f, -3.485f, 0.0f, -5.039f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _minusHexagon!!
    }

private var _minusHexagon: ImageVector? = null
