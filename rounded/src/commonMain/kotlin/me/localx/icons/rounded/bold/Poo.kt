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
                moveTo(11.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 12.0f)
                close()
                moveTo(15.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 10.0f)
                close()
                moveTo(16.332f, 17.748f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.655f, -2.5f)
                arcTo(5.48f, 5.48f, 0.0f, false, true, 12.0f, 16.0f)
                arcToRelative(5.485f, 5.485f, 0.0f, false, true, -2.668f, -0.748f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.664f, 2.5f)
                arcTo(8.336f, 8.336f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(8.336f, 8.336f, 0.0f, false, false, 16.332f, 17.748f)
                close()
                moveTo(24.0f, 18.177f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -1.138f, -3.452f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, false, -1.871f, -5.454f)
                arcTo(5.01f, 5.01f, 0.0f, false, false, 16.6f, 4.035f)
                curveTo(15.74f, 1.946f, 13.685f, 0.0f, 11.5f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 1.5f)
                arcTo(3.79f, 3.79f, 0.0f, false, true, 9.264f, 4.0f)
                lineTo(8.0f, 4.0f)
                arcTo(5.007f, 5.007f, 0.0f, false, false, 3.009f, 9.271f)
                arcToRelative(5.481f, 5.481f, 0.0f, false, false, -1.871f, 5.454f)
                arcTo(5.856f, 5.856f, 0.0f, false, false, 5.824f, 24.0f)
                lineTo(18.176f, 24.0f)
                arcTo(5.83f, 5.83f, 0.0f, false, false, 24.0f, 18.177f)
                close()
                moveTo(9.852f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.914f, -0.311f)
                arcToRelative(5.549f, 5.549f, 0.0f, false, false, 1.967f, -3.036f)
                arcTo(4.052f, 4.052f, 0.0f, false, true, 14.0f, 5.753f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.473f, 7.0f)
                lineTo(16.0f, 7.0f)
                arcToRelative(1.985f, 1.985f, 0.0f, false, true, 1.906f, 2.553f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.743f, 1.747f)
                arcTo(2.485f, 2.485f, 0.0f, false, true, 19.8f, 14.481f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.337f, 1.669f)
                arcTo(2.836f, 2.836f, 0.0f, false, true, 18.176f, 21.0f)
                lineTo(5.824f, 21.0f)
                arcToRelative(2.836f, 2.836f, 0.0f, false, true, -1.959f, -4.85f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.2f, 14.481f)
                arcTo(2.485f, 2.485f, 0.0f, false, true, 5.351f, 11.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.743f, -1.747f)
                arcTo(1.985f, 1.985f, 0.0f, false, true, 8.0f, 7.0f)
                close()
            }
        }
        .build()
        return _poo!!
    }

private var _poo: ImageVector? = null
