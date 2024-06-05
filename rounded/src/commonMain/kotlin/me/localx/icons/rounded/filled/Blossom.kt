package me.localx.icons.rounded.filled

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

public val Icons.Filled.Blossom: ImageVector
    get() {
        if (_blossom != null) {
            return _blossom!!
        }
        _blossom = Builder(name = "Blossom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.339f, 2.975f)
                curveToRelative(0.636f, -0.859f, 2.623f, -1.536f, 4.044f, -1.928f)
                arcTo(1.272f, 1.272f, 0.0f, false, true, 22.0f, 2.252f)
                curveToRelative(0.028f, 1.493f, -0.056f, 3.629f, -0.7f, 4.492f)
                arcToRelative(3.076f, 3.076f, 0.0f, false, true, -4.341f, 0.628f)
                arcTo(3.169f, 3.169f, 0.0f, false, true, 16.339f, 2.975f)
                close()
                moveTo(16.52f, 19.053f)
                arcTo(3.992f, 3.992f, 0.0f, false, true, 20.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(14.3f, 21.0f)
                arcToRelative(4.246f, 4.246f, 0.0f, false, true, 0.487f, 0.649f)
                arcToRelative(1.517f, 1.517f, 0.0f, false, true, 0.008f, 1.544f)
                arcTo(1.594f, 1.594f, 0.0f, false, true, 13.411f, 24.0f)
                lineTo(10.589f, 24.0f)
                arcToRelative(1.594f, 1.594f, 0.0f, false, true, -1.382f, -0.807f)
                arcToRelative(1.517f, 1.517f, 0.0f, false, true, 0.008f, -1.544f)
                arcToRelative(4.826f, 4.826f, 0.0f, false, true, 0.991f, -1.16f)
                curveTo(6.635f, 19.278f, 0.0f, 16.12f, 0.0f, 12.077f)
                arcTo(3.04f, 3.04f, 0.0f, false, true, 3.082f, 9.0f)
                lineTo(20.918f, 9.0f)
                arcTo(3.04f, 3.04f, 0.0f, false, true, 24.0f, 12.077f)
                curveTo(24.0f, 15.336f, 19.921f, 17.7f, 16.52f, 19.053f)
                close()
                moveTo(16.232f, 13.029f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.2f, 0.739f)
                arcTo(11.727f, 11.727f, 0.0f, false, true, 12.0f, 18.622f)
                arcToRelative(11.727f, 11.727f, 0.0f, false, true, -3.027f, -4.854f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.947f, 0.461f)
                curveToRelative(0.029f, 0.123f, 0.5f, 2.892f, 4.168f, 6.385f)
                arcTo(1.307f, 1.307f, 0.0f, false, false, 12.0f, 21.0f)
                curveToRelative(0.41f, 0.0f, 1.325f, -0.871f, 1.325f, -0.871f)
                arcToRelative(16.179f, 16.179f, 0.0f, false, false, 3.649f, -5.9f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.232f, 13.029f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(3.283f, 3.283f, 0.0f, false, false, 3.283f, -3.283f)
                curveToRelative(0.0f, -1.129f, -1.272f, -2.972f, -2.232f, -4.2f)
                arcToRelative(1.333f, 1.333f, 0.0f, false, false, -2.1f, 0.0f)
                curveToRelative(-0.96f, 1.232f, -2.232f, 3.075f, -2.232f, 4.2f)
                arcTo(3.283f, 3.283f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(7.041f, 7.372f)
                arcToRelative(3.169f, 3.169f, 0.0f, false, false, 0.62f, -4.4f)
                curveToRelative(-0.636f, -0.859f, -2.623f, -1.536f, -4.044f, -1.928f)
                arcToRelative(1.272f, 1.272f, 0.0f, false, false, -1.612f, 1.2f)
                curveToRelative(-0.028f, 1.493f, 0.056f, 3.629f, 0.7f, 4.492f)
                arcTo(3.076f, 3.076f, 0.0f, false, false, 7.041f, 7.372f)
                close()
            }
        }
        .build()
        return _blossom!!
    }

private var _blossom: ImageVector? = null
