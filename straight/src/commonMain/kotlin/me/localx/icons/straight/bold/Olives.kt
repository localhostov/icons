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

public val Icons.Bold.Olives: ImageVector
    get() {
        if (_olives != null) {
            return _olives!!
        }
        _olives = Builder(name = "Olives", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.556f, 7.307f)
                curveTo(18.719f, 5.937f, 19.374f, 3.0f, 22.0f, 3.0f)
                lineTo(22.0f, 0.0f)
                arcToRelative(5.663f, 5.663f, 0.0f, false, false, -4.537f, 2.116f)
                arcTo(13.769f, 13.769f, 0.0f, false, false, 10.0f, 0.0f)
                arcTo(13.239f, 13.239f, 0.0f, false, false, 2.0f, 2.5f)
                arcTo(13.239f, 13.239f, 0.0f, false, false, 10.0f, 5.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.622f, -1.622f)
                arcToRelative(10.087f, 10.087f, 0.0f, false, false, -1.071f, 3.69f)
                arcToRelative(6.959f, 6.959f, 0.0f, false, false, -2.132f, 0.635f)
                arcToRelative(7.536f, 7.536f, 0.0f, false, false, -0.881f, -0.635f)
                arcToRelative(7.19f, 7.19f, 0.0f, false, false, -6.184f, -0.652f)
                arcToRelative(9.445f, 9.445f, 0.0f, false, false, -4.878f, 4.108f)
                arcTo(9.445f, 9.445f, 0.0f, false, false, 0.087f, 16.75f)
                arcToRelative(7.194f, 7.194f, 0.0f, false, false, 3.435f, 5.182f)
                arcTo(7.213f, 7.213f, 0.0f, false, false, 7.283f, 23.0f)
                arcToRelative(7.72f, 7.72f, 0.0f, false, false, 4.064f, -1.231f)
                arcTo(7.029f, 7.029f, 0.0f, false, false, 16.5f, 24.0f)
                curveToRelative(4.276f, 0.0f, 7.5f, -3.654f, 7.5f, -8.5f)
                curveTo(24.0f, 11.47f, 21.766f, 8.272f, 18.556f, 7.307f)
                close()
                moveTo(5.078f, 19.367f)
                arcToRelative(4.191f, 4.191f, 0.0f, false, true, -2.024f, -3.056f)
                arcToRelative(6.449f, 6.449f, 0.0f, false, true, 0.987f, -4.23f)
                arcToRelative(6.446f, 6.446f, 0.0f, false, true, 3.3f, -2.83f)
                arcToRelative(4.182f, 4.182f, 0.0f, false, true, 3.646f, 0.383f)
                horizontalLineToRelative(0.0f)
                arcTo(9.15f, 9.15f, 0.0f, false, false, 9.0f, 15.5f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, false, 0.73f, 3.76f)
                arcTo(4.33f, 4.33f, 0.0f, false, true, 5.078f, 19.367f)
                close()
                moveTo(16.5f, 21.0f)
                curveToRelative(-2.954f, 0.0f, -4.5f, -2.767f, -4.5f, -5.5f)
                reflectiveCurveTo(13.546f, 10.0f, 16.5f, 10.0f)
                reflectiveCurveTo(21.0f, 12.767f, 21.0f, 15.5f)
                reflectiveCurveTo(19.454f, 21.0f, 16.5f, 21.0f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.812f, 2.812f, 0.0f, false, true, -3.0f, -3.0f)
                close()
                moveTo(8.182f, 15.241f)
                lineTo(6.625f, 17.806f)
                arcTo(2.851f, 2.851f, 0.0f, false, true, 5.6f, 13.629f)
                close()
            }
        }
        .build()
        return _olives!!
    }

private var _olives: ImageVector? = null
