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

public val Icons.Filled.TimeFast: ImageVector
    get() {
        if (_timeFast != null) {
            return _timeFast!!
        }
        _timeFast = Builder(name = "TimeFast", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 24.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(23.991f, 11.526f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, true, -11.991f, 12.474f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(12.014f, 12.014f, 0.0f, false, true, 12.475f, -11.991f)
                arcToRelative(12.114f, 12.114f, 0.0f, false, true, 11.516f, 11.517f)
                close()
                moveTo(11.0f, 5.793f)
                verticalLineToRelative(5.414f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.707f, -2.707f)
                verticalLineToRelative(-4.586f)
                close()
            }
        }
        .build()
        return _timeFast!!
    }

private var _timeFast: ImageVector? = null
