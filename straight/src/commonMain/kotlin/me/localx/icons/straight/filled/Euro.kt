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

public val Icons.Filled.Euro: ImageVector
    get() {
        if (_euro != null) {
            return _euro!!
        }
        _euro = Builder(name = "Euro", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 22.0f)
                arcToRelative(10.016f, 10.016f, 0.0f, false, true, -9.539f, -7.0f)
                horizontalLineToRelative(11.539f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-11.949f)
                arcToRelative(9.829f, 9.829f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(11.949f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-11.539f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 17.254f, -3.363f)
                lineToRelative(1.542f, -1.274f)
                arcToRelative(11.989f, 11.989f, 0.0f, false, false, -20.857f, 4.637f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.051f)
                curveToRelative(-0.028f, 0.331f, -0.051f, 0.662f, -0.051f, 1.0f)
                reflectiveCurveToRelative(0.023f, 0.669f, 0.051f, 1.0f)
                horizontalLineToRelative(-2.051f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.4f)
                arcToRelative(11.989f, 11.989f, 0.0f, false, false, 20.862f, 4.637f)
                lineToRelative(-1.542f, -1.274f)
                arcToRelative(9.977f, 9.977f, 0.0f, false, true, -7.72f, 3.637f)
                close()
            }
        }
        .build()
        return _euro!!
    }

private var _euro: ImageVector? = null
