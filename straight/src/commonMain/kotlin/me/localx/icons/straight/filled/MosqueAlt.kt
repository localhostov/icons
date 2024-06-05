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

public val Icons.Filled.MosqueAlt: ImageVector
    get() {
        if (_mosqueAlt != null) {
            return _mosqueAlt!!
        }
        _mosqueAlt = Builder(name = "MosqueAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.302f, 0.839f, -2.402f, 2.0f, -2.816f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.184f)
                curveToRelative(1.161f, 0.414f, 2.0f, 1.514f, 2.0f, 2.816f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(23.0f, 10.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(13.868f, 17.0f)
                curveToRelative(0.718f, -0.928f, 1.132f, -1.957f, 1.132f, -2.944f)
                curveToRelative(0.0f, -3.265f, -2.88f, -4.719f, -4.786f, -5.681f)
                curveToRelative(-0.61f, -0.308f, -1.511f, -0.764f, -1.687f, -0.981f)
                curveToRelative(-0.076f, -0.384f, -0.17f, -0.905f, -0.226f, -1.394f)
                horizontalLineToRelative(-1.601f)
                curveToRelative(-0.053f, 0.464f, -0.141f, 0.961f, -0.215f, 1.339f)
                curveToRelative(-0.183f, 0.269f, -1.087f, 0.727f, -1.698f, 1.036f)
                curveToRelative(-1.906f, 0.962f, -4.786f, 2.416f, -4.786f, 5.681f)
                curveToRelative(0.0f, 0.987f, 0.414f, 2.016f, 1.132f, 2.944f)
                horizontalLineToRelative(12.736f)
                close()
            }
        }
        .build()
        return _mosqueAlt!!
    }

private var _mosqueAlt: ImageVector? = null
