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

public val Icons.Filled.SaltShaker: ImageVector
    get() {
        if (_saltShaker != null) {
            return _saltShaker!!
        }
        _saltShaker = Builder(name = "SaltShaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                curveTo(4.0f, 1.922f, 6.589f, 0.618f, 9.0f, 0.2f)
                verticalLineToRelative(2.8f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 0.011f)
                curveToRelative(0.37f, -0.011f, 0.709f, -0.011f, 1.0f, -0.011f)
                reflectiveCurveToRelative(0.63f, 0.0f, 1.0f, 0.011f)
                verticalLineToRelative(2.989f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 0.2f)
                curveToRelative(2.411f, 0.418f, 5.0f, 1.722f, 5.0f, 5.8f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(21.956f, 19.408f)
                curveToRelative(0.168f, 1.175f, -0.173f, 2.336f, -0.934f, 3.213f)
                reflectiveCurveToRelative(-1.862f, 1.379f, -3.022f, 1.379f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-1.16f, 0.0f, -2.262f, -0.503f, -3.022f, -1.379f)
                reflectiveCurveToRelative(-1.102f, -2.038f, -0.938f, -3.187f)
                lineToRelative(1.775f, -10.434f)
                horizontalLineToRelative(16.369f)
                lineToRelative(1.771f, 10.408f)
                close()
                moveTo(15.0f, 19.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(18.0f, 15.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _saltShaker!!
    }

private var _saltShaker: ImageVector? = null
