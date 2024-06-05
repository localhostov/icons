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

public val Icons.Filled.TruckSide: ImageVector
    get() {
        if (_truckSide != null) {
            return _truckSide!!
        }
        _truckSide = Builder(name = "TruckSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(0.0f, 6.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 5.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                close()
                moveTo(24.0f, 11.0f)
                lineTo(24.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                lineTo(17.0f, 5.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(17.0f, 13.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(24.0f, 13.0f)
                close()
                moveTo(4.058f, 20.0f)
                arcTo(2.424f, 2.424f, 0.0f, false, false, 4.0f, 20.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, -0.058f, -0.5f)
                close()
                moveTo(15.058f, 20.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, -0.058f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, -0.058f, -0.5f)
                close()
            }
        }
        .build()
        return _truckSide!!
    }

private var _truckSide: ImageVector? = null
