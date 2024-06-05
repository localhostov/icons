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

public val Icons.Outline.Jug: ImageVector
    get() {
        if (_jug != null) {
            return _jug!!
        }
        _jug = Builder(name = "Jug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.89f, 10.06f)
                curveToRelative(0.69f, -0.65f, 1.11f, -1.56f, 1.11f, -2.56f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.53f, 0.0f, -1.04f, 0.12f, -1.5f, 0.34f)
                lineTo(15.0f, 2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                lineTo(9.0f, 6.93f)
                curveToRelative(0.0f, 0.33f, -0.17f, 0.65f, -0.45f, 0.83f)
                lineToRelative(-3.33f, 2.22f)
                curveToRelative(-1.39f, 0.93f, -2.23f, 2.49f, -2.23f, 4.16f)
                verticalLineToRelative(4.86f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-4.86f)
                curveToRelative(0.0f, -1.63f, -0.79f, -3.15f, -2.11f, -4.08f)
                close()
                moveTo(16.5f, 6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.6f, -0.36f, 1.14f, -0.89f, 1.37f)
                lineToRelative(-1.66f, -1.11f)
                curveToRelative(-0.21f, -0.14f, -0.35f, -0.34f, -0.41f, -0.58f)
                curveToRelative(0.15f, -0.69f, 0.76f, -1.18f, 1.47f, -1.18f)
                close()
                moveTo(19.0f, 19.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(8.0f, 22.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(5.22f, 13.0f)
                curveToRelative(0.22f, -0.54f, 0.61f, -1.02f, 1.11f, -1.36f)
                lineToRelative(3.33f, -2.22f)
                curveToRelative(0.84f, -0.56f, 1.34f, -1.49f, 1.34f, -2.5f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 6.93f)
                curveToRelative(0.0f, 1.0f, 0.5f, 1.94f, 1.34f, 2.5f)
                lineToRelative(3.33f, 2.22f)
                curveToRelative(0.84f, 0.56f, 1.34f, 1.49f, 1.34f, 2.5f)
                verticalLineToRelative(4.86f)
                close()
            }
        }
        .build()
        return _jug!!
    }

private var _jug: ImageVector? = null
