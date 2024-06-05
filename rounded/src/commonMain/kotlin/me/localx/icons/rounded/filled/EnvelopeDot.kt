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
                moveTo(12.0f, 15.42f)
                curveToRelative(0.77f, 0.0f, 1.54f, -0.29f, 2.12f, -0.88f)
                lineToRelative(4.67f, -4.67f)
                curveToRelative(-2.73f, -0.56f, -4.79f, -2.98f, -4.79f, -5.88f)
                curveToRelative(0.0f, -0.34f, 0.04f, -0.67f, 0.09f, -1.0f)
                lineTo(5.0f, 2.99f)
                curveToRelative(-1.81f, 0.0f, -3.38f, 0.97f, -4.26f, 2.41f)
                lineTo(9.88f, 14.55f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                close()
                moveTo(21.76f, 9.73f)
                lineToRelative(-6.23f, 6.23f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(0.05f, 7.54f)
                curveToRelative(-0.01f, 0.15f, -0.05f, 0.3f, -0.05f, 0.46f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineToRelative(-0.02f, -10.53f)
                curveToRelative(-0.64f, 0.57f, -1.39f, 1.0f, -2.22f, 1.26f)
                close()
            }
        }
        .build()
        return _envelopeDot!!
    }

private var _envelopeDot: ImageVector? = null
