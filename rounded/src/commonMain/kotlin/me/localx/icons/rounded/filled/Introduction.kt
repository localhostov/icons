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

public val Icons.Filled.Introduction: ImageVector
    get() {
        if (_introduction != null) {
            return _introduction!!
        }
        _introduction = Builder(name = "Introduction", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 9.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                close()
                moveTo(23.121f, 0.878f)
                curveToRelative(-0.567f, -0.566f, -1.319f, -0.878f, -2.12f, -0.878f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(-4.0f, 0.002f)
                curveToRelative(-1.654f, 0.0f, -2.999f, 1.348f, -2.998f, 3.0f)
                verticalLineToRelative(6.207f)
                reflectiveCurveToRelative(0.001f, 0.0f, 0.001f, 0.0f)
                curveToRelative(0.0f, 0.653f, 0.357f, 1.255f, 0.931f, 1.568f)
                curveToRelative(0.268f, 0.147f, 0.563f, 0.22f, 0.859f, 0.22f)
                curveToRelative(0.335f, 0.0f, 0.671f, -0.094f, 0.964f, -0.281f)
                curveToRelative(0.067f, -0.043f, 0.13f, -0.095f, 0.185f, -0.152f)
                lineToRelative(1.488f, -1.56f)
                lineToRelative(2.575f, -0.003f)
                curveToRelative(1.652f, 0.0f, 2.997f, -1.348f, 2.997f, -3.0f)
                verticalLineToRelative(-3.002f)
                curveToRelative(0.0f, -0.802f, -0.312f, -1.555f, -0.879f, -2.122f)
                close()
                moveTo(15.0f, 21.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(0.0f, 6.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(3.584f, 0.0f, 6.5f, 2.916f, 6.5f, 6.5f)
                close()
            }
        }
        .build()
        return _introduction!!
    }

private var _introduction: ImageVector? = null
