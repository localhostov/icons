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

public val Icons.Bold.RupiahSign: ImageVector
    get() {
        if (_rupiahSign != null) {
            return _rupiahSign!!
        }
        _rupiahSign = Builder(name = "RupiahSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 12.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(19.5f, 18.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(10.51f, 15.18f)
                curveToRelative(2.65f, -1.3f, 4.49f, -4.03f, 4.49f, -7.18f)
                curveTo(15.0f, 3.59f, 11.41f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(-1.5f)
                curveTo(2.47f, 0.0f, 0.0f, 2.47f, 0.0f, 5.5f)
                lineTo(0.0f, 22.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                lineTo(7.0f, 16.0f)
                curveToRelative(0.19f, 0.0f, 0.37f, -0.02f, 0.56f, -0.03f)
                lineToRelative(3.6f, 7.2f)
                curveToRelative(0.26f, 0.53f, 0.79f, 0.83f, 1.34f, 0.83f)
                curveToRelative(0.23f, 0.0f, 0.45f, -0.05f, 0.67f, -0.16f)
                curveToRelative(0.74f, -0.37f, 1.04f, -1.27f, 0.67f, -2.01f)
                lineToRelative(-3.33f, -6.65f)
                close()
                moveTo(3.0f, 13.0f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(3.0f, 13.0f)
                close()
            }
        }
        .build()
        return _rupiahSign!!
    }

private var _rupiahSign: ImageVector? = null
