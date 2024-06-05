package me.localx.icons.straight.filled

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

public val Icons.Filled.Svg: ImageVector
    get() {
        if (_svg != null) {
            return _svg!!
        }
        _svg = Builder(name = "Svg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 19.0f)
                horizontalLineToRelative(4.414f)
                lineToRelative(-4.414f, 4.414f)
                verticalLineToRelative(-4.414f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(6.409f, 6.66f)
                curveToRelative(0.012f, -0.079f, 0.069f, -0.273f, 0.362f, -0.361f)
                curveToRelative(0.657f, -0.196f, 1.265f, 0.279f, 1.29f, 0.299f)
                lineToRelative(0.476f, 0.399f)
                lineToRelative(0.805f, -0.957f)
                lineToRelative(-0.479f, -0.402f)
                curveToRelative(-0.045f, -0.038f, -1.135f, -0.934f, -2.452f, -0.537f)
                curveToRelative(-0.671f, 0.202f, -1.146f, 0.731f, -1.239f, 1.38f)
                curveToRelative(-0.087f, 0.61f, 0.178f, 1.197f, 0.777f, 1.579f)
                curveToRelative(0.0f, 0.0f, 0.678f, 0.303f, 1.43f, 0.58f)
                curveToRelative(0.159f, 0.059f, 0.672f, 0.276f, 0.61f, 0.621f)
                curveToRelative(-0.046f, 0.256f, -0.361f, 0.521f, -0.81f, 0.521f)
                curveToRelative(-0.468f, 0.0f, -0.918f, -0.188f, -1.204f, -0.504f)
                lineToRelative(-0.42f, -0.463f)
                lineToRelative(-0.926f, 0.84f)
                lineToRelative(0.42f, 0.462f)
                curveToRelative(0.527f, 0.581f, 1.304f, 0.914f, 2.13f, 0.914f)
                curveToRelative(1.021f, 0.0f, 1.88f, -0.653f, 2.04f, -1.552f)
                curveToRelative(0.121f, -0.678f, -0.186f, -1.562f, -1.408f, -2.014f)
                curveToRelative(-0.658f, -0.243f, -1.257f, -0.506f, -1.272f, -0.506f)
                curveToRelative(-0.143f, -0.097f, -0.138f, -0.243f, -0.13f, -0.302f)
                close()
                moveTo(13.998f, 5.034f)
                horizontalLineToRelative(-1.252f)
                lineToRelative(-0.684f, 3.282f)
                lineToRelative(-0.826f, -3.282f)
                horizontalLineToRelative(-1.252f)
                lineToRelative(1.511f, 6.0f)
                horizontalLineToRelative(1.25f)
                lineToRelative(1.252f, -6.0f)
                close()
                moveTo(19.0f, 8.001f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.302f)
                horizontalLineToRelative(0.682f)
                curveToRelative(-0.109f, 0.273f, -0.38f, 0.474f, -0.696f, 0.479f)
                curveToRelative(-0.402f, -0.007f, -0.725f, -0.333f, -0.724f, -0.736f)
                curveToRelative(0.0f, -0.138f, -0.007f, -1.929f, -0.008f, -2.024f)
                curveToRelative(-0.001f, -0.403f, 0.322f, -0.729f, 0.724f, -0.736f)
                curveToRelative(0.408f, 0.007f, 0.75f, 0.338f, 0.75f, 0.733f)
                verticalLineToRelative(0.015f)
                reflectiveCurveToRelative(1.25f, 0.0f, 1.25f, 0.0f)
                verticalLineToRelative(-0.015f)
                curveToRelative(0.0f, -1.094f, -0.902f, -1.985f, -2.012f, -1.985f)
                curveToRelative(-1.086f, 0.0f, -1.967f, 0.881f, -1.967f, 1.967f)
                lineToRelative(0.008f, 2.066f)
                curveToRelative(0.0f, 1.086f, 0.881f, 1.967f, 1.967f, 1.967f)
                curveToRelative(1.109f, 0.0f, 2.026f, -0.891f, 2.026f, -1.985f)
                verticalLineToRelative(-1.048f)
                close()
            }
        }
        .build()
        return _svg!!
    }

private var _svg: ImageVector? = null
