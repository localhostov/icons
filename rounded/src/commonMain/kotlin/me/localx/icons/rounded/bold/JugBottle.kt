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

public val Icons.Bold.JugBottle: ImageVector
    get() {
        if (_jugBottle != null) {
            return _jugBottle!!
        }
        _jugBottle = Builder(name = "JugBottle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 8.5f)
                reflectiveCurveToRelative(0.007f, 0.0f, 0.011f, 0.0f)
                curveToRelative(-0.006f, 0.0f, -0.04f, 0.002f, -0.011f, 0.0f)
                close()
                moveTo(22.0f, 9.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-8.357f)
                curveToRelative(0.0f, -2.28f, 1.434f, -4.35f, 3.569f, -5.15f)
                lineToRelative(0.431f, -0.162f)
                verticalLineToRelative(-1.917f)
                curveToRelative(-0.583f, -0.206f, -1.0f, -0.761f, -1.0f, -1.414f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.653f, -0.417f, 1.208f, -1.0f, 1.414f)
                verticalLineToRelative(1.711f)
                lineToRelative(4.329f, 0.812f)
                curveToRelative(1.845f, 0.346f, 3.671f, 2.062f, 3.671f, 4.062f)
                close()
                moveTo(18.971f, 18.881f)
                curveToRelative(-0.311f, 0.078f, -0.636f, 0.119f, -0.971f, 0.119f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.626f, 0.145f, -1.219f, 0.402f, -1.747f)
                lineToRelative(-2.179f, -0.408f)
                curveToRelative(-0.709f, -0.133f, -1.224f, -0.752f, -1.224f, -1.474f)
                verticalLineToRelative(-2.871f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.871f)
                curveToRelative(0.0f, 0.625f, -0.388f, 1.185f, -0.974f, 1.405f)
                lineToRelative(-1.404f, 0.526f)
                curveToRelative(-0.97f, 0.364f, -1.622f, 1.304f, -1.622f, 2.341f)
                verticalLineToRelative(8.357f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.249f, 0.0f, 2.287f, -0.921f, 2.471f, -2.119f)
                close()
                moveTo(19.0f, 9.5f)
                curveToRelative(0.0f, -0.594f, -0.493f, -0.989f, -0.989f, -1.0f)
                curveToRelative(0.002f, 0.0f, 0.0f, 0.0f, -0.011f, 0.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }
        .build()
        return _jugBottle!!
    }

private var _jugBottle: ImageVector? = null
