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

public val Icons.Bold.Euro: ImageVector
    get() {
        if (_euro != null) {
            return _euro!!
        }
        _euro = Builder(name = "Euro", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 21.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -8.05f, -5.0f)
                horizontalLineToRelative(10.05f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-10.941f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(10.941f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-10.05f)
                arcToRelative(8.989f, 8.989f, 0.0f, false, true, 14.993f, -1.727f)
                lineToRelative(2.314f, -1.91f)
                arcToRelative(11.989f, 11.989f, 0.0f, false, false, -20.557f, 3.637f)
                horizontalLineToRelative(-2.7f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.051f)
                curveToRelative(-0.028f, 0.331f, -0.051f, 0.662f, -0.051f, 1.0f)
                reflectiveCurveToRelative(0.023f, 0.669f, 0.051f, 1.0f)
                horizontalLineToRelative(-2.051f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.7f)
                arcToRelative(11.989f, 11.989f, 0.0f, false, false, 20.557f, 3.637f)
                lineToRelative(-2.314f, -1.91f)
                arcToRelative(8.976f, 8.976f, 0.0f, false, true, -6.943f, 3.273f)
                close()
            }
        }
        .build()
        return _euro!!
    }

private var _euro: ImageVector? = null
