package me.localx.icons.rounded.outline

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

public val Icons.Outline.CassetteVhs: ImageVector
    get() {
        if (_cassetteVhs != null) {
            return _cassetteVhs!!
        }
        _cassetteVhs = Builder(name = "CassetteVhs", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveTo(2.24f, 3.0f, 0.0f, 5.24f, 0.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(24.0f, 8.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 19.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(2.0f, 8.0f)
                curveToRelative(0.0f, -0.35f, 0.07f, -0.69f, 0.18f, -1.0f)
                lineTo(21.82f, 7.0f)
                curveToRelative(0.11f, 0.31f, 0.18f, 0.65f, 0.18f, 1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(17.48f, 9.0f)
                lineTo(6.52f, 9.0f)
                curveToRelative(-0.71f, 0.0f, -1.37f, 0.38f, -1.72f, 0.98f)
                curveToRelative(-0.37f, 0.63f, -0.8f, 1.66f, -0.8f, 3.02f)
                reflectiveCurveToRelative(0.44f, 2.39f, 0.8f, 3.02f)
                curveToRelative(0.35f, 0.61f, 1.01f, 0.98f, 1.72f, 0.98f)
                horizontalLineToRelative(10.95f)
                curveToRelative(0.71f, 0.0f, 1.37f, -0.38f, 1.72f, -0.98f)
                curveToRelative(0.37f, -0.63f, 0.8f, -1.66f, 0.8f, -3.02f)
                reflectiveCurveToRelative(-0.44f, -2.39f, -0.8f, -3.02f)
                curveToRelative(-0.35f, -0.61f, -1.01f, -0.98f, -1.72f, -0.98f)
                close()
                moveTo(14.0f, 10.99f)
                verticalLineToRelative(4.01f)
                horizontalLineToRelative(-4.0f)
                reflectiveCurveToRelative(0.0f, -4.01f, 0.0f, -4.01f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(6.0f, 12.99f)
                curveToRelative(0.0f, -0.91f, 0.29f, -1.6f, 0.52f, -2.0f)
                horizontalLineToRelative(1.48f)
                reflectiveCurveToRelative(0.0f, 4.01f, 0.0f, 4.01f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.24f, -0.41f, -0.53f, -1.1f, -0.53f, -2.01f)
                close()
                moveTo(17.48f, 14.99f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(-1.48f)
                reflectiveCurveToRelative(0.0f, -4.01f, 0.0f, -4.01f)
                horizontalLineToRelative(1.47f)
                curveToRelative(0.24f, 0.41f, 0.53f, 1.1f, 0.53f, 2.01f)
                reflectiveCurveToRelative(-0.29f, 1.6f, -0.52f, 2.0f)
                close()
            }
        }
        .build()
        return _cassetteVhs!!
    }

private var _cassetteVhs: ImageVector? = null
