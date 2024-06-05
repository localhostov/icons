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

public val Icons.Bold.Angle90: ImageVector
    get() {
        if (_angle90 != null) {
            return _angle90!!
        }
        _angle90 = Builder(name = "Angle90", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(0.0f, 1.5f)
                curveTo(0.0f, 0.672f, 0.671f, 0.0f, 1.5f, 0.0f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(18.401f, 14.935f)
                curveToRelative(0.267f, 0.88f, 0.446f, 1.791f, 0.534f, 2.709f)
                curveToRelative(0.075f, 0.775f, 0.603f, 1.35f, 1.636f, 1.35f)
                curveToRelative(0.825f, -0.079f, 1.429f, -0.812f, 1.35f, -1.637f)
                curveToRelative(-0.107f, -1.114f, -0.326f, -2.222f, -0.649f, -3.291f)
                curveToRelative(-0.24f, -0.793f, -1.076f, -1.239f, -1.871f, -1.001f)
                curveToRelative(-0.792f, 0.24f, -1.241f, 1.077f, -1.0f, 1.87f)
                close()
                moveTo(15.84f, 10.139f)
                curveToRelative(0.296f, 0.362f, 0.727f, 0.55f, 1.161f, 0.55f)
                curveToRelative(0.334f, 0.0f, 0.671f, -0.111f, 0.95f, -0.34f)
                curveToRelative(0.641f, -0.524f, 0.735f, -1.47f, 0.209f, -2.11f)
                curveToRelative(-0.717f, -0.876f, -1.525f, -1.684f, -2.4f, -2.399f)
                curveToRelative(-0.64f, -0.523f, -1.586f, -0.431f, -2.11f, 0.211f)
                curveToRelative(-0.525f, 0.642f, -0.43f, 1.587f, 0.211f, 2.111f)
                curveToRelative(0.721f, 0.59f, 1.387f, 1.256f, 1.979f, 1.978f)
                close()
                moveTo(6.356f, 5.064f)
                curveToRelative(0.92f, 0.089f, 1.832f, 0.269f, 2.709f, 0.534f)
                curveToRelative(0.145f, 0.044f, 0.292f, 0.064f, 0.436f, 0.064f)
                curveToRelative(0.644f, 0.0f, 1.239f, -0.417f, 1.435f, -1.065f)
                curveToRelative(0.24f, -0.793f, -0.208f, -1.63f, -1.0f, -1.87f)
                curveToRelative(-1.067f, -0.323f, -2.174f, -0.542f, -3.291f, -0.649f)
                curveToRelative(-0.819f, -0.084f, -1.558f, 0.524f, -1.637f, 1.35f)
                curveToRelative(-0.08f, 0.824f, 0.524f, 1.558f, 1.349f, 1.637f)
                close()
            }
        }
        .build()
        return _angle90!!
    }

private var _angle90: ImageVector? = null
