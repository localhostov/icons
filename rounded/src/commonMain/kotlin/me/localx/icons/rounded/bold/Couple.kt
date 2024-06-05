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

public val Icons.Bold.Couple: ImageVector
    get() {
        if (_couple != null) {
            return _couple!!
        }
        _couple = Builder(name = "Couple", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.99f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(18.421f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.707f, 1.707f)
                lineToRelative(1.229f, 1.229f)
                lineTo(16.905f, 4.974f)
                arcToRelative(6.446f, 6.446f, 0.0f, false, false, -6.9f, 0.057f)
                arcTo(6.495f, 6.495f, 0.0f, true, false, 5.0f, 16.818f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.809f)
                arcToRelative(6.462f, 6.462f, 0.0f, false, false, 2.0f, -0.84f)
                arcTo(6.488f, 6.488f, 0.0f, false, false, 19.026f, 7.1f)
                lineToRelative(2.038f, -2.038f)
                lineToRelative(1.229f, 1.229f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 5.577f)
                close()
                moveTo(3.0f, 10.5f)
                arcTo(3.486f, 3.486f, 0.0f, false, true, 7.86f, 7.282f)
                arcToRelative(6.451f, 6.451f, 0.0f, false, false, 0.0f, 6.436f)
                arcTo(3.486f, 3.486f, 0.0f, false, true, 3.0f, 10.5f)
                close()
                moveTo(13.5f, 14.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 17.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 13.5f, 14.0f)
                close()
            }
        }
        .build()
        return _couple!!
    }

private var _couple: ImageVector? = null
