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

public val Icons.Filled.BloodDropper: ImageVector
    get() {
        if (_bloodDropper != null) {
            return _bloodDropper!!
        }
        _bloodDropper = Builder(name = "BloodDropper", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-2.551f)
                curveToRelative(-0.245f, -1.691f, -1.691f, -3.0f, -3.449f, -3.0f)
                reflectiveCurveToRelative(-3.204f, 1.309f, -3.449f, 3.0f)
                horizontalLineToRelative(-2.551f)
                curveTo(3.243f, 3.0f, 1.0f, 5.243f, 1.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 10.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.079f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.079f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.079f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.079f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.414f, 0.0f, 4.434f, -1.721f, 4.899f, -4.0f)
                horizontalLineToRelative(-3.899f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bloodDropper!!
    }

private var _bloodDropper: ImageVector? = null
