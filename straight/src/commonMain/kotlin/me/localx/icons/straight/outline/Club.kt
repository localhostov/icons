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

public val Icons.Outline.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.636f, -5.982f)
                arcTo(5.209f, 5.209f, 0.0f, false, false, 18.0f, 5.546f)
                arcTo(5.793f, 5.793f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(5.793f, 5.793f, 0.0f, false, false, 6.0f, 5.546f)
                arcToRelative(5.209f, 5.209f, 0.0f, false, false, 0.636f, 2.472f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.0f, 20.0f)
                arcToRelative(6.081f, 6.081f, 0.0f, false, false, 3.922f, -1.523f)
                curveTo(10.729f, 20.853f, 10.078f, 22.0f, 8.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(19.0f, 24.0f)
                lineTo(19.0f, 22.0f)
                lineTo(16.0f, 22.0f)
                curveToRelative(-2.078f, 0.0f, -2.729f, -1.147f, -2.922f, -3.523f)
                arcTo(6.081f, 6.081f, 0.0f, false, false, 17.0f, 20.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 23.0f, 14.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 4.0f, 3.546f)
                arcToRelative(4.452f, 4.452f, 0.0f, false, true, -2.2f, 3.446f)
                horizontalLineToRelative(0.0f)
                arcTo(8.329f, 8.329f, 0.0f, false, false, 12.0f, 10.59f)
                arcToRelative(8.312f, 8.312f, 0.0f, false, false, -1.8f, -1.6f)
                horizontalLineToRelative(0.0f)
                arcTo(4.454f, 4.454f, 0.0f, false, true, 8.0f, 5.546f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(7.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(3.852f, 3.852f, 0.0f, false, true, 2.062f, 0.633f)
                lineToRelative(0.048f, 0.033f)
                verticalLineToRelative(0.0f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, 2.013f, 2.124f)
                lineTo(11.8f, 14.01f)
                lineToRelative(-0.67f, 1.2f)
                curveTo(11.11f, 15.237f, 9.538f, 18.0f, 7.0f, 18.0f)
                close()
                moveTo(11.971f, 22.0f)
                curveToRelative(0.009f, -0.016f, 0.02f, -0.031f, 0.029f, -0.047f)
                curveToRelative(0.009f, 0.016f, 0.02f, 0.031f, 0.029f, 0.047f)
                close()
                moveTo(12.871f, 15.212f)
                lineTo(12.208f, 14.0f)
                lineToRelative(0.668f, -1.215f)
                arcToRelative(6.76f, 6.76f, 0.0f, false, true, 2.009f, -2.128f)
                lineToRelative(0.005f, 0.006f)
                curveToRelative(0.027f, -0.018f, 0.065f, -0.047f, 0.095f, -0.067f)
                arcTo(3.852f, 3.852f, 0.0f, false, true, 17.0f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                curveTo(14.462f, 18.0f, 12.89f, 15.237f, 12.876f, 15.212f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
