package me.localx.icons.straight.outline

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

public val Icons.Outline.EclipseAlt: ImageVector
    get() {
        if (_eclipseAlt != null) {
            return _eclipseAlt!!
        }
        _eclipseAlt = Builder(name = "EclipseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                lineTo(24.0f, 11.0f)
                lineTo(19.931f, 11.0f)
                arcToRelative(7.957f, 7.957f, 0.0f, false, false, -0.569f, -2.129f)
                lineToRelative(3.52f, -2.049f)
                lineTo(21.876f, 5.094f)
                lineToRelative(-3.53f, 2.054f)
                arcToRelative(8.092f, 8.092f, 0.0f, false, false, -1.5f, -1.5f)
                lineToRelative(2.048f, -3.52f)
                lineTo(17.162f, 1.121f)
                lineTo(15.119f, 4.634f)
                arcTo(7.956f, 7.956f, 0.0f, false, false, 13.0f, 4.069f)
                lineTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 4.069f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, false, -2.106f, 0.559f)
                lineTo(6.854f, 1.121f)
                lineTo(5.126f, 2.127f)
                lineTo(7.169f, 5.639f)
                arcToRelative(8.02f, 8.02f, 0.0f, false, false, -1.51f, 1.5f)
                lineTo(2.14f, 5.094f)
                lineTo(1.134f, 6.822f)
                lineTo(4.642f, 8.864f)
                arcTo(7.928f, 7.928f, 0.0f, false, false, 4.069f, 11.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.069f, 13.0f)
                arcToRelative(7.985f, 7.985f, 0.0f, false, false, 0.569f, 2.129f)
                lineToRelative(-3.5f, 2.036f)
                lineToRelative(1.0f, 1.729f)
                lineToRelative(3.508f, -2.042f)
                arcToRelative(8.045f, 8.045f, 0.0f, false, false, 1.492f, 1.492f)
                lineTo(5.1f, 21.865f)
                lineToRelative(1.728f, 1.006f)
                lineTo(8.868f, 19.36f)
                arcTo(7.934f, 7.934f, 0.0f, false, false, 11.0f, 19.931f)
                lineTo(11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 19.931f)
                arcToRelative(7.944f, 7.944f, 0.0f, false, false, 2.144f, -0.577f)
                lineToRelative(2.045f, 3.517f)
                lineToRelative(1.729f, -1.006f)
                lineToRelative(-2.053f, -3.529f)
                arcToRelative(8.038f, 8.038f, 0.0f, false, false, 1.486f, -1.491f)
                lineToRelative(3.518f, 2.049f)
                lineToRelative(1.006f, -1.729f)
                lineToRelative(-3.51f, -2.044f)
                arcTo(7.961f, 7.961f, 0.0f, false, false, 19.931f, 13.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.0f, -6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, true, 12.0f, 18.0f)
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
