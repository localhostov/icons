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

public val Icons.Filled.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                arcTo(19.523f, 19.523f, 0.0f, false, true, 4.05f, 8.483f)
                curveTo(4.52f, 0.12f, 8.807f, 0.0f, 9.0f, 0.0f)
                curveToRelative(0.15f, 0.0f, 1.436f, 0.1f, 3.0f, 2.513f)
                curveTo(13.513f, 0.128f, 14.85f, 0.0f, 15.0f, 0.0f)
                curveToRelative(0.193f, 0.0f, 4.481f, 0.12f, 4.95f, 8.483f)
                arcTo(19.52f, 19.52f, 0.0f, false, true, 12.0f, 10.0f)
                close()
                moveTo(22.079f, 9.666f)
                arcTo(20.355f, 20.355f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(20.344f, 20.344f, 0.0f, false, true, 1.921f, 9.666f)
                curveTo(0.654f, 10.3f, 0.0f, 11.075f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.157f, 7.543f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(12.0f, -0.843f, 12.0f, -4.0f)
                curveTo(24.0f, 11.075f, 23.346f, 10.3f, 22.079f, 9.666f)
                close()
                moveTo(16.5f, 17.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.235f, 2.174f)
                arcToRelative(4.685f, 4.685f, 0.0f, false, false, -2.53f, 0.0f)
                arcToRelative(3.494f, 3.494f, 0.0f, true, false, 0.193f, 2.033f)
                arcTo(3.52f, 3.52f, 0.0f, false, true, 12.0f, 21.0f)
                arcToRelative(3.514f, 3.514f, 0.0f, false, true, 1.072f, 0.207f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 16.5f, 17.0f)
                close()
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
