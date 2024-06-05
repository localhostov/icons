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

public val Icons.Filled.Billiard: ImageVector
    get() {
        if (_billiard != null) {
            return _billiard!!
        }
        _billiard = Builder(name = "Billiard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.0f, 6.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, -6.0f, -6.0f)
                close()
                moveTo(15.0f, 10.448f)
                lineTo(11.888f, 16.46f)
                lineTo(10.112f, 15.54f)
                lineTo(12.462f, 11.0f)
                horizontalLineToRelative(-3.462f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _billiard!!
    }

private var _billiard: ImageVector? = null
