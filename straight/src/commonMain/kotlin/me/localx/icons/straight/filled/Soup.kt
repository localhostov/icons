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

public val Icons.Filled.Soup: ImageVector
    get() {
        if (_soup != null) {
            return _soup!!
        }
        _soup = Builder(name = "Soup", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.958f, 13.485f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 16.239f, 24.0f)
                lineTo(7.773f, 24.0f)
                arcTo(14.51f, 14.51f, 0.0f, false, true, 0.042f, 13.485f)
                arcTo(2.968f, 2.968f, 0.0f, false, true, 0.705f, 11.07f)
                arcTo(3.012f, 3.012f, 0.0f, false, true, 3.009f, 10.0f)
                lineTo(20.99f, 10.0f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, true, 2.3f, 1.07f)
                arcTo(2.968f, 2.968f, 0.0f, false, true, 23.958f, 13.485f)
                close()
                moveTo(14.0f, 5.414f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 5.414f)
                arcToRelative(4.381f, 4.381f, 0.0f, false, false, -1.293f, -3.121f)
                arcTo(2.432f, 2.432f, 0.0f, false, true, 14.0f, 0.586f)
                lineTo(14.0f, 0.0f)
                lineTo(12.0f, 0.0f)
                lineTo(12.0f, 0.586f)
                arcToRelative(4.451f, 4.451f, 0.0f, false, false, 1.292f, 3.122f)
                arcTo(2.394f, 2.394f, 0.0f, false, true, 14.0f, 5.414f)
                close()
                moveTo(10.0f, 6.414f)
                lineTo(10.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 6.414f)
                arcToRelative(4.386f, 4.386f, 0.0f, false, false, -1.293f, -3.122f)
                arcTo(2.39f, 2.39f, 0.0f, false, true, 10.0f, 1.586f)
                lineTo(10.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 1.586f)
                arcTo(4.384f, 4.384f, 0.0f, false, false, 9.292f, 4.707f)
                arcTo(2.429f, 2.429f, 0.0f, false, true, 10.0f, 6.414f)
                close()
            }
        }
        .build()
        return _soup!!
    }

private var _soup: ImageVector? = null
