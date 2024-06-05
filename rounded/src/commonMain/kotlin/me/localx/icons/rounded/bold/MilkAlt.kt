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

public val Icons.Bold.MilkAlt: ImageVector
    get() {
        if (_milkAlt != null) {
            return _milkAlt!!
        }
        _milkAlt = Builder(name = "MilkAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.989f, 9.334f)
                lineToRelative(-1.463f, -3.415f)
                curveToRelative(-0.349f, -0.814f, -0.526f, -1.676f, -0.526f, -2.561f)
                verticalLineToRelative(-0.358f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                lineTo(6.5f, -0.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.358f)
                curveToRelative(0.0f, 0.885f, -0.177f, 1.746f, -0.526f, 2.561f)
                lineToRelative(-1.463f, 3.415f)
                curveToRelative(-0.67f, 1.564f, -1.011f, 3.222f, -1.011f, 4.924f)
                verticalLineToRelative(4.742f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-4.742f)
                curveToRelative(0.0f, -1.702f, -0.34f, -3.359f, -1.011f, -4.924f)
                close()
                moveTo(17.0f, 19.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.407f)
                curveToRelative(0.113f, -0.852f, 0.332f, -1.685f, 0.675f, -2.484f)
                lineToRelative(1.463f, -3.415f)
                curveToRelative(0.51f, -1.189f, 0.768f, -2.449f, 0.768f, -3.742f)
                verticalLineToRelative(-0.358f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.358f)
                curveToRelative(0.0f, 1.293f, 0.258f, 2.553f, 0.768f, 3.742f)
                lineToRelative(1.463f, 3.415f)
                curveToRelative(0.51f, 1.189f, 0.769f, 2.448f, 0.769f, 3.742f)
                verticalLineToRelative(4.742f)
                close()
            }
        }
        .build()
        return _milkAlt!!
    }

private var _milkAlt: ImageVector? = null
