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

public val Icons.Bold.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 15.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 14.5f)
                close()
                moveTo(12.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 14.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 9.0f)
                close()
                moveTo(17.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 19.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 9.0f)
                close()
                moveTo(5.894f, 23.514f)
                curveToRelative(3.739f, 0.945f, 10.1f, 0.778f, 14.248f, -3.372f)
                reflectiveCurveTo(24.459f, 9.633f, 23.514f, 5.894f)
                arcTo(3.954f, 3.954f, 0.0f, false, false, 24.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                arcToRelative(3.954f, 3.954f, 0.0f, false, false, -1.894f, 0.486f)
                curveToRelative(-3.74f, -0.945f, -10.1f, -0.778f, -14.248f, 3.372f)
                reflectiveCurveTo(-0.459f, 14.367f, 0.486f, 18.106f)
                arcTo(3.954f, 3.954f, 0.0f, false, false, 0.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                arcTo(3.954f, 3.954f, 0.0f, false, false, 5.894f, 23.514f)
                close()
                moveTo(17.909f, 3.548f)
                lineToRelative(0.8f, 0.259f)
                lineToRelative(0.639f, -0.555f)
                arcTo(0.982f, 0.982f, 0.0f, false, true, 20.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(0.982f, 0.982f, 0.0f, false, true, -0.252f, 0.647f)
                lineToRelative(-0.555f, 0.639f)
                lineToRelative(0.259f, 0.805f)
                curveToRelative(0.894f, 2.778f, 1.025f, 8.473f, -2.431f, 11.93f)
                reflectiveCurveToRelative(-9.15f, 3.325f, -11.93f, 2.431f)
                lineToRelative(-0.805f, -0.259f)
                lineToRelative(-0.639f, 0.555f)
                arcTo(0.982f, 0.982f, 0.0f, false, true, 4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcToRelative(0.982f, 0.982f, 0.0f, false, true, 0.252f, -0.647f)
                lineToRelative(0.555f, -0.639f)
                lineToRelative(-0.259f, -0.8f)
                curveToRelative(-0.894f, -2.778f, -1.025f, -8.473f, 2.431f, -11.93f)
                arcToRelative(11.413f, 11.413f, 0.0f, false, true, 8.112f, -2.968f)
                arcTo(12.883f, 12.883f, 0.0f, false, true, 17.909f, 3.548f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
