package me.localx.icons.rounded.bold

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

public val Icons.Bold.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 23.449f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(9.511f, 9.511f, 0.0f, false, true, 9.5f, -9.5f)
                horizontalLineToRelative(3.664f)
                lineTo(13.164f, 4.768f)
                arcTo(2.214f, 2.214f, 0.0f, false, true, 17.0f, 3.261f)
                lineToRelative(6.217f, 6.695f)
                arcToRelative(2.941f, 2.941f, 0.0f, false, true, 0.0f, 3.985f)
                lineTo(17.0f, 20.636f)
                arcToRelative(2.214f, 2.214f, 0.0f, false, true, -3.837f, -1.507f)
                verticalLineToRelative(-1.68f)
                lineTo(7.5f, 17.449f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 23.449f)
                close()
                moveTo(7.5f, 14.449f)
                horizontalLineToRelative(7.164f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(1.179f)
                lineTo(21.019f, 11.9f)
                lineTo(16.164f, 6.747f)
                verticalLineToRelative(1.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(9.5f, 9.447f)
                arcToRelative(6.508f, 6.508f, 0.0f, false, false, -6.5f, 6.5f)
                verticalLineToRelative(0.0f)
                arcTo(7.458f, 7.458f, 0.0f, false, true, 7.5f, 14.449f)
                close()
                moveTo(14.8f, 5.3f)
                lineToRelative(0.008f, 0.008f)
                close()
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null
