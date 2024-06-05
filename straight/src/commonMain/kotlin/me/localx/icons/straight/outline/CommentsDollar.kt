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

public val Icons.Outline.CommentsDollar: ImageVector
    get() {
        if (_commentsDollar != null) {
            return _commentsDollar!!
        }
        _commentsDollar = Builder(name = "CommentsDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.955f, 0.0f, -5.535f, -1.615f, -6.92f, -4.004f)
                curveToRelative(0.769f, -0.006f, 1.518f, -0.091f, 2.242f, -0.248f)
                curveToRelative(1.101f, 1.371f, 2.787f, 2.252f, 4.678f, 2.252f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.891f, -0.881f, -3.577f, -2.252f, -4.678f)
                curveToRelative(0.156f, -0.724f, 0.242f, -1.473f, 0.248f, -2.242f)
                curveToRelative(2.389f, 1.385f, 4.004f, 3.965f, 4.004f, 6.92f)
                close()
                moveTo(9.0f, 18.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 9.0f)
                curveTo(0.0f, 4.038f, 4.038f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(2.0f, 5.14f, 2.0f, 9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f)
                close()
                moveTo(8.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.36f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.042f, 0.507f)
                curveToRelative(0.373f, 0.062f, 0.644f, 0.382f, 0.644f, 0.76f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.36f, -0.974f, -2.51f, -2.315f, -2.733f)
                lineToRelative(-3.042f, -0.507f)
                curveToRelative(-0.373f, -0.062f, -0.644f, -0.382f, -0.644f, -0.76f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _commentsDollar!!
    }

private var _commentsDollar: ImageVector? = null
