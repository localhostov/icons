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

public val Icons.Filled.CarBattery: ImageVector
    get() {
        if (_carBattery != null) {
            return _carBattery!!
        }
        _carBattery = Builder(name = "CarBattery", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.127f)
                lineTo(21.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(15.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(13.0f, 5.0f)
                lineTo(11.0f, 5.0f)
                lineTo(11.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 4.0f)
                lineTo(3.0f, 5.127f)
                arcTo(4.006f, 4.006f, 0.0f, false, false, 0.0f, 9.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 22.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 9.0f)
                arcTo(4.006f, 4.006f, 0.0f, false, false, 21.0f, 5.127f)
                close()
                moveTo(9.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(9.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 13.0f)
                close()
                moveTo(19.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(16.0f, 13.0f)
                lineTo(15.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 13.0f)
                close()
            }
        }
        .build()
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
