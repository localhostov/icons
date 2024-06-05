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

public val Icons.Filled.FolderFire: ImageVector
    get() {
        if (_folderFire != null) {
            return _folderFire!!
        }
        _folderFire = Builder(name = "FolderFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.899f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(2.528f)
                curveToRelative(0.463f, 0.0f, 0.927f, 0.109f, 1.341f, 0.316f)
                lineToRelative(3.156f, 1.578f)
                curveToRelative(0.138f, 0.069f, 0.293f, 0.105f, 0.447f, 0.105f)
                horizontalLineToRelative(6.528f)
                curveToRelative(2.414f, 0.0f, 4.434f, 1.721f, 4.899f, 4.0f)
                close()
                moveTo(23.121f, 20.928f)
                curveToRelative(-1.157f, 1.916f, -3.25f, 3.196f, -5.484f, 3.063f)
                curveToRelative(-3.145f, -0.188f, -5.637f, -2.797f, -5.637f, -5.989f)
                curveToRelative(0.0f, -1.139f, 0.882f, -3.11f, 1.465f, -4.139f)
                curveToRelative(0.32f, -0.566f, 0.812f, -0.498f, 1.062f, 0.103f)
                curveToRelative(0.208f, 0.501f, 0.428f, 2.035f, 1.104f, 2.035f)
                curveToRelative(1.82f, 0.0f, 1.433f, -3.302f, 2.37f, -5.492f)
                curveToRelative(0.234f, -0.548f, 0.637f, -0.61f, 1.083f, -0.215f)
                curveToRelative(2.6f, 2.303f, 6.736f, 6.168f, 4.038f, 10.636f)
                close()
                moveTo(19.327f, 18.498f)
                lineToRelative(-0.769f, -1.097f)
                curveToRelative(-0.308f, -0.308f, -0.807f, -0.308f, -1.115f, 0.0f)
                lineToRelative(-0.77f, 1.096f)
                curveToRelative(-0.754f, 0.754f, -0.889f, 1.99f, -0.195f, 2.8f)
                curveToRelative(0.802f, 0.937f, 2.242f, 0.937f, 3.044f, 0.0f)
                curveToRelative(0.693f, -0.809f, 0.559f, -2.046f, -0.195f, -2.8f)
                close()
                moveTo(0.0f, 17.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.083f)
                curveToRelative(-0.684f, -1.181f, -1.083f, -2.545f, -1.083f, -3.999f)
                curveToRelative(0.0f, -2.019f, 1.548f, -4.812f, 1.724f, -5.124f)
                curveToRelative(0.528f, -0.935f, 1.429f, -1.456f, 2.399f, -1.399f)
                curveToRelative(0.513f, 0.031f, 0.987f, 0.22f, 1.383f, 0.537f)
                curveToRelative(0.147f, -0.749f, 0.334f, -1.544f, 0.655f, -2.293f)
                curveToRelative(0.498f, -1.163f, 1.374f, -1.503f, 1.847f, -1.623f)
                curveToRelative(0.183f, -0.046f, 0.375f, -0.088f, 0.585f, -0.099f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(18.77f, 8.0f)
                curveToRelative(0.423f, 0.023f, 0.934f, 0.204f, 1.638f, 0.794f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.951f, 0.844f, 2.401f, 2.138f, 3.591f, 3.758f)
                verticalLineToRelative(-4.552f)
                horizontalLineToRelative(-5.23f)
                close()
            }
        }
        .build()
        return _folderFire!!
    }

private var _folderFire: ImageVector? = null
