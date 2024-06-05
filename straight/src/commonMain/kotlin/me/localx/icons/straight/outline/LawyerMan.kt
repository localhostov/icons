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

public val Icons.Outline.LawyerMan: ImageVector
    get() {
        if (_lawyerMan != null) {
            return _lawyerMan!!
        }
        _lawyerMan = Builder(name = "LawyerMan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(9.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(6.037f)
                lineToRelative(-0.627f, 2.0f)
                horizontalLineToRelative(-5.41f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(24.0f, 18.664f)
                verticalLineToRelative(0.336f)
                curveToRelative(0.0f, 1.104f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.896f, -2.0f, -2.0f)
                verticalLineToRelative(-0.336f)
                lineToRelative(0.854f, -2.42f)
                lineToRelative(-1.854f, -0.348f)
                verticalLineToRelative(6.105f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.48f)
                lineToRelative(-1.752f, -0.328f)
                lineToRelative(0.861f, 2.406f)
                verticalLineToRelative(0.575f)
                curveToRelative(-0.114f, 1.027f, -0.997f, 1.826f, -2.054f, 1.826f)
                curveToRelative(-1.135f, 0.0f, -2.054f, -0.92f, -2.054f, -2.054f)
                verticalLineToRelative(-0.333f)
                lineToRelative(1.5f, -4.782f)
                lineToRelative(3.5f, 0.649f)
                verticalLineToRelative(-1.48f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.851f)
                lineToRelative(3.5f, 0.649f)
                lineToRelative(1.5f, 4.164f)
                close()
            }
        }
        .build()
        return _lawyerMan!!
    }

private var _lawyerMan: ImageVector? = null
