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

public val Icons.Bold.Trust: ImageVector
    get() {
        if (_trust != null) {
            return _trust!!
        }
        _trust = Builder(name = "Trust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-3.492f)
                curveToRelative(-1.098f, 0.044f, -2.045f, 0.795f, -2.322f, 1.866f)
                lineToRelative(-1.056f, 4.625f)
                lineToRelative(-1.562f, 1.562f)
                lineTo(-0.061f, 15.939f)
                lineToRelative(0.95f, -0.95f)
                lineToRelative(0.874f, -3.824f)
                curveToRelative(0.632f, -2.451f, 2.794f, -4.135f, 5.278f, -4.161f)
                curveToRelative(0.208f, -2.295f, 1.818f, -4.245f, 4.083f, -4.83f)
                lineToRelative(3.832f, -1.107f)
                lineToRelative(0.982f, -0.982f)
                lineToRelative(2.122f, 2.121f)
                lineToRelative(-1.529f, 1.529f)
                lineToRelative(-4.532f, 1.308f)
                verticalLineToRelative(3.956f)
                horizontalLineToRelative(8.118f)
                lineToRelative(1.812f, -1.719f)
                lineToRelative(2.064f, 2.177f)
                lineToRelative(-2.636f, 2.542f)
                horizontalLineToRelative(-9.358f)
                close()
                moveTo(24.0f, 18.5f)
                curveToRelative(0.0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.462f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
                close()
                moveTo(22.359f, 17.744f)
                lineToRelative(-1.398f, -1.43f)
                lineToRelative(-3.114f, 3.203f)
                lineToRelative(-1.666f, -1.751f)
                lineToRelative(-1.387f, 1.441f)
                lineToRelative(1.632f, 1.718f)
                curveToRelative(0.766f, 0.765f, 2.079f, 0.763f, 2.823f, 0.019f)
                lineToRelative(0.004f, -0.004f)
                lineToRelative(3.107f, -3.196f)
                close()
                moveTo(8.865f, 19.0f)
                lineToRelative(-2.903f, 2.994f)
                lineToRelative(2.153f, 2.088f)
                lineToRelative(2.02f, -2.082f)
                horizontalLineToRelative(1.734f)
                curveToRelative(-0.479f, -0.906f, -0.773f, -1.922f, -0.844f, -3.0f)
                horizontalLineToRelative(-2.16f)
                close()
            }
        }
        .build()
        return _trust!!
    }

private var _trust: ImageVector? = null
