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

public val Icons.Bold.BloodDropper: ImageVector
    get() {
        if (_bloodDropper != null) {
            return _bloodDropper!!
        }
        _bloodDropper = Builder(name = "BloodDropper", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 3.0f)
                horizontalLineToRelative(-1.051f)
                curveToRelative(-0.245f, -1.692f, -1.691f, -3.0f, -3.449f, -3.0f)
                reflectiveCurveToRelative(-3.204f, 1.308f, -3.449f, 3.0f)
                horizontalLineToRelative(-1.051f)
                curveTo(3.916f, 3.0f, 1.0f, 5.916f, 1.0f, 9.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(16.5f, 19.0f)
                lineTo(7.5f, 19.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                lineTo(12.5f, 12.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(4.051f, 9.0f)
                curveToRelative(0.245f, -1.692f, 1.691f, -3.0f, 3.449f, -3.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.758f, 0.0f, 3.204f, 1.308f, 3.449f, 3.0f)
                horizontalLineToRelative(-2.449f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.149f)
                curveToRelative(-0.564f, 1.178f, -1.758f, 2.0f, -3.149f, 2.0f)
                close()
            }
        }
        .build()
        return _bloodDropper!!
    }

private var _bloodDropper: ImageVector? = null
