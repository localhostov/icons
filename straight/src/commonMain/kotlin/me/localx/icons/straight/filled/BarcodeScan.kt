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

public val Icons.Filled.BarcodeScan: ImageVector
    get() {
        if (_barcodeScan != null) {
            return _barcodeScan!!
        }
        _barcodeScan = Builder(name = "BarcodeScan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 23.0f)
                lineTo(2.0f, 14.0f)
                close()
                moveTo(17.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(9.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(5.0f, 23.0f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(13.0f, 23.0f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(20.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(22.0f, 10.0f)
                lineTo(22.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 10.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 10.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.0f, 10.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(8.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.0f, 10.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(4.0f, 1.0f)
                lineTo(2.0f, 1.0f)
                lineTo(2.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(2.0f)
                lineTo(24.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _barcodeScan!!
    }

private var _barcodeScan: ImageVector? = null
