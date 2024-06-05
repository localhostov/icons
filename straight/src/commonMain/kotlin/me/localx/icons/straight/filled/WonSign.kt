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

public val Icons.Filled.WonSign: ImageVector
    get() {
        if (_wonSign != null) {
            return _wonSign!!
        }
        _wonSign = Builder(name = "WonSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineToRelative(-2.04f)
                reflectiveCurveToRelative(-2.65f, 14.0f, -2.65f, 14.0f)
                horizontalLineToRelative(-4.33f)
                lineTo(12.0f, 2.86f)
                lineToRelative(-2.98f, 11.14f)
                lineTo(4.68f, 14.0f)
                lineTo(2.03f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineTo(2.65f, 14.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.03f, 16.0f)
                lineToRelative(1.12f, 5.93f)
                curveToRelative(0.26f, 1.17f, 1.14f, 2.07f, 2.38f, 2.07f)
                reflectiveCurveToRelative(2.06f, -0.79f, 2.39f, -1.86f)
                lineToRelative(1.64f, -6.14f)
                horizontalLineToRelative(2.89f)
                lineToRelative(1.67f, 6.22f)
                curveToRelative(0.25f, 0.99f, 1.12f, 1.78f, 2.36f, 1.78f)
                reflectiveCurveToRelative(2.12f, -0.9f, 2.38f, -2.07f)
                lineToRelative(1.12f, -5.93f)
                horizontalLineToRelative(3.03f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.65f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(6.99f, 21.58f)
                curveToRelative(-0.14f, 0.42f, -0.32f, 0.42f, -0.47f, 0.42f)
                curveToRelative(-0.26f, 0.0f, -0.38f, -0.29f, -0.42f, -0.48f)
                lineToRelative(-1.05f, -5.52f)
                horizontalLineToRelative(3.43f)
                lineToRelative(-1.49f, 5.58f)
                close()
                moveTo(11.09f, 14.0f)
                lineToRelative(0.91f, -3.41f)
                lineToRelative(0.91f, 3.41f)
                horizontalLineToRelative(-1.82f)
                close()
                moveTo(17.89f, 21.52f)
                curveToRelative(-0.04f, 0.19f, -0.16f, 0.48f, -0.42f, 0.48f)
                curveToRelative(-0.24f, 0.0f, -0.38f, -0.09f, -0.43f, -0.29f)
                lineToRelative(-1.53f, -5.71f)
                horizontalLineToRelative(3.42f)
                lineToRelative(-1.04f, 5.52f)
                close()
            }
        }
        .build()
        return _wonSign!!
    }

private var _wonSign: ImageVector? = null
