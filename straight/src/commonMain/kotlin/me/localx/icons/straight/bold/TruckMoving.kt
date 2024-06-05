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

public val Icons.Bold.TruckMoving: ImageVector
    get() {
        if (_truckMoving != null) {
            return _truckMoving!!
        }
        _truckMoving = Builder(name = "TruckMoving", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.149f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.282f, -1.739f)
                lineTo(22.379f, 7.393f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 19.059f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 4.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 13.5f, 1.0f)
                lineTo(3.5f, 1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 4.5f)
                verticalLineToRelative(16.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 4.95f, 20.0f)
                horizontalLineToRelative(1.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.9f, 0.0f)
                horizontalLineToRelative(6.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.9f, 0.0f)
                lineTo(24.0f, 20.0f)
                close()
                moveTo(14.0f, 17.0f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 4.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 4.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
                moveTo(19.059f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.474f, 0.342f)
                lineToRelative(1.339f, 4.016f)
                arcTo(2.515f, 2.515f, 0.0f, false, true, 21.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                lineTo(17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _truckMoving!!
    }

private var _truckMoving: ImageVector? = null
