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

public val Icons.Bold.Rv: ImageVector
    get() {
        if (_rv != null) {
            return _rv!!
        }
        _rv = Builder(name = "Rv", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 1.0f)
                lineTo(4.5f, 1.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 0.0f, 5.5f)
                lineTo(0.0f, 15.621f)
                lineToRelative(4.0f, 4.0f)
                lineTo(4.0f, 20.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 8.95f, 20.0f)
                horizontalLineToRelative(7.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.9f, 0.0f)
                lineTo(24.0f, 20.0f)
                lineTo(24.0f, 14.562f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -0.725f, -2.729f)
                lineTo(21.656f, 9.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(13.0f, 9.5f)
                lineTo(13.0f, 17.0f)
                lineTo(5.621f, 17.0f)
                lineTo(3.0f, 14.379f)
                lineTo(3.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 4.0f)
                horizontalLineToRelative(15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 5.5f)
                lineTo(21.0f, 6.0f)
                lineTo(16.5f, 6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 13.0f, 9.5f)
                close()
                moveTo(16.0f, 14.0f)
                lineTo(16.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.7f)
                lineToRelative(2.469f, 4.321f)
                arcToRelative(2.505f, 2.505f, 0.0f, false, true, 0.266f, 0.679f)
                close()
                moveTo(5.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 11.0f)
                close()
            }
        }
        .build()
        return _rv!!
    }

private var _rv: ImageVector? = null
