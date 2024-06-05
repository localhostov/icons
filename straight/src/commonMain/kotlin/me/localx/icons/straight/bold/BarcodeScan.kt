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

public val Icons.Bold.BarcodeScan: ImageVector
    get() {
        if (_barcodeScan != null) {
            return _barcodeScan!!
        }
        _barcodeScan = Builder(name = "BarcodeScan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 23.0f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 14.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(12.0f, 23.0f)
                horizontalLineToRelative(3.0f)
                lineTo(15.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(7.0f, 23.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(18.0f, 23.0f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 14.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _barcodeScan!!
    }

private var _barcodeScan: ImageVector? = null
