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

public val Icons.Filled.GuitarElectric: ImageVector
    get() {
        if (_guitarElectric != null) {
            return _guitarElectric!!
        }
        _guitarElectric = Builder(name = "GuitarElectric", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.97f, 11.441f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-1.549f, 1.55f, -3.954f, 1.724f, -5.703f, 0.535f)
                lineTo(23.996f, 1.418f)
                lineTo(22.582f, 0.004f)
                lineToRelative(-0.024f, 0.024f)
                curveToRelative(0.008f, -0.015f, 0.014f, -0.028f, 0.014f, -0.028f)
                curveToRelative(0.0f, 0.0f, -5.573f, 1.739f, -5.573f, 2.844f)
                curveToRelative(0.0f, 0.212f, 0.173f, 1.407f, 0.857f, 1.885f)
                lineToRelative(-4.358f, 4.358f)
                curveToRelative(-0.991f, -1.719f, -0.769f, -3.951f, 0.699f, -5.419f)
                lineToRelative(-0.016f, -0.016f)
                curveToRelative(0.206f, -0.2f, 0.427f, -0.416f, 0.676f, -0.665f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-0.574f, 0.574f, -1.019f, 0.996f, -1.387f, 1.346f)
                curveToRelative(-0.944f, 0.896f, -1.464f, 1.39f, -2.336f, 2.708f)
                curveToRelative(-1.075f, 1.625f, -2.094f, 2.283f, -4.361f, 2.819f)
                curveToRelative(-0.279f, 0.066f, -0.547f, 0.125f, -0.804f, 0.181f)
                curveToRelative(-1.22f, 0.267f, -2.273f, 0.498f, -2.953f, 1.177f)
                curveToRelative(-3.51f, 3.51f, -0.566f, 6.538f, 2.031f, 9.209f)
                lineToRelative(1.213f, 1.261f)
                curveToRelative(1.887f, 1.985f, 3.517f, 3.699f, 5.548f, 3.724f)
                curveToRelative(0.016f, 0.0f, 0.031f, 0.0f, 0.046f, 0.0f)
                curveToRelative(1.133f, 0.0f, 2.215f, -0.531f, 3.306f, -1.622f)
                curveToRelative(0.707f, -0.707f, 1.082f, -1.948f, 1.498f, -3.499f)
                curveToRelative(0.573f, -2.132f, 1.158f, -2.902f, 3.13f, -4.12f)
                curveToRelative(1.079f, -0.666f, 1.485f, -1.094f, 2.295f, -1.947f)
                curveToRelative(0.33f, -0.347f, 0.741f, -0.78f, 1.313f, -1.352f)
                lineToRelative(-0.017f, -0.017f)
                reflectiveCurveToRelative(0.003f, -0.002f, 0.004f, -0.003f)
                close()
                moveTo(8.654f, 18.347f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(11.414f, 15.587f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _guitarElectric!!
    }

private var _guitarElectric: ImageVector? = null
