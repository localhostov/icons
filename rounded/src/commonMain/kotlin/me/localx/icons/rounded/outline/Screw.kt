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

public val Icons.Outline.Screw: ImageVector
    get() {
        if (_screw != null) {
            return _screw!!
        }
        _screw = Builder(name = "Screw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.232f, 0.0f)
                horizontalLineToRelative(-6.465f)
                curveToRelative(-1.526f, 0.0f, -2.768f, 1.242f, -2.768f, 2.768f)
                curveToRelative(0.0f, 0.739f, 0.288f, 1.435f, 0.811f, 1.957f)
                lineToRelative(2.189f, 2.189f)
                reflectiveCurveToRelative(-0.027f, 12.36f, 0.007f, 12.503f)
                curveToRelative(0.019f, 1.307f, 0.531f, 2.535f, 1.457f, 3.461f)
                lineToRelative(0.829f, 0.829f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(0.829f, -0.829f)
                curveToRelative(0.944f, -0.944f, 1.464f, -2.2f, 1.464f, -3.535f)
                lineTo(14.999f, 6.914f)
                lineToRelative(2.189f, -2.189f)
                curveToRelative(0.523f, -0.522f, 0.811f, -1.218f, 0.811f, -1.957f)
                curveToRelative(0.0f, -1.526f, -1.242f, -2.768f, -2.768f, -2.768f)
                close()
                moveTo(13.0f, 19.343f)
                curveToRelative(0.0f, 0.79f, -0.32f, 1.562f, -0.878f, 2.121f)
                lineToRelative(-0.122f, 0.122f)
                lineToRelative(-0.122f, -0.122f)
                curveToRelative(-0.514f, -0.514f, -0.813f, -1.211f, -0.86f, -1.934f)
                lineToRelative(1.981f, -2.053f)
                verticalLineToRelative(1.867f)
                close()
                moveTo(13.0f, 14.596f)
                lineToRelative(-2.0f, 2.073f)
                verticalLineToRelative(-2.755f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(2.682f)
                close()
                moveTo(13.0f, 9.086f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(-4.086f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.086f)
                close()
                moveTo(15.775f, 3.311f)
                lineToRelative(-1.689f, 1.689f)
                horizontalLineToRelative(-4.172f)
                lineToRelative(-1.689f, -1.689f)
                curveToRelative(-0.145f, -0.145f, -0.225f, -0.338f, -0.225f, -0.543f)
                curveToRelative(0.0f, -0.423f, 0.344f, -0.768f, 0.768f, -0.768f)
                horizontalLineToRelative(6.465f)
                curveToRelative(0.423f, 0.0f, 0.768f, 0.344f, 0.768f, 0.768f)
                curveToRelative(0.0f, 0.205f, -0.08f, 0.398f, -0.225f, 0.543f)
                close()
            }
        }
        .build()
        return _screw!!
    }

private var _screw: ImageVector? = null
