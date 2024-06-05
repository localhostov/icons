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

public val Icons.Filled.MarsDouble: ImageVector
    get() {
        if (_marsDouble != null) {
            return _marsDouble!!
        }
        _marsDouble = Builder(name = "MarsDouble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.052f, 43.465f)
                verticalLineToRelative(85.001f)
                horizontalLineToRelative(-42.5f)
                verticalLineTo(73.513f)
                lineToRelative(-72.251f, 72.251f)
                curveToRelative(49.473f, 65.998f, 36.076f, 159.605f, -29.921f, 209.077f)
                reflectiveCurveTo(79.775f, 390.917f, 30.303f, 324.919f)
                reflectiveCurveTo(-5.774f, 165.315f, 60.224f, 115.842f)
                curveToRelative(53.026f, -39.749f, 125.905f, -39.801f, 178.987f, -0.127f)
                lineToRelative(72.251f, -72.251f)
                horizontalLineToRelative(-54.91f)
                verticalLineToRelative(-42.5f)
                horizontalLineToRelative(85.001f)
                curveTo(365.024f, 0.965f, 384.052f, 19.993f, 384.052f, 43.465f)
                close()
                moveTo(469.053f, 128.466f)
                horizontalLineToRelative(-85.001f)
                verticalLineToRelative(42.5f)
                horizontalLineToRelative(54.953f)
                lineToRelative(-72.527f, 72.527f)
                curveToRelative(-7.877f, -6.047f, -16.342f, -11.286f, -25.266f, -15.64f)
                curveToRelative(0.0f, 2.295f, 0.34f, 4.548f, 0.34f, 6.864f)
                curveToRelative(-0.117f, 105.577f, -85.675f, 191.134f, -191.252f, 191.252f)
                curveToRelative(-2.316f, 0.0f, -4.569f, -0.276f, -6.864f, -0.34f)
                curveToRelative(34.933f, 74.278f, 123.466f, 106.174f, 197.744f, 71.241f)
                curveToRelative(52.161f, -24.531f, 85.433f, -77.01f, 85.372f, -134.651f)
                curveToRelative(-0.064f, -32.05f, -10.592f, -63.202f, -29.984f, -88.72f)
                lineToRelative(72.484f, -72.484f)
                verticalLineToRelative(54.953f)
                horizontalLineToRelative(42.5f)
                verticalLineToRelative(-85.001f)
                curveTo(511.553f, 147.494f, 492.525f, 128.466f, 469.053f, 128.466f)
                close()
            }
        }
        .build()
        return _marsDouble!!
    }

private var _marsDouble: ImageVector? = null
