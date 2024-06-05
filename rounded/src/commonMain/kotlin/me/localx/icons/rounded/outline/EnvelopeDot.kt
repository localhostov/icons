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

public val Icons.Outline.EnvelopeDot: ImageVector
    get() {
        if (_envelopeDot != null) {
            return _envelopeDot!!
        }
        _envelopeDot = Builder(name = "EnvelopeDot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 8.0f)
                curveTo(0.0f, 5.24f, 2.24f, 3.0f, 5.0f, 3.0f)
                lineTo(13.0f, 3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 5.0f)
                curveToRelative(-1.15f, 0.0f, -2.14f, 0.65f, -2.65f, 1.59f)
                lineToRelative(7.53f, 7.53f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f)
                lineToRelative(3.82f, -3.82f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-3.82f, 3.82f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(2.0f, 9.07f)
                verticalLineToRelative(9.93f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                lineTo(22.0f, 10.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                close()
                moveTo(18.0f, 4.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _envelopeDot!!
    }

private var _envelopeDot: ImageVector? = null
