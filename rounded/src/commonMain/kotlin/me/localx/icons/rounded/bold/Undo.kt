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

public val Icons.Bold.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 468.245f)
                curveToRelative(0.0f, -53.019f, -42.981f, -96.0f, -96.0f, -96.0f)
                horizontalLineTo(231.083f)
                verticalLineToRelative(35.84f)
                curveToRelative(-0.05f, 26.085f, -21.237f, 47.191f, -47.322f, 47.141f)
                curveToRelative(-13.054f, -0.025f, -25.516f, -5.452f, -34.427f, -14.992f)
                lineTo(16.597f, 297.408f)
                curveToRelative(-22.124f, -24.02f, -22.124f, -60.994f, 0.0f, -85.013f)
                lineTo(149.333f, 69.568f)
                curveToRelative(17.742f, -19.122f, 47.627f, -20.241f, 66.749f, -2.499f)
                curveToRelative(9.639f, 8.943f, 15.113f, 21.499f, 15.107f, 34.648f)
                verticalLineToRelative(35.861f)
                horizontalLineToRelative(78.144f)
                curveTo(421.209f, 137.708f, 511.871f, 228.369f, 512.0f, 340.245f)
                verticalLineToRelative(128.0f)
                curveToRelative(0.0f, 17.673f, -14.327f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveTo(448.0f, 485.918f, 448.0f, 468.245f)
                close()
                moveTo(448.0f, 340.245f)
                lineTo(448.0f, 340.245f)
                curveToRelative(-0.094f, -76.544f, -62.122f, -138.573f, -138.667f, -138.667f)
                horizontalLineTo(199.083f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                verticalLineToRelative(-25.6f)
                lineTo(63.509f, 253.867f)
                lineToRelative(103.573f, 111.531f)
                verticalLineToRelative(-25.152f)
                curveToRelative(0.0f, -17.673f, 14.327f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(352.0f)
                curveToRelative(34.637f, -0.043f, 68.342f, 11.214f, 96.0f, 32.064f)
                verticalLineTo(340.245f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
