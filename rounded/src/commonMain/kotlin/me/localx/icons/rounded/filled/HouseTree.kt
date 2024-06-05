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

public val Icons.Filled.HouseTree: ImageVector
    get() {
        if (_houseTree != null) {
            return _houseTree!!
        }
        _houseTree = Builder(name = "HouseTree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.082f, 11.41f)
                lineToRelative(-3.0f, -2.349f)
                curveToRelative(-1.814f, -1.418f, -4.349f, -1.42f, -6.163f, 0.0f)
                lineToRelative(-3.0f, 2.348f)
                curveToRelative(-1.219f, 0.955f, -1.918f, 2.39f, -1.918f, 3.938f)
                verticalLineToRelative(4.152f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-4.152f)
                curveToRelative(0.0f, -1.548f, -0.699f, -2.982f, -1.918f, -3.938f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.604f, 22.253f)
                curveToRelative(-0.577f, 1.077f, -1.695f, 1.747f, -2.917f, 1.747f)
                horizontalLineToRelative(-4.508f)
                curveToRelative(1.125f, -1.169f, 1.821f, -2.754f, 1.821f, -4.5f)
                verticalLineToRelative(-4.152f)
                curveToRelative(0.0f, -2.166f, -0.979f, -4.175f, -2.685f, -5.512f)
                lineToRelative(-3.002f, -2.351f)
                curveToRelative(-1.015f, -0.793f, -2.191f, -1.254f, -3.398f, -1.414f)
                curveToRelative(0.057f, -0.167f, 0.128f, -0.33f, 0.226f, -0.483f)
                curveToRelative(0.024f, -0.038f, 4.133f, -4.835f, 4.133f, -4.835f)
                curveToRelative(0.99f, -1.01f, 2.51f, -0.957f, 3.404f, -0.053f)
                curveToRelative(0.0f, 0.0f, 4.157f, 4.851f, 4.181f, 4.889f)
                curveToRelative(0.439f, 0.681f, 0.483f, 1.552f, 0.084f, 2.256f)
                curveToRelative(-0.327f, 0.577f, -0.981f, 0.904f, -0.981f, 0.904f)
                lineToRelative(2.666f, 3.895f)
                curveToRelative(0.404f, 0.598f, 0.44f, 1.465f, 0.061f, 2.188f)
                curveToRelative(-0.361f, 0.687f, -1.092f, 1.053f, -1.092f, 1.053f)
                lineToRelative(1.878f, 3.022f)
                curveToRelative(0.646f, 1.011f, 0.698f, 2.287f, 0.13f, 3.347f)
                close()
            }
        }
        .build()
        return _houseTree!!
    }

private var _houseTree: ImageVector? = null
