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

public val Icons.Outline.ShipSide: ImageVector
    get() {
        if (_shipSide != null) {
            return _shipSide!!
        }
        _shipSide = Builder(name = "ShipSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.96f, 6.139f)
                arcTo(5.033f, 5.033f, 0.0f, false, false, 11.78f, 5.0f)
                lineTo(8.771f, 5.0f)
                lineTo(7.453f, 0.0f)
                lineTo(1.029f, 0.0f)
                lineTo(2.347f, 5.0f)
                lineTo(0.0f, 5.0f)
                lineTo(0.0f, 7.0f)
                lineTo(11.78f, 7.0f)
                arcToRelative(3.029f, 3.029f, 0.0f, false, true, 1.913f, 0.687f)
                arcTo(13.424f, 13.424f, 0.0f, false, true, 17.077f, 12.0f)
                lineTo(14.7f, 12.0f)
                lineToRelative(-3.0f, 2.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(12.3f, 16.0f)
                lineToRelative(3.0f, -2.0f)
                horizontalLineToRelative(6.641f)
                arcTo(9.012f, 9.012f, 0.0f, false, true, 13.0f, 22.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(13.0f, 24.0f)
                arcTo(11.013f, 11.013f, 0.0f, false, false, 24.0f, 13.0f)
                lineTo(24.0f, 12.0f)
                lineTo(19.287f, 12.0f)
                arcTo(15.726f, 15.726f, 0.0f, false, false, 14.96f, 6.139f)
                close()
                moveTo(3.625f, 2.0f)
                lineTo(5.912f, 2.0f)
                lineTo(6.7f, 5.0f)
                lineTo(4.415f, 5.0f)
                close()
                moveTo(12.0f, 11.0f)
                lineTo(0.0f, 11.0f)
                lineTo(0.0f, 9.0f)
                lineTo(12.0f, 9.0f)
                close()
                moveTo(3.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 20.0f)
                close()
                moveTo(7.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 20.0f)
                close()
                moveTo(11.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 20.0f)
                close()
            }
        }
        .build()
        return _shipSide!!
    }

private var _shipSide: ImageVector? = null
