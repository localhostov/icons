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

public val Icons.Bold.Bike: ImageVector
    get() {
        if (_bike != null) {
            return _bike!!
        }
        _bike = Builder(name = "Bike", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.328f, 12.2f)
                arcToRelative(28.856f, 28.856f, 0.0f, false, false, -1.09f, -2.877f)
                arcTo(13.321f, 13.321f, 0.0f, false, true, 18.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, false, -6.969f, -0.3f)
                arcTo(1.512f, 1.512f, 0.0f, false, false, 15.0f, 5.5f)
                arcToRelative(7.12f, 7.12f, 0.0f, false, false, 0.314f, 1.911f)
                lineTo(11.6f, 10.3f)
                lineTo(7.1f, 7.0f)
                lineTo(8.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(5.471f, 4.0f)
                arcTo(2.469f, 2.469f, 0.0f, false, false, 4.013f, 8.462f)
                lineToRelative(5.126f, 3.752f)
                lineToRelative(-1.093f, 0.85f)
                arcTo(4.946f, 4.946f, 0.0f, false, false, 5.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                arcToRelative(4.917f, 4.917f, 0.0f, false, false, -0.245f, -1.466f)
                lineToRelative(6.661f, -5.18f)
                reflectiveCurveToRelative(0.586f, 1.4f, 0.8f, 1.989f)
                arcToRelative(5.012f, 5.012f, 0.0f, true, false, 3.111f, -0.141f)
                close()
                moveTo(5.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 19.0f)
                close()
                moveTo(19.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 19.0f)
                close()
            }
        }
        .build()
        return _bike!!
    }

private var _bike: ImageVector? = null
