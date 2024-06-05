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
                moveTo(17.5f, 3.0f)
                horizontalLineToRelative(-2.051f)
                curveToRelative(-0.245f, -1.692f, -1.691f, -3.0f, -3.449f, -3.0f)
                reflectiveCurveToRelative(-3.204f, 1.308f, -3.449f, 3.0f)
                horizontalLineToRelative(-2.051f)
                curveTo(3.467f, 3.0f, 1.0f, 5.467f, 1.0f, 8.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.079f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.079f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.079f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.079f)
                horizontalLineToRelative(1.5f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(23.0f, 8.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(17.5f, 19.0f)
                lineTo(6.5f, 19.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-4.5f)
                lineTo(14.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.949f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.449f, 2.0f)
                close()
            }
        }
        .build()
        return _bloodDropper!!
    }

private var _bloodDropper: ImageVector? = null
