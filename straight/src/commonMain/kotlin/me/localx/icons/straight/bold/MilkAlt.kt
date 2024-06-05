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
                horizontalLineToRelative(1.0f)
                lineTo(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.358f)
                curveToRelative(0.0f, 0.885f, -0.177f, 1.746f, -0.526f, 2.561f)
                lineToRelative(-1.463f, 3.415f)
                curveToRelative(-0.67f, 1.564f, -1.011f, 3.222f, -1.011f, 4.924f)
                verticalLineToRelative(9.742f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-9.742f)
                curveToRelative(0.0f, -1.702f, -0.34f, -3.359f, -1.011f, -4.924f)
                close()
                moveTo(17.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-7.907f)
                curveToRelative(0.113f, -0.852f, 0.332f, -1.685f, 0.675f, -2.484f)
                lineToRelative(1.463f, -3.415f)
                curveToRelative(0.51f, -1.189f, 0.768f, -2.449f, 0.768f, -3.742f)
                verticalLineToRelative(-0.358f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.358f)
                curveToRelative(0.0f, 1.293f, 0.258f, 2.553f, 0.768f, 3.742f)
                lineToRelative(1.463f, 3.415f)
                curveToRelative(0.51f, 1.189f, 0.769f, 2.448f, 0.769f, 3.742f)
                verticalLineToRelative(6.742f)
                close()
            }
        }
        .build()
        return _milkAlt!!
    }

private var _milkAlt: ImageVector? = null
