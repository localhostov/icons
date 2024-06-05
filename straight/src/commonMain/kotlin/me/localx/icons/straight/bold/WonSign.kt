package me.localx.icons.straight.bold

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

public val Icons.Bold.WonSign: ImageVector
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
                horizontalLineToRelative(-3.05f)
                reflectiveCurveToRelative(-2.03f, 12.0f, -2.03f, 12.0f)
                horizontalLineToRelative(-4.32f)
                lineToRelative(-2.6f, -8.0f)
                lineToRelative(-2.6f, 8.0f)
                lineTo(5.08f, 12.0f)
                lineTo(3.04f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineTo(2.04f, 12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.55f, 15.0f)
                lineToRelative(1.11f, 6.54f)
                curveToRelative(0.32f, 1.47f, 1.48f, 2.46f, 2.87f, 2.46f)
                reflectiveCurveToRelative(2.44f, -0.83f, 2.87f, -2.23f)
                lineToRelative(2.27f, -6.77f)
                horizontalLineToRelative(0.67f)
                lineToRelative(2.29f, 6.84f)
                curveToRelative(0.32f, 1.29f, 1.46f, 2.16f, 2.85f, 2.16f)
                reflectiveCurveToRelative(2.54f, -0.99f, 2.87f, -2.48f)
                lineToRelative(1.11f, -6.52f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.04f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(6.56f, 20.75f)
                lineToRelative(-0.98f, -5.75f)
                horizontalLineToRelative(2.84f)
                lineToRelative(-1.87f, 5.75f)
                close()
                moveTo(17.44f, 20.74f)
                lineToRelative(-1.87f, -5.74f)
                horizontalLineToRelative(2.84f)
                lineToRelative(-0.97f, 5.74f)
                close()
            }
        }
        .build()
        return _wonSign!!
    }

private var _wonSign: ImageVector? = null
