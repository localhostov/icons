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

public val Icons.Bold.SatelliteDish: ImageVector
    get() {
        if (_satelliteDish != null) {
            return _satelliteDish!!
        }
        _satelliteDish = Builder(name = "SatelliteDish", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                close()
                moveTo(12.0f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(4.962f, 0.0f, 9.0f, 4.037f, 9.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.408f, 13.713f)
                lineToRelative(6.214f, 6.214f)
                lineToRelative(-1.061f, 1.061f)
                curveToRelative(-2.005f, 2.005f, -4.64f, 3.008f, -7.274f, 3.008f)
                reflectiveCurveToRelative(-5.268f, -1.002f, -7.273f, -3.008f)
                curveTo(-0.998f, 16.977f, -0.998f, 10.45f, 3.013f, 6.439f)
                lineToRelative(1.061f, -1.061f)
                lineToRelative(6.213f, 6.213f)
                lineToRelative(1.653f, -1.653f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.653f, 1.653f)
                close()
                moveTo(14.269f, 19.816f)
                lineTo(4.184f, 9.731f)
                curveToRelative(-1.844f, 2.824f, -1.527f, 6.657f, 0.951f, 9.135f)
                curveToRelative(2.477f, 2.478f, 6.311f, 2.795f, 9.134f, 0.95f)
                close()
            }
        }
        .build()
        return _satelliteDish!!
    }

private var _satelliteDish: ImageVector? = null
