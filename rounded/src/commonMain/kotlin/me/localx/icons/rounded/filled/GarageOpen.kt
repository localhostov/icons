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

public val Icons.Filled.GarageOpen: ImageVector
    get() {
        if (_garageOpen != null) {
            return _garageOpen!!
        }
        _garageOpen = Builder(name = "GarageOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.762f)
                verticalLineToRelative(9.365f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, true, -3.748f, 4.841f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 22.994f)
                verticalLineTo(13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(9.994f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.252f, 0.974f)
                arcTo(5.009f, 5.009f, 0.0f, false, true, 0.0f, 19.127f)
                verticalLineTo(9.762f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 2.2f, 5.618f)
                lineTo(9.2f, 0.894f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.594f, 0.0f)
                lineToRelative(7.0f, 4.724f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 24.0f, 9.762f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 15.0f)
                close()
            }
        }
        .build()
        return _garageOpen!!
    }

private var _garageOpen: ImageVector? = null
