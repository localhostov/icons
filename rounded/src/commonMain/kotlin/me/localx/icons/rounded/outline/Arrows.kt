package me.localx.icons.rounded.outline

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

public val Icons.Outline.Arrows: ImageVector
    get() {
        if (_arrows != null) {
            return _arrows!!
        }
        _arrows = Builder(name = "Arrows", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.351f, 10.253f)
                curveToRelative(-0.233f, -0.263f, -0.462f, -0.513f, -0.619f, -0.67f)
                lineTo(20.487f, 7.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.426f, 1.4f)
                lineToRelative(2.251f, 2.29f)
                lineTo(21.32f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.745f)
                lineToRelative(2.233f, 2.194f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, -1.426f)
                lineToRelative(-2.279f, -2.24f)
                curveToRelative(-0.163f, -0.163f, -0.413f, -0.391f, -0.674f, -0.623f)
                arcTo(2.575f, 2.575f, 0.0f, false, false, 12.028f, 0.006f)
                arcTo(0.28f, 0.28f, 0.0f, false, false, 12.0f, 0.0f)
                lineToRelative(-0.011f, 0.0f)
                arcToRelative(2.584f, 2.584f, 0.0f, false, false, -1.736f, 0.647f)
                curveToRelative(-0.263f, 0.233f, -0.513f, 0.462f, -0.67f, 0.619f)
                lineTo(7.3f, 3.513f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 8.7f, 4.939f)
                lineToRelative(2.29f, -2.251f)
                lineTo(11.0f, 2.68f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.68f)
                lineToRelative(0.015f, -0.015f)
                lineTo(4.939f, 8.7f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 3.513f, 7.3f)
                lineTo(1.274f, 9.577f)
                curveToRelative(-0.163f, 0.163f, -0.392f, 0.413f, -0.624f, 0.675f)
                arcTo(2.581f, 2.581f, 0.0f, false, false, 0.0f, 11.989f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, 0.01f, 0.005f, 0.019f, 0.006f, 0.029f)
                arcTo(2.573f, 2.573f, 0.0f, false, false, 0.65f, 13.682f)
                curveToRelative(0.233f, 0.262f, 0.461f, 0.512f, 0.618f, 0.67f)
                lineToRelative(2.245f, 2.284f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.426f, -1.4f)
                lineTo(2.744f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(8.32f)
                lineToRelative(-0.015f, -0.014f)
                lineTo(8.7f, 19.062f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.4f, 1.425f)
                lineToRelative(2.278f, 2.239f)
                curveToRelative(0.163f, 0.163f, 0.413f, 0.391f, 0.675f, 0.624f)
                arcToRelative(2.587f, 2.587f, 0.0f, false, false, 3.43f, 0.0f)
                curveToRelative(0.262f, -0.233f, 0.511f, -0.46f, 0.669f, -0.619f)
                lineToRelative(2.284f, -2.244f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.4f, -1.425f)
                lineTo(13.0f, 21.256f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(8.256f)
                lineToRelative(-2.2f, 2.233f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.426f, 1.4f)
                lineToRelative(2.239f, -2.279f)
                curveToRelative(0.163f, -0.163f, 0.391f, -0.413f, 0.624f, -0.675f)
                arcTo(2.589f, 2.589f, 0.0f, false, false, 23.351f, 10.253f)
                close()
            }
        }
        .build()
        return _arrows!!
    }

private var _arrows: ImageVector? = null
