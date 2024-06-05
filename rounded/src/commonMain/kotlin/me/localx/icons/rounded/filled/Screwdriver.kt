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

public val Icons.Filled.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.479f, 1.839f)
                lineToRelative(-1.318f, -1.319f)
                curveToRelative(-0.568f, -0.568f, -1.447f, -0.684f, -2.143f, -0.283f)
                lineToRelative(-3.832f, 2.211f)
                curveToRelative(-0.733f, 0.423f, -1.185f, 1.205f, -1.185f, 2.051f)
                verticalLineToRelative(3.086f)
                lineToRelative(-4.726f, 4.726f)
                curveToRelative(-1.115f, -0.525f, -2.482f, -0.339f, -3.404f, 0.58f)
                lineTo(0.982f, 18.764f)
                curveToRelative(-1.111f, 1.108f, -1.325f, 2.916f, -0.329f, 4.129f)
                curveToRelative(1.145f, 1.395f, 3.212f, 1.472f, 4.458f, 0.229f)
                lineToRelative(6.01f, -5.993f)
                curveToRelative(0.926f, -0.923f, 1.109f, -2.295f, 0.574f, -3.409f)
                lineToRelative(4.72f, -4.72f)
                horizontalLineToRelative(3.086f)
                curveToRelative(0.846f, 0.0f, 1.629f, -0.452f, 2.051f, -1.185f)
                lineToRelative(2.21f, -3.833f)
                curveToRelative(0.401f, -0.696f, 0.285f, -1.575f, -0.283f, -2.143f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
