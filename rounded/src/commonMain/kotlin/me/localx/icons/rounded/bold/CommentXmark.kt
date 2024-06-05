package me.localx.icons.rounded.bold

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

public val Icons.Bold.CommentXmark: ImageVector
    get() {
        if (_commentXmark != null) {
            return _commentXmark!!
        }
        _commentXmark = Builder(name = "CommentXmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.061f, 10.061f)
                lineToRelative(-1.939f, 1.939f)
                lineToRelative(1.939f, 1.939f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(-1.939f, 1.939f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(1.939f, -1.939f)
                lineToRelative(-1.939f, -1.939f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(1.939f, 1.939f)
                lineToRelative(1.939f, -1.939f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                reflectiveCurveToRelative(0.586f, 1.535f, 0.0f, 2.121f)
                close()
                moveTo(24.0f, 12.325f)
                verticalLineToRelative(6.176f)
                curveToRelative(0.0f, 3.032f, -2.468f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-5.466f)
                curveToRelative(-3.94f, 0.0f, -7.597f, -1.534f, -10.031f, -4.211f)
                curveTo(0.79f, 17.357f, -0.257f, 14.195f, 0.056f, 10.885f)
                curveTo(0.562f, 5.518f, 4.614f, 1.119f, 9.908f, 0.188f)
                curveToRelative(3.521f, -0.617f, 6.946f, 0.295f, 9.654f, 2.568f)
                curveToRelative(2.82f, 2.367f, 4.438f, 5.854f, 4.438f, 9.567f)
                close()
                moveTo(21.0f, 12.325f)
                curveToRelative(0.0f, -2.824f, -1.228f, -5.474f, -3.366f, -7.271f)
                curveToRelative(-1.605f, -1.347f, -3.552f, -2.052f, -5.604f, -2.052f)
                curveToRelative(-0.528f, 0.0f, -1.064f, 0.047f, -1.603f, 0.142f)
                curveToRelative(-3.905f, 0.687f, -7.012f, 4.061f, -7.386f, 8.022f)
                curveToRelative(-0.231f, 2.46f, 0.542f, 4.805f, 2.18f, 6.604f)
                curveToRelative(1.867f, 2.053f, 4.715f, 3.229f, 7.812f, 3.229f)
                horizontalLineToRelative(5.466f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-6.176f)
                close()
            }
        }
        .build()
        return _commentXmark!!
    }

private var _commentXmark: ImageVector? = null
