package me.localx.icons.straight.outline

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

public val Icons.Outline.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 6.0f)
                horizontalLineToRelative(-11.943f)
                lineTo(21.323f, 1.959f)
                lineToRelative(-0.626f, -1.899f)
                lineTo(2.571f, 6.031f)
                curveToRelative(-1.452f, 0.209f, -2.571f, 1.46f, -2.571f, 2.969f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-15.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0.0f, -0.552f, 0.441f, -1.0f, 0.994f, -1.0f)
                curveToRelative(3.908f, 0.0f, 18.006f, 0.0f, 18.006f, 0.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 18.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.5f, 10.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(15.5f, 17.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.122f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
