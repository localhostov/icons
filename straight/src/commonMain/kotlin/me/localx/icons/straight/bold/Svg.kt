package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Svg: ImageVector
    get() {
        if (_svg != null) {
            return _svg!!
        }
        _svg = Builder(name = "Svg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(17.471f)
                lineToRelative(6.529f, -6.529f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(14.967f, 3.033f)
                curveToRelative(1.109f, 0.0f, 2.012f, 0.891f, 2.012f, 1.985f)
                verticalLineToRelative(0.015f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-0.015f)
                curveToRelative(0.0f, -0.394f, -0.342f, -0.726f, -0.75f, -0.733f)
                curveToRelative(-0.402f, 0.007f, -0.725f, 0.333f, -0.724f, 0.736f)
                curveToRelative(0.0f, 0.095f, 0.008f, 1.886f, 0.008f, 2.024f)
                curveToRelative(-0.001f, 0.403f, 0.322f, 0.729f, 0.724f, 0.736f)
                curveToRelative(0.315f, -0.005f, 0.587f, -0.206f, 0.696f, -0.479f)
                horizontalLineToRelative(-0.682f)
                verticalLineToRelative(-1.302f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.048f)
                curveToRelative(0.0f, 1.094f, -0.916f, 1.985f, -2.026f, 1.985f)
                curveToRelative(-1.086f, 0.0f, -1.967f, -0.881f, -1.967f, -1.967f)
                lineToRelative(-0.008f, -2.066f)
                curveToRelative(0.0f, -1.086f, 0.881f, -1.967f, 1.967f, -1.967f)
                close()
                moveTo(9.238f, 3.033f)
                lineToRelative(0.826f, 3.282f)
                lineToRelative(0.684f, -3.282f)
                horizontalLineToRelative(1.252f)
                lineToRelative(-1.252f, 6.0f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.511f, -6.0f)
                horizontalLineToRelative(1.252f)
                close()
                moveTo(5.379f, 6.64f)
                curveToRelative(-0.752f, -0.277f, -1.43f, -0.58f, -1.43f, -0.58f)
                curveToRelative(-0.6f, -0.382f, -0.864f, -0.969f, -0.777f, -1.579f)
                curveToRelative(0.094f, -0.649f, 0.568f, -1.178f, 1.239f, -1.38f)
                curveToRelative(1.317f, -0.397f, 2.407f, 0.499f, 2.452f, 0.537f)
                lineToRelative(0.479f, 0.402f)
                lineToRelative(-0.805f, 0.957f)
                lineToRelative(-0.476f, -0.399f)
                curveToRelative(-0.025f, -0.021f, -0.633f, -0.495f, -1.29f, -0.299f)
                curveToRelative(-0.293f, 0.088f, -0.351f, 0.282f, -0.362f, 0.361f)
                curveToRelative(-0.008f, 0.059f, -0.013f, 0.206f, 0.13f, 0.302f)
                curveToRelative(0.016f, 0.0f, 0.614f, 0.263f, 1.272f, 0.506f)
                curveToRelative(1.223f, 0.451f, 1.529f, 1.336f, 1.408f, 2.014f)
                curveToRelative(-0.16f, 0.899f, -1.019f, 1.552f, -2.04f, 1.552f)
                curveToRelative(-0.826f, 0.0f, -1.603f, -0.333f, -2.13f, -0.914f)
                lineToRelative(-0.42f, -0.462f)
                lineToRelative(0.926f, -0.84f)
                lineToRelative(0.42f, 0.463f)
                curveToRelative(0.286f, 0.315f, 0.736f, 0.504f, 1.204f, 0.504f)
                curveToRelative(0.448f, 0.0f, 0.764f, -0.265f, 0.81f, -0.521f)
                curveToRelative(0.062f, -0.345f, -0.451f, -0.562f, -0.61f, -0.621f)
                close()
                moveTo(21.0f, 14.999f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                lineTo(3.0f, 20.999f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _svg!!
    }

private var _svg: ImageVector? = null
