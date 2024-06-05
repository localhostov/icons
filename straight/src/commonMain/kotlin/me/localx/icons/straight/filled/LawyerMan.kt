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

public val Icons.Filled.LawyerMan: ImageVector
    get() {
        if (_lawyerMan != null) {
            return _lawyerMan!!
        }
        _lawyerMan = Builder(name = "LawyerMan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 18.664f)
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
                horizontalLineToRelative(-0.013f)
                curveToRelative(-0.114f, 1.027f, -0.984f, 1.826f, -2.042f, 1.826f)
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
                moveTo(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(10.0f, 17.945f)
                verticalLineToRelative(-0.64f)
                lineToRelative(1.037f, -3.306f)
                horizontalLineToRelative(-6.037f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.579f)
                curveToRelative(-1.191f, -0.707f, -2.0f, -1.993f, -2.0f, -3.476f)
                close()
            }
        }
        .build()
        return _lawyerMan!!
    }

private var _lawyerMan: ImageVector? = null
