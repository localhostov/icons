package me.localx.icons.rounded.outline

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

public val Icons.Outline.Castle: ImageVector
    get() {
        if (_castle != null) {
            return _castle!!
        }
        _castle = Builder(name = "Castle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 9.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(19.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                lineTo(5.0f, 11.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                lineTo(24.0f, 10.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(19.5f, 22.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                lineTo(22.0f, 13.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _castle!!
    }

private var _castle: ImageVector? = null
