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

public val Icons.Bold.Diploma: ImageVector
    get() {
        if (_diploma != null) {
            return _diploma!!
        }
        _diploma = Builder(name = "Diploma", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 8.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(21.0f, 19.974f)
                verticalLineToRelative(2.942f)
                arcToRelative(1.082f, 1.082f, 0.0f, false, true, -1.847f, 0.765f)
                lineToRelative(-1.153f, -1.153f)
                lineToRelative(-1.153f, 1.153f)
                arcToRelative(1.082f, 1.082f, 0.0f, false, true, -1.847f, -0.765f)
                verticalLineToRelative(-2.942f)
                arcToRelative(4.989f, 4.989f, 0.0f, false, true, 4.0f, -8.874f)
                verticalLineToRelative(-5.6f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                lineToRelative(-8.993f, 0.038f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.507f, 2.5f)
                verticalLineToRelative(11.962f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, true, -5.5f, -5.5f)
                verticalLineToRelative(-11.962f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, true, 5.5f, -5.5f)
                lineToRelative(8.993f, -0.038f)
                arcToRelative(5.509f, 5.509f, 0.0f, false, true, 5.507f, 5.5f)
                verticalLineToRelative(7.531f)
                arcToRelative(4.932f, 4.932f, 0.0f, false, true, -1.0f, 6.943f)
                close()
                moveTo(16.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _diploma!!
    }

private var _diploma: ImageVector? = null
