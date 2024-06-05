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

public val Icons.Bold.NairaSign: ImageVector
    get() {
        if (_nairaSign != null) {
            return _nairaSign!!
        }
        _nairaSign = Builder(name = "NairaSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 10.5f)
                horizontalLineToRelative(-0.5f)
                lineTo(22.0f, 1.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(19.0f, 10.5f)
                horizontalLineToRelative(-6.18f)
                lineTo(6.95f, 1.24f)
                curveTo(6.3f, 0.23f, 5.09f, -0.23f, 3.93f, 0.11f)
                curveToRelative(-1.16f, 0.34f, -1.93f, 1.38f, -1.93f, 2.58f)
                verticalLineToRelative(7.81f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(5.0f, 13.5f)
                horizontalLineToRelative(6.18f)
                lineToRelative(5.87f, 9.26f)
                curveToRelative(0.65f, 1.01f, 1.86f, 1.47f, 3.02f, 1.13f)
                curveToRelative(1.16f, -0.34f, 1.93f, -1.38f, 1.93f, -2.58f)
                verticalLineToRelative(-7.81f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.0f, 10.5f)
                lineTo(5.0f, 3.76f)
                lineToRelative(4.27f, 6.74f)
                lineTo(5.0f, 10.5f)
                close()
                moveTo(19.0f, 20.24f)
                lineToRelative(-4.27f, -6.74f)
                horizontalLineToRelative(4.27f)
                verticalLineToRelative(6.74f)
                close()
            }
        }
        .build()
        return _nairaSign!!
    }

private var _nairaSign: ImageVector? = null
