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

public val Icons.Bold.FishCooked: ImageVector
    get() {
        if (_fishCooked != null) {
            return _fishCooked!!
        }
        _fishCooked = Builder(name = "FishCooked", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.143f, 3.857f)
                curveToRelative(0.0f, -2.858f, -2.571f, -3.857f, -3.857f, -3.857f)
                curveToRelative(-0.771f, 0.0f, -1.286f, 0.384f, -1.286f, 1.155f)
                verticalLineToRelative(5.866f)
                lineToRelative(-0.97f, 0.01f)
                curveToRelative(-1.092f, 0.031f, -2.088f, 0.11f, -3.03f, 0.218f)
                curveToRelative(0.0f, -0.794f, 0.0f, -2.404f, 0.0f, -2.404f)
                curveToRelative(-3.123f, 0.0f, -5.586f, 1.005f, -6.915f, 1.699f)
                curveToRelative(-0.666f, 0.348f, -1.085f, 1.029f, -1.085f, 1.78f)
                verticalLineToRelative(2.302f)
                curveTo(0.833f, 13.033f, 0.0f, 16.821f, 0.0f, 22.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(8.345f, 0.0f, 12.599f, -1.812f, 14.399f, -7.0f)
                horizontalLineToRelative(1.115f)
                curveToRelative(0.971f, 0.0f, 1.798f, -0.704f, 1.952f, -1.662f)
                lineToRelative(0.378f, -2.338f)
                horizontalLineToRelative(-2.591f)
                curveToRelative(0.108f, -0.943f, 0.187f, -1.938f, 0.218f, -3.03f)
                lineToRelative(0.01f, -0.97f)
                horizontalLineToRelative(5.866f)
                curveToRelative(0.771f, 0.0f, 1.155f, -0.515f, 1.155f, -1.286f)
                curveToRelative(0.0f, -1.286f, -0.999f, -3.857f, -3.857f, -3.857f)
                close()
                moveTo(11.882f, 18.182f)
                curveToRelative(-0.032f, 0.039f, -0.681f, 0.687f, -0.719f, 0.719f)
                curveToRelative(-1.678f, 1.418f, -4.261f, 1.991f, -8.163f, 2.098f)
                curveToRelative(0.107f, -3.895f, 0.678f, -6.477f, 2.09f, -8.155f)
                curveToRelative(0.029f, -0.035f, 0.7f, -0.706f, 0.735f, -0.735f)
                curveToRelative(1.678f, -1.412f, 4.26f, -1.983f, 8.155f, -2.09f)
                curveToRelative(-0.107f, 3.902f, -0.68f, 6.485f, -2.098f, 8.163f)
                close()
                moveTo(4.439f, 16.56f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(10.939f, 16.06f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _fishCooked!!
    }

private var _fishCooked: ImageVector? = null
