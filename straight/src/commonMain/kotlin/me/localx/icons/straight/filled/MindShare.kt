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

public val Icons.Filled.MindShare: ImageVector
    get() {
        if (_mindShare != null) {
            return _mindShare!!
        }
        _mindShare = Builder(name = "MindShare", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.414f, 16.586f)
                curveToRelative(0.78f, 0.779f, 0.78f, 2.049f, 0.0f, 2.828f)
                lineToRelative(-3.293f, 3.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.293f, -2.293f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.293f, 3.293f)
                close()
                moveTo(9.022f, 0.0f)
                horizontalLineToRelative(-0.022f)
                curveToRelative(-1.896f, 0.0f, -3.489f, 1.327f, -3.898f, 3.102f)
                curveToRelative(-1.774f, 0.409f, -3.102f, 2.001f, -3.102f, 3.898f)
                verticalLineToRelative(0.021f)
                curveToRelative(-1.248f, 0.939f, -2.0f, 2.41f, -2.0f, 3.979f)
                curveToRelative(0.0f, 0.886f, 0.235f, 1.737f, 0.686f, 2.5f)
                curveToRelative(-0.45f, 0.763f, -0.686f, 1.614f, -0.686f, 2.5f)
                curveToRelative(0.0f, 1.686f, 0.858f, 3.244f, 2.267f, 4.165f)
                curveToRelative(0.719f, 2.279f, 2.812f, 3.835f, 5.233f, 3.835f)
                curveToRelative(0.431f, 0.0f, 0.85f, -0.05f, 1.252f, -0.144f)
                curveToRelative(1.332f, -0.311f, 2.248f, -1.542f, 2.248f, -2.91f)
                lineTo(11.0f, 1.984f)
                curveTo(11.0f, 0.891f, 10.115f, 0.003f, 9.022f, 0.0f)
                close()
                moveTo(20.121f, 10.464f)
                lineToRelative(3.124f, 3.125f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.488f, -0.787f, 0.754f, -1.667f, 0.754f, -2.589f)
                curveToRelative(0.0f, -1.568f, -0.752f, -3.04f, -2.0f, -3.979f)
                verticalLineToRelative(-0.021f)
                curveToRelative(0.0f, -1.897f, -1.327f, -3.489f, -3.102f, -3.898f)
                curveToRelative(-0.409f, -1.774f, -2.002f, -3.102f, -3.898f, -3.102f)
                horizontalLineToRelative(-0.022f)
                curveToRelative(-1.113f, 0.007f, -1.978f, 0.988f, -1.978f, 2.101f)
                verticalLineToRelative(14.439f)
                curveToRelative(0.667f, -0.599f, 1.466f, -1.051f, 2.35f, -1.304f)
                lineToRelative(4.771f, -4.772f)
                close()
            }
        }
        .build()
        return _mindShare!!
    }

private var _mindShare: ImageVector? = null
