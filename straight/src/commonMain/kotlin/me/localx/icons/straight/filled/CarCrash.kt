package me.localx.icons.straight.filled

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

public val Icons.Filled.CarCrash: ImageVector
    get() {
        if (_carCrash != null) {
            return _carCrash!!
        }
        _carCrash = Builder(name = "CarCrash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(-0.081f, 11.0f)
                lineToRelative(2.8f, -3.5f)
                lineTo(-0.081f, 4.0f)
                lineTo(4.0f, 4.0f)
                lineTo(4.0f, -0.032f)
                lineTo(7.5f, 2.723f)
                lineTo(11.0f, -0.081f)
                lineTo(11.0f, 3.053f)
                lineTo(6.923f, 6.693f)
                arcTo(14.064f, 14.064f, 0.0f, false, false, 3.69f, 11.0f)
                close()
                moveTo(23.978f, 15.187f)
                curveToRelative(0.0f, -0.278f, 0.0f, -0.556f, -0.022f, -0.833f)
                lineTo(23.52f, 9.262f)
                arcToRelative(2.984f, 2.984f, 0.0f, false, false, -1.891f, -2.535f)
                lineToRelative(-6.455f, -2.5f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, false, -3.106f, 0.55f)
                lineTo(8.256f, 8.185f)
                curveToRelative(-0.21f, 0.187f, -0.4f, 0.4f, -0.6f, 0.6f)
                close()
                moveTo(23.839f, 17.28f)
                arcToRelative(12.018f, 12.018f, 0.0f, false, true, -0.687f, 2.53f)
                lineTo(21.9f, 22.969f)
                lineToRelative(-1.861f, -0.732f)
                lineTo(19.3f, 24.092f)
                lineToRelative(-4.648f, -1.845f)
                lineToRelative(0.731f, -1.839f)
                lineToRelative(-5.028f, -1.976f)
                lineToRelative(-0.747f, 1.88f)
                lineTo(4.96f, 18.465f)
                lineTo(5.7f, 16.6f)
                lineToRelative(-1.862f, -0.731f)
                lineTo(5.1f, 12.705f)
                arcToRelative(11.98f, 11.98f, 0.0f, false, true, 1.229f, -2.3f)
                close()
                moveTo(9.959f, 13.973f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -0.739f, 1.872f)
                arcTo(1.006f, 1.006f, 0.0f, false, false, 9.959f, 13.973f)
                close()
                moveTo(18.712f, 17.409f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -0.73f, 1.848f)
                arcTo(0.994f, 0.994f, 0.0f, false, false, 18.712f, 17.409f)
                close()
            }
        }
        .build()
        return _carCrash!!
    }

private var _carCrash: ImageVector? = null
