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

public val Icons.Bold.CommentArrowUpRight: ImageVector
    get() {
        if (_commentArrowUpRight != null) {
            return _commentArrowUpRight!!
        }
        _commentArrowUpRight = Builder(name = "CommentArrowUpRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.562f, 2.756f)
                curveTo(16.854f, 0.481f, 13.424f, -0.43f, 9.908f, 0.188f)
                curveTo(4.614f, 1.12f, 0.562f, 5.518f, 0.056f, 10.884f)
                curveToRelative(-0.312f, 3.311f, 0.734f, 6.474f, 2.947f, 8.905f)
                curveToRelative(2.435f, 2.676f, 6.091f, 4.21f, 10.031f, 4.21f)
                horizontalLineToRelative(5.466f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-6.175f)
                curveToRelative(0.0f, -3.713f, -1.617f, -7.201f, -4.438f, -9.569f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.466f)
                curveToRelative(-3.098f, 0.0f, -5.945f, -1.177f, -7.812f, -3.229f)
                curveToRelative(-1.638f, -1.799f, -2.411f, -4.145f, -2.18f, -6.604f)
                curveToRelative(0.374f, -3.962f, 3.48f, -7.336f, 7.386f, -8.023f)
                curveToRelative(0.539f, -0.095f, 1.074f, -0.142f, 1.603f, -0.142f)
                curveToRelative(2.052f, 0.0f, 3.998f, 0.705f, 5.603f, 2.052f)
                curveToRelative(2.14f, 1.796f, 3.367f, 4.446f, 3.367f, 7.271f)
                verticalLineToRelative(6.175f)
                close()
                moveTo(17.0f, 8.0f)
                verticalLineToRelative(4.474f)
                curveToRelative(0.0f, 0.891f, -1.077f, 1.337f, -1.707f, 0.707f)
                lineToRelative(-1.176f, -1.176f)
                lineToRelative(-4.056f, 4.056f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                lineToRelative(4.056f, -4.056f)
                lineToRelative(-1.176f, -1.176f)
                curveToRelative(-0.63f, -0.63f, -0.184f, -1.707f, 0.707f, -1.707f)
                horizontalLineToRelative(4.474f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _commentArrowUpRight!!
    }

private var _commentArrowUpRight: ImageVector? = null
