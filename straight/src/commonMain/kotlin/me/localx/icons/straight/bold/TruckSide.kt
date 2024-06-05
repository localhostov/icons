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

public val Icons.Bold.TruckSide: ImageVector
    get() {
        if (_truckSide != null) {
            return _truckSide!!
        }
        _truckSide = Builder(name = "TruckSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 4.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 13.5f, 1.0f)
                lineTo(3.5f, 1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 4.5f)
                lineTo(0.0f, 20.0f)
                lineTo(3.058f, 20.0f)
                arcTo(2.424f, 2.424f, 0.0f, false, false, 3.0f, 20.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, -0.058f, -0.5f)
                horizontalLineToRelative(8.116f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, -0.058f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, -0.058f, -0.5f)
                lineTo(24.0f, 20.0f)
                lineTo(24.0f, 10.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 18.5f, 5.0f)
                close()
                moveTo(14.0f, 17.0f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 4.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 4.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
                moveTo(18.5f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 10.5f)
                lineTo(21.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                lineTo(17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _truckSide!!
    }

private var _truckSide: ImageVector? = null
