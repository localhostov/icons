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

public val Icons.Bold.BullseyePointer: ImageVector
    get() {
        if (_bullseyePointer != null) {
            return _bullseyePointer!!
        }
        _bullseyePointer = Builder(name = "BullseyePointer", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.063f, 7.442f)
                curveToRelative(-0.525f, 0.0f, -1.045f, 0.092f, -1.544f, 0.272f)
                lineToRelative(-0.471f, 0.171f)
                curveToRelative(0.756f, -1.416f, 2.234f, -2.386f, 3.951f, -2.386f)
                curveToRelative(2.485f, 0.0f, 4.5f, 2.015f, 4.5f, 4.5f)
                curveToRelative(0.0f, 1.718f, -0.97f, 3.196f, -2.387f, 3.952f)
                lineToRelative(0.17f, -0.468f)
                curveToRelative(0.604f, -1.661f, 0.203f, -3.47f, -1.046f, -4.719f)
                curveToRelative(-0.852f, -0.853f, -1.979f, -1.322f, -3.173f, -1.322f)
                close()
                moveTo(15.035f, 16.914f)
                lineToRelative(-1.12f, 3.081f)
                curveToRelative(0.029f, 0.0f, 0.056f, 0.004f, 0.085f, 0.004f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(19.514f, 0.0f, 14.0f, 0.0f)
                reflectiveCurveTo(4.0f, 4.486f, 4.0f, 10.0f)
                curveToRelative(0.0f, 0.028f, 0.004f, 0.056f, 0.004f, 0.084f)
                lineToRelative(3.081f, -1.12f)
                curveToRelative(0.504f, -3.369f, 3.408f, -5.964f, 6.915f, -5.964f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                curveToRelative(0.0f, 3.507f, -2.595f, 6.412f, -5.965f, 6.915f)
                close()
                moveTo(0.0f, 13.669f)
                lineToRelative(11.2f, -4.073f)
                curveToRelative(0.923f, -0.334f, 1.928f, -0.112f, 2.623f, 0.583f)
                curveToRelative(0.694f, 0.694f, 0.917f, 1.698f, 0.581f, 2.621f)
                lineToRelative(-4.073f, 11.2f)
                lineToRelative(-4.105f, -4.105f)
                lineToRelative(-4.105f, 4.105f)
                lineTo(0.0f, 21.879f)
                lineToRelative(4.105f, -4.105f)
                lineTo(0.0f, 13.669f)
                close()
                moveTo(11.218f, 12.782f)
                lineToRelative(-5.765f, 2.096f)
                lineToRelative(3.669f, 3.669f)
                lineToRelative(2.096f, -5.765f)
                close()
            }
        }
        .build()
        return _bullseyePointer!!
    }

private var _bullseyePointer: ImageVector? = null
