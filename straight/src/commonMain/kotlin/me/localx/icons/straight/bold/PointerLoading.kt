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

public val Icons.Bold.PointerLoading: ImageVector
    get() {
        if (_pointerLoading != null) {
            return _pointerLoading!!
        }
        _pointerLoading = Builder(name = "PointerLoading", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.555f, 3.699f)
                curveToRelative(-0.352f, -0.464f, -0.886f, -0.776f, -1.466f, -0.856f)
                curveToRelative(-0.567f, -0.078f, -1.121f, 0.062f, -1.631f, 0.455f)
                lineTo(9.4f, 12.847f)
                lineToRelative(6.096f, 0.646f)
                lineToRelative(-3.029f, 5.97f)
                lineToRelative(3.834f, 1.919f)
                lineToRelative(3.125f, -6.076f)
                lineToRelative(4.573f, 4.18f)
                lineTo(23.999f, 5.023f)
                curveToRelative(0.0f, -0.477f, -0.159f, -0.949f, -0.445f, -1.324f)
                close()
                moveTo(21.0f, 12.678f)
                lineToRelative(-2.003f, -1.831f)
                lineToRelative(-2.398f, -0.255f)
                lineToRelative(4.401f, -3.802f)
                verticalLineToRelative(5.888f)
                close()
                moveTo(3.0f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(7.0f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(11.0f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pointerLoading!!
    }

private var _pointerLoading: ImageVector? = null
