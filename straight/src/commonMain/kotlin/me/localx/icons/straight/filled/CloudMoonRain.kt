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

public val Icons.Filled.CloudMoonRain: ImageVector
    get() {
        if (_cloudMoonRain != null) {
            return _cloudMoonRain!!
        }
        _cloudMoonRain = Builder(name = "CloudMoonRain", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.986f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.986f, 19.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.986f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.986f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(24.014f, 17.0f)
                arcTo(4.983f, 4.983f, 0.0f, false, true, 22.0f, 21.017f)
                verticalLineToRelative(-2.01f)
                arcTo(2.006f, 2.006f, 0.0f, false, false, 19.993f, 17.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 1.994f)
                lineTo(8.0f, 21.447f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, true, 1.026f, -7.324f)
                curveToRelative(0.331f, -5.5f, 7.952f, -7.041f, 10.4f, -2.106f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 24.014f, 17.0f)
                close()
                moveTo(20.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 2.0f)
                close()
                moveTo(16.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 5.0f)
                close()
                moveTo(22.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 8.0f)
                close()
                moveTo(4.191f, 16.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.046f, -3.919f)
                arcTo(7.509f, 7.509f, 0.0f, false, true, 10.0f, 8.529f)
                lineTo(10.0f, 8.517f)
                arcToRelative(6.653f, 6.653f, 0.0f, false, true, 3.352f, -5.643f)
                lineTo(14.9f, 1.993f)
                lineToRelative(-1.552f, -0.862f)
                curveTo(2.992f, -4.174f, -5.361f, 10.164f, 4.18f, 16.6f)
                close()
            }
        }
        .build()
        return _cloudMoonRain!!
    }

private var _cloudMoonRain: ImageVector? = null
