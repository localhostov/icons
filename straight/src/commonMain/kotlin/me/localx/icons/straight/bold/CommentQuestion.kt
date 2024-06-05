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

public val Icons.Bold.CommentQuestion: ImageVector
    get() {
        if (_commentQuestion != null) {
            return _commentQuestion!!
        }
        _commentQuestion = Builder(name = "CommentQuestion", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                horizontalLineToRelative(9.0f)
                lineTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.963f, -4.038f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(13.5f, 13.381f)
                curveToRelative(0.0f, -0.286f, 0.26f, -0.773f, 0.43f, -0.876f)
                curveToRelative(1.498f, -0.828f, 2.305f, -2.522f, 2.007f, -4.217f)
                curveToRelative(-0.283f, -1.616f, -1.61f, -2.943f, -3.225f, -3.226f)
                curveToRelative(-1.182f, -0.207f, -2.377f, 0.11f, -3.284f, 0.874f)
                curveToRelative(-0.908f, 0.762f, -1.428f, 1.879f, -1.428f, 3.063f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -0.296f, 0.13f, -0.575f, 0.357f, -0.767f)
                curveToRelative(0.133f, -0.112f, 0.417f, -0.29f, 0.837f, -0.216f)
                curveToRelative(0.382f, 0.066f, 0.721f, 0.405f, 0.788f, 0.789f)
                curveToRelative(0.094f, 0.534f, -0.212f, 0.911f, -0.5f, 1.07f)
                curveToRelative(-1.13f, 0.622f, -1.982f, 2.128f, -1.982f, 3.504f)
                verticalLineToRelative(0.619f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.619f)
                close()
                moveTo(13.5f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _commentQuestion!!
    }

private var _commentQuestion: ImageVector? = null
