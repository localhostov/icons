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

public val Icons.Filled.MillSign: ImageVector
    get() {
        if (_millSign != null) {
            return _millSign!!
        }
        _millSign = Builder(name = "MillSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 9.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-0.62f, 0.0f, -1.2f, 0.15f, -1.72f, 0.4f)
                lineToRelative(-2.28f, 5.57f)
                verticalLineToRelative(9.02f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.14f)
                lineToRelative(-3.07f, 7.51f)
                curveToRelative(-0.16f, 0.39f, -0.53f, 0.62f, -0.93f, 0.62f)
                curveToRelative(-0.13f, 0.0f, -0.25f, -0.02f, -0.38f, -0.07f)
                curveToRelative(-0.51f, -0.21f, -0.76f, -0.79f, -0.55f, -1.3f)
                lineToRelative(4.93f, -12.04f)
                verticalLineToRelative(-1.58f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.54f)
                curveToRelative(1.06f, -0.95f, 2.46f, -1.54f, 4.0f, -1.54f)
                curveToRelative(2.09f, 0.0f, 3.92f, 1.07f, 5.0f, 2.69f)
                curveToRelative(0.45f, -0.67f, 1.02f, -1.25f, 1.69f, -1.69f)
                lineToRelative(1.38f, -3.38f)
                curveToRelative(0.21f, -0.51f, 0.79f, -0.76f, 1.3f, -0.55f)
                curveToRelative(0.51f, 0.21f, 0.76f, 0.79f, 0.55f, 1.3f)
                lineToRelative(-0.69f, 1.67f)
                curveToRelative(0.25f, -0.03f, 0.5f, -0.05f, 0.76f, -0.05f)
                curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _millSign!!
    }

private var _millSign: ImageVector? = null
