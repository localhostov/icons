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

public val Icons.Bold.Effect: ImageVector
    get() {
        if (_effect != null) {
            return _effect!!
        }
        _effect = Builder(name = "Effect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.357f, 3.0f)
                lineToRelative(3.749f, 13.561f)
                curveToRelative(1.643f, 0.288f, 2.894f, 1.713f, 2.894f, 3.439f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.055f, 0.477f, -1.99f, 1.216f, -2.632f)
                lineToRelative(-3.972f, -14.368f)
                horizontalLineToRelative(-2.244f)
                verticalLineToRelative(14.35f)
                curveToRelative(1.179f, 0.563f, 2.0f, 1.756f, 2.0f, 3.15f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.394f, 0.821f, -2.587f, 2.0f, -3.15f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(14.35f)
                curveToRelative(1.179f, 0.563f, 2.0f, 1.756f, 2.0f, 3.15f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.394f, 0.821f, -2.587f, 2.0f, -3.15f)
                verticalLineTo(3.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.643f)
                close()
            }
        }
        .build()
        return _effect!!
    }

private var _effect: ImageVector? = null
