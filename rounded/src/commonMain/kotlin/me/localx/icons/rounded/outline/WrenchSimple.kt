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

public val Icons.Outline.WrenchSimple: ImageVector
    get() {
        if (_wrenchSimple != null) {
            return _wrenchSimple!!
        }
        _wrenchSimple = Builder(name = "WrenchSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 24.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.398f)
                curveToRelative(0.0f, -1.505f, 0.805f, -2.853f, 2.1f, -3.516f)
                curveToRelative(3.022f, -1.55f, 4.9f, -4.62f, 4.9f, -8.013f)
                curveToRelative(0.0f, -3.455f, -1.928f, -6.55f, -5.03f, -8.078f)
                lineToRelative(0.03f, 6.005f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineTo(2.012f)
                curveTo(4.928f, 3.523f, 3.0f, 6.618f, 3.0f, 10.073f)
                curveToRelative(0.0f, 3.393f, 1.878f, 6.463f, 4.9f, 8.013f)
                curveToRelative(1.295f, 0.663f, 2.1f, 2.011f, 2.1f, 3.516f)
                verticalLineToRelative(1.398f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.398f)
                curveToRelative(0.0f, -0.739f, -0.397f, -1.421f, -1.012f, -1.736f)
                curveToRelative(-3.693f, -1.894f, -5.988f, -5.646f, -5.988f, -9.792f)
                curveTo(1.0f, 5.852f, 3.355f, 2.068f, 7.146f, 0.2f)
                curveToRelative(0.61f, -0.3f, 1.321f, -0.263f, 1.901f, 0.101f)
                curveToRelative(0.597f, 0.371f, 0.953f, 1.011f, 0.953f, 1.711f)
                verticalLineToRelative(5.988f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(2.012f)
                curveToRelative(0.0f, -0.7f, 0.356f, -1.34f, 0.953f, -1.711f)
                curveToRelative(0.581f, -0.362f, 1.293f, -0.399f, 1.9f, -0.101f)
                curveToRelative(3.791f, 1.868f, 6.146f, 5.651f, 6.146f, 9.873f)
                curveToRelative(0.0f, 4.146f, -2.295f, 7.898f, -5.988f, 9.792f)
                curveToRelative(-0.614f, 0.315f, -1.012f, 0.997f, -1.012f, 1.736f)
                verticalLineToRelative(1.398f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _wrenchSimple!!
    }

private var _wrenchSimple: ImageVector? = null
