package me.localx.icons.rounded.filled

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
                moveToRelative(21.715f, 18.363f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -17.254f, -3.363f)
                horizontalLineToRelative(10.539f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-10.949f)
                arcToRelative(9.829f, 9.829f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(10.949f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-10.539f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 17.254f, -3.363f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.542f, -1.274f)
                arcToRelative(11.989f, 11.989f, 0.0f, false, false, -20.857f, 4.637f)
                horizontalLineToRelative(-1.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.051f)
                curveToRelative(-0.028f, 0.331f, -0.051f, 0.662f, -0.051f, 1.0f)
                reflectiveCurveToRelative(0.023f, 0.669f, 0.051f, 1.0f)
                horizontalLineToRelative(-1.051f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.4f)
                arcToRelative(11.989f, 11.989f, 0.0f, false, false, 20.862f, 4.637f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.542f, -1.274f)
                close()
            }
        }
        .build()
        return _euro!!
    }

private var _euro: ImageVector? = null
