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

public val Icons.Filled.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = Builder(name = "PiggyBank", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.432f, 11.046f)
                curveToRelative(-0.338f, -0.846f, -0.824f, -1.636f, -1.432f, -2.327f)
                verticalLineToRelative(-3.715f)
                curveToRelative(0.0f, -0.618f, -0.278f, -1.192f, -0.764f, -1.576f)
                curveToRelative(-0.478f, -0.377f, -1.089f, -0.513f, -1.681f, -0.374f)
                curveToRelative(-1.825f, 0.435f, -3.194f, 1.469f, -3.927f, 2.946f)
                horizontalLineToRelative(-5.363f)
                curveToRelative(-2.581f, 0.0f, -4.898f, 1.158f, -6.419f, 2.969f)
                curveToRelative(-1.2f, -0.175f, -1.055f, -1.971f, 0.153f, -1.969f)
                curveToRelative(1.307f, -0.005f, 1.308f, -1.995f, 0.0f, -2.0f)
                curveToRelative(-3.185f, -0.01f, -4.129f, 4.406f, -1.268f, 5.709f)
                curveToRelative(-1.759f, 3.62f, -0.229f, 8.282f, 3.268f, 10.212f)
                verticalLineToRelative(0.079f)
                curveToRelative(0.002f, 3.351f, 4.74f, 4.118f, 5.829f, 1.0f)
                horizontalLineToRelative(2.343f)
                curveToRelative(1.089f, 3.12f, 5.827f, 2.349f, 5.829f, -1.0f)
                verticalLineToRelative(-0.092f)
                curveToRelative(1.56f, -0.903f, 2.771f, -2.3f, 3.432f, -3.954f)
                curveToRelative(0.821f, -0.175f, 1.568f, -0.848f, 1.568f, -1.954f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.106f, -0.748f, -1.779f, -1.568f, -1.954f)
                close()
                moveTo(18.0f, 13.0f)
                curveToRelative(-1.308f, -0.006f, -1.308f, -1.994f, 0.0f, -2.0f)
                curveToRelative(1.308f, 0.006f, 1.308f, 1.994f, 0.0f, 2.0f)
                close()
                moveTo(6.052f, 4.512f)
                curveToRelative(-0.562f, -5.591f, 7.74f, -6.132f, 7.948f, -0.512f)
                horizontalLineToRelative(-4.734f)
                curveToRelative(-1.121f, 0.0f, -2.2f, 0.185f, -3.214f, 0.512f)
                close()
            }
        }
        .build()
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
