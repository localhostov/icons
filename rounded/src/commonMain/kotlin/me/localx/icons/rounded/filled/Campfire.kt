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

public val Icons.Filled.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.939f, 23.342f)
                curveToRelative(-0.147f, 0.406f, -0.531f, 0.659f, -0.939f, 0.659f)
                curveToRelative(-0.113f, 0.0f, -0.229f, -0.02f, -0.342f, -0.061f)
                lineToRelative(-10.658f, -3.876f)
                lineToRelative(-10.658f, 3.876f)
                curveToRelative(-0.113f, 0.041f, -0.229f, 0.061f, -0.342f, 0.061f)
                curveToRelative(-0.408f, 0.0f, -0.792f, -0.252f, -0.939f, -0.659f)
                curveToRelative(-0.189f, -0.519f, 0.079f, -1.093f, 0.598f, -1.282f)
                lineToRelative(8.415f, -3.06f)
                lineTo(0.658f, 15.94f)
                curveToRelative(-0.519f, -0.189f, -0.787f, -0.763f, -0.598f, -1.282f)
                curveToRelative(0.188f, -0.519f, 0.762f, -0.788f, 1.281f, -0.598f)
                lineToRelative(10.658f, 3.876f)
                lineToRelative(10.658f, -3.876f)
                curveToRelative(0.521f, -0.19f, 1.093f, 0.08f, 1.281f, 0.598f)
                curveToRelative(0.189f, 0.519f, -0.079f, 1.093f, -0.598f, 1.282f)
                lineToRelative(-8.415f, 3.06f)
                lineToRelative(8.415f, 3.06f)
                curveToRelative(0.519f, 0.189f, 0.787f, 0.763f, 0.598f, 1.282f)
                close()
                moveTo(12.51f, 0.211f)
                curveToRelative(2.391f, 2.133f, 6.49f, 5.074f, 6.49f, 8.77f)
                curveToRelative(0.0f, 3.743f, -2.926f, 6.803f, -6.614f, 7.018f)
                curveToRelative(-3.083f, 0.181f, -5.763f, -1.832f, -6.949f, -4.683f)
                curveToRelative(-1.109f, -2.664f, 0.096f, -5.391f, 1.348f, -6.939f)
                curveToRelative(0.327f, -0.405f, 0.965f, -0.331f, 1.175f, 0.144f)
                curveToRelative(0.296f, 0.671f, 0.198f, 1.756f, 0.826f, 1.756f)
                curveToRelative(1.327f, 0.0f, 0.987f, -3.374f, 2.468f, -5.879f)
                curveToRelative(0.263f, -0.445f, 0.873f, -0.532f, 1.258f, -0.188f)
                horizontalLineToRelative(-0.001f)
                close()
                moveTo(13.896f, 12.96f)
                curveToRelative(0.878f, -1.025f, 0.708f, -2.591f, -0.246f, -3.545f)
                lineToRelative(-1.117f, -1.117f)
                curveToRelative(-0.311f, -0.311f, -0.816f, -0.311f, -1.127f, 0.0f)
                lineToRelative(-1.117f, 1.117f)
                curveToRelative(-0.954f, 0.954f, -1.125f, 2.521f, -0.246f, 3.545f)
                curveToRelative(1.016f, 1.185f, 2.839f, 1.185f, 3.855f, 0.0f)
                horizontalLineToRelative(-0.001f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
