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

public val Icons.Filled.CarGarage: ImageVector
    get() {
        if (_carGarage != null) {
            return _carGarage!!
        }
        _carGarage = Builder(name = "CarGarage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.294f, 16.0f)
                arcTo(12.016f, 12.016f, 0.0f, false, false, 1.0f, 18.6f)
                lineTo(1.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 22.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 18.6f)
                arcToRelative(12.016f, 12.016f, 0.0f, false, false, -0.294f, -2.6f)
                close()
                moveTo(18.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 18.0f)
                close()
                moveTo(6.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 18.0f)
                close()
                moveTo(21.733f, 13.23f)
                curveToRelative(0.125f, 0.25f, 0.223f, 0.512f, 0.33f, 0.77f)
                lineTo(1.937f, 14.0f)
                curveToRelative(0.107f, -0.258f, 0.2f, -0.52f, 0.33f, -0.77f)
                lineTo(4.553f, 8.658f)
                arcTo(2.984f, 2.984f, 0.0f, false, true, 7.236f, 7.0f)
                horizontalLineToRelative(9.528f)
                arcToRelative(2.984f, 2.984f, 0.0f, false, true, 2.683f, 1.658f)
                close()
                moveTo(23.94f, 5.53f)
                lineTo(23.057f, 7.33f)
                lineTo(12.441f, 2.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, 0.0f)
                lineTo(0.943f, 7.323f)
                lineTo(0.06f, 5.528f)
                lineTo(10.676f, 0.308f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, true, 2.648f, 0.0f)
                close()
            }
        }
        .build()
        return _carGarage!!
    }

private var _carGarage: ImageVector? = null
