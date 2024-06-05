package me.localx.icons.rounded.bold

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

public val Icons.Bold.EnvelopeDot: ImageVector
    get() {
        if (_envelopeDot != null) {
            return _envelopeDot!!
        }
        _envelopeDot = Builder(name = "EnvelopeDot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(0.0f, 8.5f)
                curveTo(0.0f, 5.47f, 2.47f, 3.0f, 5.5f, 3.0f)
                lineTo(13.5f, 3.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 6.0f)
                curveToRelative(-0.96f, 0.0f, -1.79f, 0.54f, -2.21f, 1.33f)
                lineToRelative(6.94f, 6.94f)
                curveToRelative(0.95f, 0.95f, 2.59f, 0.95f, 3.54f, 0.0f)
                curveToRelative(0.02f, -0.02f, 2.75f, -2.4f, 2.75f, -2.4f)
                curveToRelative(0.62f, -0.54f, 1.57f, -0.48f, 2.12f, 0.15f)
                curveToRelative(0.54f, 0.62f, 0.48f, 1.57f, -0.15f, 2.12f)
                lineToRelative(-2.64f, 2.3f)
                curveToRelative(-1.03f, 1.01f, -2.4f, 1.57f, -3.85f, 1.57f)
                reflectiveCurveToRelative(-2.85f, -0.57f, -3.89f, -1.61f)
                lineTo(3.0f, 11.28f)
                verticalLineToRelative(7.22f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(21.0f, 10.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(20.5f, 7.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _envelopeDot!!
    }

private var _envelopeDot: ImageVector? = null
