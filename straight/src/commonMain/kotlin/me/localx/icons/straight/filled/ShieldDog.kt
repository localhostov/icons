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

public val Icons.Filled.ShieldDog: ImageVector
    get() {
        if (_shieldDog != null) {
            return _shieldDog!!
        }
        _shieldDog = Builder(name = "ShieldDog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.996f, 11.5f)
                horizontalLineToRelative(0.004f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.364f)
                lineToRelative(-0.703f, 2.559f)
                curveToRelative(-1.227f, -1.157f, -1.903f, -2.304f, -1.939f, -3.313f)
                lineToRelative(1.624f, -3.246f)
                horizontalLineToRelative(1.125f)
                curveToRelative(0.768f, 0.0f, 1.465f, 0.333f, 1.819f, 0.867f)
                curveToRelative(0.656f, 0.992f, 1.809f, 1.633f, 2.935f, 1.633f)
                close()
                moveTo(22.0f, 5.439f)
                verticalLineToRelative(6.525f)
                curveToRelative(0.0f, 7.435f, -7.047f, 10.848f, -9.207f, 11.716f)
                lineToRelative(-0.835f, 0.336f)
                lineToRelative(-0.805f, -0.402f)
                curveToRelative(-2.147f, -1.074f, -9.153f, -5.087f, -9.153f, -11.65f)
                verticalLineToRelative(-6.525f)
                curveToRelative(0.0f, -1.293f, 0.826f, -2.435f, 2.055f, -2.842f)
                lineTo(12.0f, -0.038f)
                lineToRelative(7.945f, 2.634f)
                curveToRelative(1.229f, 0.407f, 2.055f, 1.549f, 2.055f, 2.842f)
                close()
                moveTo(18.0f, 11.496f)
                lineToRelative(-0.008f, -1.996f)
                horizontalLineToRelative(-1.996f)
                curveToRelative(-0.387f, 0.0f, -0.946f, -0.253f, -1.268f, -0.738f)
                curveToRelative(-0.731f, -1.104f, -2.035f, -1.762f, -3.486f, -1.762f)
                horizontalLineToRelative(-0.242f)
                verticalLineToRelative(-2.5f)
                curveToRelative(-1.381f, 0.0f, -2.501f, 1.12f, -2.501f, 2.501f)
                verticalLineToRelative(0.764f)
                reflectiveCurveToRelative(-2.007f, 4.012f, -2.007f, 4.012f)
                verticalLineToRelative(0.385f)
                curveToRelative(0.0f, 2.501f, 2.116f, 4.624f, 3.89f, 5.963f)
                lineToRelative(1.177f, 0.888f)
                lineToRelative(1.101f, -4.011f)
                horizontalLineToRelative(1.839f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.504f)
                close()
            }
        }
        .build()
        return _shieldDog!!
    }

private var _shieldDog: ImageVector? = null
