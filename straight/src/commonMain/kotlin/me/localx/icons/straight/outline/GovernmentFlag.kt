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

public val Icons.Outline.GovernmentFlag: ImageVector
    get() {
        if (_governmentFlag != null) {
            return _governmentFlag!!
        }
        _governmentFlag = Builder(name = "GovernmentFlag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 14.0f)
                verticalLineToRelative(-1.526f)
                curveToRelative(0.0f, -1.032f, -0.563f, -1.979f, -1.469f, -2.474f)
                curveToRelative(0.0f, 0.0f, -8.412f, -4.578f, -8.531f, -4.624f)
                verticalLineToRelative(-1.349f)
                lineToRelative(3.0f, -1.944f)
                lineTo(11.0f, 0.0f)
                verticalLineToRelative(5.376f)
                curveToRelative(-0.119f, 0.045f, -8.531f, 4.624f, -8.531f, 4.624f)
                curveToRelative(-0.906f, 0.493f, -1.469f, 1.441f, -1.469f, 2.474f)
                verticalLineToRelative(1.526f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                lineTo(1.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.426f, 11.756f)
                lineToRelative(8.182f, -4.463f)
                curveToRelative(0.245f, -0.135f, 0.538f, -0.135f, 0.783f, 0.0f)
                lineToRelative(8.183f, 4.463f)
                curveToRelative(0.111f, 0.061f, 0.204f, 0.145f, 0.274f, 0.244f)
                lineTo(3.151f, 12.0f)
                curveToRelative(0.071f, -0.1f, 0.164f, -0.184f, 0.275f, -0.244f)
                close()
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(19.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _governmentFlag!!
    }

private var _governmentFlag: ImageVector? = null
