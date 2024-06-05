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

public val Icons.Filled.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = Builder(name = "Garage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 11.0f)
                horizontalLineTo(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 11.0f)
                close()
                moveTo(13.0f, 22.0f)
                horizontalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 22.0f)
                close()
                moveTo(24.0f, 9.724f)
                verticalLineTo(19.0f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, true, -4.0f, 4.9f)
                verticalLineTo(13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(23.9f)
                arcTo(5.009f, 5.009f, 0.0f, false, true, 0.0f, 19.0f)
                verticalLineTo(9.724f)
                arcTo(4.992f, 4.992f, 0.0f, false, true, 2.2f, 5.579f)
                lineTo(9.2f, 0.855f)
                arcToRelative(4.981f, 4.981f, 0.0f, false, true, 5.594f, 0.0f)
                lineToRelative(7.0f, 4.724f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 24.0f, 9.724f)
                close()
            }
        }
        .build()
        return _garage!!
    }

private var _garage: ImageVector? = null
