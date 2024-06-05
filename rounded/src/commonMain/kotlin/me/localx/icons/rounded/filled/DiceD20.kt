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

public val Icons.Filled.DiceD20: ImageVector
    get() {
        if (_diceD20 != null) {
            return _diceD20!!
        }
        _diceD20 = Builder(name = "DiceD20", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2f, 11.0f)
                lineTo(12.0f, 16.113f)
                lineTo(8.805f, 11.0f)
                close()
                moveTo(10.017f, 16.706f)
                lineTo(6.944f, 11.8f)
                lineTo(3.83f, 16.158f)
                close()
                moveTo(17.252f, 8.353f)
                lineTo(21.952f, 5.534f)
                arcToRelative(4.978f, 4.978f, 0.0f, false, false, -1.372f, -1.222f)
                lineToRelative(-6.0f, -3.6f)
                arcTo(4.99f, 4.99f, 0.0f, false, false, 12.712f, 0.05f)
                curveTo(12.778f, 0.112f, 17.247f, 8.353f, 17.247f, 8.353f)
                close()
                moveTo(15.323f, 9.0f)
                lineTo(12.0f, 2.848f)
                lineTo(8.677f, 9.0f)
                close()
                moveTo(17.056f, 11.8f)
                lineTo(14.0f, 16.688f)
                lineToRelative(6.167f, -0.534f)
                close()
                moveTo(6.753f, 8.353f)
                reflectiveCurveTo(11.222f, 0.112f, 11.288f, 0.05f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 9.427f, 0.713f)
                lineToRelative(-6.0f, 3.6f)
                arcTo(4.978f, 4.978f, 0.0f, false, false, 2.055f, 5.534f)
                close()
                moveTo(18.277f, 10.067f)
                reflectiveCurveToRelative(4.578f, 6.414f, 4.6f, 6.446f)
                arcTo(4.979f, 4.979f, 0.0f, false, false, 23.0f, 15.4f)
                lineTo(23.0f, 8.6f)
                arcToRelative(4.965f, 4.965f, 0.0f, false, false, -0.165f, -1.267f)
                close()
                moveTo(13.0f, 18.781f)
                lineTo(13.0f, 23.9f)
                arcToRelative(5.015f, 5.015f, 0.0f, false, false, 1.573f, -0.614f)
                lineToRelative(6.0f, -3.6f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.719f, -1.732f)
                curveTo(22.226f, 17.976f, 13.0f, 18.781f, 13.0f, 18.781f)
                close()
                moveTo(5.723f, 10.067f)
                lineTo(1.165f, 7.333f)
                arcTo(4.965f, 4.965f, 0.0f, false, false, 1.0f, 8.6f)
                verticalLineToRelative(6.8f)
                arcToRelative(4.979f, 4.979f, 0.0f, false, false, 0.127f, 1.113f)
                curveTo(1.145f, 16.481f, 5.723f, 10.067f, 5.723f, 10.067f)
                close()
                moveTo(11.0f, 18.8f)
                reflectiveCurveToRelative(-9.227f, -0.825f, -9.292f, -0.845f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 1.719f, 1.732f)
                lineToRelative(6.0f, 3.6f)
                arcTo(5.015f, 5.015f, 0.0f, false, false, 11.0f, 23.9f)
                close()
            }
        }
        .build()
        return _diceD20!!
    }

private var _diceD20: ImageVector? = null
