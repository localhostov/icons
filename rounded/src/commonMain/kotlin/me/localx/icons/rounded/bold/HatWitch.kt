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

public val Icons.Bold.HatWitch: ImageVector
    get() {
        if (_hatWitch != null) {
            return _hatWitch!!
        }
        _hatWitch = Builder(name = "HatWitch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 21.0f)
                horizontalLineToRelative(-0.258f)
                lineToRelative(-3.859f, -11.227f)
                curveToRelative(-0.689f, -2.003f, -0.302f, -4.219f, 1.001f, -5.869f)
                curveToRelative(0.432f, 0.326f, 0.808f, 0.734f, 1.106f, 1.211f)
                lineToRelative(0.737f, 1.18f)
                curveToRelative(0.439f, 0.702f, 1.364f, 0.917f, 2.067f, 0.477f)
                curveToRelative(0.703f, -0.439f, 0.916f, -1.364f, 0.477f, -2.067f)
                lineToRelative(-0.737f, -1.181f)
                curveToRelative(-1.38f, -2.207f, -3.758f, -3.524f, -6.36f, -3.524f)
                horizontalLineToRelative(-1.657f)
                curveToRelative(-3.643f, 0.0f, -6.881f, 2.316f, -8.059f, 5.764f)
                lineTo(1.756f, 21.0f)
                horizontalLineToRelative(-0.256f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(21.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9.798f, 6.733f)
                curveToRelative(0.763f, -2.233f, 2.86f, -3.733f, 5.22f, -3.733f)
                horizontalLineToRelative(1.351f)
                curveToRelative(-1.39f, 2.309f, -1.715f, 5.149f, -0.822f, 7.749f)
                lineToRelative(3.524f, 10.251f)
                horizontalLineToRelative(-4.07f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.074f)
                lineToRelative(4.871f, -14.267f)
                close()
            }
        }
        .build()
        return _hatWitch!!
    }

private var _hatWitch: ImageVector? = null
