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

public val Icons.Bold.BoneBreak: ImageVector
    get() {
        if (_boneBreak != null) {
            return _boneBreak!!
        }
        _boneBreak = Builder(name = "BoneBreak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 6.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(19.299f, 4.286f)
                lineToRelative(-2.598f, -1.5f)
                lineToRelative(-2.0f, 3.464f)
                lineToRelative(2.598f, 1.5f)
                lineToRelative(2.0f, -3.464f)
                close()
                moveTo(9.299f, 6.25f)
                lineToRelative(-2.0f, -3.464f)
                lineToRelative(-2.598f, 1.5f)
                lineToRelative(2.0f, 3.464f)
                lineToRelative(2.598f, -1.5f)
                close()
                moveTo(24.0f, 13.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-1.303f, 0.0f, -2.524f, 0.571f, -3.365f, 1.521f)
                lineToRelative(-2.565f, -0.733f)
                lineToRelative(-0.824f, 2.885f)
                lineToRelative(4.858f, 1.388f)
                lineToRelative(0.535f, -1.177f)
                curveToRelative(0.244f, -0.537f, 0.778f, -0.884f, 1.361f, -0.884f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.512f, -0.263f, 0.984f, -0.703f, 1.263f)
                lineToRelative(-1.206f, 0.765f)
                lineToRelative(0.704f, 1.242f)
                curveToRelative(0.136f, 0.24f, 0.205f, 0.486f, 0.205f, 0.731f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.493f, -1.5f)
                lineToRelative(0.2f, -1.472f)
                lineToRelative(-5.208f, -1.488f)
                lineToRelative(-5.208f, 1.488f)
                lineToRelative(0.208f, 1.472f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.245f, 0.069f, -0.491f, 0.205f, -0.731f)
                lineToRelative(0.704f, -1.242f)
                lineToRelative(-1.206f, -0.765f)
                curveToRelative(-0.44f, -0.279f, -0.703f, -0.751f, -0.703f, -1.263f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.583f, 0.0f, 1.117f, 0.347f, 1.361f, 0.884f)
                lineToRelative(0.535f, 1.177f)
                lineToRelative(4.858f, -1.388f)
                lineToRelative(-0.824f, -2.885f)
                lineToRelative(-2.565f, 0.733f)
                curveToRelative(-0.841f, -0.951f, -2.062f, -1.521f, -3.365f, -1.521f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                curveToRelative(0.0f, 1.112f, 0.406f, 2.159f, 1.124f, 2.969f)
                curveToRelative(-0.082f, 0.337f, -0.124f, 0.681f, -0.124f, 1.031f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                curveToRelative(2.226f, 0.0f, 4.08f, -1.625f, 4.437f, -3.751f)
                lineToRelative(2.063f, -0.589f)
                lineToRelative(2.062f, 0.589f)
                curveToRelative(0.357f, 2.126f, 2.211f, 3.751f, 4.438f, 3.751f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -0.35f, -0.042f, -0.694f, -0.124f, -1.031f)
                curveToRelative(0.717f, -0.81f, 1.124f, -1.857f, 1.124f, -2.969f)
                close()
            }
        }
        .build()
        return _boneBreak!!
    }

private var _boneBreak: ImageVector? = null
