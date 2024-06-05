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

public val Icons.Bold.ScalpelPath: ImageVector
    get() {
        if (_scalpelPath != null) {
            return _scalpelPath!!
        }
        _scalpelPath = Builder(name = "ScalpelPath", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.753f, 6.927f)
                curveToRelative(1.495f, -1.491f, 1.659f, -3.888f, 0.375f, -5.455f)
                curveTo(22.41f, 0.596f, 21.353f, 0.062f, 20.226f, 0.005f)
                curveToRelative(-1.128f, -0.053f, -2.232f, 0.368f, -3.031f, 1.165f)
                lineTo(0.762f, 17.564f)
                curveToRelative(-0.491f, 0.491f, -0.762f, 1.144f, -0.762f, 1.837f)
                reflectiveCurveToRelative(0.272f, 1.35f, 0.765f, 1.84f)
                curveToRelative(0.492f, 0.49f, 1.144f, 0.759f, 1.835f, 0.759f)
                horizontalLineToRelative(0.013f)
                curveToRelative(0.341f, 0.0f, 0.69f, -0.007f, 0.949f, -0.016f)
                curveToRelative(1.957f, -0.078f, 3.799f, -0.46f, 5.476f, -1.135f)
                curveToRelative(2.367f, -0.954f, 4.18f, -2.873f, 5.055f, -5.28f)
                lineToRelative(8.661f, -8.643f)
                close()
                moveTo(7.916f, 18.067f)
                curveToRelative(-1.316f, 0.53f, -2.772f, 0.838f, -4.326f, 0.914f)
                lineToRelative(6.179f, -6.165f)
                lineToRelative(1.587f, 1.479f)
                curveToRelative(-0.554f, 1.713f, -1.821f, 3.12f, -3.439f, 3.772f)
                close()
                moveTo(11.894f, 10.696f)
                lineToRelative(7.419f, -7.401f)
                curveToRelative(0.204f, -0.203f, 0.468f, -0.312f, 0.763f, -0.293f)
                curveToRelative(0.166f, 0.009f, 0.482f, 0.068f, 0.732f, 0.373f)
                curveToRelative(0.312f, 0.381f, 0.234f, 1.022f, -0.174f, 1.43f)
                lineToRelative(-7.273f, 7.258f)
                lineToRelative(-1.467f, -1.366f)
                close()
                moveTo(17.0f, 22.501f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 22.501f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _scalpelPath!!
    }

private var _scalpelPath: ImageVector? = null
