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

public val Icons.Filled.Dart: ImageVector
    get() {
        if (_dart != null) {
            return _dart!!
        }
        _dart = Builder(name = "Dart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.414f, 12.0f)
                curveToRelative(-2.294f, 3.115f, -5.629f, 8.457f, -6.293f, 9.121f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, true, -3.407f, 0.579f)
                lineToRelative(-2.3f, 2.3f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.3f, -2.3f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, true, 0.577f, -3.4f)
                curveToRelative(0.664f, -0.664f, 6.006f, -4.0f, 9.121f, -6.293f)
                close()
                moveTo(12.0f, 4.586f)
                verticalLineToRelative(6.0f)
                lineToRelative(7.293f, -7.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-7.293f, 7.293f)
                horizontalLineToRelative(6.0f)
                lineToRelative(4.586f, -4.586f)
                verticalLineToRelative(-4.414f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-4.414f)
                close()
            }
        }
        .build()
        return _dart!!
    }

private var _dart: ImageVector? = null
