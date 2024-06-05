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

public val Icons.Bold.Poo: ImageVector
    get() {
        if (_poo != null) {
            return _poo!!
        }
        _poo = Builder(name = "Poo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 12.0f)
                close()
                moveTo(15.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 14.0f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(6.946f, 6.946f, 0.0f, false, true, -3.6f, -1.2f)
                lineTo(6.6f, 17.2f)
                arcToRelative(9.192f, 9.192f, 0.0f, false, false, 10.792f, 0.0f)
                lineToRelative(-1.786f, -2.41f)
                arcTo(6.952f, 6.952f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(24.0f, 18.177f)
                arcTo(5.83f, 5.83f, 0.0f, false, true, 18.176f, 24.0f)
                lineTo(5.824f, 24.0f)
                arcToRelative(5.856f, 5.856f, 0.0f, false, true, -4.686f, -9.275f)
                arcTo(5.48f, 5.48f, 0.0f, false, true, 3.009f, 9.271f)
                arcTo(5.007f, 5.007f, 0.0f, false, true, 8.0f, 4.0f)
                lineTo(9.264f, 4.0f)
                arcTo(3.79f, 3.79f, 0.0f, false, false, 10.0f, 1.5f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.185f, 0.0f, 4.24f, 1.946f, 5.1f, 4.035f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, true, 4.394f, 5.236f)
                arcToRelative(5.481f, 5.481f, 0.0f, false, true, 1.871f, 5.454f)
                arcTo(5.75f, 5.75f, 0.0f, false, true, 24.0f, 18.177f)
                close()
                moveTo(21.0f, 18.177f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.865f, -2.027f)
                lineToRelative(-0.743f, -0.718f)
                lineToRelative(0.406f, -0.951f)
                arcTo(2.485f, 2.485f, 0.0f, false, false, 18.649f, 11.3f)
                lineToRelative(-1.086f, -0.57f)
                lineToRelative(0.343f, -1.177f)
                arcTo(1.985f, 1.985f, 0.0f, false, false, 16.0f, 7.0f)
                lineTo(14.208f, 7.0f)
                lineTo(14.0f, 5.753f)
                arcToRelative(4.052f, 4.052f, 0.0f, false, false, -1.262f, -2.1f)
                arcToRelative(5.549f, 5.549f, 0.0f, false, true, -1.967f, 3.036f)
                lineToRelative(-0.4f, 0.311f)
                lineTo(8.0f, 7.0f)
                arcTo(1.985f, 1.985f, 0.0f, false, false, 6.094f, 9.553f)
                lineToRelative(0.343f, 1.177f)
                lineToRelative(-1.086f, 0.57f)
                arcTo(2.485f, 2.485f, 0.0f, false, false, 4.2f, 14.481f)
                lineToRelative(0.406f, 0.951f)
                lineToRelative(-0.743f, 0.718f)
                arcTo(2.836f, 2.836f, 0.0f, false, false, 5.824f, 21.0f)
                lineTo(18.176f, 21.0f)
                arcTo(2.827f, 2.827f, 0.0f, false, false, 21.0f, 18.177f)
                close()
            }
        }
        .build()
        return _poo!!
    }

private var _poo: ImageVector? = null
