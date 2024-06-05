package me.localx.icons.straight.filled

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

public val Icons.Filled.BagMapPin: ImageVector
    get() {
        if (_bagMapPin != null) {
            return _bagMapPin!!
        }
        _bagMapPin = Builder(name = "BagMapPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                curveToRelative(0.0f, -1.336f, -0.521f, -2.591f, -1.465f, -3.535f)
                curveToRelative(-0.944f, -0.945f, -2.2f, -1.465f, -3.535f, -1.465f)
                reflectiveCurveToRelative(-2.592f, 0.521f, -3.535f, 1.465f)
                curveToRelative(-0.944f, 0.943f, -1.465f, 2.199f, -1.465f, 3.535f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.473f, 3.543f)
                lineToRelative(3.527f, 3.45f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(0.944f, -0.943f, 1.465f, -2.199f, 1.465f, -3.535f)
                close()
                moveTo(12.0f, 18.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(6.0f, 2.691f, 6.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.147f)
                lineToRelative(-2.073f, -2.027f)
                curveToRelative(-1.343f, -1.341f, -2.074f, -3.102f, -2.074f, -4.973f)
                reflectiveCurveToRelative(0.729f, -3.629f, 2.052f, -4.95f)
                curveToRelative(1.319f, -1.321f, 3.077f, -2.05f, 4.948f, -2.05f)
                reflectiveCurveToRelative(3.628f, 0.729f, 4.95f, 2.051f)
                curveToRelative(1.321f, 1.322f, 2.05f, 3.08f, 2.05f, 4.949f)
                reflectiveCurveToRelative(-0.729f, 3.629f, -2.052f, 4.95f)
                lineToRelative(-2.095f, 2.05f)
                horizontalLineToRelative(6.147f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(24.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(8.0f, 6.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                lineTo(8.0f, 6.0f)
                close()
            }
        }
        .build()
        return _bagMapPin!!
    }

private var _bagMapPin: ImageVector? = null
