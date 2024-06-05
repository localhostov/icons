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

public val Icons.Bold.GlobePointer: ImageVector
    get() {
        if (_globePointer != null) {
            return _globePointer!!
        }
        _globePointer = Builder(name = "GlobePointer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 0.442f, 0.028f, 0.878f, 0.075f, 1.308f)
                lineToRelative(2.94f, -1.006f)
                curveToRelative(-0.003f, -0.101f, -0.015f, -0.2f, -0.015f, -0.302f)
                curveToRelative(0.0f, -3.847f, 2.43f, -7.128f, 5.832f, -8.414f)
                curveToRelative(-1.032f, 1.896f, -2.108f, 4.529f, -2.296f, 7.511f)
                lineToRelative(3.134f, -1.072f)
                curveToRelative(0.409f, -2.449f, 1.484f, -4.562f, 2.331f, -5.927f)
                curveToRelative(1.068f, 1.72f, 2.499f, 4.633f, 2.499f, 7.902f)
                lineToRelative(-0.064f, 0.982f)
                curveToRelative(-0.232f, 2.713f, -1.345f, 5.106f, -2.279f, 6.661f)
                lineToRelative(-1.465f, 4.282f)
                curveToRelative(0.43f, 0.047f, 0.865f, 0.075f, 1.307f, 0.075f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(20.865f, 10.5f)
                horizontalLineToRelative(-3.443f)
                curveToRelative(-0.282f, -2.735f, -1.284f, -5.144f, -2.248f, -6.911f)
                curveToRelative(2.946f, 1.116f, 5.153f, 3.729f, 5.691f, 6.911f)
                close()
                moveTo(15.171f, 20.413f)
                curveToRelative(0.965f, -1.767f, 1.959f, -4.176f, 2.243f, -6.913f)
                horizontalLineToRelative(3.452f)
                curveToRelative(-0.537f, 3.183f, -2.746f, 5.798f, -5.694f, 6.913f)
                close()
                moveTo(8.554f, 24.0f)
                lineToRelative(-2.058f, -4.374f)
                lineToRelative(-4.285f, 4.285f)
                lineTo(0.089f, 21.79f)
                lineToRelative(4.285f, -4.285f)
                lineTo(0.0f, 15.447f)
                lineToRelative(13.0f, -4.447f)
                lineToRelative(-4.447f, 13.0f)
                close()
            }
        }
        .build()
        return _globePointer!!
    }

private var _globePointer: ImageVector? = null
