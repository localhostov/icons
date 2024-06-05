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

public val Icons.Outline.FaceExplode: ImageVector
    get() {
        if (_faceExplode != null) {
            return _faceExplode!!
        }
        _faceExplode = Builder(name = "FaceExplode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 10.549f)
                verticalLineToRelative(1.086f)
                curveToRelative(0.0f, 6.698f, -5.283f, 12.245f, -11.776f, 12.363f)
                curveToRelative(-0.076f, 0.0f, -0.152f, 0.002f, -0.227f, 0.002f)
                curveToRelative(-3.165f, 0.0f, -6.141f, -1.215f, -8.403f, -3.437f)
                curveTo(1.276f, 18.288f, 0.0f, 15.247f, 0.0f, 12.0f)
                verticalLineToRelative(-1.499f)
                curveToRelative(0.0f, -0.599f, 0.358f, -1.138f, 0.912f, -1.372f)
                curveToRelative(0.545f, -0.23f, 1.169f, -0.116f, 1.59f, 0.292f)
                curveToRelative(0.572f, 0.555f, 1.489f, 0.579f, 1.498f, 0.579f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.523f, -0.154f, -0.774f, -0.316f, -0.894f)
                curveToRelative(-0.656f, 0.598f, -1.385f, 0.894f, -2.184f, 0.894f)
                curveToRelative(-1.064f, 0.0f, -2.059f, -0.476f, -2.727f, -1.306f)
                curveToRelative(-0.668f, -0.829f, -0.919f, -1.912f, -0.689f, -2.97f)
                curveToRelative(0.247f, -1.132f, 1.088f, -2.091f, 2.197f, -2.502f)
                curveToRelative(0.658f, -0.245f, 1.332f, -0.287f, 1.987f, -0.135f)
                curveTo(8.515f, -0.08f, 10.517f, -0.322f, 12.0f, 0.546f)
                curveToRelative(1.485f, -0.869f, 3.486f, -0.627f, 4.732f, 0.543f)
                curveToRelative(1.324f, -0.31f, 2.712f, 0.202f, 3.539f, 1.272f)
                curveToRelative(0.669f, 0.866f, 0.891f, 1.983f, 0.609f, 3.064f)
                curveToRelative(-0.294f, 1.128f, -1.167f, 2.047f, -2.277f, 2.399f)
                curveToRelative(-1.07f, 0.339f, -2.239f, 0.061f, -3.219f, -0.745f)
                curveToRelative(-0.255f, 0.136f, -0.384f, 0.444f, -0.384f, 0.92f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4.5f)
                reflectiveCurveToRelative(0.899f, -0.021f, 1.476f, -0.559f)
                curveToRelative(0.435f, -0.406f, 1.068f, -0.515f, 1.617f, -0.275f)
                curveToRelative(0.551f, 0.239f, 0.907f, 0.782f, 0.907f, 1.383f)
                close()
                moveTo(22.0f, 11.493f)
                curveToRelative(-0.941f, 0.488f, -1.869f, 0.507f, -2.0f, 0.507f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.241f, 0.511f, -1.951f, 0.939f, -2.328f)
                curveToRelative(0.733f, -0.646f, 1.624f, -0.693f, 1.878f, -0.664f)
                curveToRelative(0.227f, 0.029f, 0.438f, 0.136f, 0.596f, 0.302f)
                curveToRelative(0.245f, 0.257f, 0.886f, 0.834f, 1.583f, 0.609f)
                curveToRelative(0.456f, -0.145f, 0.827f, -0.536f, 0.948f, -0.999f)
                curveToRelative(0.126f, -0.483f, 0.036f, -0.958f, -0.256f, -1.336f)
                curveToRelative(-0.417f, -0.539f, -1.149f, -0.754f, -1.831f, -0.431f)
                curveToRelative(-0.435f, 0.207f, -0.958f, 0.074f, -1.24f, -0.317f)
                curveToRelative(-0.384f, -0.531f, -0.973f, -0.836f, -1.617f, -0.836f)
                curveToRelative(-0.621f, 0.0f, -1.066f, 0.283f, -1.331f, 0.521f)
                curveToRelative(-0.38f, 0.342f, -0.958f, 0.342f, -1.338f, 0.0f)
                curveToRelative(-0.265f, -0.238f, -0.71f, -0.521f, -1.331f, -0.521f)
                curveToRelative(-0.644f, 0.0f, -1.233f, 0.305f, -1.617f, 0.836f)
                curveToRelative(-0.283f, 0.393f, -0.806f, 0.526f, -1.242f, 0.316f)
                curveToRelative(-0.385f, -0.183f, -0.767f, -0.202f, -1.166f, -0.054f)
                curveToRelative(-0.467f, 0.173f, -0.835f, 0.586f, -0.937f, 1.052f)
                curveToRelative(-0.103f, 0.471f, 0.001f, 0.929f, 0.292f, 1.289f)
                curveToRelative(0.287f, 0.356f, 0.713f, 0.561f, 1.169f, 0.561f)
                curveToRelative(0.484f, 0.0f, 0.832f, -0.337f, 1.05f, -0.591f)
                curveToRelative(0.059f, -0.068f, 0.185f, -0.191f, 0.26f, -0.241f)
                curveToRelative(0.164f, -0.109f, 0.357f, -0.168f, 0.555f, -0.168f)
                curveToRelative(1.059f, 0.0f, 2.635f, 0.799f, 2.635f, 3.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(4.0f, 12.0f)
                curveToRelative(-0.132f, 0.0f, -1.06f, -0.019f, -2.0f, -0.506f)
                verticalLineToRelative(0.506f)
                curveToRelative(0.0f, 2.706f, 1.063f, 5.24f, 2.995f, 7.137f)
                curveToRelative(1.93f, 1.895f, 4.487f, 2.903f, 7.193f, 2.861f)
                curveToRelative(5.411f, -0.099f, 9.812f, -4.747f, 9.812f, -10.363f)
                verticalLineToRelative(-0.142f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.44f, 0.0f, -2.597f, 1.148f, -2.972f, 2.22f)
                curveToRelative(-0.134f, 0.383f, 0.168f, 0.78f, 0.573f, 0.78f)
                curveToRelative(1.158f, 0.0f, 3.638f, 0.0f, 4.788f, 0.0f)
                curveToRelative(0.403f, 0.0f, 0.706f, -0.393f, 0.576f, -0.775f)
                curveToRelative(-0.365f, -1.074f, -1.53f, -2.224f, -2.965f, -2.224f)
                close()
            }
        }
        .build()
        return _faceExplode!!
    }

private var _faceExplode: ImageVector? = null
