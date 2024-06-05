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
                moveTo(22.0f, 9.65f)
                curveToRelative(0.75f, -0.26f, 1.42f, -0.67f, 2.0f, -1.19f)
                verticalLineToRelative(15.54f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 6.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                lineTo(14.09f, 3.0f)
                curveToRelative(-0.05f, 0.33f, -0.09f, 0.66f, -0.09f, 1.0f)
                reflectiveCurveToRelative(0.04f, 0.67f, 0.09f, 1.0f)
                lineTo(3.0f, 5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f)
                lineToRelative(4.33f, -4.33f)
                curveToRelative(0.49f, 0.13f, 1.01f, 0.21f, 1.55f, 0.21f)
                curveToRelative(0.41f, 0.0f, 0.8f, -0.04f, 1.19f, -0.12f)
                lineToRelative(-5.65f, 5.65f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(2.0f, 9.07f)
                verticalLineToRelative(12.93f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 9.65f)
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
