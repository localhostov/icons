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

public val Icons.Filled.Jug: ImageVector
    get() {
        if (_jug != null) {
            return _jug!!
        }
        _jug = Builder(name = "Jug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.88f, 10.06f)
                curveToRelative(0.69f, -0.65f, 1.12f, -1.56f, 1.12f, -2.56f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.53f, 0.0f, -1.04f, 0.13f, -1.5f, 0.35f)
                lineTo(15.0f, 2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                lineTo(9.0f, 6.93f)
                curveToRelative(0.0f, 0.33f, -0.17f, 0.65f, -0.45f, 0.83f)
                lineToRelative(-3.33f, 2.22f)
                curveToRelative(-1.07f, 0.71f, -1.8f, 1.8f, -2.09f, 3.02f)
                horizontalLineToRelative(12.86f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-4.86f)
                curveToRelative(0.0f, -1.63f, -0.79f, -3.15f, -2.12f, -4.08f)
                close()
                moveTo(17.09f, 8.86f)
                lineToRelative(-1.64f, -1.1f)
                curveToRelative(-0.21f, -0.14f, -0.35f, -0.34f, -0.41f, -0.58f)
                curveToRelative(0.15f, -0.69f, 0.76f, -1.19f, 1.47f, -1.19f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.6f, -0.38f, 1.12f, -0.91f, 1.36f)
                close()
            }
        }
        .build()
        return _jug!!
    }

private var _jug: ImageVector? = null
