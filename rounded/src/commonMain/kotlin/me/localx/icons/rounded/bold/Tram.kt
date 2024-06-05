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

public val Icons.Bold.Tram: ImageVector
    get() {
        if (_tram != null) {
            return _tram!!
        }
        _tram = Builder(name = "Tram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 9.0f)
                lineTo(12.0f, 9.0f)
                lineTo(12.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 9.0f, 4.732f)
                lineTo(9.0f, 9.0f)
                lineTo(5.5f, 9.0f)
                curveTo(2.259f, 9.0f, 0.0f, 12.162f, 0.0f, 15.0f)
                verticalLineToRelative(3.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 18.5f)
                lineTo(24.0f, 15.0f)
                curveTo(24.0f, 12.162f, 21.741f, 9.0f, 18.5f, 9.0f)
                close()
                moveTo(21.0f, 15.0f)
                verticalLineToRelative(1.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 12.0f)
                horizontalLineToRelative(1.5f)
                curveTo(19.762f, 12.0f, 21.0f, 13.486f, 21.0f, 15.0f)
                close()
                moveTo(10.0f, 16.0f)
                lineTo(10.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(5.5f, 12.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 15.0f)
                curveTo(3.0f, 13.486f, 4.238f, 12.0f, 5.5f, 12.0f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                arcToRelative(2.505f, 2.505f, 0.0f, false, true, -2.45f, -2.0f)
                horizontalLineToRelative(17.9f)
                arcTo(2.505f, 2.505f, 0.0f, false, true, 18.5f, 21.0f)
                close()
                moveTo(13.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 2.0f)
                close()
                moveTo(19.026f, 2.162f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.219f, 0.407f)
                lineToRelative(2.0f, -0.381f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.562f, 2.948f)
                lineToRelative(-2.0f, 0.38f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.026f, 2.162f)
                close()
                moveTo(0.026f, 5.781f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.219f, 4.026f)
                lineToRelative(3.0f, -0.571f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 4.781f, 6.4f)
                lineToRelative(-3.0f, 0.572f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.026f, 5.781f)
                close()
            }
        }
        .build()
        return _tram!!
    }

private var _tram: ImageVector? = null
