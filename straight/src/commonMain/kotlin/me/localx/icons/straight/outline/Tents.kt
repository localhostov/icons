package me.localx.icons.straight.outline

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

public val Icons.Outline.Tents: ImageVector
    get() {
        if (_tents != null) {
            return _tents!!
        }
        _tents = Builder(name = "Tents", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.679f, 16.697f)
                curveToRelative(-0.451f, 0.804f, -1.312f, 1.303f, -2.247f, 1.303f)
                horizontalLineToRelative(-0.846f)
                lineToRelative(-1.321f, -2.0f)
                horizontalLineToRelative(2.167f)
                curveToRelative(0.311f, 0.0f, 0.456f, -0.197f, 0.503f, -0.282f)
                curveToRelative(0.052f, -0.092f, 0.119f, -0.277f, -0.009f, -0.488f)
                lineTo(14.0f, 3.608f)
                lineToRelative(-1.483f, 2.175f)
                lineToRelative(-1.191f, -1.803f)
                lineTo(14.0f, 0.059f)
                lineToRelative(9.606f, 14.087f)
                curveToRelative(0.501f, 0.821f, 0.519f, 1.759f, 0.073f, 2.552f)
                close()
                moveTo(19.615f, 20.158f)
                curveToRelative(0.493f, 0.809f, 0.51f, 1.746f, 0.064f, 2.539f)
                curveToRelative(-0.451f, 0.804f, -1.312f, 1.303f, -2.247f, 1.303f)
                lineTo(2.568f, 24.0f)
                curveToRelative(-0.935f, 0.0f, -1.795f, -0.499f, -2.247f, -1.303f)
                curveToRelative(-0.446f, -0.793f, -0.429f, -1.73f, 0.045f, -2.509f)
                lineTo(10.0f, 5.603f)
                lineToRelative(9.614f, 14.556f)
                close()
                moveTo(11.445f, 22.0f)
                lineToRelative(-1.444f, -2.186f)
                lineToRelative(-1.444f, 2.186f)
                horizontalLineToRelative(2.888f)
                close()
                moveTo(17.927f, 21.229f)
                lineToRelative(-7.926f, -11.998f)
                lineToRelative(-7.933f, 12.01f)
                curveToRelative(-0.119f, 0.206f, -0.053f, 0.387f, -0.002f, 0.477f)
                curveToRelative(0.047f, 0.085f, 0.192f, 0.282f, 0.503f, 0.282f)
                horizontalLineToRelative(3.592f)
                lineToRelative(3.841f, -5.814f)
                lineToRelative(3.841f, 5.814f)
                horizontalLineToRelative(3.592f)
                curveToRelative(0.311f, 0.0f, 0.456f, -0.197f, 0.503f, -0.282f)
                curveToRelative(0.052f, -0.092f, 0.119f, -0.277f, -0.009f, -0.488f)
                close()
            }
        }
        .build()
        return _tents!!
    }

private var _tents: ImageVector? = null
