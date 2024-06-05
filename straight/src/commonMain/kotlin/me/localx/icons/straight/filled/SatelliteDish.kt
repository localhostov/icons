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

public val Icons.Filled.SatelliteDish: ImageVector
    get() {
        if (_satelliteDish != null) {
            return _satelliteDish!!
        }
        _satelliteDish = Builder(name = "SatelliteDish", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(12.0f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.201f, 14.213f)
                lineToRelative(6.213f, 6.214f)
                lineToRelative(-0.707f, 0.707f)
                curveToRelative(-1.908f, 1.907f, -4.415f, 2.861f, -6.92f, 2.861f)
                reflectiveCurveToRelative(-5.012f, -0.953f, -6.92f, -2.861f)
                curveToRelative(-3.816f, -3.815f, -3.816f, -10.025f, 0.0f, -13.841f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(6.213f, 6.213f)
                lineToRelative(1.506f, -1.506f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.506f, 1.506f)
                close()
            }
        }
        .build()
        return _satelliteDish!!
    }

private var _satelliteDish: ImageVector? = null
