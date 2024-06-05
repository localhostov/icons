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

public val Icons.Filled.EnvelopeDot: ImageVector
    get() {
        if (_envelopeDot != null) {
            return _envelopeDot!!
        }
        _envelopeDot = Builder(name = "EnvelopeDot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveTo(17.79f, 0.0f, 20.0f, 0.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(9.88f, 14.12f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f)
                lineToRelative(4.33f, -4.33f)
                curveToRelative(-2.56f, -0.68f, -4.45f, -3.01f, -4.45f, -5.79f)
                curveToRelative(0.0f, -0.34f, 0.04f, -0.67f, 0.09f, -1.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.15f, 0.0f, -2.13f, 0.65f, -2.64f, 1.6f)
                lineTo(9.88f, 14.12f)
                close()
                moveTo(21.19f, 9.88f)
                lineToRelative(-5.65f, 5.65f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(0.0f, 7.07f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 8.46f)
                curveToRelative(-0.78f, 0.7f, -1.74f, 1.2f, -2.81f, 1.42f)
                close()
            }
        }
        .build()
        return _envelopeDot!!
    }

private var _envelopeDot: ImageVector? = null
