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

public val Icons.Outline.Skating: ImageVector
    get() {
        if (_skating != null) {
            return _skating!!
        }
        _skating = Builder(name = "Skating", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.707f, 16.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineTo(5.685f, 21.5f)
                lineToRelative(0.2f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.415f, 0.014f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.429f)
                arcTo(3.007f, 3.007f, 0.0f, false, true, 4.457f, 23.1f)
                lineToRelative(-2.8f, -2.857f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.427f, -1.4f)
                lineToRelative(1.2f, 1.225f)
                lineTo(8.293f, 16.06f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.707f, 16.06f)
                close()
                moveTo(20.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(13.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 18.274f)
                lineToRelative(-4.94f, -4.693f)
                arcTo(3.35f, 3.35f, 0.0f, false, true, 10.0f, 8.784f)
                lineTo(12.781f, 6.0f)
                lineTo(5.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 4.0f)
                horizontalLineToRelative(8.144f)
                arcTo(5.007f, 5.007f, 0.0f, false, true, 16.35f, 5.163f)
                lineToRelative(0.671f, 0.56f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.1f, 4.337f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-3.831f, 3.83f)
                lineToRelative(3.4f, 3.229f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.311f, 0.725f)
                lineTo(17.001f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(11.017f, 11.169f)
                arcToRelative(1.337f, 1.337f, 0.0f, false, false, 0.42f, 0.961f)
                lineToRelative(0.4f, 0.383f)
                lineToRelative(3.865f, -3.865f)
                verticalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.016f, -1.432f)
                lineTo(15.068f, 6.7f)
                curveToRelative(-0.029f, -0.024f, -0.063f, -0.041f, -0.092f, -0.064f)
                lineTo(11.411f, 10.2f)
                arcTo(1.345f, 1.345f, 0.0f, false, false, 11.017f, 11.169f)
                close()
                moveTo(19.5f, -0.045f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 2.5f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.5f, -0.045f)
                close()
            }
        }
        .build()
        return _skating!!
    }

private var _skating: ImageVector? = null
