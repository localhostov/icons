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

public val Icons.Outline.SignHanging: ImageVector
    get() {
        if (_signHanging != null) {
            return _signHanging!!
        }
        _signHanging = Builder(name = "SignHanging", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.418f)
                lineTo(21.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                lineTo(0.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.418f)
                curveToRelative(-1.764f, 0.773f, -3.0f, 2.536f, -3.0f, 4.582f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.046f, -1.236f, -3.809f, -3.0f, -4.582f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 4.0f)
                lineTo(9.0f, 2.0f)
                close()
                moveTo(22.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(9.0f, 18.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _signHanging!!
    }

private var _signHanging: ImageVector? = null
