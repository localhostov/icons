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

public val Icons.Bold.NfcSlash: ImageVector
    get() {
        if (_nfcSlash != null) {
            return _nfcSlash!!
        }
        _nfcSlash = Builder(name = "NfcSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(6.5f, 23.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(1.0f, 9.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(14.5f, 20.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(7.5f, 13.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.56f, 23.56f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineTo(0.44f, 2.56f)
                curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
                curveTo(1.03f, -0.15f, 1.97f, -0.15f, 2.56f, 0.44f)
                lineToRelative(1.26f, 1.26f)
                curveToRelative(0.81f, -0.45f, 1.73f, -0.7f, 2.68f, -0.7f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.95f, -0.24f, 1.87f, -0.7f, 2.68f)
                lineToRelative(1.26f, 1.26f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f)
                close()
                moveTo(6.15f, 4.03f)
                lineToRelative(1.97f, 1.97f)
                horizontalLineToRelative(1.88f)
                curveToRelative(0.61f, 0.0f, 1.15f, 0.37f, 1.39f, 0.93f)
                reflectiveCurveToRelative(0.1f, 1.21f, -0.33f, 1.63f)
                lineToRelative(-0.19f, 0.19f)
                lineToRelative(4.13f, 4.13f)
                verticalLineToRelative(-3.88f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.12f, 0.0f, 0.24f, -0.03f, 0.35f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.02f, -0.12f, 0.03f, -0.23f, 0.03f, -0.35f)
                lineTo(20.0f, 6.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(6.5f, 4.0f)
                curveToRelative(-0.12f, 0.0f, -0.24f, 0.0f, -0.35f, 0.03f)
                close()
            }
        }
        .build()
        return _nfcSlash!!
    }

private var _nfcSlash: ImageVector? = null
