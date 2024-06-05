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

public val Icons.Filled.SaltPepper: ImageVector
    get() {
        if (_saltPepper != null) {
            return _saltPepper!!
        }
        _saltPepper = Builder(name = "SaltPepper", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.832f, 11.445f)
                curveTo(20.89f, 10.032f, 20.0f, 8.7f, 20.0f, 7.0f)
                lineTo(20.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 3.0f)
                lineTo(20.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(15.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                lineTo(11.0f, 3.0f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 7.0f)
                curveToRelative(0.0f, 1.7f, -0.89f, 3.032f, -1.832f, 4.445f)
                arcTo(9.854f, 9.854f, 0.0f, false, false, 8.0f, 17.0f)
                curveToRelative(0.0f, 2.949f, 2.058f, 6.374f, 2.145f, 6.519f)
                lineToRelative(0.292f, 0.481f)
                lineTo(21.562f, 24.0f)
                lineToRelative(0.292f, -0.481f)
                curveTo(21.942f, 23.374f, 24.0f, 19.949f, 24.0f, 17.0f)
                arcTo(9.847f, 9.847f, 0.0f, false, false, 21.832f, 11.445f)
                close()
                moveTo(14.0f, 7.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                lineTo(18.0f, 7.0f)
                arcToRelative(8.981f, 8.981f, 0.0f, false, false, 1.8f, 5.0f)
                lineTo(12.2f, 12.0f)
                arcTo(8.989f, 8.989f, 0.0f, false, false, 14.0f, 7.0f)
                close()
                moveTo(16.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 18.0f)
                close()
                moveTo(18.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 21.0f)
                close()
                moveTo(20.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 18.0f)
                close()
                moveTo(8.118f, 24.0f)
                lineTo(2.437f, 24.0f)
                lineToRelative(-0.292f, -0.481f)
                curveTo(2.058f, 23.374f, 0.0f, 19.949f, 0.0f, 17.0f)
                arcToRelative(9.854f, 9.854f, 0.0f, false, true, 2.168f, -5.555f)
                curveTo(3.11f, 10.032f, 4.0f, 8.7f, 4.0f, 7.0f)
                lineTo(4.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                lineTo(3.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                arcToRelative(2.943f, 2.943f, 0.0f, false, true, 0.9f, 0.153f)
                arcTo(4.967f, 4.967f, 0.0f, false, false, 9.0f, 3.0f)
                lineTo(9.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                lineTo(6.0f, 7.0f)
                arcToRelative(8.989f, 8.989f, 0.0f, false, true, -1.8f, 5.0f)
                lineTo(7.456f, 12.0f)
                arcTo(9.8f, 9.8f, 0.0f, false, false, 6.0f, 17.0f)
                arcTo(16.211f, 16.211f, 0.0f, false, false, 8.118f, 24.0f)
                close()
            }
        }
        .build()
        return _saltPepper!!
    }

private var _saltPepper: ImageVector? = null
