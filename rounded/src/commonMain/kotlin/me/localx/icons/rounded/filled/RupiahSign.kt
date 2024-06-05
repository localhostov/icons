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

public val Icons.Filled.RupiahSign: ImageVector
    get() {
        if (_rupiahSign != null) {
            return _rupiahSign!!
        }
        _rupiahSign = Builder(name = "RupiahSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 7.5f)
                curveTo(15.0f, 3.36f, 11.64f, 0.0f, 7.5f, 0.0f)
                horizontalLineToRelative(-2.5f)
                curveTo(2.24f, 0.0f, 0.0f, 2.24f, 0.0f, 5.0f)
                lineTo(0.0f, 23.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(2.0f, 15.0f)
                lineTo(7.41f, 15.0f)
                lineToRelative(4.71f, 8.49f)
                curveToRelative(0.18f, 0.33f, 0.52f, 0.51f, 0.88f, 0.51f)
                curveToRelative(0.16f, 0.0f, 0.33f, -0.04f, 0.48f, -0.13f)
                curveToRelative(0.48f, -0.27f, 0.66f, -0.88f, 0.39f, -1.36f)
                lineToRelative(-4.34f, -7.8f)
                curveToRelative(3.15f, -0.89f, 5.46f, -3.78f, 5.46f, -7.21f)
                close()
                moveTo(7.5f, 13.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(20.5f, 13.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 18.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _rupiahSign!!
    }

private var _rupiahSign: ImageVector? = null
