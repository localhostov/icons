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

public val Icons.Filled.TruckContainer: ImageVector
    get() {
        if (_truckContainer != null) {
            return _truckContainer!!
        }
        _truckContainer = Builder(name = "TruckContainer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 1.0f)
                lineTo(3.0f, 1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.0f)
                lineTo(0.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                lineTo(14.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 1.0f)
                close()
                moveTo(4.0f, 11.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(8.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(10.0f, 11.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                lineTo(10.0f, 11.0f)
                moveToRelative(6.0f, 0.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(3.559f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.4f, 7.051f)
                lineTo(23.721f, 11.0f)
                close()
                moveTo(0.0f, 18.0f)
                lineTo(0.0f, 16.0f)
                lineTo(16.0f, 16.0f)
                lineTo(16.0f, 13.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(0.058f, 20.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
                moveTo(7.058f, 20.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
                moveTo(17.058f, 20.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
            }
        }
        .build()
        return _truckContainer!!
    }

private var _truckContainer: ImageVector? = null
