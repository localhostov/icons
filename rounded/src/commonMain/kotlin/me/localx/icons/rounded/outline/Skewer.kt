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

public val Icons.Outline.Skewer: ImageVector
    get() {
        if (_skewer != null) {
            return _skewer!!
        }
        _skewer = Builder(name = "Skewer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.7f, 0.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(19.5f, 3.086f)
                lineTo(17.7f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.413f, 1.414f)
                lineTo(18.084f, 4.5f)
                lineTo(16.5f, 6.086f)
                lineTo(14.706f, 4.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.413f, 1.414f)
                lineTo(15.085f, 7.5f)
                lineTo(13.873f, 8.713f)
                curveToRelative(-3.54f, -4.385f, -6.308f, 0.58f, -4.07f, 4.071f)
                lineTo(8.514f, 14.073f)
                lineTo(6.722f, 12.267f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 5.3f, 13.675f)
                lineToRelative(1.8f, 1.812f)
                curveToRelative(-1.016f, 0.982f, -1.235f, 1.563f, -3.241f, 1.538f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 2.117f, 5.949f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.563f, 21.56f)
                arcToRelative(1.506f, 1.506f, 0.0f, false, true, -2.376f, -1.789f)
                curveToRelative(0.108f, -0.184f, 0.44f, -0.746f, 1.672f, -0.746f)
                curveToRelative(2.5f, 0.024f, 3.333f, -0.753f, 4.649f, -2.118f)
                lineToRelative(1.783f, 1.8f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 11.71f, 17.3f)
                lineToRelative(-1.788f, -1.8f)
                lineToRelative(1.287f, -1.288f)
                curveToRelative(3.517f, 2.236f, 8.453f, -0.544f, 4.078f, -4.078f)
                lineTo(16.5f, 8.914f)
                lineToRelative(1.792f, 1.793f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.7f, 9.293f)
                lineTo(17.912f, 7.5f)
                lineTo(19.5f, 5.914f)
                lineTo(21.29f, 7.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.7f, 6.293f)
                lineTo(20.911f, 4.5f)
                lineTo(23.7f, 1.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.7f, 0.293f)
                close()
                moveTo(14.986f, 12.776f)
                arcToRelative(2.892f, 2.892f, 0.0f, false, true, -3.762f, -3.764f)
                arcToRelative(0.132f, 0.132f, 0.0f, false, true, 0.144f, 0.023f)
                lineToRelative(3.6f, 3.6f)
                arcTo(0.126f, 0.126f, 0.0f, false, true, 14.986f, 12.776f)
                close()
            }
        }
        .build()
        return _skewer!!
    }

private var _skewer: ImageVector? = null
