package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.16f, 11.6926f)
                lineTo(9.4f, 9.8656f)
                lineTo(7.24f, 11.9446f)
                lineTo(9.44f, 14.2316f)
                curveTo(9.6558f, 14.46f, 9.915f, 14.6432f, 10.2024f, 14.7702f)
                curveTo(10.4898f, 14.8973f, 10.7997f, 14.9657f, 11.114f, 14.9716f)
                horizontalLineTo(11.151f)
                curveTo(11.7739f, 14.9698f, 12.371f, 14.7226f, 12.813f, 14.2836f)
                lineTo(17.834f, 9.2606f)
                lineTo(15.712f, 7.1406f)
                lineTo(11.16f, 11.6926f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.922f, 23.9994f)
                lineTo(11.391f, 23.7624f)
                curveTo(11.007f, 23.5884f, 2.0f, 19.4994f, 2.0f, 11.9994f)
                verticalLineTo(5.5244f)
                curveTo(2.0001f, 4.8947f, 2.1983f, 4.281f, 2.5666f, 3.7702f)
                curveTo(2.9349f, 3.2594f, 3.4546f, 2.8774f, 4.052f, 2.6784f)
                lineTo(12.0f, 0.0294f)
                lineTo(19.949f, 2.6794f)
                curveTo(20.5466f, 2.8777f, 21.0665f, 3.2594f, 21.4347f, 3.7702f)
                curveTo(21.8029f, 4.2809f, 22.0007f, 4.8948f, 22.0f, 5.5244f)
                verticalLineTo(11.9994f)
                curveTo(22.0f, 20.5384f, 12.863f, 23.6814f, 12.474f, 23.8114f)
                lineTo(11.922f, 23.9994f)
                close()
                moveTo(12.0f, 3.1914f)
                lineTo(5.0f, 5.5244f)
                verticalLineTo(11.9994f)
                curveTo(5.0f, 16.6694f, 10.344f, 19.8464f, 12.077f, 20.7524f)
                curveTo(13.819f, 20.0254f, 19.0f, 17.4074f, 19.0f, 11.9994f)
                verticalLineTo(5.5244f)
                lineTo(12.0f, 3.1914f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
