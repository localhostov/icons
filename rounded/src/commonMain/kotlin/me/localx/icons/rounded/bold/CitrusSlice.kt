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

public val Icons.Bold.CitrusSlice: ImageVector
    get() {
        if (_citrusSlice != null) {
            return _citrusSlice!!
        }
        _citrusSlice = Builder(name = "CitrusSlice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.584f, 1.632f)
                curveToRelative(-0.596f, -0.891f, -1.555f, -1.463f, -2.633f, -1.569f)
                curveToRelative(-1.108f, -0.106f, -2.192f, 0.279f, -2.978f, 1.064f)
                lineTo(1.127f, 15.974f)
                curveToRelative(-0.786f, 0.786f, -1.173f, 1.871f, -1.064f, 2.978f)
                curveToRelative(0.106f, 1.078f, 0.679f, 2.037f, 1.569f, 2.632f)
                curveToRelative(2.421f, 1.617f, 5.197f, 2.407f, 7.96f, 2.407f)
                curveToRelative(3.72f, 0.0f, 7.416f, -1.432f, 10.191f, -4.208f)
                curveToRelative(4.837f, -4.837f, 5.594f, -12.471f, 1.801f, -18.151f)
                close()
                moveTo(18.645f, 16.523f)
                lineToRelative(-5.523f, -5.523f)
                horizontalLineToRelative(7.777f)
                curveToRelative(-0.244f, 1.976f, -1.003f, 3.888f, -2.253f, 5.523f)
                close()
                moveTo(11.0f, 13.121f)
                lineToRelative(5.523f, 5.523f)
                curveToRelative(-1.636f, 1.25f, -3.547f, 2.01f, -5.523f, 2.254f)
                verticalLineToRelative(-7.777f)
                close()
                moveTo(18.095f, 3.248f)
                curveToRelative(0.132f, -0.131f, 0.308f, -0.203f, 0.492f, -0.203f)
                curveToRelative(0.023f, 0.0f, 0.047f, 0.0f, 0.07f, 0.003f)
                curveToRelative(0.129f, 0.013f, 0.309f, 0.066f, 0.432f, 0.25f)
                curveToRelative(0.967f, 1.449f, 1.555f, 3.058f, 1.787f, 4.702f)
                horizontalLineToRelative(-7.533f)
                lineToRelative(4.752f, -4.752f)
                close()
                moveTo(3.048f, 18.657f)
                curveToRelative(-0.021f, -0.209f, 0.052f, -0.414f, 0.2f, -0.562f)
                lineToRelative(4.752f, -4.752f)
                verticalLineToRelative(7.532f)
                curveToRelative(-1.644f, -0.232f, -3.254f, -0.82f, -4.702f, -1.787f)
                curveToRelative(-0.183f, -0.122f, -0.237f, -0.302f, -0.25f, -0.432f)
                close()
            }
        }
        .build()
        return _citrusSlice!!
    }

private var _citrusSlice: ImageVector? = null
