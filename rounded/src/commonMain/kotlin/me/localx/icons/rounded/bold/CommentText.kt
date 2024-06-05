package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.CommentText: ImageVector
    get() {
        if (_commentText != null) {
            return _commentText!!
        }
        _commentText = Builder(name = "CommentText", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.835f, 0.029f)
                curveTo(9.365f, -0.219f, 5.961f, 1.066f, 3.508f, 3.521f)
                curveTo(1.056f, 5.977f, -0.211f, 9.378f, 0.029f, 12.853f)
                curveToRelative(0.441f, 6.355f, 6.032f, 11.147f, 13.005f, 11.147f)
                horizontalLineToRelative(5.647f)
                curveToRelative(2.933f, 0.0f, 5.318f, -2.386f, 5.318f, -5.318f)
                verticalLineToRelative(-6.357f)
                curveTo(24.0f, 5.854f, 19.096f, 0.453f, 12.835f, 0.029f)
                close()
                moveTo(21.0f, 18.681f)
                curveToRelative(0.0f, 1.278f, -1.04f, 2.318f, -2.318f, 2.318f)
                horizontalLineToRelative(-5.647f)
                curveToRelative(-5.465f, 0.0f, -9.676f, -3.514f, -10.012f, -8.354f)
                curveToRelative(-0.181f, -2.61f, 0.77f, -5.163f, 2.609f, -7.005f)
                curveToRelative(1.694f, -1.696f, 3.992f, -2.64f, 6.383f, -2.64f)
                curveToRelative(0.205f, 0.0f, 0.411f, 0.007f, 0.617f, 0.021f)
                curveToRelative(4.692f, 0.318f, 8.368f, 4.404f, 8.368f, 9.303f)
                verticalLineToRelative(6.357f)
                close()
            }
        }
        .build()
        return _commentText!!
    }

private var _commentText: ImageVector? = null
