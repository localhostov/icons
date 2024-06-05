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

public val Icons.Bold.CommentArrowDown: ImageVector
    get() {
        if (_commentArrowDown != null) {
            return _commentArrowDown!!
        }
        _commentArrowDown = Builder(name = "CommentArrowDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.562f, 2.756f)
                curveTo(16.854f, 0.481f, 13.424f, -0.43f, 9.908f, 0.188f)
                curveTo(4.614f, 1.12f, 0.562f, 5.518f, 0.056f, 10.884f)
                curveToRelative(-0.313f, 3.311f, 0.733f, 6.474f, 2.946f, 8.905f)
                curveToRelative(2.435f, 2.676f, 6.091f, 4.21f, 10.032f, 4.21f)
                horizontalLineToRelative(5.466f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-6.175f)
                curveToRelative(0.0f, -3.713f, -1.617f, -7.201f, -4.438f, -9.569f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.466f)
                curveToRelative(-3.098f, 0.0f, -5.945f, -1.177f, -7.813f, -3.229f)
                curveToRelative(-1.637f, -1.799f, -2.411f, -4.145f, -2.179f, -6.604f)
                curveToRelative(0.375f, -3.962f, 3.48f, -7.336f, 7.385f, -8.023f)
                curveToRelative(0.539f, -0.095f, 1.074f, -0.142f, 1.603f, -0.142f)
                curveToRelative(2.051f, 0.0f, 3.998f, 0.705f, 5.602f, 2.052f)
                curveToRelative(2.14f, 1.796f, 3.367f, 4.446f, 3.367f, 7.271f)
                verticalLineToRelative(6.175f)
                close()
                moveTo(15.832f, 14.544f)
                lineToRelative(-3.163f, 3.163f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                lineToRelative(-3.163f, -3.163f)
                curveToRelative(-0.63f, -0.63f, -0.184f, -1.707f, 0.707f, -1.707f)
                horizontalLineToRelative(1.663f)
                lineTo(10.462f, 7.336f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(5.501f)
                horizontalLineToRelative(1.664f)
                curveToRelative(0.891f, 0.0f, 1.337f, 1.077f, 0.707f, 1.707f)
                close()
            }
        }
        .build()
        return _commentArrowDown!!
    }

private var _commentArrowDown: ImageVector? = null
