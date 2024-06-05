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

public val Icons.Filled.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.938f, 17.884f)
                arcTo(7.007f, 7.007f, 0.0f, false, true, 16.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -6.912f, -5.949f)
                curveToRelative(0.089f, 0.022f, 0.172f, 0.055f, 0.264f, 0.071f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.894f, 1.844f)
                arcToRelative(4.17f, 4.17f, 0.0f, false, false, 5.508f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 18.006f)
                horizontalLineToRelative(6.0f)
                arcTo(3.971f, 3.971f, 0.0f, false, false, 22.938f, 17.884f)
                close()
                moveTo(0.0f, 14.1f)
                arcToRelative(2.067f, 2.067f, 0.0f, false, false, 1.69f, 2.05f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 4.866f, 2.306f)
                arcToRelative(2.189f, 2.189f, 0.0f, false, false, 2.888f, 0.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 16.0f, 16.006f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                lineTo(2.094f, 12.006f)
                arcTo(2.094f, 2.094f, 0.0f, false, false, 0.0f, 14.1f)
                close()
                moveTo(23.0f, 10.0f)
                verticalLineToRelative(0.148f)
                arcToRelative(3.984f, 3.984f, 0.0f, false, false, -1.0f, -0.142f)
                lineTo(2.094f, 10.006f)
                arcTo(4.033f, 4.033f, 0.0f, false, false, 1.0f, 10.174f)
                lineTo(1.0f, 10.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 23.0f, 10.0f)
                close()
                moveTo(7.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 7.0f)
                close()
                moveTo(10.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 4.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
