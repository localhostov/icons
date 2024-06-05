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

public val Icons.Bold.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.967f, 14.074f)
                curveToRelative(-0.633f, -0.534f, -1.578f, -0.454f, -2.113f, 0.179f)
                curveToRelative(-0.427f, 0.506f, -0.461f, 1.211f, -0.135f, 1.747f)
                horizontalLineToRelative(-7.304f)
                curveToRelative(1.248f, -0.967f, 2.743f, -1.807f, 4.32f, -2.692f)
                curveToRelative(4.343f, -2.439f, 9.266f, -5.203f, 9.266f, -11.808f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(3.5f, 0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                curveToRelative(0.0f, 3.38f, 1.319f, 6.136f, 4.033f, 8.426f)
                curveToRelative(0.281f, 0.237f, 0.624f, 0.354f, 0.966f, 0.354f)
                curveToRelative(0.427f, 0.0f, 0.851f, -0.181f, 1.147f, -0.533f)
                curveToRelative(0.427f, -0.506f, 0.461f, -1.211f, 0.135f, -1.747f)
                horizontalLineToRelative(7.304f)
                curveToRelative(-1.248f, 0.967f, -2.743f, 1.806f, -4.32f, 2.692f)
                curveToRelative(-4.343f, 2.439f, -9.266f, 5.203f, -9.266f, 11.808f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -3.38f, -1.319f, -6.136f, -4.033f, -8.426f)
                close()
                moveTo(18.211f, 5.0f)
                lineTo(5.785f, 5.0f)
                curveToRelative(-0.32f, -0.625f, -0.539f, -1.287f, -0.662f, -2.0f)
                horizontalLineToRelative(13.751f)
                curveToRelative(-0.129f, 0.735f, -0.356f, 1.397f, -0.664f, 2.0f)
                close()
                moveTo(5.79f, 19.0f)
                horizontalLineToRelative(12.425f)
                curveToRelative(0.32f, 0.625f, 0.539f, 1.287f, 0.662f, 2.0f)
                lineTo(5.126f, 21.0f)
                curveToRelative(0.13f, -0.735f, 0.356f, -1.397f, 0.663f, -2.0f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
