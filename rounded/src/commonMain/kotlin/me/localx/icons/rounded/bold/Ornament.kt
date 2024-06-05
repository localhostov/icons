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

public val Icons.Bold.Ornament: ImageVector
    get() {
        if (_ornament != null) {
            return _ornament!!
        }
        _ornament = Builder(name = "Ornament", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.992f, 4.832f)
                curveToRelative(-0.085f, -1.025f, -0.946f, -1.832f, -1.992f, -1.832f)
                horizontalLineToRelative(-0.271f)
                curveToRelative(0.17f, -0.294f, 0.268f, -0.636f, 0.268f, -1.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.364f, 0.098f, 0.706f, 0.268f, 1.0f)
                horizontalLineToRelative(-0.266f)
                curveToRelative(-1.047f, 0.0f, -1.907f, 0.808f, -1.992f, 1.832f)
                curveToRelative(-3.533f, 1.544f, -6.008f, 5.072f, -6.008f, 9.168f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -4.096f, -2.475f, -7.623f, -6.008f, -9.168f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(3.671f, 0.0f, 6.691f, 2.84f, 6.977f, 6.439f)
                lineToRelative(-1.725f, -1.725f)
                curveToRelative(-0.903f, -0.904f, -2.375f, -0.904f, -3.284f, 0.005f)
                lineToRelative(-1.974f, 1.994f)
                lineToRelative(-1.975f, -1.995f)
                curveToRelative(-0.905f, -0.903f, -2.375f, -0.902f, -3.278f, 0.0f)
                lineToRelative(-1.72f, 1.72f)
                curveToRelative(0.287f, -3.599f, 3.307f, -6.439f, 6.977f, -6.439f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-2.78f, 0.0f, -5.186f, -1.628f, -6.315f, -3.981f)
                lineToRelative(2.694f, -2.694f)
                lineToRelative(1.976f, 1.996f)
                curveToRelative(0.876f, 0.877f, 2.398f, 0.883f, 3.285f, -0.005f)
                lineToRelative(1.976f, -1.996f)
                lineToRelative(2.699f, 2.699f)
                curveToRelative(-1.129f, 2.353f, -3.535f, 3.981f, -6.315f, 3.981f)
                close()
            }
        }
        .build()
        return _ornament!!
    }

private var _ornament: ImageVector? = null
