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

public val Icons.Outline.FishBones: ImageVector
    get() {
        if (_fishBones != null) {
            return _fishBones!!
        }
        _fishBones = Builder(name = "FishBones", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.5f, 19.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 7.0f)
                curveToRelative(0.0f, 1.178f, -0.78f, 2.0f, -1.898f, 2.0f)
                horizontalLineToRelative(-4.688f)
                lineToRelative(1.293f, 1.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.366f, 1.366f)
                lineToRelative(2.564f, 2.504f)
                curveToRelative(0.396f, 0.387f, 0.403f, 1.02f, 0.018f, 1.414f)
                curveToRelative(-0.196f, 0.201f, -0.456f, 0.302f, -0.716f, 0.302f)
                curveToRelative(-0.252f, 0.0f, -0.504f, -0.095f, -0.698f, -0.284f)
                lineToRelative(-2.582f, -2.521f)
                lineToRelative(-1.306f, 1.306f)
                lineToRelative(3.293f, 3.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(-0.751f, 0.751f)
                curveToRelative(0.856f, 1.006f, 1.555f, 2.149f, 2.054f, 3.39f)
                curveToRelative(0.288f, 0.718f, 0.259f, 1.522f, -0.08f, 2.209f)
                reflectiveCurveToRelative(-0.958f, 1.199f, -1.701f, 1.406f)
                curveToRelative(-1.528f, 0.428f, -3.32f, 0.697f, -5.478f, 0.823f)
                curveToRelative(-0.074f, 0.005f, -0.147f, 0.007f, -0.22f, 0.007f)
                curveToRelative(-1.008f, 0.0f, -1.982f, -0.402f, -2.702f, -1.122f)
                curveTo(0.35f, 22.105f, -0.057f, 21.041f, 0.006f, 19.956f)
                curveToRelative(0.126f, -2.153f, 0.395f, -3.945f, 0.824f, -5.479f)
                curveToRelative(0.208f, -0.743f, 0.721f, -1.363f, 1.408f, -1.701f)
                curveToRelative(0.687f, -0.339f, 1.491f, -0.368f, 2.207f, -0.079f)
                curveToRelative(1.241f, 0.499f, 2.384f, 1.197f, 3.39f, 2.054f)
                lineToRelative(0.751f, -0.751f)
                lineToRelative(-3.293f, -3.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(1.289f, -1.289f)
                lineToRelative(-2.565f, -2.504f)
                curveToRelative(-0.395f, -0.387f, -0.402f, -1.02f, -0.017f, -1.414f)
                curveToRelative(0.386f, -0.396f, 1.02f, -0.401f, 1.414f, -0.018f)
                lineToRelative(2.582f, 2.521f)
                lineToRelative(1.383f, -1.383f)
                lineToRelative(-1.793f, -1.793f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(1.293f, 1.293f)
                lineTo(15.0f, 1.898f)
                curveToRelative(0.0f, -1.118f, 0.822f, -1.898f, 2.0f, -1.898f)
                curveToRelative(1.423f, 0.0f, 3.447f, 0.989f, 3.905f, 3.095f)
                curveToRelative(2.105f, 0.458f, 3.095f, 2.482f, 3.095f, 3.905f)
                close()
                moveTo(9.447f, 20.3f)
                curveToRelative(-1.047f, -2.604f, -3.142f, -4.699f, -5.748f, -5.747f)
                curveToRelative(-0.191f, -0.077f, -0.397f, -0.069f, -0.577f, 0.018f)
                curveToRelative(-0.18f, 0.089f, -0.31f, 0.247f, -0.366f, 0.446f)
                curveToRelative(-0.389f, 1.394f, -0.636f, 3.047f, -0.752f, 5.057f)
                curveToRelative(-0.03f, 0.515f, 0.164f, 1.021f, 0.532f, 1.391f)
                reflectiveCurveToRelative(0.879f, 0.562f, 1.391f, 0.533f)
                curveToRelative(2.014f, -0.118f, 3.667f, -0.364f, 5.056f, -0.753f)
                curveToRelative(0.199f, -0.056f, 0.357f, -0.186f, 0.446f, -0.365f)
                curveToRelative(0.089f, -0.181f, 0.096f, -0.386f, 0.018f, -0.579f)
                close()
                moveTo(22.0f, 7.0f)
                curveToRelative(0.0f, -0.02f, -0.117f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.858f, -1.931f, -1.997f, -1.998f, -2.0f)
                lineToRelative(-0.002f, 5.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _fishBones!!
    }

private var _fishBones: ImageVector? = null
