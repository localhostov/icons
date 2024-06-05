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

public val Icons.Bold.Tubes: ImageVector
    get() {
        if (_tubes != null) {
            return _tubes!!
        }
        _tubes = Builder(name = "Tubes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 0.0f)
                lineTo(1.5f, 0.0f)
                curveTo(0.671f, 0.0f, 0.0f, 0.672f, 0.0f, 1.5f)
                curveToRelative(0.0f, 0.653f, 0.417f, 1.208f, 1.0f, 1.414f)
                verticalLineToRelative(16.586f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                lineTo(10.0f, 2.914f)
                curveToRelative(0.583f, -0.206f, 1.0f, -0.761f, 1.0f, -1.414f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(7.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(4.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(5.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.653f, 0.417f, 1.208f, 1.0f, 1.414f)
                verticalLineToRelative(16.586f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                lineTo(23.0f, 2.914f)
                curveToRelative(0.583f, -0.206f, 1.0f, -0.761f, 1.0f, -1.414f)
                close()
                moveTo(20.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(18.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _tubes!!
    }

private var _tubes: ImageVector? = null
