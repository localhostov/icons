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

public val Icons.Bold.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 13.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.489f)
                curveToRelative(-1.176f, -1.127f, -1.894f, -2.707f, -1.894f, -4.404f)
                curveTo(2.095f, 2.734f, 4.83f, 0.0f, 8.191f, 0.0f)
                horizontalLineToRelative(7.809f)
                curveToRelative(3.361f, 0.0f, 6.095f, 2.734f, 6.095f, 6.096f)
                verticalLineToRelative(0.404f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-0.404f)
                curveToRelative(0.0f, -1.707f, -1.389f, -3.096f, -3.095f, -3.096f)
                horizontalLineToRelative(-7.809f)
                curveToRelative(-1.707f, 0.0f, -3.096f, 1.389f, -3.096f, 3.096f)
                curveToRelative(0.0f, 1.372f, 0.921f, 2.595f, 2.24f, 2.975f)
                lineToRelative(4.97f, 1.43f)
                horizontalLineToRelative(10.194f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(20.447f, 16.006f)
                curveToRelative(-0.825f, 0.072f, -1.436f, 0.8f, -1.363f, 1.625f)
                curveToRelative(0.008f, 0.091f, 0.012f, 0.182f, 0.012f, 0.273f)
                curveToRelative(0.0f, 1.707f, -1.389f, 3.096f, -3.095f, 3.096f)
                horizontalLineToRelative(-7.809f)
                curveToRelative(-1.707f, 0.0f, -3.096f, -1.389f, -3.096f, -3.096f)
                verticalLineToRelative(-0.404f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.404f)
                curveToRelative(0.0f, 3.361f, 2.734f, 6.096f, 6.096f, 6.096f)
                horizontalLineToRelative(7.809f)
                curveToRelative(3.361f, 0.0f, 6.095f, -2.734f, 6.095f, -6.096f)
                curveToRelative(0.0f, -0.18f, -0.008f, -0.358f, -0.023f, -0.535f)
                curveToRelative(-0.072f, -0.825f, -0.794f, -1.44f, -1.625f, -1.363f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
