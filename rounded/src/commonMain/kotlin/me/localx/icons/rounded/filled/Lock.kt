package me.localx.icons.rounded.filled

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

public val Icons.Filled.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(405.333f, 179.712f)
                verticalLineToRelative(-30.379f)
                curveTo(405.333f, 66.859f, 338.475f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(106.667f, 66.859f, 106.667f, 149.333f)
                verticalLineToRelative(30.379f)
                curveToRelative(-38.826f, 16.945f, -63.944f, 55.259f, -64.0f, 97.621f)
                verticalLineToRelative(128.0f)
                curveTo(42.737f, 464.214f, 90.452f, 511.93f, 149.333f, 512.0f)
                horizontalLineToRelative(213.333f)
                curveToRelative(58.881f, -0.07f, 106.596f, -47.786f, 106.667f, -106.667f)
                verticalLineToRelative(-128.0f)
                curveTo(469.278f, 234.971f, 444.159f, 196.657f, 405.333f, 179.712f)
                close()
                moveTo(277.333f, 362.667f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                verticalLineTo(320.0f)
                curveToRelative(0.0f, -11.782f, 9.551f, -21.333f, 21.333f, -21.333f)
                curveToRelative(11.782f, 0.0f, 21.333f, 9.551f, 21.333f, 21.333f)
                verticalLineTo(362.667f)
                close()
                moveTo(362.667f, 170.667f)
                horizontalLineTo(149.333f)
                verticalLineToRelative(-21.333f)
                curveToRelative(0.0f, -58.91f, 47.756f, -106.667f, 106.667f, -106.667f)
                reflectiveCurveToRelative(106.667f, 47.756f, 106.667f, 106.667f)
                verticalLineTo(170.667f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
