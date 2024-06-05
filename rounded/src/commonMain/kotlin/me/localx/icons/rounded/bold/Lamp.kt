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

public val Icons.Bold.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.96f, 11.367f)
                lineToRelative(-0.839f, -6.563f)
                curveToRelative(-0.35f, -2.738f, -2.695f, -4.803f, -5.456f, -4.803f)
                lineTo(6.335f, 0.001f)
                curveTo(3.574f, 0.0f, 1.229f, 2.065f, 0.879f, 4.803f)
                lineTo(0.04f, 11.367f)
                curveToRelative(-0.182f, 1.424f, 0.259f, 2.859f, 1.208f, 3.937f)
                reflectiveCurveToRelative(2.317f, 1.696f, 3.753f, 1.696f)
                horizontalLineToRelative(5.499f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.5f, -2.0f, 1.5f, -2.0f, 1.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                curveToRelative(0.0f, 0.0f, -2.0f, 0.0f, -2.0f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(5.499f)
                curveToRelative(1.436f, 0.0f, 2.804f, -0.618f, 3.753f, -1.696f)
                reflectiveCurveToRelative(1.39f, -2.513f, 1.208f, -3.938f)
                close()
                moveTo(20.5f, 13.322f)
                curveToRelative(-0.385f, 0.438f, -0.918f, 0.678f, -1.501f, 0.678f)
                lineTo(5.001f, 14.0f)
                curveToRelative(-0.583f, 0.0f, -1.116f, -0.241f, -1.501f, -0.678f)
                curveToRelative(-0.386f, -0.438f, -0.558f, -0.997f, -0.483f, -1.575f)
                lineToRelative(0.839f, -6.563f)
                curveToRelative(0.158f, -1.245f, 1.225f, -2.183f, 2.479f, -2.183f)
                horizontalLineToRelative(11.33f)
                curveToRelative(1.255f, 0.0f, 2.321f, 0.938f, 2.479f, 2.183f)
                lineToRelative(0.839f, 6.563f)
                curveToRelative(0.074f, 0.579f, -0.098f, 1.138f, -0.483f, 1.576f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
