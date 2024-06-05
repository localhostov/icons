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

public val Icons.Filled.Icicles: ImageVector
    get() {
        if (_icicles != null) {
            return _icicles!!
        }
        _icicles = Builder(name = "Icicles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 24.0f)
                horizontalLineToRelative(-0.024f)
                curveToRelative(-0.468f, -0.012f, -0.864f, -0.346f, -0.956f, -0.804f)
                lineToRelative(-2.02f, -13.696f)
                lineToRelative(-1.02f, 8.696f)
                curveToRelative(-0.096f, 0.479f, -0.538f, 0.831f, -1.013f, 0.803f)
                curveToRelative(-0.488f, -0.016f, -0.894f, -0.382f, -0.959f, -0.866f)
                lineTo(0.043f, 3.473f)
                curveToRelative(-0.155f, -0.822f, 0.076f, -1.714f, 0.644f, -2.397f)
                reflectiveCurveTo(2.089f, 0.0f, 2.977f, 0.0f)
                horizontalLineToRelative(18.047f)
                curveToRelative(0.882f, 0.0f, 1.712f, 0.387f, 2.279f, 1.062f)
                curveToRelative(0.566f, 0.675f, 0.804f, 1.56f, 0.652f, 2.428f)
                lineToRelative(-2.972f, 18.209f)
                curveToRelative(-0.077f, 0.474f, -0.479f, 0.825f, -0.959f, 0.839f)
                curveToRelative(-0.514f, -0.008f, -0.901f, -0.316f, -1.005f, -0.784f)
                lineToRelative(-2.02f, -12.253f)
                lineToRelative(-1.533f, 7.87f)
                curveToRelative(-0.114f, 0.82f, -0.506f, 1.125f, -0.956f, 1.13f)
                curveToRelative(-0.473f, -0.017f, -0.849f, -0.292f, -0.973f, -0.725f)
                lineToRelative(-1.538f, -8.275f)
                lineToRelative(-3.03f, 13.744f)
                curveToRelative(-0.112f, 0.445f, -0.513f, 0.756f, -0.97f, 0.756f)
                close()
            }
        }
        .build()
        return _icicles!!
    }

private var _icicles: ImageVector? = null
