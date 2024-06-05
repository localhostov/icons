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

public val Icons.Filled.HammerWar: ImageVector
    get() {
        if (_hammerWar != null) {
            return _hammerWar!!
        }
        _hammerWar = Builder(name = "HammerWar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.268f, 14.874f)
                lineToRelative(-4.41f, 4.41f)
                curveToRelative(-0.475f, 0.476f, -1.102f, 0.733f, -1.76f, 0.733f)
                curveToRelative(-0.117f, 0.0f, -0.235f, -0.009f, -0.354f, -0.025f)
                curveToRelative(-0.784f, -0.109f, -1.455f, -0.569f, -1.839f, -1.262f)
                lineToRelative(-1.926f, -3.467f)
                lineToRelative(6.268f, -6.268f)
                lineToRelative(3.467f, 1.926f)
                curveToRelative(0.691f, 0.384f, 1.151f, 1.054f, 1.261f, 1.838f)
                reflectiveCurveToRelative(-0.148f, 1.555f, -0.708f, 2.114f)
                close()
                moveTo(5.269f, 9.095f)
                lineToRelative(3.467f, 1.926f)
                lineToRelative(6.268f, -6.268f)
                lineToRelative(-1.926f, -3.467f)
                curveToRelative(-0.384f, -0.692f, -1.055f, -1.152f, -1.839f, -1.262f)
                curveToRelative(-0.785f, -0.109f, -1.555f, 0.148f, -2.114f, 0.708f)
                lineTo(4.716f, 5.143f)
                curveToRelative(-0.56f, 0.56f, -0.818f, 1.33f, -0.708f, 2.114f)
                reflectiveCurveToRelative(0.57f, 1.454f, 1.261f, 1.838f)
                close()
                moveTo(18.569f, 6.836f)
                lineToRelative(-0.234f, -1.17f)
                lineToRelative(-1.17f, -0.234f)
                lineToRelative(-0.005f, -0.005f)
                lineToRelative(-0.003f, 0.003f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-7.036f, 7.036f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(7.039f, -7.039f)
                lineToRelative(-0.005f, -0.005f)
                close()
                moveTo(8.706f, 13.88f)
                lineToRelative(-4.508f, 4.508f)
                curveToRelative(-1.115f, -0.529f, -2.485f, -0.344f, -3.405f, 0.576f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.567f, 0.567f, -0.879f, 1.32f, -0.879f, 2.122f)
                reflectiveCurveToRelative(0.312f, 1.555f, 0.879f, 2.121f)
                curveToRelative(0.585f, 0.585f, 1.353f, 0.877f, 2.121f, 0.877f)
                reflectiveCurveToRelative(1.537f, -0.292f, 2.122f, -0.877f)
                curveToRelative(0.566f, -0.566f, 0.878f, -1.32f, 0.878f, -2.121f)
                curveToRelative(0.0f, -0.454f, -0.11f, -0.888f, -0.3f, -1.286f)
                lineToRelative(4.506f, -4.506f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _hammerWar!!
    }

private var _hammerWar: ImageVector? = null
