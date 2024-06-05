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

public val Icons.Filled.ShipSide: ImageVector
    get() {
        if (_shipSide != null) {
            return _shipSide!!
        }
        _shipSide = Builder(name = "ShipSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7f, 14.0f)
                lineToRelative(-3.0f, 2.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(8.0f)
                lineTo(14.0f, 24.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 24.0f, 14.0f)
                close()
                moveTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.0f)
                close()
                moveTo(7.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 21.0f)
                close()
                moveTo(11.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 21.0f)
                close()
                moveTo(10.0f, 11.0f)
                lineTo(10.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                lineTo(0.0f, 6.0f)
                lineTo(11.78f, 6.0f)
                arcToRelative(5.033f, 5.033f, 0.0f, false, true, 3.18f, 1.139f)
                arcTo(15.383f, 15.383f, 0.0f, false, true, 18.806f, 12.0f)
                lineTo(14.092f, 12.0f)
                lineToRelative(-3.0f, 2.0f)
                lineTo(0.0f, 14.0f)
                lineTo(0.0f, 11.0f)
                close()
                moveTo(2.083f, 4.0f)
                lineTo(1.029f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(8.056f, 4.0f)
                close()
            }
        }
        .build()
        return _shipSide!!
    }

private var _shipSide: ImageVector? = null
