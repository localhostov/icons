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

public val Icons.Filled.CarMechanic: ImageVector
    get() {
        if (_carMechanic != null) {
            return _carMechanic!!
        }
        _carMechanic = Builder(name = "CarMechanic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.733f, 13.23f)
                curveToRelative(0.125f, 0.25f, 0.223f, 0.512f, 0.33f, 0.77f)
                lineTo(1.937f, 14.0f)
                curveToRelative(0.107f, -0.258f, 0.2f, -0.52f, 0.33f, -0.77f)
                lineTo(4.553f, 8.658f)
                arcTo(2.984f, 2.984f, 0.0f, false, true, 7.236f, 7.0f)
                horizontalLineToRelative(9.528f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, true, 2.683f, 1.658f)
                close()
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(2.816f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.632f, 0.0f)
                lineTo(5.816f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.184f, 2.0f)
                lineTo(3.0f, 2.0f)
                lineTo(3.0f, 4.0f)
                lineTo(0.184f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.816f, 4.0f)
                lineTo(18.184f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 5.632f, 0.0f)
                lineTo(21.0f, 4.0f)
                close()
                moveTo(22.7f, 16.0f)
                arcToRelative(11.955f, 11.955f, 0.0f, false, true, 0.3f, 2.6f)
                lineTo(23.0f, 22.0f)
                lineTo(21.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 22.0f)
                lineTo(8.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 22.0f)
                lineTo(1.0f, 22.0f)
                lineTo(1.0f, 18.6f)
                arcTo(12.016f, 12.016f, 0.0f, false, true, 1.294f, 16.0f)
                close()
                moveTo(18.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 20.0f)
                close()
                moveTo(6.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 20.0f)
                close()
            }
        }
        .build()
        return _carMechanic!!
    }

private var _carMechanic: ImageVector? = null
