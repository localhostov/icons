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

public val Icons.Outline.Sickle: ImageVector
    get() {
        if (_sickle != null) {
            return _sickle!!
        }
        _sickle = Builder(name = "Sickle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 0.0f)
                curveTo(6.71f, 0.0f, 2.0f, 4.71f, 2.0f, 10.5f)
                curveToRelative(0.0f, 2.97f, 1.281f, 5.797f, 3.47f, 7.775f)
                lineToRelative(-4.257f, 4.257f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(6.592f, -6.593f)
                lineToRelative(-0.375f, -0.662f)
                curveToRelative(-0.552f, -0.975f, -0.844f, -2.079f, -0.844f, -3.192f)
                curveToRelative(0.0f, -3.584f, 2.916f, -6.5f, 6.5f, -6.5f)
                curveToRelative(3.075f, 0.0f, 5.751f, 2.187f, 6.364f, 5.199f)
                lineToRelative(0.188f, 0.801f)
                horizontalLineToRelative(1.669f)
                reflectiveCurveToRelative(0.28f, -1.984f, 0.28f, -2.5f)
                curveTo(23.0f, 4.71f, 18.29f, 0.0f, 12.5f, 0.0f)
                close()
                moveTo(14.5f, 5.0f)
                curveToRelative(-4.687f, 0.0f, -8.5f, 3.813f, -8.5f, 8.5f)
                curveToRelative(0.0f, 1.056f, 0.2f, 2.104f, 0.584f, 3.087f)
                curveToRelative(-1.636f, -1.589f, -2.584f, -3.787f, -2.584f, -6.087f)
                curveToRelative(0.0f, -4.687f, 3.813f, -8.5f, 8.5f, -8.5f)
                curveToRelative(3.599f, 0.0f, 6.682f, 2.248f, 7.92f, 5.413f)
                curveToRelative(-1.546f, -1.502f, -3.65f, -2.413f, -5.92f, -2.413f)
                close()
            }
        }
        .build()
        return _sickle!!
    }

private var _sickle: ImageVector? = null
