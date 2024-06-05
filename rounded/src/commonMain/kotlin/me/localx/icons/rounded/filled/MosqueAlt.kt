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
                moveToRelative(16.0f, 7.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.302f, 0.839f, -2.402f, 2.0f, -2.816f)
                verticalLineToRelative(-1.184f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.184f)
                curveToRelative(1.161f, 0.414f, 2.0f, 1.514f, 2.0f, 2.816f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(13.875f, 17.0f)
                curveToRelative(0.724f, -0.928f, 1.125f, -1.949f, 1.125f, -2.944f)
                curveToRelative(0.0f, -3.265f, -2.88f, -4.719f, -4.786f, -5.681f)
                curveToRelative(-0.636f, -0.321f, -1.597f, -0.806f, -1.714f, -1.01f)
                verticalLineToRelative(-1.365f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.325f)
                curveToRelative(-0.165f, 0.267f, -1.094f, 0.736f, -1.714f, 1.05f)
                curveToRelative(-1.906f, 0.962f, -4.786f, 2.416f, -4.786f, 5.681f)
                curveToRelative(0.0f, 0.98f, 0.409f, 2.012f, 1.132f, 2.944f)
                horizontalLineToRelative(12.743f)
                close()
                moveTo(23.0f, 22.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _mosqueAlt!!
    }

private var _mosqueAlt: ImageVector? = null
