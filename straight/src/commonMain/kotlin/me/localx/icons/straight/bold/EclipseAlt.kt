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

public val Icons.Bold.EclipseAlt: ImageVector
    get() {
        if (_eclipseAlt != null) {
            return _eclipseAlt!!
        }
        _eclipseAlt = Builder(name = "EclipseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                lineTo(20.874f, 10.5f)
                arcToRelative(8.946f, 8.946f, 0.0f, false, false, -1.541f, -3.712f)
                lineToRelative(2.213f, -2.213f)
                lineTo(19.425f, 2.454f)
                lineTo(17.212f, 4.667f)
                arcTo(8.946f, 8.946f, 0.0f, false, false, 13.5f, 3.126f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 3.126f)
                arcTo(8.946f, 8.946f, 0.0f, false, false, 6.788f, 4.667f)
                lineTo(4.575f, 2.454f)
                lineTo(2.454f, 4.575f)
                lineTo(4.667f, 6.788f)
                arcTo(8.946f, 8.946f, 0.0f, false, false, 3.126f, 10.5f)
                lineTo(0.0f, 10.5f)
                verticalLineToRelative(3.0f)
                lineTo(3.126f, 13.5f)
                arcToRelative(8.946f, 8.946f, 0.0f, false, false, 1.541f, 3.712f)
                lineTo(2.454f, 19.425f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.213f, -2.213f)
                arcTo(8.946f, 8.946f, 0.0f, false, false, 10.5f, 20.874f)
                lineTo(10.5f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 20.874f)
                arcToRelative(8.946f, 8.946f, 0.0f, false, false, 3.712f, -1.541f)
                lineToRelative(2.213f, 2.213f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.213f, -2.213f)
                arcTo(8.946f, 8.946f, 0.0f, false, false, 20.874f, 13.5f)
                close()
                moveTo(18.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.0f, -6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, true, 18.0f, 12.0f)
                close()
                moveTo(14.252f, 15.3f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 13.929f, 8.5f)
                arcTo(3.926f, 3.926f, 0.0f, false, false, 12.0f, 11.818f)
                arcTo(4.361f, 4.361f, 0.0f, false, false, 14.252f, 15.3f)
                close()
            }
        }
        .build()
        return _eclipseAlt!!
    }

private var _eclipseAlt: ImageVector? = null
