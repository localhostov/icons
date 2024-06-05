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

public val Icons.Bold.GrinBeam: ImageVector
    get() {
        if (_grinBeam != null) {
            return _grinBeam!!
        }
        _grinBeam = Builder(name = "GrinBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.467f, -1.193f)
                curveToRelative(-0.01f, -0.046f, -0.02f, -0.091f, -0.032f, -0.134f)
                curveToRelative(-0.012f, 0.043f, -0.022f, 0.088f, -0.032f, 0.134f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.936f, -0.614f)
                curveToRelative(0.888f, -4.217f, 5.051f, -4.212f, 5.936f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 12.0f)
                close()
                moveTo(17.808f, 11.968f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.161f, -1.775f)
                curveToRelative(-0.888f, -4.217f, -5.051f, -4.212f, -5.936f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.936f, 0.614f)
                curveToRelative(0.01f, -0.046f, 0.02f, -0.091f, 0.032f, -0.134f)
                curveToRelative(0.012f, 0.043f, 0.022f, 0.088f, 0.032f, 0.134f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.775f, 1.161f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(-3.9f, 0.6f, -3.893f, 23.4f, 12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, true, -9.0f, 9.0f)
                curveTo(0.076f, 20.547f, 0.081f, 3.451f, 12.0f, 3.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, true, 21.0f, 12.0f)
                close()
                moveTo(16.789f, 14.024f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 7.2f, 14.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.052f, 1.518f)
                arcTo(6.836f, 6.836f, 0.0f, false, false, 12.0f, 19.0f)
                arcToRelative(6.827f, 6.827f, 0.0f, false, false, 5.842f, -3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.789f, 14.024f)
                close()
            }
        }
        .build()
        return _grinBeam!!
    }

private var _grinBeam: ImageVector? = null
