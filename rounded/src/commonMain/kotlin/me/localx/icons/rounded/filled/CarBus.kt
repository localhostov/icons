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

public val Icons.Filled.CarBus: ImageVector
    get() {
        if (_carBus != null) {
            return _carBus!!
        }
        _carBus = Builder(name = "CarBus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.833f, 9.0f)
                arcToRelative(4.988f, 4.988f, 0.0f, false, true, 4.616f, 3.077f)
                lineToRelative(0.321f, 0.77f)
                arcToRelative(16.158f, 16.158f, 0.0f, false, true, 0.7f, 2.153f)
                lineTo(8.526f, 15.0f)
                arcToRelative(16.033f, 16.033f, 0.0f, false, true, 0.705f, -2.154f)
                lineToRelative(0.32f, -0.769f)
                arcTo(4.988f, 4.988f, 0.0f, false, true, 14.167f, 9.0f)
                close()
                moveTo(23.86f, 17.0f)
                lineTo(21.0f, 17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(19.0f, 17.0f)
                lineTo(13.0f, 17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 17.0f)
                lineTo(8.14f, 17.0f)
                curveToRelative(-0.353f, 1.82f, -0.182f, 4.173f, 1.86f, 4.816f)
                lineTo(10.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineToRelative(-0.184f)
                curveTo(24.043f, 21.172f, 24.213f, 18.821f, 23.86f, 17.0f)
                close()
                moveTo(13.668f, 0.5f)
                arcTo(13.737f, 13.737f, 0.0f, false, false, 6.332f, 0.5f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 2.149f, 5.0f)
                horizontalLineToRelative(15.7f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 13.668f, 0.5f)
                close()
                moveTo(2.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, 2.816f)
                lineTo(4.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(6.0f, 19.0f)
                arcToRelative(17.216f, 17.216f, 0.0f, false, true, 0.125f, -2.0f)
                lineToRelative(0.465f, -2.5f)
                curveToRelative(0.045f, -0.173f, 0.091f, -0.335f, 0.137f, -0.5f)
                lineTo(2.0f, 14.0f)
                close()
                moveTo(14.167f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                lineTo(7.417f, 12.0f)
                lineToRelative(0.287f, -0.691f)
                arcTo(6.983f, 6.983f, 0.0f, false, true, 14.167f, 7.0f)
                close()
            }
        }
        .build()
        return _carBus!!
    }

private var _carBus: ImageVector? = null
